/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.Bundle;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.a3.K;
import ax.b3.f;
import ax.c3.d0;
import ax.u3.q;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.K;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class y
extends j {
    private long A;
    private ConcurrentLinkedQueue<K> B = new ConcurrentLinkedQueue();
    private n C;
    private n D;
    ax.a3.K E;
    private o w;
    private List<K> x;
    private K y;
    private c z;

    /*
     * WARNING - void declaration
     */
    public y(h.a object3, o object2, List<n> list) {
        super((h.a)object3);
        List<n> var3_5;
        Iterator<n> iterator;
        this.w = iterator;
        ((o)((Object)iterator)).n0();
        this.x = new ArrayList<K>();
        for (n n8 : ax.c3.q.g((List<n>)var3_5, ax.c3.q.c("DateUpNoSeparate"))) {
            this.x.add((K)n8);
            this.A += n8.p();
        }
        this.h(this.w.T());
    }

    static /* synthetic */ n A0(y y8, n n8) {
        y8.C = n8;
        return n8;
    }

    static /* synthetic */ n B0(y y8, n n8) {
        y8.D = n8;
        return n8;
    }

    private void F0(boolean bl, int n8) {
        n n9;
        this.E = new ax.a3.K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", this.C());
        bundle.putString("fileName", this.A());
        bundle.putBoolean("isDirectory", bl);
        bundle.putInt("errCode", n8);
        bundle.putBoolean("applyToAll", false);
        bundle.putBoolean("directoryRename", true);
        if (!bl && n8 == 1 && this.C != null && (n9 = this.D) != null) {
            bundle.putLong("new_file_date", n9.q());
            bundle.putLong("new_file_size", this.D.p());
            bundle.putString("old_file_path", this.C.E());
            bundle.putLong("old_file_date", this.C.q());
            bundle.putLong("old_file_size", this.C.p());
        }
        this.E.v2(bundle);
        this.E.v3(new K.i(this){
            final y a;
            {
                this.a = y8;
            }

            @Override
            public void a(j.f f8, boolean bl) {
                ax.W2.y.x0(this.a, new c(this.a, true, f8));
                this.a.z.i(new Void[0]);
            }
        });
        this.q().K(this, this.E);
    }

    static /* synthetic */ c x0(y y8, c c8) {
        y8.z = c8;
        return c8;
    }

    static /* synthetic */ K z0(y y8, K k8) {
        y8.y = k8;
        return k8;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 10;
    }

    @Override
    public String C() {
        return this.r().getString(2131952522);
    }

    @Override
    protected String F() {
        int n8 = ax.W2.y$b.b[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getString(2131951754);
            }
            return this.r().getString(2131952361);
        }
        n8 = this.w().H();
        if (n8 == 1) {
            String string = d0.h(this.x.get(0).A1());
            return this.r().getResources().getString(2131952362, new Object[]{string});
        }
        return this.r().getResources().getQuantityString(2131820557, n8, new Object[]{n8});
    }

    @Override
    protected String G() {
        return "";
    }

    @Override
    public ax.c3.K H() {
        return null;
    }

    @Override
    public String J() {
        return "";
    }

    @Override
    public ax.c3.K K() {
        return null;
    }

    @Override
    public String M() {
        K k8 = this.y;
        if (k8 == null) {
            return "";
        }
        return k8.A1();
    }

    @Override
    protected boolean P() {
        return this.w.Y();
    }

    @Override
    protected void W() {
        ax.a3.K k8 = this.E;
        if (k8 != null && k8.X0()) {
            if (this.E.e1()) {
                this.E.N2();
                return;
            }
            this.E.u3(true);
        }
    }

    @Override
    protected boolean X() {
        if (this.S(this.z)) {
            this.z.e();
            return true;
        }
        return false;
    }

    @Override
    protected void Y() {
        if (this.w.Y()) {
            this.w().T(v.a.c0);
            this.w.n(this.x());
        }
    }

    @Override
    protected void Z() {
        if (this.w().H() + this.w().C() == this.x.size()) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        c c8;
        this.j0();
        this.w().a0(true);
        this.w().e0(this.A);
        this.w().d0(this.x.size());
        this.k0();
        this.B.addAll(this.x);
        this.z = c8 = new c(this, false, j.f.q);
        c8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_restore").c("result", string).c("loc", this.w.S().I()).d(this.w().x()).e();
    }

    private class c
    extends q<Void, Void, Integer> {
        boolean h;
        j.f i;
        final y j;

        public c(y y8, boolean bl, j.f f8) {
            this.j = y8;
            super(q.e.f0);
            this.h = bl;
            this.i = f8;
        }

        int A(K k8, j.f f8) {
            f f92;
            block6: {
                ax.W2.y.z0(this.j, k8);
                ax.W2.y.A0(this.j, null);
                ax.W2.y.B0(this.j, null);
                try {
                    J.s2(this.j.w, k8, f8, this);
                    this.j.w().d(k8.p());
                    this.j.w().c(v.b.q, 1);
                }
                catch (f f92) {
                    break block6;
                }
                catch (ax.b3.a | ax.b3.j exception) {
                    this.j.w().c(v.b.c0, 1);
                    this.j.w().b(k8.B());
                }
                this.j.l0(true);
                return 0;
            }
            if (f92.a()) {
                return 2;
            }
            try {
                y y8 = this.j;
                ax.W2.y.A0(y8, y8.w.z(k8.A1()));
                y8 = this.j;
                ax.W2.y.B0(y8, y8.w.z(k8.B1()));
            }
            catch (ax.b3.j j8) {
                ax.W2.y.A0(this.j, null);
                ax.W2.y.B0(this.j, null);
            }
            return 1;
        }

        protected Integer w(Void ... voidArray) {
            int n8;
            if (this.h && (n8 = this.z(this.j.y, this.i)) != 0) {
                ax.Ha.c.h().d("PROCCED OVERWRITE RECYCLE BIN ERROR").g(n8).h();
            }
            while (!this.j.B.isEmpty()) {
                if (this.isCancelled()) {
                    return 0;
                }
                n8 = this.A((K)this.j.B.remove(), j.f.q);
                if (n8 == 0) continue;
                return n8;
            }
            return 0;
        }

        protected void x(Integer n8) {
            this.j.g0();
        }

        protected void y(Integer n8) {
            if (n8 == 0) {
                this.j.o();
                return;
            }
            y y8 = this.j;
            y8.F0(y8.y.isDirectory(), n8);
        }

        int z(K k8, j.f f8) {
            int n8 = ax.W2.y$b.a[f8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return 0;
                        }
                        this.j.i();
                        this.j.w().c(v.b.d0, 1);
                        return 0;
                    }
                    this.j.w().c(v.b.d0, 1);
                    return 0;
                }
                return this.A(k8, j.f.d0);
            }
            return this.A(k8, j.f.e0);
        }
    }
}

