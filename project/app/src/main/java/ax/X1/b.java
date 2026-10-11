/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.X1.L;
import ax.X1.a;
import ax.X1.c;
import ax.q1.M;
import ax.q1.N;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.IOException;
import java.util.List;

public final class b
implements r {
    public static final x d = new a();
    private final c a = new c("audio/ac3");
    private final G b = new G(2786);
    private boolean c;

    public static /* synthetic */ r[] g() {
        return new r[]{new b()};
    }

    @Override
    public void a(t t8) {
        this.a.d(t8, new L.d(0, 1));
        t8.o();
        t8.h(new N.b(-9223372036854775807L));
    }

    @Override
    public void b(long l8, long l9) {
        this.c = false;
        this.a.b();
    }

    @Override
    public boolean c(s s8) throws IOException {
        G g8 = new G(10);
        int n8 = 0;
        while (true) {
            int n9;
            s8.p(g8.f(), 0, 10);
            g8.b0(0);
            if (g8.P() != 0x494433) {
                s8.m();
                s8.j(n8);
                n9 = n8;
                block1: while (true) {
                    int n10 = 0;
                    while (true) {
                        s8.p(g8.f(), 0, 6);
                        g8.b0(0);
                        if (g8.U() != 2935) {
                            s8.m();
                            if (++n9 - n8 >= 8192) {
                                return false;
                            }
                            s8.j(n9);
                            continue block1;
                        }
                        if (++n10 >= 4) {
                            return true;
                        }
                        int n11 = ax.q1.b.g(g8.f());
                        if (n11 == -1) {
                            return false;
                        }
                        s8.j(n11 - 6);
                    }
                    break;
                }
            }
            g8.c0(3);
            n9 = g8.L();
            n8 += n9 + 10;
            s8.j(n9);
        }
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        int n8 = s8.c(this.b.f(), 0, 2786);
        if (n8 == -1) {
            return -1;
        }
        this.b.b0(0);
        this.b.a0(n8);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.c(this.b);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

