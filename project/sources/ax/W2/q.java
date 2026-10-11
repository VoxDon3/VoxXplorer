package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.b3.C1495j;
import ax.c3.K;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class q extends j {
    private int A;
    private long B;
    private Map<String, C3587f.a> C;
    private C3596o w;
    private List<AbstractC3595n> x;
    private AbstractC3595n y;
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

    private class b extends AbstractC3199q<Void, Void, Integer> {
        public b() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02f4  */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Integer g(java.lang.Void... r11) {
            /*
                Method dump skipped, instructions count: 916
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.q.b.g(java.lang.Void[]):java.lang.Integer");
        }

        public void x() throws C1495j {
            K k = K.e;
            if (k.e() != null) {
                J.X1(k, false);
            }
            Iterator it = q.this.x.iterator();
            while (it.hasNext()) {
                if (((C3605y) ((AbstractC3595n) it.next())).X0()) {
                    K k2 = K.f;
                    if (k2.e() != null) {
                        J.X1(k2, false);
                        return;
                    }
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            q.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            q.this.o();
        }
    }

    public q(h.a aVar, C3596o c3596o, List<AbstractC3595n> list, int i, long j, Map<String, C3587f.a> map) {
        super(aVar);
        this.w = c3596o;
        this.x = list;
        this.A = i;
        this.B = j;
        this.C = map;
        c3596o.n0();
        h(this.w.T());
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 9;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_moving_to_recycle_bin);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i == 1) {
            int H = w().H();
            return H == 1 ? r().getResources().getString(R.string.msg_recycled_single_item, this.x.get(0).B()) : r().getResources().getQuantityString(R.plurals.msg_recycled_items_plurals, H, Integer.valueOf(H));
        }
        if (i == 2) {
            return r().getString(R.string.msg_move_failed);
        }
        if (i != 3) {
            return null;
        }
        return r().getString(R.string.cancelled);
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
        AbstractC3595n abstractC3595n = this.y;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.y;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
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
        if (w().H() == this.x.size()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        w().a0(true);
        w().e0(this.B);
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
        ax.Q2.a.i().m("command", "file_recycle").c("result", a.c.a(D())).c("loc", this.w.S().I()).d(w().x()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
