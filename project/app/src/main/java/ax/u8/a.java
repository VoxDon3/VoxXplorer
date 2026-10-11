/*
 * Decompiled with CFR 0.152.
 */
package ax.u8;

import ax.r8.f;
import ax.r8.i;
import ax.r8.k;
import ax.r8.l;
import ax.r8.o;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class a
extends JsonWriter {
    private static final Writer e0 = new AutoCloseable(){

        @Override
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override
        public void write(char[] cArray, int n8, int n9) {
            throw new AssertionError();
        }
    };
    private static final o f0 = new o("closed");
    private String c0;
    private i d0;
    private final List<i> q = new ArrayList<i>();

    public a() {
        super(e0);
        this.d0 = k.q;
    }

    private i b() {
        List<i> list = this.q;
        return list.get(list.size() - 1);
    }

    private void c(i i8) {
        if (this.c0 != null) {
            if (!i8.n() || this.getSerializeNulls()) {
                ((l)this.b()).r(this.c0, i8);
            }
            this.c0 = null;
            return;
        }
        if (this.q.isEmpty()) {
            this.d0 = i8;
            return;
        }
        i i9 = this.b();
        if (i9 instanceof f) {
            ((f)i9).r(i8);
            return;
        }
        throw new IllegalStateException();
    }

    public i a() {
        if (this.q.isEmpty()) {
            return this.d0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.q);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public JsonWriter beginArray() throws IOException {
        f f8 = new f();
        this.c(f8);
        this.q.add(f8);
        return this;
    }

    @Override
    public JsonWriter beginObject() throws IOException {
        l l8 = new l();
        this.c(l8);
        this.q.add(l8);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (this.q.isEmpty()) {
            this.q.add(f0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public JsonWriter endArray() throws IOException {
        if (!this.q.isEmpty() && this.c0 == null) {
            if (this.b() instanceof f) {
                List<i> list = this.q;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public JsonWriter endObject() throws IOException {
        if (!this.q.isEmpty() && this.c0 == null) {
            if (this.b() instanceof l) {
                List<i> list = this.q;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public JsonWriter name(String string) throws IOException {
        if (string != null) {
            if (!this.q.isEmpty() && this.c0 == null) {
                if (this.b() instanceof l) {
                    this.c0 = string;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override
    public JsonWriter nullValue() throws IOException {
        this.c(k.q);
        return this;
    }

    @Override
    public JsonWriter value(double d8) throws IOException {
        if (!this.isLenient() && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.c(new o(d8));
        return this;
    }

    @Override
    public JsonWriter value(float f8) throws IOException {
        if (!this.isLenient() && (Float.isNaN(f8) || Float.isInfinite(f8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(f8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.c(new o(Float.valueOf(f8)));
        return this;
    }

    @Override
    public JsonWriter value(long l8) throws IOException {
        this.c(new o(l8));
        return this;
    }

    @Override
    public JsonWriter value(Boolean bl) throws IOException {
        if (bl == null) {
            return this.nullValue();
        }
        this.c(new o(bl));
        return this;
    }

    @Override
    public JsonWriter value(Number number) throws IOException {
        double d8;
        if (number == null) {
            return this.nullValue();
        }
        if (!this.isLenient() && (Double.isNaN(d8 = number.doubleValue()) || Double.isInfinite(d8))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.c(new o(number));
        return this;
    }

    @Override
    public JsonWriter value(String string) throws IOException {
        if (string == null) {
            return this.nullValue();
        }
        this.c(new o(string));
        return this;
    }

    @Override
    public JsonWriter value(boolean bl) throws IOException {
        this.c(new o(bl));
        return this;
    }
}

