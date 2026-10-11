package ax.W2;

import android.media.MediaScannerConnection;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class n extends j {
    private boolean A;
    private C3596o w;
    private b x;
    private String y;
    private boolean z;

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
        private boolean h;

        public b() {
            super(AbstractC3199q.e.NORMAL);
        }

        private boolean w() {
            try {
                AbstractC3595n z = n.this.w.z(n.this.y);
                if (z != null && z.n()) {
                    this.h = true;
                    return false;
                }
                if (isCancelled()) {
                    return false;
                }
                if (n.this.A) {
                    return n.this.w.k(z, false);
                }
                boolean N = n.this.w.N(z);
                if (N && C1809B.P(z) && ".nomedia".equals(z.B())) {
                    MediaScannerConnection.scanFile(n.this.r().getApplicationContext(), new String[]{z.E()}, null, null);
                }
                return N;
            } catch (C1495j e) {
                e.printStackTrace();
                this.h = false;
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            boolean w = w();
            if (w) {
                n.this.w().c(v.b.SUCCESS, 1);
            } else {
                n.this.w().c(v.b.FAILURE, 1);
                if (this.h) {
                    n.this.z = true;
                } else {
                    n.this.z = false;
                }
            }
            n.this.l0(true);
            return Boolean.valueOf(w);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            n.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            n.this.o();
        }
    }

    public n(h.a aVar, C3596o c3596o, String str, boolean z) {
        super(aVar);
        this.w = c3596o;
        this.y = str;
        this.A = z;
        c3596o.n0();
        h(this.w.T());
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 6;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.dialog_title_new_folder);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i == 1) {
            return r().getResources().getString(this.A ? R.string.msg_create_folder_success : R.string.msg_create_file_success);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return r().getResources().getString(R.string.cancelled);
        }
        if (this.z) {
            return r().getResources().getString(R.string.msg_file_exists);
        }
        return r().getResources().getString(this.A ? R.string.msg_create_folder_failure : R.string.msg_create_file_failure);
    }

    @Override // ax.W2.j
    protected String G() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
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
        return this.w.T();
    }

    @Override // ax.W2.j
    public String M() {
        return TextUtils.isEmpty(this.y) ? HttpUrl.FRAGMENT_ENCODE_SET : this.y;
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
        if (this.y != null) {
            ax.B.b bVar = new ax.B.b();
            bVar.add(d0.h(this.y));
            w.c().g(this.w.T(), d0.r(this.y), bVar);
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
        w().e0(0L);
        w().d0(1);
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
        ax.Q2.a.i().m("command", this.A ? "folder_create" : "file_create").c("result", a.c.a(D())).c("loc", this.w.S().I()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
