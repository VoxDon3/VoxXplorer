package ax.pb;

import java.io.UnsupportedEncodingException;

/* renamed from: ax.pb.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2792E extends AbstractC2818s {
    C2792E() {
        this.d0 = (byte) 114;
        this.j0 = Z.L;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComNegotiate[" + super.toString() + ",wordCount=" + this.o0 + ",dialects=NT LM 0.12]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        try {
            byte[] bytes = "\u0002NT LM 0.12\u0000".getBytes("ASCII");
            System.arraycopy(bytes, 0, bArr, i, bytes.length);
            return bytes.length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
