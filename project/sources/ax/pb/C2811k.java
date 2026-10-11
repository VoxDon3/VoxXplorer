package ax.pb;

import java.io.UnsupportedEncodingException;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.pb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2811k extends P {
    static final String[] g1 = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};
    String d1;
    String e1 = null;
    int f1;

    C2811k(String str, int i) {
        this.d1 = str;
        this.f1 = i;
        this.d0 = (byte) 37;
        this.Y0 = (byte) 104;
        this.Z0 = "\\PIPE\\LANMAN";
        this.T0 = 8;
        this.U0 = Http2.INITIAL_MAX_FRAME_SIZE;
        this.V0 = (byte) 0;
        this.X0 = 0;
        this.W0 = 5000;
    }

    @Override // ax.pb.P
    void E(int i, String str) {
        super.s();
        this.e1 = str;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        char c = this.Y0 == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = g1[c].getBytes("ASCII");
            AbstractC2818s.w(this.Y0 & 255, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = i2 + bytes.length;
            AbstractC2818s.w(1L, bArr, length);
            AbstractC2818s.w(this.U0, bArr, length + 2);
            AbstractC2818s.x(this.f1, bArr, length + 4);
            int i3 = length + 8;
            int B = i3 + B(this.d1.toUpperCase(), bArr, i3, false);
            if (c == 1) {
                B += B(this.e1.toUpperCase(), bArr, B, false);
            }
            return B - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetServerEnum2[");
        sb.append(super.toString());
        sb.append(",name=");
        sb.append(this.Z0);
        sb.append(",serverTypes=");
        sb.append(this.f1 == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM");
        sb.append("]");
        return new String(sb.toString());
    }
}
