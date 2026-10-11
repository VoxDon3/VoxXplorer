/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.s1.a;

final class d
implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    private d(int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = n13;
        this.g = n14;
    }

    public static d d(G g8) {
        int n8 = g8.z();
        g8.c0(12);
        int n9 = g8.z();
        int n10 = g8.z();
        int n11 = g8.z();
        g8.c0(4);
        int n12 = g8.z();
        int n13 = g8.z();
        g8.c0(4);
        return new d(n8, n9, n10, n11, n12, n13, g8.z());
    }

    @Override
    public int a() {
        return 1752331379;
    }

    public long b() {
        return d0.p1(this.e, (long)this.c * 1000000L, this.d);
    }

    public int c() {
        int n8 = this.a;
        if (n8 != 1935960438) {
            if (n8 != 1935963489) {
                if (n8 != 1937012852) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Found unsupported streamType fourCC: ");
                    stringBuilder.append(Integer.toHexString(this.a));
                    u.h("AviStreamHeaderChunk", stringBuilder.toString());
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }
}

