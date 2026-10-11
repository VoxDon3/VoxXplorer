/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.os.Handler;
import android.os.Looper;
import ax.P0.y;
import ax.U0.z;
import ax.Z0.I1;
import ax.b1.u;
import ax.i1.D;
import ax.i1.F;
import ax.i1.N;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class a
implements F {
    private final ArrayList<F.c> a = new ArrayList(1);
    private final HashSet<F.c> b = new HashSet(1);
    private final N.a c = new N.a();
    private final u.a d = new u.a();
    private Looper e;
    private ax.P0.N f;
    private I1 g;

    protected abstract void A(z var1);

    protected final void B(ax.P0.N n8) {
        this.f = n8;
        ArrayList<F.c> arrayList = this.a;
        int n9 = arrayList.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            F.c c8 = arrayList.get(i8);
            c8.a(this, n8);
        }
    }

    protected abstract void C();

    @Override
    public /* synthetic */ void a(y y8) {
        D.c(this, y8);
    }

    @Override
    public final void b(F.c c8) {
        this.a.remove(c8);
        if (this.a.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            this.C();
            return;
        }
        this.q(c8);
    }

    @Override
    public final void c(Handler handler, N n8) {
        ax.S0.a.e(handler);
        ax.S0.a.e(n8);
        this.c.h(handler, n8);
    }

    @Override
    public final void d(F.c c8) {
        ax.S0.a.e(this.e);
        boolean bl = this.b.isEmpty();
        this.b.add(c8);
        if (bl) {
            this.w();
        }
    }

    @Override
    public final void g(N n8) {
        this.c.x(n8);
    }

    @Override
    public final void l(F.c c8, z z8, I1 object) {
        Looper looper = Looper.myLooper();
        Looper looper2 = this.e;
        boolean bl = looper2 == null || looper2 == looper;
        ax.S0.a.a(bl);
        this.g = object;
        object = this.f;
        this.a.add(c8);
        if (this.e == null) {
            this.e = looper;
            this.b.add(c8);
            this.A(z8);
            return;
        }
        if (object != null) {
            this.d(c8);
            c8.a(this, (ax.P0.N)object);
        }
    }

    @Override
    public /* synthetic */ boolean m() {
        return D.b(this);
    }

    @Override
    public final void n(u u8) {
        this.d.n(u8);
    }

    @Override
    public /* synthetic */ ax.P0.N o() {
        return D.a(this);
    }

    @Override
    public final void p(Handler handler, u u8) {
        ax.S0.a.e(handler);
        ax.S0.a.e(u8);
        this.d.g(handler, u8);
    }

    @Override
    public final void q(F.c c8) {
        boolean bl = this.b.isEmpty();
        this.b.remove(c8);
        if (!bl && this.b.isEmpty()) {
            this.v();
        }
    }

    protected final u.a r(int n8, F.b b8) {
        return this.d.o(n8, b8);
    }

    protected final u.a s(F.b b8) {
        return this.d.o(0, b8);
    }

    protected final N.a t(int n8, F.b b8) {
        return this.c.A(n8, b8);
    }

    protected final N.a u(F.b b8) {
        return this.c.A(0, b8);
    }

    protected void v() {
    }

    protected void w() {
    }

    protected final I1 x() {
        return ax.S0.a.i(this.g);
    }

    protected final boolean y() {
        return this.b.isEmpty() ^ true;
    }

    public final void z(F.c c8, z z8) {
        this.l(c8, z8, I1.d);
    }
}

