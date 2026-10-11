/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.S0.M;
import ax.S0.d0;
import ax.q1.s;
import java.io.IOException;

final class A {
    private final M a = new M(0L);
    private final G b = new G();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    A() {
    }

    private static boolean a(byte[] byArray) {
        if ((byArray[0] & 0xC4) != 68) {
            return false;
        }
        if ((byArray[2] & 4) != 4) {
            return false;
        }
        if ((byArray[4] & 4) != 4) {
            return false;
        }
        if ((byArray[5] & 1) != 1) {
            return false;
        }
        return (byArray[8] & 3) == 3;
    }

    private int b(s s8) {
        this.b.Y(d0.f);
        this.c = true;
        s8.m();
        return 0;
    }

    private int f(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    private int h(s s8, ax.q1.M m8) throws IOException {
        long l8;
        int n8 = (int)Math.min(20000L, s8.getLength());
        long l9 = s8.getPosition();
        if (l9 != (l8 = (long)0)) {
            m8.a = l8;
            return 1;
        }
        this.b.X(n8);
        s8.m();
        s8.p(this.b.f(), 0, n8);
        this.f = this.i(this.b);
        this.d = true;
        return 0;
    }

    private long i(G g8) {
        int n8 = g8.j();
        for (int i8 = g8.g(); i8 < n8 - 3; ++i8) {
            if (this.f(g8.f(), i8) != 442) continue;
            g8.b0(i8 + 4);
            long l8 = A.l(g8);
            if (l8 == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    private int j(s s8, ax.q1.M m8) throws IOException {
        long l8 = s8.getLength();
        int n8 = (int)Math.min(20000L, l8);
        if (s8.getPosition() != (l8 -= (long)n8)) {
            m8.a = l8;
            return 1;
        }
        this.b.X(n8);
        s8.m();
        s8.p(this.b.f(), 0, n8);
        this.g = this.k(this.b);
        this.e = true;
        return 0;
    }

    private long k(G g8) {
        int n8 = g8.g();
        for (int i8 = g8.j() - 4; i8 >= n8; --i8) {
            if (this.f(g8.f(), i8) != 442) continue;
            g8.b0(i8 + 4);
            long l8 = A.l(g8);
            if (l8 == -9223372036854775807L) continue;
            return l8;
        }
        return -9223372036854775807L;
    }

    public static long l(G g8) {
        int n8 = g8.g();
        if (g8.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] byArray = new byte[9];
        g8.q(byArray, 0, 9);
        g8.b0(n8);
        if (!A.a(byArray)) {
            return -9223372036854775807L;
        }
        return A.m(byArray);
    }

    private static long m(byte[] byArray) {
        byte by = byArray[0];
        long l8 = by;
        long l9 = by;
        long l10 = byArray[1];
        by = byArray[2];
        return (l8 & 0x38L) >> 3 << 30 | (l9 & 3L) << 28 | (l10 & 0xFFL) << 20 | ((long)by & 0xF8L) >> 3 << 15 | ((long)by & 3L) << 13 | ((long)byArray[3] & 0xFFL) << 5 | ((long)byArray[4] & 0xF8L) >> 3;
    }

    public long c() {
        return this.h;
    }

    public M d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public int g(s s8, ax.q1.M m8) throws IOException {
        if (!this.e) {
            return this.j(s8, m8);
        }
        if (this.g == -9223372036854775807L) {
            return this.b(s8);
        }
        if (!this.d) {
            return this.h(s8, m8);
        }
        long l8 = this.f;
        if (l8 == -9223372036854775807L) {
            return this.b(s8);
        }
        l8 = this.a.b(l8);
        this.h = this.a.c(this.g) - l8;
        return this.b(s8);
    }
}

