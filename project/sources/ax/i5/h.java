package ax.i5;

import ax.e5.InterfaceC1979a;
import ax.h5.AbstractC2151a;
import ax.h5.InterfaceC2155e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class h extends AbstractC2151a {
    private InterfaceC1979a c0;
    private C2270b d0;
    private c e0;
    private f f0;
    private C2269a g0;
    private i h0;

    private h(InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar, i iVar, f fVar) {
        this.c0 = interfaceC1979a;
        this.d0 = c2270b;
        this.e0 = cVar;
        this.h0 = iVar;
        this.f0 = fVar;
    }

    public static h b(i iVar, InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar, f fVar) throws IOException {
        return new h(interfaceC1979a, c2270b, cVar, iVar, fVar);
    }

    private void c() throws IOException {
        if (this.g0 == null) {
            this.g0 = new C2269a(this.h0.i(), this.c0, this.d0, this.e0);
        }
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e[] B0() throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override // ax.h5.AbstractC2151a, ax.h5.InterfaceC2155e
    public InterfaceC2155e H0(String str) {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override // ax.h5.InterfaceC2155e
    public void R0(long j) {
        this.h0.c().K(j);
    }

    @Override // ax.h5.InterfaceC2155e
    public String W0() {
        i iVar = this.h0;
        return iVar != null ? iVar.f() : "null entry";
    }

    @Override // ax.h5.InterfaceC2155e
    public void X0(InterfaceC2155e interfaceC2155e) throws IOException {
        this.f0.g(this.h0, interfaceC2155e);
        this.f0 = (f) interfaceC2155e;
    }

    @Override // ax.h5.InterfaceC2155e
    public String[] c0() {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override // ax.h5.InterfaceC2155e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    public void d(long j) throws IOException {
        c();
        this.g0.f(j);
        this.h0.n(j);
    }

    @Override // ax.h5.InterfaceC2155e
    public void delete() throws IOException {
        c();
        this.f0.o(this.h0);
        this.f0.q();
        this.g0.f(0L);
    }

    public void flush() throws IOException {
        this.f0.q();
    }

    @Override // ax.h5.InterfaceC2155e
    public long getLength() {
        return this.h0.e();
    }

    @Override // ax.h5.InterfaceC2155e
    public String getName() {
        return this.h0.g();
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e getParent() {
        return this.f0;
    }

    @Override // ax.h5.InterfaceC2155e
    public long h() {
        return this.h0.c().l();
    }

    @Override // ax.h5.InterfaceC2155e
    public void i(long j, ByteBuffer byteBuffer) throws IOException {
        c();
        this.h0.o();
        this.g0.d(j, byteBuffer);
    }

    @Override // ax.h5.InterfaceC2155e
    public boolean isDirectory() {
        return false;
    }

    @Override // ax.h5.InterfaceC2155e
    public void l(long j, ByteBuffer byteBuffer) throws IOException {
        c();
        long remaining = byteBuffer.remaining() + j;
        if (remaining > getLength()) {
            d(remaining);
        }
        this.h0.p();
        this.g0.g(j, byteBuffer);
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e n(String str) throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e p0(String str) throws IOException {
        throw new UnsupportedOperationException("This is a file!");
    }

    @Override // ax.h5.InterfaceC2155e
    public boolean q0() {
        return false;
    }

    @Override // ax.h5.InterfaceC2155e
    public void w0(String str) throws IOException {
        this.f0.p(this.h0, str);
    }

    @Override // ax.h5.InterfaceC2155e
    public String z() {
        i iVar = this.h0;
        return iVar != null ? iVar.h() : "null entry";
    }
}
