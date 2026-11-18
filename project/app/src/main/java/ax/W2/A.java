/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import ax.Ha.c;
import ax.Q2.a;
import ax.Q2.d;
import ax.Q2.f;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.W2.w;
import ax.W2.z;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.q;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.util.List;

public class A
extends j {
    private boolean A;
    private z.d B;
    private n C;
    private String D;
    private ax.B.b<String> E = new ax.B.b();
    private String F;
    private o w;
    private List<n> x;
    private List<String> y;
    private b z;

    public A(h.a a8, o o8, List<String> list, String string, List<n> list2, z.d d8) {
        super(a8);
        this.B = d8;
        this.w = o8;
        this.y = list;
        this.F = string;
        this.x = list2;
        o8.n0();
        this.h(this.w.T());
    }

    static /* synthetic */ n A0(A a8, n n8) {
        a8.C = n8;
        return n8;
    }

    static /* synthetic */ String C0(A a8, String string) {
        a8.D = string;
        return string;
    }

    static /* synthetic */ boolean x0(A a8, boolean bl) {
        a8.A = bl;
        return bl;
    }

    @Override
    public String A() {
        return this.I();
    }

    @Override
    public int B() {
        return 8;
    }

    @Override
    public String C() {
        return this.r().getString(2131951901);
    }

    @Override
    public String F() {
        int n8 = ax.W2.A$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            if (this.A) {
                return this.r().getResources().getString(2131952343);
            }
            return this.r().getResources().getString(2131952359);
        }
        return this.r().getResources().getString(2131952360);
    }

    @Override
    protected String G() {
        if (ax.W2.A$a.a[this.D().ordinal()] != 2) {
            return "";
        }
        boolean bl = this.w.S() == f.p0;
        return this.v(bl);
    }

    @Override
    public K H() {
        n n8 = this.C;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String J() {
        n n8 = this.C;
        if (n8 == null) {
            return "";
        }
        return n8.W();
    }

    @Override
    public K K() {
        n n8 = this.C;
        if (n8 == null) {
            return null;
        }
        return n8.R();
    }

    @Override
    public String M() {
        Object object = this.C;
        if (object == null) {
            return "";
        }
        if (this.D == null) {
            return "";
        }
        object = d0.r(((n)object).W());
        try {
            object = d0.Q((String)object, this.D);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Merge error:");
            stringBuilder.append(this.C.P().I());
            stringBuilder.append(":");
            stringBuilder.append(this.C.E());
            d.c("Rename target path merger", new Exception(stringBuilder.toString()));
            stringBuilder = new StringBuilder();
            stringBuilder.append("/");
            stringBuilder.append(this.D);
            return stringBuilder.toString();
        }
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
        if (this.F != null) {
            ax.W2.w.c().g(this.w.T(), this.F, this.E);
        }
        if (this.w().M() == this.w().H()) {
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
        this.w().Z(true);
        this.w().d0(this.x.size());
        this.k0();
        this.z = b8 = new b(this);
        b8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = a.c.a(this.D());
        ax.Q2.a.i().m("command", "file_rename").c("result", string).c("loc", this.w.S().I()).e();
    }

    private class b
    extends q<Void, Void, Boolean> {
        final A h;

        public b(A a8) {
            this.h = a8;
            super(q.e.f0);
        }

        protected Boolean w(Void ... object) {
            object = this.h;
            ax.W2.A.x0((A)object, false);
            for (int i8 = 0; i8 < this.h.x.size(); ++i8) {
                object = this.h;
                ax.W2.A.A0((A)object, (n)((A)object).x.get(i8));
                object = this.h;
                ax.W2.A.C0((A)object, (String)((A)object).y.get(i8));
                if (this.h.C != null && this.h.D == null) {
                    ax.Ha.b b8 = c.h().f().b("RENAME TARGET FILENAME NULL");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("size:");
                    ((StringBuilder)object).append(this.h.x.size());
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.h.y.size());
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.h.C.R().k());
                    b8.g(((StringBuilder)object).toString()).h();
                    this.h.w().c(v.b.c0, 1);
                    this.h.w().b(this.h.C.B());
                    continue;
                }
                this.h.l0(true);
                if (this.z(this.h.C, this.h.D)) {
                    this.h.E.add(this.h.D);
                    this.h.w().c(v.b.q, 1);
                    this.h.w().f(this.h.D);
                    continue;
                }
                this.h.w().c(v.b.c0, 1);
                this.h.w().b(this.h.C.B());
            }
            this.h.l0(true);
            return Boolean.TRUE;
        }

        protected void x(Boolean bl) {
            this.h.g0();
        }

        protected void y(Boolean bl) {
            this.h.o();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean z(n object, String string) {
            Object n8;
            block12: {
                if (((n)object).B().equals(string)) {
                    return true;
                }
                if (d0.F(((n)object).B(), string)) {
                    try {
                        n8 = ax.c3.B.z(this.h.w, (n)object);
                        if (n8 == null) {
                            return false;
                        }
                        this.h.w.m0((n)object, (n)n8, this, null);
                        n n9 = this.h.w.z(((n)n8).E());
                        n8 = n9;
                        if (n9 == null) {
                            return false;
                        }
                        break block12;
                    }
                    catch (ax.b3.j j8) {
                    }
                    catch (ax.b3.a a8) {
                        return false;
                    }
                    this.h.q0(j8);
                    return false;
                }
                n8 = object;
            }
            try {
                object = d0.Q(((n)object).T(), string);
                object = this.h.w.z((String)object);
                if (object == null) {
                    return false;
                }
                if (object.n()) {
                    ax.W2.A.x0(this.h, true);
                    return false;
                }
                this.h.w.m0((n)n8, (n)object, this, null);
                return true;
            }
            catch (ax.b3.j j9) {
            }
            catch (ax.b3.a a9) {
                return false;
            }
            j9.printStackTrace();
            this.h.q0(j9);
            return false;
        }
    }
}

