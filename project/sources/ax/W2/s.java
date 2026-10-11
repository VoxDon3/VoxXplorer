package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.K;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class s extends j {
    private static final Logger B = Logger.getLogger("FileManager.DownloadOperator");
    private boolean A;
    private C3596o w;
    private b x;
    private List<AbstractC3595n> y;
    AbstractC3595n z;

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
            AbstractC3595n abstractC3595n;
            boolean z;
            for (AbstractC3595n abstractC3595n2 : s.this.y) {
                if (isCancelled()) {
                    return Boolean.FALSE;
                }
                s sVar = s.this;
                sVar.z = abstractC3595n2;
                sVar.l0(true);
                try {
                    try {
                        abstractC3595n = s.this.w.z(abstractC3595n2.E());
                    } catch (C1486a unused) {
                        s.this.w().c(v.b.FAILURE, 1);
                    }
                } catch (C1495j unused2) {
                    abstractC3595n = abstractC3595n2;
                }
                try {
                    if (abstractC3595n.n()) {
                        File Z = s.this.A ? abstractC3595n.Z() : abstractC3595n.N();
                        if (C1809B.G(Z, abstractC3595n)) {
                            s.this.w().c(v.b.SUCCESS, 1);
                            s.this.w().d(Z.length());
                        } else {
                            if (abstractC3595n.isDirectory()) {
                                if (abstractC3595n2.P() == ax.Q2.f.K0 && (s.this.w.u() instanceof W) && ((W) s.this.w.u()).K0()) {
                                    abstractC3595n = abstractC3595n2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    ax.Ha.c.h().f().b("DOWNLOAD DIRECTORY ERROR").g("location:" + abstractC3595n2.P().I() + ",dir:" + abstractC3595n2.isDirectory() + ",ext:" + abstractC3595n2.A()).h();
                                    s.this.w().c(v.b.FAILURE, 1);
                                    s.B.severe("Download Directory Error");
                                }
                            }
                            s.this.w.p(abstractC3595n, Z, this, s.this.V());
                            Z.setReadable(true, false);
                            Z.setWritable(true, false);
                            s.this.w().c(v.b.SUCCESS, 1);
                        }
                    } else {
                        s.this.r0(20);
                        s.this.w().c(v.b.FAILURE, 1);
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                    int q0 = s.this.q0(e);
                    if (q0 == 80) {
                        ax.Ha.c.h().f().d("UNSUPPORTED ENCRYPTION : DOWNLOAD FAILED").l(e).g("location:" + abstractC3595n2.P().I()).h();
                    } else if (q0 != 0) {
                        ax.Ha.c.h().f().d("DOWNLOAD FAILED KNOWN REASON").l(e).g("location:" + abstractC3595n2.P().I()).h();
                    } else {
                        ax.Ha.c.h().f().d("DOWNLOAD FAILED").l(e).g("location:" + abstractC3595n2.P().I()).h();
                    }
                    s.this.w().c(v.b.FAILURE, 1);
                }
            }
            s.this.l0(true);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            s.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            s.this.o();
        }
    }

    public s(h.a aVar, C3596o c3596o, List<AbstractC3595n> list, boolean z) {
        super(aVar);
        this.w = c3596o;
        this.y = list;
        this.A = z;
        c3596o.n0();
        h(this.w.T());
    }

    @Override // ax.W2.j
    public String A() {
        return I();
    }

    @Override // ax.W2.j
    public int B() {
        return 4;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_downloading);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i == 1) {
            return r().getResources().getString(R.string.msg_download_complete);
        }
        if (i == 2) {
            return r().getResources().getString(R.string.msg_download_failed);
        }
        if (i != 3) {
            return null;
        }
        return r().getResources().getString(R.string.cancelled);
    }

    @Override // ax.W2.j
    protected String G() {
        return a.a[D().ordinal()] != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : v(false);
    }

    @Override // ax.W2.j
    public K H() {
        AbstractC3595n abstractC3595n = this.z;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String J() {
        AbstractC3595n abstractC3595n = this.z;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    public K K() {
        return null;
    }

    @Override // ax.W2.j
    public String M() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.w.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        if (!S(this.x)) {
            return false;
        }
        this.x.e();
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
        if (w().M() == w().H()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        Iterator<AbstractC3595n> it = this.y.iterator();
        while (it.hasNext()) {
            w().h(it.next().p());
        }
        w().d0(this.y.size());
        k0();
        b bVar = new b();
        this.x = bVar;
        bVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_download").c("result", a.c.a(D())).c("loc", this.w.S().I()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
