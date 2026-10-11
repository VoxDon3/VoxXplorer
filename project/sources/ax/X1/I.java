package ax.X1;

import ax.S0.d0;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class I {
    private final int a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final ax.S0.M b = new ax.S0.M(0);
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private final ax.S0.G c = new ax.S0.G();

    I(int i) {
        this.a = i;
    }

    private int a(InterfaceC2858s interfaceC2858s) {
        this.c.Y(d0.f);
        this.d = true;
        interfaceC2858s.m();
        return 0;
    }

    private int f(InterfaceC2858s interfaceC2858s, ax.q1.M m, int i) throws IOException {
        int min = (int) Math.min(this.a, interfaceC2858s.getLength());
        long j = 0;
        if (interfaceC2858s.getPosition() != j) {
            m.a = j;
            return 1;
        }
        this.c.X(min);
        interfaceC2858s.m();
        interfaceC2858s.p(this.c.f(), 0, min);
        this.g = g(this.c, i);
        this.e = true;
        return 0;
    }

    private long g(ax.S0.G g, int i) {
        int j = g.j();
        for (int g2 = g.g(); g2 < j; g2++) {
            if (g.f()[g2] == 71) {
                long c = M.c(g, g2, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(InterfaceC2858s interfaceC2858s, ax.q1.M m, int i) throws IOException {
        long length = interfaceC2858s.getLength();
        int min = (int) Math.min(this.a, length);
        long j = length - min;
        if (interfaceC2858s.getPosition() != j) {
            m.a = j;
            return 1;
        }
        this.c.X(min);
        interfaceC2858s.m();
        interfaceC2858s.p(this.c.f(), 0, min);
        this.h = i(this.c, i);
        this.f = true;
        return 0;
    }

    private long i(ax.S0.G g, int i) {
        int g2 = g.g();
        int j = g.j();
        for (int i2 = j - 188; i2 >= g2; i2--) {
            if (M.b(g.f(), g2, j, i2)) {
                long c = M.c(g, i2, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.i;
    }

    public ax.S0.M c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(InterfaceC2858s interfaceC2858s, ax.q1.M m, int i) throws IOException {
        if (i <= 0) {
            return a(interfaceC2858s);
        }
        if (!this.f) {
            return h(interfaceC2858s, m, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(interfaceC2858s);
        }
        if (!this.e) {
            return f(interfaceC2858s, m, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(interfaceC2858s);
        }
        this.i = this.b.c(this.h) - this.b.b(j);
        return a(interfaceC2858s);
    }
}
