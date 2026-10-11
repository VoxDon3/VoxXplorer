package ax.W2;

import android.os.Bundle;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.a3.K;
import ax.b3.C1486a;
import ax.b3.C1491f;
import ax.b3.C1495j;
import ax.c3.C1829q;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.K;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class y extends j {
    private long A;
    private ConcurrentLinkedQueue<K> B;
    private AbstractC3595n C;
    private AbstractC3595n D;
    ax.a3.K E;
    private C3596o w;
    private List<K> x;
    private K y;
    private c z;

    class a implements K.i {
        a() {
        }

        @Override // ax.a3.K.i
        public void a(j.f fVar, boolean z) {
            y.this.z = y.this.new c(true, fVar);
            y.this.z.i(new Void[0]);
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[h.b.values().length];
            b = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.f.values().length];
            a = iArr2;
            try {
                iArr2[j.f.OVERWRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.f.RENAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j.f.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j.f.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class c extends AbstractC3199q<Void, Void, Integer> {
        boolean h;
        j.f i;

        public c(boolean z, j.f fVar) {
            super(AbstractC3199q.e.NORMAL);
            this.h = z;
            this.i = fVar;
        }

        int A(com.voxdon.xplorer.file.K k, j.f fVar) {
            y.this.y = k;
            y.this.C = null;
            y.this.D = null;
            try {
                J.s2(y.this.w, k, fVar, this);
                y.this.w().d(k.p());
                y.this.w().c(v.b.SUCCESS, 1);
            } catch (C1486a | C1495j unused) {
                y.this.w().c(v.b.FAILURE, 1);
                y.this.w().b(k.B());
            } catch (C1491f e) {
                if (e.a()) {
                    return 2;
                }
                try {
                    y yVar = y.this;
                    yVar.C = yVar.w.z(k.A1());
                    y yVar2 = y.this;
                    yVar2.D = yVar2.w.z(k.B1());
                } catch (C1495j unused2) {
                    y.this.C = null;
                    y.this.D = null;
                }
                return 1;
            }
            y.this.l0(true);
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            int z;
            if (this.h && (z = z(y.this.y, this.i)) != 0) {
                ax.Ha.c.h().d("PROCCED OVERWRITE RECYCLE BIN ERROR").g(Integer.valueOf(z)).h();
            }
            while (!y.this.B.isEmpty() && !isCancelled()) {
                int A = A((com.voxdon.xplorer.file.K) y.this.B.remove(), j.f.NORMAL);
                if (A != 0) {
                    return Integer.valueOf(A);
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            y.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (num.intValue() == 0) {
                y.this.o();
            } else {
                y yVar = y.this;
                yVar.F0(yVar.y.isDirectory(), num.intValue());
            }
        }

        int z(com.voxdon.xplorer.file.K k, j.f fVar) {
            int i = b.a[fVar.ordinal()];
            if (i == 1) {
                return A(k, j.f.OVERWRITE);
            }
            if (i == 2) {
                return A(k, j.f.RENAME);
            }
            if (i == 3) {
                y.this.w().c(v.b.SKIPPED, 1);
                return 0;
            }
            if (i != 4) {
                return 0;
            }
            y.this.i();
            y.this.w().c(v.b.SKIPPED, 1);
            return 0;
        }
    }

    public y(h.a aVar, C3596o c3596o, List<AbstractC3595n> list) {
        super(aVar);
        this.B = new ConcurrentLinkedQueue<>();
        this.w = c3596o;
        c3596o.n0();
        this.x = new ArrayList();
        for (AbstractC3595n abstractC3595n : C1829q.g(list, C1829q.c("DateUpNoSeparate"))) {
            this.x.add((com.voxdon.xplorer.file.K) abstractC3595n);
            this.A += abstractC3595n.p();
        }
        h(this.w.T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(boolean z, int i) {
        AbstractC3595n abstractC3595n;
        this.E = new ax.a3.K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", C());
        bundle.putString("fileName", A());
        bundle.putBoolean("isDirectory", z);
        bundle.putInt("errCode", i);
        bundle.putBoolean("applyToAll", false);
        bundle.putBoolean("directoryRename", true);
        if (!z && i == 1 && this.C != null && (abstractC3595n = this.D) != null) {
            bundle.putLong("new_file_date", abstractC3595n.q());
            bundle.putLong("new_file_size", this.D.p());
            bundle.putString("old_file_path", this.C.E());
            bundle.putLong("old_file_date", this.C.q());
            bundle.putLong("old_file_size", this.C.p());
        }
        this.E.v2(bundle);
        this.E.v3(new a());
        q().K(this, this.E);
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 10;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_restoring_from_recycle_bin);
    }

    @Override // ax.W2.j
    protected String F() {
        int i = b.b[D().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return r().getString(R.string.msg_restore_failed);
            }
            if (i != 3) {
                return null;
            }
            return r().getString(R.string.cancelled);
        }
        int H = w().H();
        if (H != 1) {
            return r().getResources().getQuantityString(R.plurals.msg_restored_items_plurals, H, Integer.valueOf(H));
        }
        return r().getResources().getString(R.string.msg_restored_single_item, d0.h(this.x.get(0).A1()));
    }

    @Override // ax.W2.j
    protected String G() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    public ax.c3.K H() {
        return null;
    }

    @Override // ax.W2.j
    public String J() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    public ax.c3.K K() {
        return null;
    }

    @Override // ax.W2.j
    public String M() {
        com.voxdon.xplorer.file.K k = this.y;
        return k == null ? HttpUrl.FRAGMENT_ENCODE_SET : k.A1();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.w.Y();
    }

    @Override // ax.W2.j
    protected void W() {
        ax.a3.K k = this.E;
        if (k == null || !k.X0()) {
            return;
        }
        if (this.E.e1()) {
            this.E.N2();
        } else {
            this.E.u3(true);
        }
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
        if (w().H() + w().C() == this.x.size()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        w().a0(true);
        w().e0(this.A);
        w().d0(this.x.size());
        k0();
        this.B.addAll(this.x);
        c cVar = new c(false, j.f.NORMAL);
        this.z = cVar;
        cVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_restore").c("result", a.c.a(D())).c("loc", this.w.S().I()).d(w().x()).e();
    }
}
