/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import ax.h5.e;
import ax.i5.a;
import ax.i5.b;
import ax.i5.c;
import ax.i5.f;
import ax.i5.i;
import java.io.IOException;
import java.nio.ByteBuffer;

public class h
extends ax.h5.a {
    private ax.e5.a c0;
    private b d0;
    private c e0;
    private f f0;
    private a g0;
    private i h0;

    private h(ax.e5.a a8, b b8, c c8, i i8, f f8) {
        this.c0 = a8;
        this.d0 = b8;
        this.e0 = c8;
        this.h0 = i8;
        this.f0 = f8;
    }

    public static h b(i i8, ax.e5.a a8, b b8, c c8, f f8) throws IOException {
        return new h(a8, b8, c8, i8, f8);
    }

    private void c() throws IOException {
        if (this.g0 == null) {
            this.g0 = new a(this.h0.i(), this.c0, this.d0, this.e0);
        }
    }

    @Override
    public e[] B0() throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override
    public e H0(String string) {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override
    public void R0(long l8) {
        this.h0.c().K(l8);
    }

    @Override
    public String W0() {
        i i8 = this.h0;
        if (i8 != null) {
            return i8.f();
        }
        return "null entry";
    }

    @Override
    public void X0(e e8) throws IOException {
        this.f0.g(this.h0, e8);
        this.f0 = (f)e8;
    }

    @Override
    public String[] c0() {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override
    public void close() throws IOException {
        this.flush();
    }

    public void d(long l8) throws IOException {
        this.c();
        this.g0.f(l8);
        this.h0.n(l8);
    }

    @Override
    public void delete() throws IOException {
        this.c();
        this.f0.o(this.h0);
        this.f0.q();
        this.g0.f(0L);
    }

    public void flush() throws IOException {
        this.f0.q();
    }

    @Override
    public long getLength() {
        return this.h0.e();
    }

    @Override
    public String getName() {
        return this.h0.g();
    }

    @Override
    public e getParent() {
        return this.f0;
    }

    @Override
    public long h() {
        return this.h0.c().l();
    }

    @Override
    public void i(long l8, ByteBuffer byteBuffer) throws IOException {
        this.c();
        this.h0.o();
        this.g0.d(l8, byteBuffer);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public void l(long l8, ByteBuffer byteBuffer) throws IOException {
        this.c();
        long l9 = (long)byteBuffer.remaining() + l8;
        if (l9 > this.getLength()) {
            this.d(l9);
        }
        this.h0.p();
        this.g0.g(l8, byteBuffer);
    }

    @Override
    public e n(String string) throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override
    public e p0(String string) throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override
    public boolean q0() {
        return false;
    }

    @Override
    public void w0(String string) throws IOException {
        this.f0.p(this.h0, string);
    }

    @Override
    public String z() {
        i i8 = this.h0;
        if (i8 != null) {
            return i8.h();
        }
        return "null entry";
    }
}

