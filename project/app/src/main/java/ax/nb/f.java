/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.g;
import ax.qb.d;
import java.net.InetAddress;

abstract class f {
    int a;
    g[] b;
    int c;
    int d;
    int e;
    int f = 1;
    int g;
    int h;
    int i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = true;
    boolean o;
    boolean p = true;
    b q;
    b r;
    int s;
    int t = 1;
    int u;
    int v;
    int w;
    int x;
    InetAddress y;

    f() {
    }

    static int c(byte[] byArray, int n8) {
        return ((byArray[n8] & 0xFF) << 8) + (byArray[n8 + 1] & 0xFF);
    }

    static int d(byte[] byArray, int n8) {
        return ((byArray[n8] & 0xFF) << 24) + ((byArray[n8 + 1] & 0xFF) << 16) + ((byArray[n8 + 2] & 0xFF) << 8) + (byArray[n8 + 3] & 0xFF);
    }

    static int e(byte[] byArray, int n8) {
        return ax.nb.f.c(byArray, n8);
    }

    static void l(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)(n8 >> 8 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 & 0xFF);
    }

    abstract int a(byte[] var1, int var2);

    int b(byte[] byArray, int n8) {
        this.c = ax.nb.f.c(byArray, n8);
        byte by = byArray[n8 + 2];
        boolean bl = false;
        boolean bl2 = (by & 0x80) != 0;
        this.k = bl2;
        this.d = (by & 0x78) >> 3;
        bl2 = (by & 4) != 0;
        this.l = bl2;
        bl2 = (by & 2) != 0;
        this.m = bl2;
        bl2 = (by & 1) != 0;
        this.n = bl2;
        by = byArray[n8 + 3];
        bl2 = (by & 0x80) != 0;
        this.o = bl2;
        bl2 = (by & 0x10) == 0 ? bl : true;
        this.p = bl2;
        this.e = by & 0xF;
        this.f = ax.nb.f.c(byArray, n8 + 4);
        this.g = ax.nb.f.c(byArray, n8 + 6);
        this.h = ax.nb.f.c(byArray, n8 + 8);
        this.i = ax.nb.f.c(byArray, n8 + 10);
        return 12;
    }

    int f(byte[] byArray, int n8) {
        int n9 = this.q.b(byArray, n8) + n8;
        this.s = ax.nb.f.c(byArray, n9);
        this.t = ax.nb.f.c(byArray, n9 + 2);
        return n9 + 4 - n8;
    }

    abstract int g(byte[] var1, int var2);

    int h(byte[] byArray, int n8) {
        int n9;
        int n10;
        if ((byArray[n8] & 0xC0) == 192) {
            this.r = this.q;
            n10 = n8 + 2;
        } else {
            n10 = this.r.b(byArray, n8) + n8;
        }
        this.u = ax.nb.f.c(byArray, n10);
        this.v = ax.nb.f.c(byArray, n10 + 2);
        this.w = ax.nb.f.d(byArray, n10 + 4);
        this.x = n9 = ax.nb.f.c(byArray, n10 + 8);
        int n11 = n10 + 10;
        this.b = new g[n9 / 6];
        int n12 = 0;
        n10 = n11;
        while (true) {
            this.a = n12;
            if (n10 >= n9 + n11) break;
            n10 += this.g(byArray, n10);
            n12 = this.a + 1;
        }
        return n10 - n8;
    }

    int i(byte[] byArray, int n8) {
        int n9 = this.b(byArray, n8) + n8;
        return n9 + this.a(byArray, n9) - n8;
    }

    abstract int j(byte[] var1, int var2);

    int k(byte[] byArray, int n8) {
        ax.nb.f.l(this.c, byArray, n8);
        boolean bl = this.k;
        int n9 = 128;
        int n10 = 0;
        int n11 = bl ? 128 : 0;
        int n12 = this.d;
        int n13 = this.l ? 4 : 0;
        int n14 = this.m ? 2 : 0;
        byArray[n8 + 2] = (byte)(n11 + (n12 << 3 & 0x78) + n13 + n14 + this.n);
        n11 = this.o ? n9 : 0;
        n13 = n10;
        if (this.p) {
            n13 = 16;
        }
        byArray[n8 + 3] = (byte)(n11 + n13 + (this.e & 0xF));
        ax.nb.f.l(this.f, byArray, n8 + 4);
        ax.nb.f.l(this.g, byArray, n8 + 6);
        ax.nb.f.l(this.h, byArray, n8 + 8);
        ax.nb.f.l(this.i, byArray, n8 + 10);
        return 12;
    }

    int m(byte[] byArray, int n8) {
        int n9 = this.q.d(byArray, n8) + n8;
        ax.nb.f.l(this.s, byArray, n9);
        ax.nb.f.l(this.t, byArray, n9 + 2);
        return n9 + 4 - n8;
    }

    int n(byte[] byArray, int n8) {
        int n9 = this.k(byArray, n8) + n8;
        return n9 + this.j(byArray, n9) - n8;
    }

    public String toString() {
        CharSequence charSequence;
        int n8 = this.d;
        CharSequence charSequence2 = n8 != 0 ? (n8 != 7 ? Integer.toString(n8) : "WACK") : "QUERY";
        n8 = this.e;
        if (n8 != 1 && n8 != 2 && n8 != 4 && n8 != 5 && n8 != 6 && n8 != 7) {
            ax.qb.d.c(this.e, 1);
        }
        n8 = this.s;
        CharSequence charSequence3 = "NB";
        if (n8 != 32) {
            if (n8 != 33) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("0x");
                ((StringBuilder)charSequence).append(ax.qb.d.c(this.s, 4));
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = "NBSTAT";
            }
        } else {
            charSequence = "NB";
        }
        n8 = this.u;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 10) {
                    if (n8 != 32) {
                        if (n8 != 33) {
                            charSequence3 = new StringBuilder();
                            ((StringBuilder)charSequence3).append("0x");
                            ((StringBuilder)charSequence3).append(ax.qb.d.c(this.u, 4));
                            charSequence3 = ((StringBuilder)charSequence3).toString();
                        } else {
                            charSequence3 = "NBSTAT";
                        }
                    }
                } else {
                    charSequence3 = "NULL";
                }
            } else {
                charSequence3 = "NS";
            }
        } else {
            charSequence3 = "A";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("nameTrnId=");
        stringBuilder.append(this.c);
        stringBuilder.append(",isResponse=");
        stringBuilder.append(this.k);
        stringBuilder.append(",opCode=");
        stringBuilder.append((String)charSequence2);
        stringBuilder.append(",isAuthAnswer=");
        stringBuilder.append(this.l);
        stringBuilder.append(",isTruncated=");
        stringBuilder.append(this.m);
        stringBuilder.append(",isRecurAvailable=");
        stringBuilder.append(this.o);
        stringBuilder.append(",isRecurDesired=");
        stringBuilder.append(this.n);
        stringBuilder.append(",isBroadcast=");
        stringBuilder.append(this.p);
        stringBuilder.append(",resultCode=");
        stringBuilder.append(this.e);
        stringBuilder.append(",questionCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(",answerCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(",authorityCount=");
        stringBuilder.append(this.h);
        stringBuilder.append(",additionalCount=");
        stringBuilder.append(this.i);
        stringBuilder.append(",questionName=");
        stringBuilder.append(this.q);
        stringBuilder.append(",questionType=");
        stringBuilder.append((String)charSequence);
        stringBuilder.append(",questionClass=");
        n8 = this.t;
        charSequence = "IN";
        if (n8 == 1) {
            charSequence2 = "IN";
        } else {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("0x");
            ((StringBuilder)charSequence2).append(ax.qb.d.c(this.t, 4));
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        stringBuilder.append((String)charSequence2);
        stringBuilder.append(",recordName=");
        stringBuilder.append(this.r);
        stringBuilder.append(",recordType=");
        stringBuilder.append((String)charSequence3);
        stringBuilder.append(",recordClass=");
        if (this.v == 1) {
            charSequence3 = charSequence;
        } else {
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append("0x");
            ((StringBuilder)charSequence3).append(ax.qb.d.c(this.v, 4));
            charSequence3 = ((StringBuilder)charSequence3).toString();
        }
        stringBuilder.append((String)charSequence3);
        stringBuilder.append(",ttl=");
        stringBuilder.append(this.w);
        stringBuilder.append(",rDataLength=");
        stringBuilder.append(this.x);
        return new String(stringBuilder.toString());
    }
}

