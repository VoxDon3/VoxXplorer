package ax.pb;

import java.io.UnsupportedEncodingException;

/* renamed from: ax.pb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2813m extends P {
    C2813m() {
        this.d0 = (byte) 37;
        this.Y0 = (byte) 0;
        this.Z0 = new String("\\PIPE\\LANMAN");
        this.T0 = 8;
        this.V0 = (byte) 0;
        this.X0 = 0;
        this.W0 = 5000;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            AbstractC2818s.w(0L, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = i2 + bytes.length;
            AbstractC2818s.w(1L, bArr, length);
            AbstractC2818s.w(this.U0, bArr, length + 2);
            return (length + 4) - i;
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
        return new String("NetShareEnum[" + super.toString() + "]");
    }
}
