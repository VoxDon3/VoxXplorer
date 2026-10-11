/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.P0.T;
import ax.P0.c;
import ax.i1.F;
import ax.i1.q0;
import ax.l1.K;
import ax.m1.e;

public abstract class J {
    private a a;
    private e b;

    protected final e b() {
        return ax.S0.a.i(this.b);
    }

    public T c() {
        return T.F;
    }

    public N0.a d() {
        return null;
    }

    public void e(a a8, e e8) {
        boolean bl = this.a == null;
        ax.S0.a.g(bl);
        this.a = a8;
        this.b = e8;
    }

    protected final void f() {
        a a8 = this.a;
        if (a8 != null) {
            a8.b();
        }
    }

    protected final void g(M0 m02) {
        a a8 = this.a;
        if (a8 != null) {
            a8.a(m02);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object var1);

    public void j() {
        this.a = null;
        this.b = null;
    }

    public abstract K k(N0[] var1, q0 var2, F.b var3, N var4) throws s;

    public void l(c c8) {
    }

    public void m(T t8) {
    }

    public static interface a {
        public void a(M0 var1);

        public void b();
    }
}

