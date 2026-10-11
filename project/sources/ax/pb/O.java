package ax.pb;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class O extends AbstractC2795b {
    private String F0;
    private String G0;
    private String H0;
    boolean I0;
    byte[] J0;

    O(AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.F0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.G0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.H0 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.J0 = null;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        int i2;
        if (this.s0) {
            byte[] bArr2 = this.J0;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            i2 = this.J0.length + i;
        } else {
            i2 = i;
        }
        String m = m(bArr, i2);
        this.F0 = m;
        int t = i2 + t(m, i2);
        String n = n(bArr, t, i + this.p0, 255, this.q0);
        this.G0 = n;
        int t2 = t + t(n, t);
        if (!this.s0) {
            String n2 = n(bArr, t2, i + this.p0, 255, this.q0);
            this.H0 = n2;
            t2 += t(n2, t2);
        }
        return t2 - i;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.I0 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (this.s0) {
            int i3 = AbstractC2818s.i(bArr, i2);
            i2 = i + 4;
            this.J0 = new byte[i3];
        }
        return i2 - i;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComSessionSetupAndXResponse[" + super.toString() + ",isLoggedInAsGuest=" + this.I0 + ",nativeOs=" + this.F0 + ",nativeLanMan=" + this.G0 + ",primaryDomain=" + this.H0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
