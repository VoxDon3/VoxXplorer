package ax.W2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.a3.K;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f extends j {
    private static final Logger J = ax.Q2.g.a(f.class);
    private d A;
    private String B;
    private AbstractC3595n C;
    private boolean D;
    private j.f E;
    private K F;
    private List<g> G;
    private g H;
    private ax.B.b<String> I;
    private LinkedList<g> w;
    private AbstractC3595n x;
    private C3596o y;
    private c z;

    class a implements K.i {
        a() {
        }

        @Override // ax.a3.K.i
        public void a(j.f fVar, boolean z) {
            f.this.D = z;
            f.this.E = fVar;
            f.this.A = f.this.new d(true, fVar);
            f.this.A.i(new Void[0]);
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.f.values().length];
            b = iArr;
            try {
                iArr[j.f.OVERWRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.f.RENAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.f.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.f.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[h.b.values().length];
            a = iArr2;
            try {
                iArr2[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class c extends AbstractC3199q<Void, Void, Void> {
        public c() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            f.this.w = new LinkedList();
            try {
                for (g gVar : f.this.G) {
                    if (isCancelled()) {
                        throw new C1486a();
                    }
                    f.this.w.offer(gVar);
                    long i = gVar.i();
                    if (i == -1) {
                        f.this.w().a0(true);
                    }
                    f.this.w().h(i);
                    f.this.w().g(1);
                }
                return null;
            } catch (C1486a unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Void r1) {
            f.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Void r1) {
            f.this.k0();
            f.this.O0();
        }
    }

    private class d extends AbstractC3199q<Void, Void, Integer> {
        boolean h;
        j.f i;

        public d(f fVar) {
            this(false, j.f.NORMAL);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x012d, code lost:
        
            if (r2 != null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x015c, code lost:
        
            if (r2 != null) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void A(boolean r15, ax.u3.InterfaceC3185c r16) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.f.d.A(boolean, ax.u3.c):void");
        }

        private void C(j.f fVar) {
            int i = b.b[fVar.ordinal()];
            if (i == 1) {
                B(false);
                return;
            }
            if (i == 2) {
                B(true);
            } else if (i == 3) {
                f.this.w().c(v.b.SKIPPED, 1);
            } else {
                if (i != 4) {
                    return;
                }
                f.this.i();
            }
        }

        private boolean x() {
            if (f.this.H.c != null) {
                Uri uri = f.this.H.c;
                if (C1809B.K(uri.getScheme())) {
                    File m = ax.Z2.a.m(f.this.r(), "content-tmp");
                    String path = uri.getPath();
                    if (path != null && d0.I(m.getAbsolutePath(), path)) {
                        return true;
                    }
                }
            }
            return false;
        }

        void B(boolean z) {
            A(z, this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            while (!isCancelled()) {
                if (this.h) {
                    this.h = false;
                    C(this.i);
                } else {
                    f fVar = f.this;
                    fVar.H = (g) fVar.w.pop();
                    f fVar2 = f.this;
                    String N0 = fVar2.N0(fVar2.H);
                    try {
                        f fVar3 = f.this;
                        fVar3.C = fVar3.y.z(N0);
                        e = null;
                    } catch (C1495j e) {
                        e = e;
                        e.printStackTrace();
                    }
                    if (f.this.C == null) {
                        if (e != null) {
                            f.this.q0(e);
                        }
                        f.this.w().c(v.b.FAILURE, 1);
                        f.this.w().b(f.this.H.h());
                    } else {
                        f.this.l0(true);
                        if (!f.this.C.n()) {
                            B(false);
                        } else {
                            if (f.this.C.isDirectory()) {
                                return 2;
                            }
                            if (!f.this.D) {
                                return 1;
                            }
                            C(this.i);
                        }
                    }
                }
                if (f.this.w.isEmpty()) {
                    break;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            f.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                f.this.O0();
            } else {
                f.this.P0(intValue);
            }
        }

        public d(boolean z, j.f fVar) {
            super(AbstractC3199q.e.NORMAL);
            this.h = z;
            this.i = fVar;
        }
    }

    public f(h.a aVar, List<g> list, C3596o c3596o, AbstractC3595n abstractC3595n) {
        super(aVar);
        this.I = new ax.B.b<>();
        this.G = list;
        this.y = c3596o;
        this.x = abstractC3595n;
        c3596o.n0();
        h(this.y.T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String N0(g gVar) {
        String E = this.x.E();
        if (TextUtils.isEmpty(E)) {
            throw new IllegalArgumentException();
        }
        return d0.Q(E, gVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        LinkedList<g> linkedList = this.w;
        if (linkedList != null && !linkedList.isEmpty()) {
            d dVar = new d(this);
            this.A = dVar;
            dVar.i(new Void[0]);
            return;
        }
        l0(true);
        if (w().O() != w().z()) {
            J.severe("Total : " + w().O() + " != Progress : " + w().z());
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(int i) {
        this.F = new K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", C());
        bundle.putString("fileName", this.C.B());
        bundle.putBoolean("isDirectory", false);
        bundle.putInt("errCode", i);
        bundle.putBoolean("applyToAll", true);
        bundle.putBoolean("directoryRename", false);
        this.F.v2(bundle);
        this.F.v3(new a());
        q().K(this, this.F);
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 12;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_copying);
    }

    @Override // ax.W2.j
    public String F() {
        int i = b.a[D().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return r().getResources().getString(R.string.msg_copy_failed);
            }
            if (i != 3) {
                return null;
            }
            return r().getResources().getString(R.string.cancelled);
        }
        if (w().H() == 0 && w().M() != 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int size = this.G.size();
        if (size != 1) {
            return r().getResources().getQuantityString(R.plurals.msg_copied_items_plurals, size, Integer.valueOf(size), this.x.E());
        }
        return r().getResources().getString(R.string.msg_copied_single_item, this.G.get(0).h(), this.x.E());
    }

    @Override // ax.W2.j
    public String G() {
        if (b.a[D().ordinal()] != 2) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return v(this.y.S() == ax.Q2.f.p0);
    }

    @Override // ax.W2.j
    public ax.c3.K H() {
        return null;
    }

    @Override // ax.W2.j
    public String J() {
        g gVar = this.H;
        return gVar == null ? HttpUrl.FRAGMENT_ENCODE_SET : gVar.p();
    }

    @Override // ax.W2.j
    public ax.c3.K K() {
        AbstractC3595n abstractC3595n = this.C;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.C;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.y.Y();
    }

    @Override // ax.W2.j
    protected void W() {
        K k = this.F;
        if (k == null || !k.X0()) {
            return;
        }
        if (this.F.e1()) {
            this.F.N2();
        } else {
            this.F.u3(true);
        }
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.z)) {
            this.z.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.A)) {
            return z;
        }
        this.A.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        if (this.y.Y()) {
            w().T(v.a.SCANNING);
            this.y.n(x());
        }
    }

    @Override // ax.W2.j
    protected void Z() {
        if (this.x != null) {
            w.c().g(this.x.R(), this.x.E(), this.I);
        }
        if (w().M() == w().H() + w().C()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        this.B = this.x.P().I();
        c cVar = new c();
        this.z = cVar;
        cVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        Iterator<g> it = this.G.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        this.y.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_save").c("result", a.c.a(D())).c("tgt", this.B).d(w().x()).e();
    }
}
