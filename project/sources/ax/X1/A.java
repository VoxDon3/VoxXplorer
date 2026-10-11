package ax.X1;

import ax.S0.d0;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class A {
    private boolean c;
    private boolean d;
    private boolean e;
    private final ax.S0.M a = new ax.S0.M(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final ax.S0.G b = new ax.S0.G();

    A() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(InterfaceC2858s interfaceC2858s) {
        this.b.Y(d0.f);
        this.c = true;
        interfaceC2858s.m();
        return 0;
    }

    private int f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int h(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        int min = (int) Math.min(20000L, interfaceC2858s.getLength());
        long j = 0;
        if (interfaceC2858s.getPosition() != j) {
            m.a = j;
            return 1;
        }
        this.b.X(min);
        interfaceC2858s.m();
        interfaceC2858s.p(this.b.f(), 0, min);
        this.f = i(this.b);
        this.d = true;
        return 0;
    }

    private long i(ax.S0.G g) {
        int j = g.j();
        for (int g2 = g.g(); g2 < j - 3; g2++) {
            if (f(g.f(), g2) == 442) {
                g.b0(g2 + 4);
                long l = l(g);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        long length = interfaceC2858s.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (interfaceC2858s.getPosition() != j) {
            m.a = j;
            return 1;
        }
        this.b.X(min);
        interfaceC2858s.m();
        interfaceC2858s.p(this.b.f(), 0, min);
        this.g = k(this.b);
        this.e = true;
        return 0;
    }

    private long k(ax.S0.G g) {
        int g2 = g.g();
        for (int j = g.j() - 4; j >= g2; j--) {
            if (f(g.f(), j) == 442) {
                g.b0(j + 4);
                long l = l(g);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(ax.S0.G g) {
        int g2 = g.g();
        if (g.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        g.q(bArr, 0, 9);
        g.b0(g2);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b = bArr[0];
        long j = (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b2 = bArr[2];
        return j | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.h;
    }

    public ax.S0.M d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public int g(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        if (!this.e) {
            return j(interfaceC2858s, m);
        }
        if (this.g == -9223372036854775807L) {
            return b(interfaceC2858s);
        }
        if (!this.d) {
            return h(interfaceC2858s, m);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return b(interfaceC2858s);
        }
        this.h = this.a.c(this.g) - this.a.b(j);
        return b(interfaceC2858s);
    }
}
