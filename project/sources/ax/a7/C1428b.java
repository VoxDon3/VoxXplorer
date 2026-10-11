package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonWriter;
import ax.l7.AbstractC2476d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@TargetApi(11)
/* renamed from: ax.a7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1428b extends AbstractC2476d {
    private final C1427a c0;
    private final JsonWriter q;

    C1428b(C1427a c1427a, JsonWriter jsonWriter) {
        this.c0 = c1427a;
        this.q = jsonWriter;
        jsonWriter.setLenient(true);
    }

    @Override // ax.l7.AbstractC2476d
    public void A() throws IOException {
        this.q.beginArray();
    }

    @Override // ax.l7.AbstractC2476d
    public void F() throws IOException {
        this.q.beginObject();
    }

    @Override // ax.l7.AbstractC2476d
    public void H(String str) throws IOException {
        this.q.value(str);
    }

    @Override // ax.l7.AbstractC2476d
    public void a() throws IOException {
        this.q.setIndent("  ");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // ax.l7.AbstractC2476d
    public void d(boolean z) throws IOException {
        this.q.value(z);
    }

    @Override // ax.l7.AbstractC2476d
    public void e() throws IOException {
        this.q.endArray();
    }

    @Override // ax.l7.AbstractC2476d
    public void f() throws IOException {
        this.q.endObject();
    }

    @Override // ax.l7.AbstractC2476d, java.io.Flushable
    public void flush() throws IOException {
        this.q.flush();
    }

    @Override // ax.l7.AbstractC2476d
    public void g(String str) throws IOException {
        this.q.name(str);
    }

    @Override // ax.l7.AbstractC2476d
    public void j() throws IOException {
        this.q.nullValue();
    }

    @Override // ax.l7.AbstractC2476d
    public void m(double d) throws IOException {
        this.q.value(d);
    }

    @Override // ax.l7.AbstractC2476d
    public void o(float f) throws IOException {
        this.q.value(f);
    }

    @Override // ax.l7.AbstractC2476d
    public void p(int i) throws IOException {
        this.q.value(i);
    }

    @Override // ax.l7.AbstractC2476d
    public void q(long j) throws IOException {
        this.q.value(j);
    }

    @Override // ax.l7.AbstractC2476d
    public void u(BigDecimal bigDecimal) throws IOException {
        this.q.value(bigDecimal);
    }

    @Override // ax.l7.AbstractC2476d
    public void v(BigInteger bigInteger) throws IOException {
        this.q.value(bigInteger);
    }
}
