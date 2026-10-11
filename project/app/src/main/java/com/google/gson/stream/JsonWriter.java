/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class JsonWriter
implements Closeable,
Flushable,
AutoCloseable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS;
    private static final Pattern VALID_JSON_NUMBER_PATTERN;
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        REPLACEMENT_CHARS = new String[128];
        for (int i8 = 0; i8 <= 31; ++i8) {
            JsonWriter.REPLACEMENT_CHARS[i8] = String.format("\\u%04x", i8);
        }
        String[] stringArray = REPLACEMENT_CHARS;
        stringArray[34] = "\\\"";
        stringArray[92] = "\\\\";
        stringArray[9] = "\\t";
        stringArray[8] = "\\b";
        stringArray[10] = "\\n";
        stringArray[13] = "\\r";
        stringArray[12] = "\\f";
        stringArray = (String[])stringArray.clone();
        HTML_SAFE_REPLACEMENT_CHARS = stringArray;
        stringArray[60] = "\\u003c";
        stringArray[62] = "\\u003e";
        stringArray[38] = "\\u0026";
        stringArray[61] = "\\u003d";
        stringArray[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        this.push(6);
        this.separator = ":";
        this.serializeNulls = true;
        if (writer != null) {
            this.out = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void beforeName() throws IOException {
        block4: {
            block3: {
                int n8;
                block2: {
                    n8 = this.peek();
                    if (n8 != 5) break block2;
                    this.out.write(44);
                    break block3;
                }
                if (n8 != 3) break block4;
            }
            this.newline();
            this.replaceTop(4);
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void beforeValue() throws IOException {
        int n8 = this.peek();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 4) {
                    if (n8 != 6) {
                        if (n8 == 7) {
                            if (!this.lenient) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.replaceTop(7);
                    return;
                }
                this.out.append(this.separator);
                this.replaceTop(5);
                return;
            }
            this.out.append(',');
            this.newline();
            return;
        }
        this.replaceTop(2);
        this.newline();
    }

    private JsonWriter close(int n8, int n9, char c8) throws IOException {
        int n10 = this.peek();
        if (n10 != n9 && n10 != n8) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName == null) {
            --this.stackSize;
            if (n10 == n9) {
                this.newline();
            }
            this.out.write(c8);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dangling name: ");
        stringBuilder.append(this.deferredName);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static boolean isTrustedNumberType(Class<? extends Number> clazz) {
        return clazz == Integer.class || clazz == Long.class || clazz == Double.class || clazz == Float.class || clazz == Byte.class || clazz == Short.class || clazz == BigDecimal.class || clazz == BigInteger.class || clazz == AtomicInteger.class || clazz == AtomicLong.class;
        {
        }
    }

    private void newline() throws IOException {
        if (this.indent != null) {
            this.out.write(10);
            int n8 = this.stackSize;
            for (int i8 = 1; i8 < n8; ++i8) {
                this.out.write(this.indent);
            }
        }
    }

    private JsonWriter open(int n8, char c8) throws IOException {
        this.beforeValue();
        this.push(n8);
        this.out.write(c8);
        return this;
    }

    private int peek() {
        int n8 = this.stackSize;
        if (n8 != 0) {
            return this.stack[n8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int n8) {
        int n9 = this.stackSize;
        int[] nArray = this.stack;
        if (n9 == nArray.length) {
            this.stack = Arrays.copyOf(nArray, n9 * 2);
        }
        nArray = this.stack;
        n9 = this.stackSize;
        this.stackSize = n9 + 1;
        nArray[n9] = n8;
    }

    private void replaceTop(int n8) {
        this.stack[this.stackSize - 1] = n8;
    }

    private void string(String string) throws IOException {
        String[] stringArray = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int n8 = string.length();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10;
            block8: {
                String string2;
                block7: {
                    char c8;
                    block9: {
                        block6: {
                            String string3;
                            c8 = string.charAt(i8);
                            if (c8 >= '\u0080') break block6;
                            string2 = string3 = stringArray[c8];
                            if (string3 != null) break block7;
                            n10 = n9;
                            break block8;
                        }
                        if (c8 != '\u2028') break block9;
                        string2 = "\\u2028";
                        break block7;
                    }
                    n10 = n9;
                    if (c8 != '\u2029') break block8;
                    string2 = "\\u2029";
                }
                if (n9 < i8) {
                    this.out.write(string, n9, i8 - n9);
                }
                this.out.write(string2);
                n10 = i8 + 1;
            }
            n9 = n10;
        }
        if (n9 < n8) {
            this.out.write(string, n9, n8 - n9);
        }
        this.out.write(34);
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            this.beforeName();
            this.string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        this.writeDeferredName();
        return this.open(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        this.writeDeferredName();
        return this.open(3, '{');
    }

    @Override
    public void close() throws IOException {
        this.out.close();
        int n8 = this.stackSize;
        if (n8 <= 1 && (n8 != 1 || this.stack[n8 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter endArray() throws IOException {
        return this.close(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return this.close(3, 5, '}');
    }

    @Override
    public void flush() throws IOException {
        if (this.stackSize != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String string) throws IOException {
        if (string == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.out.append(string);
        return this;
    }

    public JsonWriter name(String string) throws IOException {
        if (string != null) {
            if (this.deferredName == null) {
                if (this.stackSize != 0) {
                    this.deferredName = string;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                this.writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        this.beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean bl) {
        this.htmlSafe = bl;
    }

    public final void setIndent(String string) {
        if (string.length() == 0) {
            this.indent = null;
            this.separator = ":";
            return;
        }
        this.indent = string;
        this.separator = ": ";
    }

    public final void setLenient(boolean bl) {
        this.lenient = bl;
    }

    public final void setSerializeNulls(boolean bl) {
        this.serializeNulls = bl;
    }

    public JsonWriter value(double d8) throws IOException {
        this.writeDeferredName();
        if (!this.lenient && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(d8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.beforeValue();
        this.out.append(Double.toString(d8));
        return this;
    }

    public JsonWriter value(float f8) throws IOException {
        this.writeDeferredName();
        if (!this.lenient && (Float.isNaN(f8) || Float.isInfinite(f8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append(f8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.beforeValue();
        this.out.append(Float.toString(f8));
        return this;
    }

    public JsonWriter value(long l8) throws IOException {
        this.writeDeferredName();
        this.beforeValue();
        this.out.write(Long.toString(l8));
        return this;
    }

    public JsonWriter value(Boolean object) throws IOException {
        if (object == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        Writer writer = this.out;
        object = ((Boolean)object).booleanValue() ? "true" : "false";
        writer.write((String)object);
        return this;
    }

    public JsonWriter value(Number serializable) throws IOException {
        String string;
        block8: {
            block7: {
                block6: {
                    if (serializable == null) {
                        return this.nullValue();
                    }
                    this.writeDeferredName();
                    string = serializable.toString();
                    if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) break block6;
                    Class<?> clazz = serializable.getClass();
                    if (!JsonWriter.isTrustedNumberType(clazz) && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append("String created by ");
                        ((StringBuilder)serializable).append(clazz);
                        ((StringBuilder)serializable).append(" is not a valid JSON number: ");
                        ((StringBuilder)serializable).append(string);
                        throw new IllegalArgumentException(((StringBuilder)serializable).toString());
                    }
                    break block7;
                }
                if (!this.lenient) break block8;
            }
            this.beforeValue();
            this.out.append(string);
            return this;
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Numeric values must be finite, but was ");
        ((StringBuilder)serializable).append(string);
        throw new IllegalArgumentException(((StringBuilder)serializable).toString());
    }

    public JsonWriter value(String string) throws IOException {
        if (string == null) {
            return this.nullValue();
        }
        this.writeDeferredName();
        this.beforeValue();
        this.string(string);
        return this;
    }

    public JsonWriter value(boolean bl) throws IOException {
        this.writeDeferredName();
        this.beforeValue();
        Writer writer = this.out;
        String string = bl ? "true" : "false";
        writer.write(string);
        return this;
    }
}

