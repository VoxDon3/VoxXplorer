package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.X2.Q;
import ax.b3.C1486a;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.K;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.R;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class p extends j {
    private static final Logger H = Logger.getLogger("FileManager.DeleteOperator");
    private b A;
    private boolean B;
    private boolean C;
    private int D;
    private long E;
    private boolean F;
    private Map<String, C3587f.a> G;
    private C3596o w;
    private List<AbstractC3595n> x;
    private List<AbstractC3595n> y;
    private AbstractC3595n z;

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

    private class b extends AbstractC3199q<Void, Void, Integer> {
        long h;

        public b() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x000d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean w(com.voxdon.xplorer.file.AbstractC3595n r10) throws ax.b3.C1495j, ax.b3.C1486a {
            /*
                Method dump skipped, instructions count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.p.b.w(com.voxdon.xplorer.file.n):boolean");
        }

        private boolean y(AbstractC3595n abstractC3595n) {
            return Q.L() && C1809B.P(abstractC3595n) && ax.Q2.f.k0(abstractC3595n.P()) && C3605y.Y0(((C3605y) abstractC3595n).C0());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            p.this.o();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            int i;
            for (int i2 = 0; i2 < p.this.x.size(); i2++) {
                p.this.v0();
                if (isCancelled()) {
                    return 0;
                }
                AbstractC3595n abstractC3595n = (AbstractC3595n) p.this.x.get(i2);
                p.this.z = abstractC3595n;
                if (p.this.B) {
                    try {
                        p.this.w.I(abstractC3595n);
                        p.this.w().d(abstractC3595n.p());
                        p.this.w().c(v.b.SUCCESS, 1);
                    } catch (C1495j e) {
                        p.this.q0(e);
                        p.this.w().c(v.b.FAILURE, 1);
                        p.this.w().b(abstractC3595n.B());
                    }
                } else if (y(abstractC3595n)) {
                    if (p.this.G == null || !p.this.G.containsKey(abstractC3595n.Q()) || (i = ((C3587f.a) p.this.G.get(abstractC3595n.Q())).b) == 0) {
                        i = 1;
                    }
                    p.this.q0(new C1490e("system restricted folder :" + abstractC3595n.B()));
                    p.this.w().c(v.b.FAILURE, i);
                    p.this.w().b(abstractC3595n.B());
                } else {
                    try {
                        w(abstractC3595n);
                    } catch (C1486a unused) {
                    } catch (C1495j e2) {
                        e2.printStackTrace();
                    }
                }
                p.this.l0(true);
                if (i2 < p.this.y.size()) {
                    try {
                        p.this.w.P((AbstractC3595n) p.this.y.get(i2));
                    } catch (C1495j e3) {
                        ax.Ha.c.h().f().c("INDEX FILE DELETE FAILED").l(e3).h();
                    }
                }
            }
            if (p.this.F && p.this.w().n() == 0 && !isCancelled()) {
                C3184b.c(p.this.w.T().d() == ax.Q2.f.o1);
                J.V1(p.this.w.T());
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            p.this.g0();
        }
    }

    static class c {
        AbstractC3595n a;
        boolean b = false;

        c(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }
    }

    public p(h.a aVar, C3596o c3596o, List<AbstractC3595n> list, List<AbstractC3595n> list2, int i, long j, boolean z, boolean z2, Map<String, C3587f.a> map) {
        super(aVar);
        this.w = c3596o;
        this.x = list;
        this.y = list2;
        this.D = i;
        this.E = j;
        this.B = c3596o.O();
        this.C = z;
        this.F = z2;
        this.w.n0();
        this.G = map;
        h(this.w.T());
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 7;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_deleting);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return r().getString(R.string.msg_delete_failed);
            }
            if (i != 3) {
                return null;
            }
            return r().getString(R.string.cancelled);
        }
        int size = this.x.size();
        if (size != 1) {
            return r().getResources().getQuantityString(R.plurals.msg_deleted_items_plurals, size, Integer.valueOf(size));
        }
        return r().getResources().getString(R.string.msg_deleted_single_item, this.x.get(0).B());
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
        return null;
    }

    @Override // ax.W2.j
    public String J() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    public K K() {
        AbstractC3595n abstractC3595n = this.z;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.z;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.w.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        if (!S(this.A)) {
            return false;
        }
        this.A.e();
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
        if (!this.B ? !(this.D <= 0 ? w().n() != 0 : w().H() != this.D) : w().H() == this.x.size()) {
            t0(h.b.FAILURE);
        } else {
            t0(h.b.SUCCESS);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        w().a0(true);
        if (this.B) {
            w().e0(this.E);
            w().d0(this.x.size());
        } else {
            w().e0(this.E);
            w().d0(this.D);
        }
        k0();
        b bVar = new b();
        this.A = bVar;
        bVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_delete").c("result", a.c.a(D())).c("loc", this.w.S().I()).d(w().x()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
