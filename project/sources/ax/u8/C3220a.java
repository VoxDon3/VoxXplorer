package ax.u8;

import ax.r8.AbstractC3000i;
import ax.r8.C2997f;
import ax.r8.C3002k;
import ax.r8.C3003l;
import ax.r8.C3006o;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.u8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3220a extends JsonWriter {
    private static final Writer e0 = new C0471a();
    private static final C3006o f0 = new C3006o("closed");
    private String c0;
    private AbstractC3000i d0;
    private final List<AbstractC3000i> q;

    /* renamed from: ax.u8.a$a, reason: collision with other inner class name */
    class C0471a extends Writer implements AutoCloseable {
        C0471a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C3220a() {
        super(e0);
        this.q = new ArrayList();
        this.d0 = C3002k.q;
    }

    private AbstractC3000i b() {
        return this.q.get(r0.size() - 1);
    }

    private void c(AbstractC3000i abstractC3000i) {
        if (this.c0 != null) {
            if (!abstractC3000i.n() || getSerializeNulls()) {
                ((C3003l) b()).r(this.c0, abstractC3000i);
            }
            this.c0 = null;
            return;
        }
        if (this.q.isEmpty()) {
            this.d0 = abstractC3000i;
            return;
        }
        AbstractC3000i b = b();
        if (!(b instanceof C2997f)) {
            throw new IllegalStateException();
        }
        ((C2997f) b).r(abstractC3000i);
    }

    public AbstractC3000i a() {
        if (this.q.isEmpty()) {
            return this.d0;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.q);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        C2997f c2997f = new C2997f();
        c(c2997f);
        this.q.add(c2997f);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        C3003l c3003l = new C3003l();
        c(c3003l);
        this.q.add(c3003l);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.q.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.q.add(f0);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.q.isEmpty() || this.c0 != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof C2997f)) {
            throw new IllegalStateException();
        }
        this.q.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.q.isEmpty() || this.c0 != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof C3003l)) {
            throw new IllegalStateException();
        }
        this.q.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.q.isEmpty() || this.c0 != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof C3003l)) {
            throw new IllegalStateException();
        }
        this.c0 = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        c(C3002k.q);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        c(new C3006o(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        c(new C3006o(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        c(new C3006o(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f) throws IOException {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        c(new C3006o(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        c(new C3006o(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) throws IOException {
        c(new C3006o(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c(new C3006o(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }
}
