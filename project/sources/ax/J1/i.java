package ax.J1;

import ax.S0.G;
import ax.S0.d0;
import ax.q1.J;

/* loaded from: classes.dex */
final class i {
    public final J.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;

    private i(J.a aVar, long j, long j2, long[] jArr, int i, int i2) {
        this.a = new J.a(aVar);
        this.b = j;
        this.c = j2;
        this.f = jArr;
        this.d = i;
        this.e = i2;
    }

    public static i b(J.a aVar, G g) {
        long[] jArr;
        int i;
        int i2;
        int v = g.v();
        int Q = (v & 1) != 0 ? g.Q() : -1;
        long O = (v & 2) != 0 ? g.O() : -1L;
        if ((v & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = g.M();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((v & 8) != 0) {
            g.c0(4);
        }
        if (g.a() >= 24) {
            g.c0(21);
            int P = g.P();
            i2 = P & 4095;
            i = (16773120 & P) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new i(aVar, Q, O, jArr2, i, i2);
    }

    public long a() {
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return d0.o1((j * r2.g) - 1, this.a.d);
    }
}
