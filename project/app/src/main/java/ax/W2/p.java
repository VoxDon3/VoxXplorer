/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.os.SystemClock;
import ax.Q2.a;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.X2.Q;
import ax.b3.e;
import ax.c3.B;
import ax.c3.K;
import ax.u3.q;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.f;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.y;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;

public class p
extends j {
    private static final Logger H = Logger.getLogger("FileManager.DeleteOperator");
    private b A;
    private boolean B;
    private boolean C;
    private int D;
    private long E;
    private boolean F;
    private Map<String, f.a> G;
    private o w;
    private List<n> x;
    private List<n> y;
    private n z;

    public p(h.a a8, o o8, List<n> list, List<n> list2, int n8, long l8, boolean bl, boolean bl2, Map<String, f.a> map) {
        super(a8);
        this.w = o8;
        this.x = list;
        this.y = list2;
        this.D = n8;
        this.E = l8;
        this.B = o8.O();
        this.C = bl;
        this.F = bl2;
        this.w.n0();
        this.G = map;
        this.h(this.w.T());
    }

    static /* synthetic */ n w0(p p8, n n8) {
        p8.z = n8;
        return n8;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 7;
    }

    @Override
    public String C() {
        return this.r().getString(2131952514);
    }

    @Override
    public String F() {
        int n8 = ax.W2.p$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getString(2131951754);
            }
            return this.r().getString(2131952335);
        }
        n8 = this.x.size();
        if (n8 == 1) {
            String string = this.x.get(0).B();
            return this.r().getResources().getString(2131952336, new Object[]{string});
        }
        return this.r().getResources().getQuantityString(2131820553, n8, new Object[]{n8});
    }

    @Override
    protected String G() {
        if (ax.W2.p$a.a[this.D().ordinal()] != 2) {
            return "";
        }
        boolean bl = this.w.S() == f.p0;
        return this.v(bl);
    }

    @Override
    public K H() {
        return null;
    }

    @Override
    public String J() {
        return "";
    }

    @Override
    public K K() {
        n n8 = this.z;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        n n8 = this.z;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    protected boolean P() {
        return this.w.Y();
    }

    @Override
    protected void W() {
    }

    @Override
    protected boolean X() {
        if (this.S(this.A)) {
            this.A.e();
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
        if (this.B ? this.w().H() == this.x.size() : (this.D > 0 ? this.w().H() == this.D : this.w().n() == 0)) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        b b8;
        this.j0();
        this.w().a0(true);
        if (this.B) {
            this.w().e0(this.E);
            this.w().d0(this.x.size());
        } else {
            this.w().e0(this.E);
            this.w().d0(this.D);
        }
        this.k0();
        this.A = b8 = new b(this);
        b8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_delete").c("result", string).c("loc", this.w.S().I()).d(this.w().x()).e();
    }

    private class b
    extends q<Void, Void, Integer> {
        long h;
        final p i;

        public b(p p8) {
            this.i = p8;
            super(q.e.f0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean w(n object) throws ax.b3.j, ax.b3.a {
            Object object2 = new Stack<Object>();
            ((Stack)object2).push(new c((n)object));
            while (true) {
                long l8;
                block11: {
                    n n8;
                    block15: {
                        ax.b3.j j82;
                        int n9;
                        block12: {
                            int n10;
                            block13: {
                                block14: {
                                    n9 = ((AbstractCollection)object2).size();
                                    n10 = 1;
                                    if (n9 <= 0) return n10 != 0;
                                    this.i.v0();
                                    if (this.isCancelled()) throw new ax.b3.a();
                                    object = (c)((Stack)object2).pop();
                                    n8 = ((c)object).a;
                                    p.w0(this.i, n8);
                                    if (!n8.isDirectory() || n8.l()) break block13;
                                    if (((c)object).b) break block14;
                                    ((c)object).b = true;
                                    ((Stack)object2).push(object);
                                    object = this.i.w.f0(n8);
                                    if (object == null || object.size() <= 0) break block11;
                                    object = object.iterator();
                                    break block15;
                                }
                                try {
                                    this.i.w.P(n8);
                                    break block11;
                                }
                                catch (ax.b3.j j9) {}
                            }
                            l8 = n8.p();
                            try {
                                this.i.w.P(n8);
                                this.i.w().d(l8);
                                this.i.w().c(v.b.q, 1);
                            }
                            catch (ax.b3.j j82) {
                                try {
                                    n10 = this.i.w.z(n8.E()).n();
                                    n9 = n10 ^ 1;
                                }
                                catch (ax.b3.j j10) {
                                    n9 = 0;
                                }
                                if (n9 == 0) break block12;
                                this.i.w().d(l8);
                                this.i.w().c(v.b.q, 1);
                            }
                            break block11;
                        }
                        n9 = this.i.q0(j82);
                        if (ax.c3.B.P(n8)) {
                            object = (y)n8;
                            String string = n8.P().I();
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append(string);
                            ((StringBuilder)object2).append(",base:");
                            object = ((y)object).B0() == null ? "null" : ((y)object).B0().toString();
                            ((StringBuilder)object2).append((String)object);
                            object = ((StringBuilder)object2).toString();
                            if (n9 != 10 && n9 != 50 && n9 != 60 && n9 != 40 && n9 != 100 && n9 != 90 && n9 != 30) {
                                ax.Ha.c.h().f().d("DELETE FAILED!").l(j82).g(object).h();
                            } else {
                                object2 = ax.Ha.c.h().f().d("DELETE FAILED HAS KNOWN REASON");
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append((String)object);
                                stringBuilder.append(",");
                                stringBuilder.append(n9);
                                ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
                            }
                        }
                        this.i.w().c(v.b.c0, 1);
                        this.i.w().b(n8.B());
                        return 0 != 0;
                    }
                    while (object.hasNext()) {
                        n8 = (n)object.next();
                        if (this.i.C && J.j2(n8)) continue;
                        ((Stack)object2).push(new c(n8));
                    }
                }
                if ((l8 = SystemClock.uptimeMillis()) - this.h < 100L) continue;
                this.h = l8;
                this.i.l0(false);
            }
        }

        private boolean y(n n8) {
            if (!Q.L()) {
                return false;
            }
            if (!ax.c3.B.P(n8)) {
                return false;
            }
            return f.k0(n8.P()) && com.alphainventor.filemanager.file.y.Y0(((y)n8).C0());
        }

        protected void A(Integer n8) {
            this.i.o();
        }

        protected Integer x(Void ... object) {
            boolean bl = false;
            object = 0;
            for (int i8 = 0; i8 < this.i.x.size(); ++i8) {
                this.i.v0();
                if (this.isCancelled()) {
                    return object;
                }
                n n8 = (n)this.i.x.get(i8);
                p.w0(this.i, n8);
                if (this.i.B) {
                    try {
                        this.i.w.I(n8);
                        this.i.w().d(n8.p());
                        this.i.w().c(v.b.q, 1);
                    }
                    catch (ax.b3.j j8) {
                        this.i.q0(j8);
                        this.i.w().c(v.b.c0, 1);
                        this.i.w().b(n8.B());
                    }
                } else if (this.y(n8)) {
                    int n9;
                    if (this.i.G == null || !this.i.G.containsKey(n8.Q()) || (n9 = ((f.a)((p)this.i).G.get((Object)n8.Q())).b) == 0) {
                        n9 = 1;
                    }
                    p p8 = this.i;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("system restricted folder :");
                    stringBuilder.append(n8.B());
                    p8.q0(new e(stringBuilder.toString()));
                    this.i.w().c(v.b.c0, n9);
                    this.i.w().b(n8.B());
                } else {
                    try {
                        this.w(n8);
                    }
                    catch (ax.b3.a a8) {
                    }
                    catch (ax.b3.j j9) {
                        j9.printStackTrace();
                    }
                }
                this.i.l0(true);
                if (i8 >= this.i.y.size()) continue;
                try {
                    this.i.w.P((n)this.i.y.get(i8));
                    continue;
                }
                catch (ax.b3.j j10) {
                    ax.Ha.c.h().f().c("INDEX FILE DELETE FAILED").l(j10).h();
                }
            }
            if (this.i.F && this.i.w().n() == 0 && !this.isCancelled()) {
                if (this.i.w.T().d() == f.o1) {
                    bl = true;
                }
                ax.u3.b.c(bl);
                J.V1(this.i.w.T());
            }
            return object;
        }

        protected void z(Integer n8) {
            this.i.g0();
        }
    }

    static class c {
        n a;
        boolean b;

        c(n n8) {
            this.a = n8;
            this.b = false;
        }
    }
}

