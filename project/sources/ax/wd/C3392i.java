package ax.wd;

import ax.vd.u;

/* renamed from: ax.wd.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3392i extends C3386c implements u {
    public C3392i(int i) {
        super(s(i));
    }

    private static int s(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // ax.vd.InterfaceC3312i
    public int c(byte[] bArr, int i) {
        return e(bArr, i, i());
    }

    @Override // ax.vd.u
    public int e(byte[] bArr, int i, int i2) {
        int t = t(bArr, i, i2);
        a();
        return t;
    }

    @Override // ax.vd.InterfaceC3312i
    public String f() {
        return "SHAKE" + this.e;
    }

    @Override // ax.vd.InterfaceC3312i
    public int i() {
        return this.e / 4;
    }

    public int t(byte[] bArr, int i, int i2) {
        if (!this.f) {
            n(15, 4);
        }
        r(bArr, i, i2 * 8);
        return i2;
    }
}
