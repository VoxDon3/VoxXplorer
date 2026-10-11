package ax.c3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ax.m7.C2534i;
import ax.p7.C2779c;
import com.voxdon.xplorer.file.AbstractC3595n;
import okhttp3.HttpUrl;

/* renamed from: ax.c3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1812E extends AbstractC3595n {
    private C2779c k0;
    private String l0;
    private Long m0;
    private Boolean n0;
    private Boolean o0;
    private String p0;
    private Boolean q0;
    private Long r0;
    private String s0;
    private String t0;

    public C1812E(com.voxdon.xplorer.file.r rVar, String str) {
        this(rVar, null, null, null, str);
    }

    public static boolean k0(C2779c c2779c) {
        return "application/vnd.google-apps.shortcut".equals(c2779c.s());
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        C2779c c2779c = this.k0;
        return c2779c != null ? com.voxdon.xplorer.file.r.J0(c2779c) : d0.h(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.l0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String I(boolean z) {
        return (isDirectory() || !(j0() || p() == -1)) ? super.I(z) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected Drawable J(Context context, boolean z) {
        Drawable e = C1808A.e(context, s(), z);
        return e != null ? e : super.J(context, z);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public boolean c0() {
        return l() && p() == -1;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        C2779c c2779c = this.k0;
        if (c2779c == null || c2779c.n() == null || this.k0.n().n() == null) {
            return false;
        }
        return this.k0.n().n().booleanValue();
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return t().compareTo(abstractC3595n.t());
        } catch (Exception unused) {
            return -1;
        }
    }

    public String f0() {
        C2779c c2779c = this.k0;
        if (c2779c == null) {
            return null;
        }
        return c2779c.C();
    }

    public C2779c g0() {
        return this.k0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return false;
    }

    public String h0() {
        return this.t0;
    }

    public int hashCode() {
        C2779c c2779c = this.k0;
        return c2779c != null ? c2779c.hashCode() : this.l0.hashCode();
    }

    public String i0() {
        C2779c c2779c = this.k0;
        if (c2779c == null) {
            return null;
        }
        return c2779c.z();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        if (this.n0 == null) {
            if ("/".equals(this.l0)) {
                this.n0 = Boolean.TRUE;
            } else if (this.k0 == null) {
                this.n0 = Boolean.FALSE;
            } else if (!l() || this.k0.x() == null) {
                this.n0 = Boolean.valueOf("application/vnd.google-apps.folder".equals(this.k0.s()));
            } else {
                this.n0 = Boolean.valueOf("application/vnd.google-apps.folder".equals(this.k0.x().o()));
            }
        }
        return this.n0.booleanValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        C2779c c2779c = this.k0;
        if (c2779c == null || c2779c.n() == null || this.k0.n().o() == null) {
            return false;
        }
        return this.k0.n().o().booleanValue();
    }

    public boolean j0() {
        String s = s();
        return (s == null || !s.startsWith("application/vnd.google-apps.") || s.endsWith("shortcut")) ? false : true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        if (this.q0 == null) {
            C2779c c2779c = this.k0;
            if (c2779c != null) {
                this.q0 = Boolean.valueOf(k0(c2779c));
            } else {
                this.q0 = Boolean.FALSE;
            }
        }
        return this.q0.booleanValue();
    }

    public void l0(long j) {
        this.r0 = Long.valueOf(j);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        Boolean bool = this.o0;
        if (bool != null) {
            return bool.booleanValue();
        }
        C2779c c2779c = this.k0;
        if (c2779c == null) {
            return "/".equals(this.l0);
        }
        if (c2779c.B() == null) {
            return true;
        }
        return !r0.booleanValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        if (this.r0 == null) {
            C2779c c2779c = this.k0;
            if (c2779c != null && c2779c.y() != null) {
                this.r0 = this.k0.y();
            } else if (!l()) {
                this.r0 = 0L;
            } else if (isDirectory()) {
                this.r0 = 0L;
            } else {
                this.r0 = -1L;
            }
        }
        return this.r0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.m0 == null) {
            C2779c c2779c = this.k0;
            if (c2779c != null) {
                C2534i t = c2779c.t();
                if (t != null) {
                    this.m0 = Long.valueOf(t.b());
                } else {
                    C2534i o = this.k0.o();
                    if (o != null) {
                        this.m0 = Long.valueOf(o.b());
                    } else {
                        this.m0 = -1L;
                    }
                }
            } else {
                this.m0 = -1L;
            }
        }
        return this.m0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (isDirectory()) {
            return X();
        }
        return -2;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.p0 == null) {
            String str = null;
            if (this.k0 != null) {
                if (l() && this.k0.x() != null) {
                    str = this.k0.x().o();
                }
                if (str == null) {
                    str = this.k0.s();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
            } else if ("application/octet-stream".equals(str)) {
                str = C1833v.e(this, "application/octet-stream");
            }
            this.p0 = str;
        }
        return this.p0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        C2779c c2779c = this.k0;
        if (c2779c != null) {
            return c2779c.r();
        }
        if ("/".equals(this.l0)) {
            return "root";
        }
        if ("/.hidden-system-folder".equals(this.l0)) {
            return "noid";
        }
        ax.Ha.c.h().f().b("GDID").j().h();
        return null;
    }

    public C1812E(com.voxdon.xplorer.file.r rVar, String str, boolean z, boolean z2) {
        this(rVar, null, null, null, str);
        this.n0 = Boolean.valueOf(z);
        this.o0 = Boolean.valueOf(z2);
    }

    public C1812E(com.voxdon.xplorer.file.r rVar, String str, String str2, String str3) {
        this(rVar, str, str2, null, str3);
    }

    public C1812E(com.voxdon.xplorer.file.r rVar, String str, String str2, C2779c c2779c, String str3) {
        super(rVar);
        this.s0 = str;
        this.t0 = str2;
        this.k0 = c2779c;
        this.l0 = str3;
    }
}
