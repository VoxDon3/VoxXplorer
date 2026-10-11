package ax.Dc;

import java.util.Arrays;

/* renamed from: ax.Dc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0685u implements N {
    private byte[] c0;
    private byte[] d0;
    private W q;

    public void a(byte[] bArr) {
        this.d0 = Z.c(bArr);
    }

    @Override // ax.Dc.N
    public W b() {
        return this.q;
    }

    @Override // ax.Dc.N
    public W c() {
        byte[] bArr = this.c0;
        return new W(bArr != null ? bArr.length : 0);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) {
        g(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public void e(W w) {
        this.q = w;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        return Z.c(this.c0);
    }

    public void g(byte[] bArr) {
        this.c0 = Z.c(bArr);
    }

    @Override // ax.Dc.N
    public byte[] h() {
        byte[] bArr = this.d0;
        return bArr != null ? Z.c(bArr) : f();
    }

    @Override // ax.Dc.N
    public W i() {
        return this.d0 != null ? new W(this.d0.length) : c();
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        a(copyOfRange);
        if (this.c0 == null) {
            g(copyOfRange);
        }
    }
}
