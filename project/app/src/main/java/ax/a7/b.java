/*
 * Decompiled with CFR 0.152.
 */
package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonWriter;
import ax.a7.a;
import ax.l7.d;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@TargetApi(value=11)
class b
extends d {
    private final a c0;
    private final JsonWriter q;

    b(a a8, JsonWriter jsonWriter) {
        this.c0 = a8;
        this.q = jsonWriter;
        jsonWriter.setLenient(true);
    }

    @Override
    public void A() throws IOException {
        this.q.beginArray();
    }

    @Override
    public void F() throws IOException {
        this.q.beginObject();
    }

    @Override
    public void H(String string) throws IOException {
        this.q.value(string);
    }

    @Override
    public void a() throws IOException {
        this.q.setIndent("  ");
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public void d(boolean bl) throws IOException {
        this.q.value(bl);
    }

    @Override
    public void e() throws IOException {
        this.q.endArray();
    }

    @Override
    public void f() throws IOException {
        this.q.endObject();
    }

    @Override
    public void flush() throws IOException {
        this.q.flush();
    }

    @Override
    public void g(String string) throws IOException {
        this.q.name(string);
    }

    @Override
    public void j() throws IOException {
        this.q.nullValue();
    }

    @Override
    public void m(double d8) throws IOException {
        this.q.value(d8);
    }

    @Override
    public void o(float f8) throws IOException {
        this.q.value((double)f8);
    }

    @Override
    public void p(int n8) throws IOException {
        this.q.value((long)n8);
    }

    @Override
    public void q(long l8) throws IOException {
        this.q.value(l8);
    }

    @Override
    public void u(BigDecimal bigDecimal) throws IOException {
        this.q.value((Number)bigDecimal);
    }

    @Override
    public void v(BigInteger bigInteger) throws IOException {
        this.q.value((Number)bigInteger);
    }
}

