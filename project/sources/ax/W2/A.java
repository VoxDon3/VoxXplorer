package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.W2.z;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class A extends j {
    private boolean A;
    private z.d B;
    private AbstractC3595n C;
    private String D;
    private ax.B.b<String> E;
    private String F;
    private C3596o w;
    private List<AbstractC3595n> x;
    private List<String> y;
    private b z;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b extends AbstractC3199q<Void, Void, Boolean> {
        public b() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            A.this.A = false;
            for (int i = 0; i < A.this.x.size(); i++) {
                A a = A.this;
                a.C = (AbstractC3595n) a.x.get(i);
                A a2 = A.this;
                a2.D = (String) a2.y.get(i);
                if (A.this.C == null || A.this.D != null) {
                    A.this.l0(true);
                    if (z(A.this.C, A.this.D)) {
                        A.this.E.add(A.this.D);
                        A.this.w().c(v.b.SUCCESS, 1);
                        A.this.w().f(A.this.D);
                    } else {
                        A.this.w().c(v.b.FAILURE, 1);
                        A.this.w().b(A.this.C.B());
                    }
                } else {
                    ax.Ha.c.h().f().b("RENAME TARGET FILENAME NULL").g("size:" + A.this.x.size() + "," + A.this.y.size() + "," + A.this.C.R().k()).h();
                    A.this.w().c(v.b.FAILURE, 1);
                    A.this.w().b(A.this.C.B());
                }
            }
            A.this.l0(true);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            A.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            A.this.o();
        }

        boolean z(AbstractC3595n abstractC3595n, String str) {
            AbstractC3595n z;
            if (abstractC3595n.B().equals(str)) {
                return true;
            }
            if (d0.F(abstractC3595n.B(), str)) {
                try {
                    AbstractC3595n z2 = C1809B.z(A.this.w, abstractC3595n);
                    if (z2 == null) {
                        return false;
                    }
                    A.this.w.m0(abstractC3595n, z2, this, null);
                    z = A.this.w.z(z2.E());
                    if (z == null) {
                        return false;
                    }
                } catch (C1486a unused) {
                    return false;
                } catch (C1495j e) {
                    A.this.q0(e);
                    return false;
                }
            } else {
                z = abstractC3595n;
            }
            try {
                AbstractC3595n z3 = A.this.w.z(d0.Q(abstractC3595n.T(), str));
                if (z3 == null) {
                    return false;
                }
                if (z3.n()) {
                    A.this.A = true;
                    return false;
                }
                A.this.w.m0(z, z3, this, null);
                return true;
            } catch (C1486a unused2) {
                return false;
            } catch (C1495j e2) {
                e2.printStackTrace();
                A.this.q0(e2);
                return false;
            }
        }
    }

    public A(h.a aVar, C3596o c3596o, List<String> list, String str, List<AbstractC3595n> list2, z.d dVar) {
        super(aVar);
        this.E = new ax.B.b<>();
        this.B = dVar;
        this.w = c3596o;
        this.y = list;
        this.F = str;
        this.x = list2;
        c3596o.n0();
        h(this.w.T());
    }

    @Override // ax.W2.j
    public String A() {
        return I();
    }

    @Override // ax.W2.j
    public int B() {
        return 8;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.dialog_title_rename_file);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i == 1) {
            return r().getResources().getString(R.string.msg_rename_file_success);
        }
        if (i == 2) {
            return this.A ? r().getResources().getString(R.string.msg_file_exists) : r().getResources().getString(R.string.msg_rename_file_failure);
        }
        if (i != 3) {
            return null;
        }
        return r().getResources().getString(R.string.cancelled);
    }

    @Override // ax.W2.j
    protected String G() {
        if (a.a[D().ordinal()] != 2) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return v(this.w.S() == ax.Q2.f.p0);
    }

    @Override // ax.W2.j
    public K H() {
        AbstractC3595n abstractC3595n = this.C;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String J() {
        AbstractC3595n abstractC3595n = this.C;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    public K K() {
        AbstractC3595n abstractC3595n = this.C;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.C;
        if (abstractC3595n == null || this.D == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            return d0.Q(d0.r(abstractC3595n.W()), this.D);
        } catch (IllegalArgumentException unused) {
            ax.Q2.d.c("Rename target path merger", new Exception("Merge error:" + this.C.P().I() + ":" + this.C.E()));
            return "/" + this.D;
        }
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.w.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        if (!S(this.z)) {
            return false;
        }
        this.z.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        if (this.w.Y()) {
            w().T(v.a.SCANNING);
            this.w.n(x());
        }
    }

    @Override // ax.W2.j
    protected void Z() {
        if (this.F != null) {
            w.c().g(this.w.T(), this.F, this.E);
        }
        if (w().M() == w().H()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        w().a0(true);
        w().Z(true);
        w().d0(this.x.size());
        k0();
        b bVar = new b();
        this.z = bVar;
        bVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_rename").c("result", a.c.a(D())).c("loc", this.w.S().I()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
