package ax.nb;

import ax.qb.C2896d;
import java.net.InetAddress;

/* renamed from: ax.nb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2643f {
    int a;
    C2644g[] b;
    int c;
    int d;
    int e;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean o;
    C2639b q;
    C2639b r;
    int s;
    int u;
    int v;
    int w;
    int x;
    InetAddress y;
    boolean n = true;
    boolean p = true;
    int f = 1;
    int t = 1;

    AbstractC2643f() {
    }

    static int c(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    static int d(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    static int e(byte[] bArr, int i) {
        return c(bArr, i);
    }

    static void l(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    abstract int a(byte[] bArr, int i);

    int b(byte[] bArr, int i) {
        this.c = c(bArr, i);
        byte b = bArr[i + 2];
        this.k = (b & 128) != 0;
        this.d = (b & 120) >> 3;
        this.l = (b & 4) != 0;
        this.m = (b & 2) != 0;
        this.n = (b & 1) != 0;
        byte b2 = bArr[i + 3];
        this.o = (b2 & 128) != 0;
        this.p = (b2 & 16) != 0;
        this.e = b2 & 15;
        this.f = c(bArr, i + 4);
        this.g = c(bArr, i + 6);
        this.h = c(bArr, i + 8);
        this.i = c(bArr, i + 10);
        return 12;
    }

    int f(byte[] bArr, int i) {
        int b = this.q.b(bArr, i) + i;
        this.s = c(bArr, b);
        this.t = c(bArr, b + 2);
        return (b + 4) - i;
    }

    abstract int g(byte[] bArr, int i);

    int h(byte[] bArr, int i) {
        int b;
        if ((bArr[i] & 192) == 192) {
            this.r = this.q;
            b = i + 2;
        } else {
            b = this.r.b(bArr, i) + i;
        }
        this.u = c(bArr, b);
        this.v = c(bArr, b + 2);
        this.w = d(bArr, b + 4);
        int c = c(bArr, b + 8);
        this.x = c;
        int i2 = b + 10;
        this.b = new C2644g[c / 6];
        int i3 = c + i2;
        int i4 = 0;
        while (true) {
            this.a = i4;
            if (i2 >= i3) {
                return i2 - i;
            }
            i2 += g(bArr, i2);
            i4 = this.a + 1;
        }
    }

    int i(byte[] bArr, int i) {
        int b = b(bArr, i) + i;
        return (b + a(bArr, b)) - i;
    }

    abstract int j(byte[] bArr, int i);

    int k(byte[] bArr, int i) {
        l(this.c, bArr, i);
        bArr[i + 2] = (byte) ((this.k ? 128 : 0) + ((this.d << 3) & 120) + (this.l ? 4 : 0) + (this.m ? 2 : 0) + (this.n ? 1 : 0));
        bArr[i + 3] = (byte) ((this.o ? 128 : 0) + (this.p ? 16 : 0) + (this.e & 15));
        l(this.f, bArr, i + 4);
        l(this.g, bArr, i + 6);
        l(this.h, bArr, i + 8);
        l(this.i, bArr, i + 10);
        return 12;
    }

    int m(byte[] bArr, int i) {
        int d = this.q.d(bArr, i) + i;
        l(this.s, bArr, d);
        l(this.t, bArr, d + 2);
        return (d + 4) - i;
    }

    int n(byte[] bArr, int i) {
        int k = k(bArr, i) + i;
        return (k + j(bArr, k)) - i;
    }

    public String toString() {
        String str;
        String str2;
        int i = this.d;
        String num = i != 0 ? i != 7 ? Integer.toString(i) : "WACK" : "QUERY";
        int i2 = this.e;
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
            C2896d.c(this.e, 1);
        }
        int i3 = this.s;
        String str3 = "NB";
        if (i3 == 32) {
            str = "NB";
        } else if (i3 != 33) {
            str = "0x" + C2896d.c(this.s, 4);
        } else {
            str = "NBSTAT";
        }
        int i4 = this.u;
        if (i4 == 1) {
            str3 = "A";
        } else if (i4 == 2) {
            str3 = "NS";
        } else if (i4 == 10) {
            str3 = "NULL";
        } else if (i4 != 32) {
            if (i4 != 33) {
                str3 = "0x" + C2896d.c(this.u, 4);
            } else {
                str3 = "NBSTAT";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("nameTrnId=");
        sb.append(this.c);
        sb.append(",isResponse=");
        sb.append(this.k);
        sb.append(",opCode=");
        sb.append(num);
        sb.append(",isAuthAnswer=");
        sb.append(this.l);
        sb.append(",isTruncated=");
        sb.append(this.m);
        sb.append(",isRecurAvailable=");
        sb.append(this.o);
        sb.append(",isRecurDesired=");
        sb.append(this.n);
        sb.append(",isBroadcast=");
        sb.append(this.p);
        sb.append(",resultCode=");
        sb.append(this.e);
        sb.append(",questionCount=");
        sb.append(this.f);
        sb.append(",answerCount=");
        sb.append(this.g);
        sb.append(",authorityCount=");
        sb.append(this.h);
        sb.append(",additionalCount=");
        sb.append(this.i);
        sb.append(",questionName=");
        sb.append(this.q);
        sb.append(",questionType=");
        sb.append(str);
        sb.append(",questionClass=");
        String str4 = "IN";
        if (this.t == 1) {
            str2 = "IN";
        } else {
            str2 = "0x" + C2896d.c(this.t, 4);
        }
        sb.append(str2);
        sb.append(",recordName=");
        sb.append(this.r);
        sb.append(",recordType=");
        sb.append(str3);
        sb.append(",recordClass=");
        if (this.v != 1) {
            str4 = "0x" + C2896d.c(this.v, 4);
        }
        sb.append(str4);
        sb.append(",ttl=");
        sb.append(this.w);
        sb.append(",rDataLength=");
        sb.append(this.x);
        return new String(sb.toString());
    }
}
