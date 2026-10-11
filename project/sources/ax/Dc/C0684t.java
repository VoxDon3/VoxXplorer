package ax.Dc;

import java.util.Arrays;

/* renamed from: ax.Dc.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0684t implements N {
    private static final W d0 = new W(44225);
    private byte[] c0;
    private byte[] q;

    @Override // ax.Dc.N
    public W b() {
        return d0;
    }

    @Override // ax.Dc.N
    public W c() {
        byte[] bArr = this.q;
        return new W(bArr == null ? 0 : bArr.length);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) {
        this.q = Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // ax.Dc.N
    public byte[] f() {
        return Z.c(this.q);
    }

    @Override // ax.Dc.N
    public byte[] h() {
        byte[] bArr = this.c0;
        return bArr == null ? f() : Z.c(bArr);
    }

    @Override // ax.Dc.N
    public W i() {
        return this.c0 == null ? c() : new W(this.c0.length);
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) {
        this.c0 = Arrays.copyOfRange(bArr, i, i + i2);
        if (this.q == null) {
            d(bArr, i, i2);
        }
    }
}
