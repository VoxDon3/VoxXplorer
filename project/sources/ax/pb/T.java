package ax.pb;

import java.io.UnsupportedEncodingException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class T extends AbstractC2795b {
    boolean F0;
    boolean G0;
    String H0;
    String I0;

    T(AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.I0 = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        int p = p(bArr, i, 32);
        try {
            this.H0 = new String(bArr, i, p, "ASCII");
            return ((p + 1) + i) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        byte b = bArr[i];
        this.F0 = (b & 1) == 1;
        this.G0 = (b & 2) == 2;
        return 2;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComTreeConnectAndXResponse[" + super.toString() + ",supportSearchBits=" + this.F0 + ",shareIsInDfs=" + this.G0 + ",service=" + this.H0 + ",nativeFileSystem=" + this.I0 + "]");
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
