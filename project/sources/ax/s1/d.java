package ax.s1;

import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;

/* loaded from: classes.dex */
final class d implements InterfaceC3043a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    private d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public static d d(G g) {
        int z = g.z();
        g.c0(12);
        int z2 = g.z();
        int z3 = g.z();
        int z4 = g.z();
        g.c0(4);
        int z5 = g.z();
        int z6 = g.z();
        g.c0(4);
        return new d(z, z2, z3, z4, z5, z6, g.z());
    }

    @Override // ax.s1.InterfaceC3043a
    public int a() {
        return 1752331379;
    }

    public long b() {
        return d0.p1(this.e, this.c * 1000000, this.d);
    }

    public int c() {
        int i = this.a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C0987u.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.a));
        return -1;
    }
}
