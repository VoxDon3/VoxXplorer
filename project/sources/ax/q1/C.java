package ax.q1;

import java.io.IOException;

/* loaded from: classes.dex */
public class C implements InterfaceC2858s {
    private final InterfaceC2858s a;

    public C(InterfaceC2858s interfaceC2858s) {
        this.a = interfaceC2858s;
    }

    @Override // ax.q1.InterfaceC2858s
    public int a(int i) throws IOException {
        return this.a.a(i);
    }

    @Override // ax.q1.InterfaceC2858s, ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws IOException {
        return this.a.c(bArr, i, i2);
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.e(bArr, i, i2, z);
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean g(int i, boolean z) throws IOException {
        return this.a.g(i, z);
    }

    @Override // ax.q1.InterfaceC2858s
    public long getLength() {
        return this.a.getLength();
    }

    @Override // ax.q1.InterfaceC2858s
    public long getPosition() {
        return this.a.getPosition();
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean h(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.h(bArr, i, i2, z);
    }

    @Override // ax.q1.InterfaceC2858s
    public long i() {
        return this.a.i();
    }

    @Override // ax.q1.InterfaceC2858s
    public void j(int i) throws IOException {
        this.a.j(i);
    }

    @Override // ax.q1.InterfaceC2858s
    public int k(byte[] bArr, int i, int i2) throws IOException {
        return this.a.k(bArr, i, i2);
    }

    @Override // ax.q1.InterfaceC2858s
    public void m() {
        this.a.m();
    }

    @Override // ax.q1.InterfaceC2858s
    public void n(int i) throws IOException {
        this.a.n(i);
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean o(int i, boolean z) throws IOException {
        return this.a.o(i, z);
    }

    @Override // ax.q1.InterfaceC2858s
    public void p(byte[] bArr, int i, int i2) throws IOException {
        this.a.p(bArr, i, i2);
    }

    @Override // ax.q1.InterfaceC2858s
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.readFully(bArr, i, i2);
    }
}
