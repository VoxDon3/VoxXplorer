/*
 * Decompiled with CFR 0.152.
 */
package ax.w1;

import ax.S0.G;
import ax.q1.I;
import ax.q1.M;
import ax.q1.N;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import ax.w1.a;
import ax.w1.b;
import ax.w1.d;
import ax.w1.f;
import java.io.IOException;
import java.util.List;

public final class c
implements r {
    public static final x q = new b();
    private final G a = new G(4);
    private final G b = new G(9);
    private final G c = new G(11);
    private final G d = new G();
    private final d e = new d();
    private t f;
    private int g = 1;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private a o;
    private f p;

    public static /* synthetic */ r[] g() {
        return new r[]{new c()};
    }

    private void h() {
        if (!this.n) {
            this.f.h(new N.b(-9223372036854775807L));
            this.n = true;
        }
    }

    private long i() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    private G j(s s8) throws IOException {
        if (this.l > this.d.b()) {
            G g8 = this.d;
            g8.Z(new byte[Math.max(g8.b() * 2, this.l)], 0);
        } else {
            this.d.b0(0);
        }
        this.d.a0(this.l);
        s8.readFully(this.d.f(), 0, this.l);
        return this.d;
    }

    private boolean l(s s8) throws IOException {
        byte[] byArray = this.b.f();
        boolean bl = false;
        if (!s8.e(byArray, 0, 9, true)) {
            return false;
        }
        this.b.b0(0);
        this.b.c0(4);
        int n8 = this.b.M();
        boolean bl2 = (n8 & 4) != 0;
        if ((n8 & 1) != 0) {
            bl = true;
        }
        if (bl2 && this.o == null) {
            this.o = new a(this.f.u(8, 1));
        }
        if (bl && this.p == null) {
            this.p = new f(this.f.u(9, 2));
        }
        this.f.o();
        this.j = this.b.v() - 5;
        this.g = 2;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private boolean m(s var1_1) throws IOException {
        block3: {
            block5: {
                block4: {
                    var3_2 = this.i();
                    var2_3 = this.k;
                    if (var2_3 == 8 && this.o != null) {
                        this.h();
                        var5_4 = this.o.a(this.j(var1_1), var3_2);
lbl6:
                        // 4 sources

                        while (true) {
                            var6_5 = true;
                            break block3;
                            break;
                        }
                    }
                    if (var2_3 != 9 || this.p == null) break block4;
                    this.h();
                    var5_4 = this.p.a(this.j(var1_1), var3_2);
                    ** GOTO lbl6
                }
                if (var2_3 != 18 || this.n) break block5;
                var6_5 = this.e.a(this.j(var1_1), var3_2);
                var3_2 = this.e.d();
                var5_4 = var6_5;
                if (var3_2 == -9223372036854775807L) ** GOTO lbl6
                this.f.h(new I(this.e.e(), this.e.f(), var3_2));
                this.n = true;
                var5_4 = var6_5;
                ** while (true)
            }
            var1_1.n(this.l);
            var5_4 = false;
            var6_5 = false;
        }
        if (!this.h && var5_4) {
            this.h = true;
            var3_2 = this.e.d() == -9223372036854775807L ? -this.m : 0L;
            this.i = var3_2;
        }
        this.j = 4;
        this.g = 2;
        return var6_5;
    }

    private boolean n(s s8) throws IOException {
        if (!s8.e(this.c.f(), 0, 11, true)) {
            return false;
        }
        this.c.b0(0);
        this.k = this.c.M();
        this.l = this.c.P();
        this.m = this.c.P();
        this.m = ((long)(this.c.M() << 24) | this.m) * 1000L;
        this.c.c0(3);
        this.g = 4;
        return true;
    }

    private void o(s s8) throws IOException {
        s8.n(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override
    public void a(t t8) {
        this.f = t8;
    }

    @Override
    public void b(long l8, long l9) {
        if (l8 == 0L) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override
    public boolean c(s s8) throws IOException {
        s8.p(this.a.f(), 0, 3);
        this.a.b0(0);
        if (this.a.P() != 4607062) {
            return false;
        }
        s8.p(this.a.f(), 0, 2);
        this.a.b0(0);
        if ((this.a.U() & 0xFA) != 0) {
            return false;
        }
        s8.p(this.a.f(), 0, 4);
        this.a.b0(0);
        int n8 = this.a.v();
        s8.m();
        s8.j(n8);
        s8.p(this.a.f(), 0, 4);
        this.a.b0(0);
        return this.a.v() == 0;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        ax.S0.a.i(this.f);
        while (true) {
            int n8;
            if ((n8 = this.g) != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            if (!this.m(s8)) continue;
                            return 0;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.n(s8)) continue;
                    return -1;
                }
                this.o(s8);
                continue;
            }
            if (!this.l(s8)) break;
        }
        return -1;
    }

    public /* synthetic */ List k() {
        return ax.q1.q.a(this);
    }
}

