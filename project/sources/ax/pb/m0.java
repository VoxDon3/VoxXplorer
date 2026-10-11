package ax.pb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
class m0 extends P {
    static final int i1 = C2345a.d("jcifs.smb.client.listSize", Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    static final int j1 = C2345a.d("jcifs.smb.client.listCount", 200);
    private int d1;
    private int e1;
    private int f1;
    private int g1 = 0;
    private String h1;

    m0(String str, String str2, int i) {
        if (str.equals("\\")) {
            this.x0 = str;
        } else {
            this.x0 = str + "\\";
        }
        this.h1 = str2;
        this.d1 = i & 55;
        this.d0 = (byte) 50;
        this.Y0 = (byte) 1;
        this.e1 = 0;
        this.f1 = 260;
        this.S0 = 0;
        this.T0 = 10;
        this.U0 = i1;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        AbstractC2818s.w(j1, bArr, i + 2);
        AbstractC2818s.w(this.e1, bArr, i + 4);
        AbstractC2818s.w(this.f1, bArr, i + 6);
        AbstractC2818s.x(this.g1, bArr, i + 8);
        int i2 = i + 12;
        return (i2 + A(this.x0 + this.h1, bArr, i2)) - i;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2FindFirst2[" + super.toString() + ",searchAttributes=0x" + C2896d.c(this.d1, 2) + ",searchCount=" + j1 + ",flags=0x" + C2896d.c(this.e1, 2) + ",informationLevel=0x" + C2896d.c(this.f1, 3) + ",searchStorageType=" + this.g1 + ",filename=" + this.x0 + "]");
    }
}
