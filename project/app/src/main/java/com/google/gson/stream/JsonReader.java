/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

import ax.t8.e;
import com.google.gson.internal.bind.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class JsonReader
implements Closeable,
AutoCloseable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer = new char[1024];
    private final Reader in;
    private boolean lenient = false;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    private int[] pathIndices;
    private String[] pathNames;
    int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos = 0;
    private int[] stack;
    private int stackSize;

    static {
        e.INSTANCE = new e(){

            @Override
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                int n8;
                if (jsonReader instanceof a) {
                    ((a)jsonReader).e();
                    return;
                }
                int n9 = n8 = jsonReader.peeked;
                if (n8 == 0) {
                    n9 = jsonReader.doPeek();
                }
                if (n9 == 13) {
                    jsonReader.peeked = 9;
                    return;
                }
                if (n9 == 12) {
                    jsonReader.peeked = 8;
                    return;
                }
                if (n9 == 14) {
                    jsonReader.peeked = 10;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a name but was ");
                stringBuilder.append((Object)jsonReader.peek());
                stringBuilder.append(jsonReader.locationString());
                throw new IllegalStateException(stringBuilder.toString());
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] nArray = new int[32];
        this.stack = nArray;
        this.stackSize = 1;
        nArray[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader != null) {
            this.in = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void checkLenient() throws IOException {
        if (this.lenient) {
            return;
        }
        throw this.syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void consumeNonExecutePrefix() throws IOException {
        char[] cArray;
        this.nextNonWhitespace(true);
        int n8 = this.pos;
        this.pos = n8 - 1;
        if ((n8 + 4 <= this.limit || this.fillBuffer(5)) && (cArray = this.buffer)[n8 = this.pos] == ')' && cArray[n8 + 1] == ']' && cArray[n8 + 2] == '}' && cArray[n8 + 3] == '\'' && cArray[n8 + 4] == '\n') {
            this.pos = n8 + 5;
        }
    }

    private boolean fillBuffer(int n8) throws IOException {
        block7: {
            char[] cArray = this.buffer;
            int n9 = this.lineStart;
            int n10 = this.pos;
            this.lineStart = n9 - n10;
            n9 = this.limit;
            if (n9 != n10) {
                this.limit = n9 -= n10;
                System.arraycopy(cArray, n10, cArray, 0, n9);
            } else {
                this.limit = 0;
            }
            this.pos = 0;
            do {
                Reader reader = this.in;
                n10 = this.limit;
                if ((n10 = reader.read(cArray, n10, cArray.length - n10)) == -1) break block7;
                this.limit = n9 = this.limit + n10;
                n10 = n8;
                if (this.lineNumber == 0) {
                    int n11 = this.lineStart;
                    n10 = n8;
                    if (n11 == 0) {
                        n10 = n8;
                        if (n9 > 0) {
                            n10 = n8;
                            if (cArray[0] == '\ufeff') {
                                ++this.pos;
                                this.lineStart = n11 + 1;
                                n10 = n8 + 1;
                            }
                        }
                    }
                }
                n8 = n10;
            } while (n9 < n10);
            return true;
        }
        return false;
    }

    private String getPath(boolean bl) {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        for (int i8 = 0; i8 < (n8 = this.stackSize); ++i8) {
            int n9;
            int n10 = this.stack[i8];
            if (n10 != 1 && n10 != 2) {
                if (n10 != 3 && n10 != 4 && n10 != 5) continue;
                stringBuilder.append('.');
                String string = this.pathNames[i8];
                if (string == null) continue;
                stringBuilder.append(string);
                continue;
            }
            n10 = n9 = this.pathIndices[i8];
            if (bl) {
                n10 = n9;
                if (n9 > 0) {
                    n10 = n9;
                    if (i8 == n8 - 1) {
                        n10 = n9 - 1;
                    }
                }
            }
            stringBuilder.append('[');
            stringBuilder.append(n10);
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    private boolean isLiteral(char var1_1) throws IOException {
        block4: {
            if (var1_1 == '\t' || var1_1 == '\n' || var1_1 == '\f' || var1_1 == '\r' || var1_1 == ' ') break block4;
            if (var1_1 == '#') ** GOTO lbl-1000
            if (var1_1 == ',') break block4;
            if (var1_1 == '/' || var1_1 == '=') ** GOTO lbl-1000
            if (var1_1 == '{' || var1_1 == '}' || var1_1 == ':') break block4;
            if (var1_1 == ';') ** GOTO lbl-1000
            switch (var1_1) {
                default: {
                    return true;
                }
                case '\\': lbl-1000:
                // 4 sources

                {
                    this.checkLenient();
                }
                case '[': 
                case ']': 
            }
        }
        return false;
    }

    private int nextNonWhitespace(boolean bl) throws IOException {
        Object object = this.buffer;
        int n8 = this.pos;
        int n9 = this.limit;
        while (true) {
            Object object2;
            block10: {
                block11: {
                    block14: {
                        block15: {
                            block13: {
                                block12: {
                                    int n10;
                                    block9: {
                                        n10 = n8;
                                        object2 = n9;
                                        if (n8 == n9) {
                                            this.pos = n8;
                                            if (!this.fillBuffer(1)) {
                                                if (!bl) {
                                                    return -1;
                                                }
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append("End of input");
                                                ((StringBuilder)object).append(this.locationString());
                                                throw new EOFException(((StringBuilder)object).toString());
                                            }
                                            n10 = this.pos;
                                            object2 = this.limit;
                                        }
                                        n8 = n10 + 1;
                                        n9 = object[n10];
                                        if (n9 != 10) break block9;
                                        ++this.lineNumber;
                                        this.lineStart = n8;
                                        break block10;
                                    }
                                    if (n9 == 32 || n9 == 13 || n9 == 9) break block10;
                                    if (n9 != 47) break block11;
                                    this.pos = n8;
                                    if (n8 != object2) break block12;
                                    this.pos = n10;
                                    boolean bl2 = this.fillBuffer(2);
                                    ++this.pos;
                                    if (!bl2) break block13;
                                }
                                this.checkLenient();
                                n8 = this.pos;
                                object2 = object[n8];
                                if (object2 == 42) break block14;
                                if (object2 == 47) break block15;
                            }
                            return n9;
                        }
                        this.pos = n8 + 1;
                        this.skipToEndOfLine();
                        n8 = this.pos;
                        n9 = this.limit;
                        continue;
                    }
                    this.pos = n8 + 1;
                    if (this.skipTo("*/")) {
                        n8 = this.pos + 2;
                        n9 = this.limit;
                        continue;
                    }
                    throw this.syntaxError("Unterminated comment");
                }
                if (n9 == 35) {
                    this.pos = n8;
                    this.checkLenient();
                    this.skipToEndOfLine();
                    n8 = this.pos;
                    n9 = this.limit;
                    continue;
                }
                this.pos = n8;
                return n9;
            }
            n9 = object2;
        }
    }

    private String nextQuotedValue(char c8) throws IOException {
        char[] cArray = this.buffer;
        StringBuilder stringBuilder = null;
        while (true) {
            StringBuilder stringBuilder2;
            int n8;
            int n9 = this.pos;
            int n10 = this.limit;
            block1: while (true) {
                int n11 = n9;
                while ((n8 = n11) < n10) {
                    n11 = n8 + 1;
                    if ((n8 = cArray[n8]) == c8) {
                        this.pos = n11;
                        c8 = (char)(n11 - n9 - 1);
                        if (stringBuilder == null) {
                            return new String(cArray, n9, (int)c8);
                        }
                        stringBuilder.append(cArray, n9, (int)c8);
                        return stringBuilder.toString();
                    }
                    if (n8 == 92) {
                        this.pos = n11;
                        n11 -= n9;
                        stringBuilder2 = stringBuilder;
                        if (stringBuilder == null) {
                            stringBuilder2 = new StringBuilder(Math.max(n11 * 2, 16));
                        }
                        stringBuilder2.append(cArray, n9, n11 - 1);
                        stringBuilder2.append(this.readEscapeCharacter());
                        n9 = this.pos;
                        n10 = this.limit;
                        stringBuilder = stringBuilder2;
                        continue block1;
                    }
                    if (n8 != 10) continue;
                    ++this.lineNumber;
                    this.lineStart = n11;
                }
                break;
            }
            stringBuilder2 = stringBuilder;
            if (stringBuilder == null) {
                stringBuilder2 = new StringBuilder(Math.max((n8 - n9) * 2, 16));
            }
            stringBuilder2.append(cArray, n9, n8 - n9);
            this.pos = n8;
            if (!this.fillBuffer(1)) break;
            stringBuilder = stringBuilder2;
        }
        throw this.syntaxError("Unterminated string");
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private String nextUnquotedValue() throws IOException {
        block11: {
            var5_1 /* !! */  = null;
            var2_2 = 0;
            do {
                block10: {
                    var1_3 = 0;
                    block5: while (true) {
                        if ((var3_4 = this.pos) + var1_3 >= this.limit) ** GOTO lbl20
                        if ((var3_4 = this.buffer[var3_4 + var1_3]) == 9 || var3_4 == 10 || var3_4 == 12 || var3_4 == 13 || var3_4 == 32) break;
                        if (var3_4 == 35) ** GOTO lbl-1000
                        if (var3_4 == 44) break;
                        if (var3_4 == 47 || var3_4 == 61) ** GOTO lbl-1000
                        if (var3_4 == 123 || var3_4 == 125 || var3_4 == 58) break;
                        if (var3_4 == 59) ** GOTO lbl-1000
                        switch (var3_4) {
                            default: {
                                ++var1_3;
                                continue block5;
                            }
                            case 92: lbl-1000:
                            // 4 sources

                            {
                                this.checkLenient();
                                break block5;
                            }
lbl20:
                            // 1 sources

                            if (var1_3 < this.buffer.length) {
                                if (!this.fillBuffer(var1_3 + 1)) break block5;
                                continue block5;
                            }
                            break block10;
                            case 91: 
                            case 93: 
                        }
                        break;
                    }
                    var4_5 = var5_1 /* !! */ ;
                    break block11;
                }
                var4_5 = var5_1 /* !! */ ;
                if (var5_1 /* !! */  == null) {
                    var4_5 = new StringBuilder(Math.max(var1_3, 16));
                }
                var4_5.append(this.buffer, this.pos, var1_3);
                this.pos += var1_3;
                var5_1 /* !! */  = var4_5;
            } while (this.fillBuffer(1));
            var1_3 = var2_2;
        }
        if (var4_5 == null) {
            var4_5 = new String(this.buffer, this.pos, var1_3);
        } else {
            var4_5.append(this.buffer, this.pos, var1_3);
            var4_5 = var4_5.toString();
        }
        this.pos += var1_3;
        return var4_5;
    }

    private int peekKeyword() throws IOException {
        String string;
        String string2;
        int n8 = this.buffer[this.pos];
        if (n8 != 116 && n8 != 84) {
            if (n8 != 102 && n8 != 70) {
                if (n8 != 110 && n8 != 78) {
                    return 0;
                }
                string2 = "null";
                string = "NULL";
                n8 = 7;
            } else {
                string2 = "false";
                string = "FALSE";
                n8 = 6;
            }
        } else {
            string2 = "true";
            string = "TRUE";
            n8 = 5;
        }
        int n9 = string2.length();
        for (int i8 = 1; i8 < n9; ++i8) {
            if (this.pos + i8 >= this.limit && !this.fillBuffer(i8 + 1)) {
                return 0;
            }
            char c8 = this.buffer[this.pos + i8];
            if (c8 == string2.charAt(i8) || c8 == string.charAt(i8)) continue;
            return 0;
        }
        if ((this.pos + n9 < this.limit || this.fillBuffer(n9 + 1)) && this.isLiteral(this.buffer[this.pos + n9])) {
            return 0;
        }
        this.pos += n9;
        this.peeked = n8;
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int peekNumber() throws IOException {
        char[] cArray = this.buffer;
        int n8 = this.pos;
        int n9 = this.limit;
        int n10 = 0;
        int n11 = 0;
        int n12 = 1;
        long l8 = 0L;
        boolean bl = false;
        while (true) {
            boolean bl2;
            int n13;
            int n14;
            long l9;
            int n15;
            int n16;
            block22: {
                block26: {
                    block15: {
                        block16: {
                            block25: {
                                block17: {
                                    block18: {
                                        block14: {
                                            char c8;
                                            block19: {
                                                block20: {
                                                    block24: {
                                                        block23: {
                                                            block21: {
                                                                block13: {
                                                                    n16 = n8;
                                                                    n15 = n9;
                                                                    if (n8 + n10 != n9) break block13;
                                                                    if (n10 == cArray.length) {
                                                                        return 0;
                                                                    }
                                                                    if (!this.fillBuffer(n10 + 1)) break block14;
                                                                    n16 = this.pos;
                                                                    n15 = this.limit;
                                                                }
                                                                if ((c8 = cArray[n16 + n10]) == '+') break block15;
                                                                if (c8 == 'E' || c8 == 'e') break block16;
                                                                if (c8 == '-') break block17;
                                                                if (c8 == '.') break block18;
                                                                if (c8 < '0' || c8 > '9') break block19;
                                                                if (n11 == 1 || n11 == 0) break block20;
                                                                if (n11 != 2) break block21;
                                                                if (l8 == 0L) {
                                                                    return 0;
                                                                }
                                                                l9 = 10L * l8 - (long)(c8 - 48);
                                                                long l10 = l8 - -922337203685477580L;
                                                                n14 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                                                                n14 = n14 <= 0 && (n14 != 0 || l9 >= l8) ? 0 : 1;
                                                                n13 = n12 & n14;
                                                                n14 = n11;
                                                                bl2 = bl;
                                                                break block22;
                                                            }
                                                            if (n11 != 3) break block23;
                                                            n14 = 4;
                                                            n13 = n12;
                                                            l9 = l8;
                                                            bl2 = bl;
                                                            break block22;
                                                        }
                                                        if (n11 == 5) break block24;
                                                        n14 = n11;
                                                        n13 = n12;
                                                        l9 = l8;
                                                        bl2 = bl;
                                                        if (n11 != 6) break block22;
                                                    }
                                                    n14 = 7;
                                                    n13 = n12;
                                                    l9 = l8;
                                                    bl2 = bl;
                                                    break block22;
                                                }
                                                l9 = -(c8 - 48);
                                                n14 = 2;
                                                n13 = n12;
                                                bl2 = bl;
                                                break block22;
                                            }
                                            if (this.isLiteral(c8)) {
                                                return 0;
                                            }
                                        }
                                        if (!(n11 != 2 || n12 == 0 || l8 == Long.MIN_VALUE && !bl || l8 == 0L && bl)) {
                                            if (!bl) {
                                                l8 = -l8;
                                            }
                                            this.peekedLong = l8;
                                            this.pos += n10;
                                            this.peeked = 15;
                                            return 15;
                                        }
                                        if (n11 != 2 && n11 != 4 && n11 != 7) {
                                            return 0;
                                        }
                                        this.peekedNumberLength = n10;
                                        this.peeked = 16;
                                        return 16;
                                    }
                                    if (n11 != 2) {
                                        return 0;
                                    }
                                    n14 = 3;
                                    n13 = n12;
                                    l9 = l8;
                                    bl2 = bl;
                                    break block22;
                                }
                                if (n11 != 0) break block25;
                                n14 = 1;
                                bl2 = true;
                                n13 = n12;
                                l9 = l8;
                                break block22;
                            }
                            if (n11 != 5) {
                                return 0;
                            }
                            break block26;
                        }
                        if (n11 != 2 && n11 != 4) {
                            return 0;
                        }
                        n14 = 5;
                        n13 = n12;
                        l9 = l8;
                        bl2 = bl;
                        break block22;
                    }
                    if (n11 != 5) {
                        return 0;
                    }
                }
                n14 = 6;
                n13 = n12;
                l9 = l8;
                bl2 = bl;
            }
            ++n10;
            n8 = n16;
            n9 = n15;
            n11 = n14;
            n12 = n13;
            l8 = l9;
            bl = bl2;
        }
    }

    private void push(int n8) {
        int n9 = this.stackSize;
        int[] nArray = this.stack;
        if (n9 == nArray.length) {
            this.stack = Arrays.copyOf(nArray, n9 *= 2);
            this.pathIndices = Arrays.copyOf(this.pathIndices, n9);
            this.pathNames = Arrays.copyOf(this.pathNames, n9);
        }
        nArray = this.stack;
        n9 = this.stackSize;
        this.stackSize = n9 + 1;
        nArray[n9] = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private char readEscapeCharacter() throws IOException {
        int n8;
        if (this.pos == this.limit && !this.fillBuffer(1)) {
            throw this.syntaxError("Unterminated escape sequence");
        }
        Object object = this.buffer;
        int n9 = this.pos;
        this.pos = n8 = n9 + 1;
        char c8 = object[n9];
        if (c8 == '\n') {
            ++this.lineNumber;
            this.lineStart = n8;
            return c8;
        }
        char c9 = c8;
        if (c8 == '\"') return c9;
        c9 = c8;
        if (c8 == '\'') return c9;
        c9 = c8;
        if (c8 == '/') return c9;
        c9 = c8;
        if (c8 == '\\') return c9;
        if (c8 == 'b') return '\b';
        if (c8 == 'f') {
            return '\f';
        }
        if (c8 == 'n') {
            return '\n';
        }
        if (c8 == 'r') {
            return '\r';
        }
        if (c8 == 't') {
            return '\t';
        }
        if (c8 != 'u') {
            throw this.syntaxError("Invalid escape sequence");
        }
        if (n9 + 5 > this.limit && !this.fillBuffer(4)) {
            throw this.syntaxError("Unterminated escape sequence");
        }
        n9 = this.pos;
        c9 = '\u0000';
        n8 = n9;
        while (true) {
            int n10;
            if ((n10 = n8) >= n9 + 4) {
                this.pos += 4;
                return c9;
            }
            n8 = this.buffer[n10];
            char c10 = (char)(c9 << 4);
            if (n8 >= 48 && n8 <= 57) {
                n8 -= 48;
            } else if (n8 >= 97 && n8 <= 102) {
                n8 -= 87;
            } else {
                if (n8 < 65 || n8 > 70) break;
                n8 -= 55;
            }
            c9 = (char)(c10 + n8);
            n8 = n10 + 1;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("\\u");
        ((StringBuilder)object).append(new String(this.buffer, this.pos, 4));
        throw new NumberFormatException(((StringBuilder)object).toString());
    }

    private void skipQuotedValue(char c8) throws IOException {
        char[] cArray = this.buffer;
        do {
            int n8 = this.pos;
            int n9 = this.limit;
            while (n8 < n9) {
                int n10 = n8 + 1;
                if ((n8 = cArray[n8]) == c8) {
                    this.pos = n10;
                    return;
                }
                if (n8 == 92) {
                    this.pos = n10;
                    this.readEscapeCharacter();
                    n8 = this.pos;
                    n9 = this.limit;
                    continue;
                }
                if (n8 == 10) {
                    ++this.lineNumber;
                    this.lineStart = n10;
                }
                n8 = n10;
            }
            this.pos = n8;
        } while (this.fillBuffer(1));
        throw this.syntaxError("Unterminated string");
    }

    private boolean skipTo(String string) throws IOException {
        int n8 = string.length();
        block0: while (true) {
            int n9 = ++this.pos;
            int n10 = this.limit;
            if (n9 + n8 > n10 && !this.fillBuffer(n8)) {
                return false;
            }
            char[] cArray = this.buffer;
            n10 = this.pos;
            if (cArray[n10] == '\n') {
                ++this.lineNumber;
                this.lineStart = n10 + 1;
                continue;
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                if (this.buffer[this.pos + i8] == string.charAt(i8)) continue;
                continue block0;
            }
            break;
        }
        return true;
    }

    private void skipToEndOfLine() throws IOException {
        while (this.pos < this.limit || this.fillBuffer(1)) {
            int n8;
            char[] cArray = this.buffer;
            int n9 = this.pos;
            this.pos = n8 = n9 + 1;
            if ((n9 = cArray[n9]) == 10) {
                ++this.lineNumber;
                this.lineStart = n8;
                return;
            }
            if (n9 != 13) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void skipUnquotedValue() throws IOException {
        do {
            var1_1 = 0;
            block5: while ((var2_2 = this.pos) + var1_1 < this.limit) {
                block6: {
                    if ((var2_2 = this.buffer[var2_2 + var1_1]) == 9 || var2_2 == 10 || var2_2 == 12 || var2_2 == 13 || var2_2 == 32) break block6;
                    if (var2_2 == 35) ** GOTO lbl-1000
                    if (var2_2 == 44) break block6;
                    if (var2_2 == 47 || var2_2 == 61) ** GOTO lbl-1000
                    if (var2_2 == 123 || var2_2 == 125 || var2_2 == 58) break block6;
                    if (var2_2 == 59) ** GOTO lbl-1000
                    switch (var2_2) {
                        default: {
                            ++var1_1;
                            continue block5;
                        }
                        case 92: lbl-1000:
                        // 4 sources

                        {
                            this.checkLenient();
                        }
                        case 91: 
                        case 93: 
                    }
                }
                this.pos += var1_1;
                return;
            }
            this.pos = var2_2 + var1_1;
        } while (this.fillBuffer(1));
    }

    private IOException syntaxError(String string) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(this.locationString());
        throw new MalformedJsonException(stringBuilder.toString());
    }

    public void beginArray() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 3) {
            this.push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void beginObject() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 1) {
            this.push(3);
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    int doPeek() throws IOException {
        int n8;
        int n9;
        block32: {
            block37: {
                block30: {
                    block36: {
                        block35: {
                            block33: {
                                block34: {
                                    Object[] objectArray;
                                    block31: {
                                        block29: {
                                            objectArray = this.stack;
                                            n9 = this.stackSize;
                                            n8 = objectArray[n9 - 1];
                                            if (n8 != 1) break block29;
                                            objectArray[n9 - 1] = 2;
                                            break block30;
                                        }
                                        if (n8 != 2) break block31;
                                        n9 = this.nextNonWhitespace(true);
                                        if (n9 != 44) {
                                            if (n9 != 59) {
                                                if (n9 == 93) {
                                                    this.peeked = 4;
                                                    return 4;
                                                }
                                                throw this.syntaxError("Unterminated array");
                                            }
                                            this.checkLenient();
                                        }
                                        break block30;
                                    }
                                    if (n8 == 3 || n8 == 5) break block32;
                                    if (n8 != 4) break block33;
                                    objectArray[n9 - 1] = 5;
                                    n9 = this.nextNonWhitespace(true);
                                    if (n9 == 58) break block30;
                                    if (n9 != 61) break block34;
                                    this.checkLenient();
                                    if ((this.pos < this.limit || this.fillBuffer(1)) && (objectArray = (Object[])this.buffer)[n9 = this.pos] == 62) {
                                        this.pos = n9 + 1;
                                    }
                                    break block30;
                                }
                                throw this.syntaxError("Expected ':'");
                            }
                            if (n8 != 6) break block35;
                            if (this.lenient) {
                                this.consumeNonExecutePrefix();
                            }
                            this.stack[this.stackSize - 1] = 7;
                            break block30;
                        }
                        if (n8 != 7) break block36;
                        if (this.nextNonWhitespace(false) == -1) {
                            this.peeked = 17;
                            return 17;
                        }
                        this.checkLenient();
                        --this.pos;
                        break block30;
                    }
                    if (n8 == 8) break block37;
                }
                n9 = this.nextNonWhitespace(true);
                if (n9 != 34) {
                    if (n9 != 39) {
                        if (n9 != 44 && n9 != 59) {
                            if (n9 != 91) {
                                if (n9 != 93) {
                                    if (n9 != 123) {
                                        --this.pos;
                                        n8 = this.peekKeyword();
                                        if (n8 != 0) {
                                            return n8;
                                        }
                                        n8 = this.peekNumber();
                                        if (n8 != 0) {
                                            return n8;
                                        }
                                        if (this.isLiteral(this.buffer[this.pos])) {
                                            this.checkLenient();
                                            this.peeked = 10;
                                            return 10;
                                        }
                                        throw this.syntaxError("Expected value");
                                    }
                                    this.peeked = 1;
                                    return 1;
                                }
                                if (n8 == 1) {
                                    this.peeked = 4;
                                    return 4;
                                }
                            } else {
                                this.peeked = 3;
                                return 3;
                            }
                        }
                        if (n8 != 1 && n8 != 2) {
                            throw this.syntaxError("Unexpected value");
                        }
                        this.checkLenient();
                        --this.pos;
                        this.peeked = 7;
                        return 7;
                    }
                    this.checkLenient();
                    this.peeked = 8;
                    return 8;
                }
                this.peeked = 9;
                return 9;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        objectArray[n9 - 1] = 4;
        if (n8 == 5 && (n9 = this.nextNonWhitespace(true)) != 44) {
            if (n9 != 59) {
                if (n9 == 125) {
                    this.peeked = 2;
                    return 2;
                }
                throw this.syntaxError("Unterminated object");
            }
            this.checkLenient();
        }
        if ((n9 = this.nextNonWhitespace(true)) != 34) {
            if (n9 != 39) {
                if (n9 != 125) {
                    this.checkLenient();
                    --this.pos;
                    if (this.isLiteral((char)n9)) {
                        this.peeked = 14;
                        return 14;
                    }
                    throw this.syntaxError("Expected name");
                }
                if (n8 != 5) {
                    this.peeked = 2;
                    return 2;
                }
                throw this.syntaxError("Expected name");
            }
            this.checkLenient();
            this.peeked = 12;
            return 12;
        }
        this.peeked = 13;
        return 13;
    }

    public void endArray() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 4) {
            n9 = this.stackSize;
            this.stackSize = n9 - 1;
            int[] nArray = this.pathIndices;
            nArray[n9 -= 2] = nArray[n9] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void endObject() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 2) {
            n8 = this.stackSize;
            this.stackSize = n9 = n8 - 1;
            this.pathNames[n9] = null;
            int[] nArray = this.pathIndices;
            n9 = n8 - 2;
            nArray[n9] = nArray[n9] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String getPath() {
        return this.getPath(false);
    }

    public String getPreviousPath() {
        return this.getPath(true);
    }

    public boolean hasNext() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        return n9 != 2 && n9 != 4 && n9 != 17;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    String locationString() {
        int n8 = this.lineNumber;
        int n9 = this.pos;
        int n10 = this.lineStart;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(n8 + 1);
        stringBuilder.append(" column ");
        stringBuilder.append(n9 - n10 + 1);
        stringBuilder.append(" path ");
        stringBuilder.append(this.getPath());
        return stringBuilder.toString();
    }

    public boolean nextBoolean() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 5) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return true;
        }
        if (n9 == 6) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a boolean but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public double nextDouble() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 15) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return this.peekedLong;
        }
        if (n9 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (n9 != 8 && n9 != 9) {
            if (n9 == 10) {
                this.peekedString = this.nextUnquotedValue();
            } else if (n9 != 11) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a double but was ");
                stringBuilder.append((Object)this.peek());
                stringBuilder.append(this.locationString());
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else {
            char c8 = n9 == 8 ? (char)'\'' : '\"';
            this.peekedString = this.nextQuotedValue(c8);
        }
        this.peeked = 11;
        double d8 = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d8);
            stringBuilder.append(this.locationString());
            throw new MalformedJsonException(stringBuilder.toString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] nArray = this.pathIndices;
        n9 = this.stackSize - 1;
        nArray[n9] = nArray[n9] + 1;
        return d8;
    }

    public int nextInt() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 15) {
            long l8 = this.peekedLong;
            n8 = (int)l8;
            if (l8 == (long)n8) {
                this.peeked = 0;
                int[] nArray = this.pathIndices;
                n9 = this.stackSize - 1;
                nArray[n9] = nArray[n9] + 1;
                return n8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected an int but was ");
            stringBuilder.append(this.peekedLong);
            stringBuilder.append(this.locationString());
            throw new NumberFormatException(stringBuilder.toString());
        }
        if (n9 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            int[] nArray;
            if (n9 != 8 && n9 != 9 && n9 != 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected an int but was ");
                stringBuilder.append((Object)this.peek());
                stringBuilder.append(this.locationString());
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (n9 == 10) {
                this.peekedString = this.nextUnquotedValue();
            } else {
                char c8 = n9 == 8 ? (char)'\'' : '\"';
                this.peekedString = this.nextQuotedValue(c8);
            }
            try {
                n8 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                nArray = this.pathIndices;
                n9 = this.stackSize - 1;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            nArray[n9] = nArray[n9] + 1;
            return n8;
        }
        this.peeked = 11;
        double d8 = Double.parseDouble(this.peekedString);
        n9 = (int)d8;
        if ((double)n9 == d8) {
            this.peekedString = null;
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n8 = this.stackSize - 1;
            nArray[n8] = nArray[n8] + 1;
            return n9;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected an int but was ");
        stringBuilder.append(this.peekedString);
        stringBuilder.append(this.locationString());
        throw new NumberFormatException(stringBuilder.toString());
    }

    public long nextLong() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 15) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return this.peekedLong;
        }
        if (n9 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            int[] nArray;
            long l8;
            if (n9 != 8 && n9 != 9 && n9 != 10) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected a long but was ");
                stringBuilder.append((Object)this.peek());
                stringBuilder.append(this.locationString());
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (n9 == 10) {
                this.peekedString = this.nextUnquotedValue();
            } else {
                char c8 = n9 == 8 ? (char)'\'' : '\"';
                this.peekedString = this.nextQuotedValue(c8);
            }
            try {
                l8 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                nArray = this.pathIndices;
                n9 = this.stackSize - 1;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            nArray[n9] = nArray[n9] + 1;
            return l8;
        }
        this.peeked = 11;
        double d8 = Double.parseDouble(this.peekedString);
        long l9 = (long)d8;
        if ((double)l9 == d8) {
            this.peekedString = null;
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return l9;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a long but was ");
        stringBuilder.append(this.peekedString);
        stringBuilder.append(this.locationString());
        throw new NumberFormatException(stringBuilder.toString());
    }

    public String nextName() throws IOException {
        block7: {
            String string;
            block5: {
                int n8;
                block6: {
                    block4: {
                        int n9;
                        n8 = n9 = this.peeked;
                        if (n9 == 0) {
                            n8 = this.doPeek();
                        }
                        if (n8 != 14) break block4;
                        string = this.nextUnquotedValue();
                        break block5;
                    }
                    if (n8 != 12) break block6;
                    string = this.nextQuotedValue('\'');
                    break block5;
                }
                if (n8 != 13) break block7;
                string = this.nextQuotedValue('\"');
            }
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = string;
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a name but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void nextNull() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        if (n9 == 7) {
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n9 = this.stackSize - 1;
            nArray[n9] = nArray[n9] + 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String nextString() throws IOException {
        block10: {
            String string;
            int n8;
            block5: {
                block9: {
                    block8: {
                        block7: {
                            block6: {
                                block4: {
                                    int n9;
                                    n8 = n9 = this.peeked;
                                    if (n9 == 0) {
                                        n8 = this.doPeek();
                                    }
                                    if (n8 != 10) break block4;
                                    string = this.nextUnquotedValue();
                                    break block5;
                                }
                                if (n8 != 8) break block6;
                                string = this.nextQuotedValue('\'');
                                break block5;
                            }
                            if (n8 != 9) break block7;
                            string = this.nextQuotedValue('\"');
                            break block5;
                        }
                        if (n8 != 11) break block8;
                        string = this.peekedString;
                        this.peekedString = null;
                        break block5;
                    }
                    if (n8 != 15) break block9;
                    string = Long.toString(this.peekedLong);
                    break block5;
                }
                if (n8 != 16) break block10;
                string = new String(this.buffer, this.pos, this.peekedNumberLength);
                this.pos += this.peekedNumberLength;
            }
            this.peeked = 0;
            int[] nArray = this.pathIndices;
            n8 = this.stackSize - 1;
            nArray[n8] = nArray[n8] + 1;
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a string but was ");
        stringBuilder.append((Object)this.peek());
        stringBuilder.append(this.locationString());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public JsonToken peek() throws IOException {
        int n8;
        int n9 = n8 = this.peeked;
        if (n8 == 0) {
            n9 = this.doPeek();
        }
        switch (n9) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return JsonToken.END_DOCUMENT;
            }
            case 15: 
            case 16: {
                return JsonToken.NUMBER;
            }
            case 12: 
            case 13: 
            case 14: {
                return JsonToken.NAME;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return JsonToken.STRING;
            }
            case 7: {
                return JsonToken.NULL;
            }
            case 5: 
            case 6: {
                return JsonToken.BOOLEAN;
            }
            case 4: {
                return JsonToken.END_ARRAY;
            }
            case 3: {
                return JsonToken.BEGIN_ARRAY;
            }
            case 2: {
                return JsonToken.END_OBJECT;
            }
            case 1: 
        }
        return JsonToken.BEGIN_OBJECT;
    }

    public final void setLenient(boolean bl) {
        this.lenient = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void skipValue() throws IOException {
        int n8;
        int n9 = 0;
        do {
            block8: {
                block12: {
                    block13: {
                        int n10;
                        block11: {
                            block10: {
                                block9: {
                                    block7: {
                                        block6: {
                                            block5: {
                                                n10 = n8 = this.peeked;
                                                if (n8 == 0) {
                                                    n10 = this.doPeek();
                                                }
                                                if (n10 != 3) break block5;
                                                this.push(1);
                                                break block6;
                                            }
                                            if (n10 != 1) break block7;
                                            this.push(3);
                                        }
                                        n8 = n9 + 1;
                                        break block8;
                                    }
                                    if (n10 != 4) break block9;
                                    --this.stackSize;
                                    break block10;
                                }
                                if (n10 != 2) break block11;
                                --this.stackSize;
                            }
                            n8 = n9 - 1;
                            break block8;
                        }
                        if (n10 == 14 || n10 == 10) break block12;
                        if (n10 == 8 || n10 == 12) break block13;
                        if (n10 != 9 && n10 != 13) {
                            n8 = n9;
                            if (n10 == 16) {
                                this.pos += this.peekedNumberLength;
                                n8 = n9;
                            }
                            break block8;
                        } else {
                            this.skipQuotedValue('\"');
                            n8 = n9;
                        }
                        break block8;
                    }
                    this.skipQuotedValue('\'');
                    n8 = n9;
                    break block8;
                }
                this.skipUnquotedValue();
                n8 = n9;
            }
            this.peeked = 0;
            n9 = n8;
        } while (n8 != 0);
        int[] nArray = this.pathIndices;
        n8 = this.stackSize;
        n9 = n8 - 1;
        nArray[n9] = nArray[n9] + 1;
        this.pathNames[n8 - 1] = "null";
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(this.locationString());
        return stringBuilder.toString();
    }
}

