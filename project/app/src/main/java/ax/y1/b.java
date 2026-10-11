/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import ax.K1.n;
import ax.N1.t;
import ax.P0.C;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.q1.M;
import ax.q1.N;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.y1.c;
import ax.y1.d;
import ax.y1.e;
import ax.y1.f;
import java.io.IOException;
import java.util.List;

final class b
implements r {
    private final G a = new G(2);
    private t b;
    private int c;
    private int d;
    private int e;
    private long f = -1L;
    private ax.F1.a g;
    private s h;
    private d i;
    private n j;

    private void g(s s8) throws IOException {
        this.a.X(2);
        s8.p(this.a.f(), 0, 2);
        s8.j(this.a.U() - 2);
    }

    private void h() {
        ax.S0.a.e(this.b).o();
        this.b.h(new N.b(-9223372036854775807L));
        this.c = 6;
    }

    private static ax.F1.a i(String object, long l8) throws IOException {
        if (l8 == -1L) {
            return null;
        }
        if ((object = ax.y1.f.a((String)object)) == null) {
            return null;
        }
        return ((c)object).a(l8);
    }

    private void j(ax.F1.a a8) {
        ax.S0.a.e(this.b).u(1024, 4).e(new v.b().W("image/jpeg").r0(new C(a8)).P());
    }

    private int l(s s8) throws IOException {
        this.a.X(2);
        s8.p(this.a.f(), 0, 2);
        return this.a.U();
    }

    private void m(s s8) throws IOException {
        int n8;
        this.a.X(2);
        s8.readFully(this.a.f(), 0, 2);
        this.d = n8 = this.a.U();
        if (n8 == 65498) {
            if (this.f != -1L) {
                this.c = 4;
                return;
            }
            this.h();
            return;
        }
        if ((n8 < 65488 || n8 > 65497) && n8 != 65281) {
            this.c = 1;
        }
    }

    private void n(s object) throws IOException {
        if (this.d == 65505) {
            Object object2 = new G(this.e);
            object.readFully(((G)object2).f(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(((G)object2).G()) && (object2 = ((G)object2).G()) != null) {
                this.g = object = ax.y1.b.i((String)object2, object.getLength());
                if (object != null) {
                    this.f = ((ax.F1.a)object).d;
                }
            }
        } else {
            object.n(this.e);
        }
        this.c = 0;
    }

    private void o(s s8) throws IOException {
        this.a.X(2);
        s8.readFully(this.a.f(), 0, 2);
        this.e = this.a.U() - 2;
        this.c = 2;
    }

    private void p(s s8) throws IOException {
        if (!s8.h(this.a.f(), 0, 1, true)) {
            this.h();
            return;
        }
        s8.m();
        if (this.j == null) {
            this.j = new n(t.a.a, 8);
        }
        s8 = new d(s8, this.f);
        this.i = s8;
        if (this.j.c(s8)) {
            this.j.a(new e(this.f, ax.S0.a.e(this.b)));
            this.q();
            return;
        }
        this.h();
    }

    private void q() {
        this.j(ax.S0.a.e(this.g));
        this.c = 5;
    }

    @Override
    public void a(t t8) {
        this.b = t8;
    }

    @Override
    public void b(long l8, long l9) {
        if (l8 == 0L) {
            this.c = 0;
            this.j = null;
            return;
        }
        if (this.c == 5) {
            ax.S0.a.e(this.j).b(l8, l9);
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        int n8;
        if (this.l(s8) != 65496) {
            return false;
        }
        this.d = n8 = this.l(s8);
        if (n8 == 65504) {
            this.g(s8);
            this.d = this.l(s8);
        }
        return this.d == 65505;
    }

    @Override
    public void d() {
        n n8 = this.j;
        if (n8 != null) {
            n8.d();
        }
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        int n8 = this.c;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    long l8;
                    if (n8 != 4) {
                        if (n8 != 5) {
                            if (n8 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.i == null || s8 != this.h) {
                            this.h = s8;
                            this.i = new d(s8, this.f);
                        }
                        if ((n8 = ax.S0.a.e(this.j).f(this.i, m8)) == 1) {
                            m8.a += this.f;
                        }
                        return n8;
                    }
                    long l9 = s8.getPosition();
                    if (l9 != (l8 = this.f)) {
                        m8.a = l8;
                        return 1;
                    }
                    this.p(s8);
                    return 0;
                }
                this.n(s8);
                return 0;
            }
            this.o(s8);
            return 0;
        }
        this.m(s8);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

