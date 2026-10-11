package com.voxdon.xplorer.file;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.InterfaceC1814b;
import ax.c3.d0;
import com.voxdon.xplorer.R;
import java.io.File;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3595n implements Comparable<AbstractC3595n>, InterfaceC1814b {
    private ax.c3.K c0;
    private int d0 = -1;
    private long e0;
    private int f0;
    private String g0;
    private String h0;
    private EnumC1837z i0;
    private String j0;
    private Context q;

    public AbstractC3595n(AbstractC3594m abstractC3594m) {
        this.q = abstractC3594m.p().getApplicationContext();
        this.c0 = abstractC3594m.v();
    }

    public String A() {
        return d0.j(B());
    }

    public final String B() {
        String str;
        String C = C();
        String h = d0.h(E());
        if (C != null && !C.equals(h)) {
            if (this instanceof C3605y) {
                C3605y c3605y = (C3605y) this;
                File file = c3605y.M0;
                String str2 = null;
                if (file != null) {
                    str = file.getAbsolutePath();
                    String absolutePath = c3605y.F0().getAbsolutePath();
                    if (absolutePath.startsWith(str)) {
                        String substring = absolutePath.substring(str.length());
                        if (substring.startsWith("/")) {
                            str2 = substring.substring(1);
                        }
                    }
                } else {
                    str = "null";
                }
                ax.Ha.c.h().f().d("GFNA LOCAL!!!").j().g(P().I() + ":" + C + ":" + h + ":parentPath=" + str + ":dir=" + isDirectory() + ":alt=" + str2).h();
                if (str2 != null) {
                    return str2;
                }
            } else {
                ax.Ha.c.h().f().d("GFNA").j().g(P().I() + ":" + C + ":" + h).h();
            }
        }
        return C;
    }

    protected abstract String C();

    public C3597p D() {
        return null;
    }

    public final String E() {
        String F = F();
        if (!d0.B(F)) {
            String str = P().I() + "-" + C() + "-" + F;
            if (this instanceof C3605y) {
                C3605y c3605y = (C3605y) this;
                if (c3605y.F0() != null) {
                    str = str + "-" + c3605y.F0().getPath();
                }
            }
            ax.Ha.c.h().f().b("NOT NORMALIZED PATH").g(str).h();
        }
        return F;
    }

    protected abstract String F();

    public EnumC1837z G() {
        if (this.i0 == null) {
            this.i0 = C1808A.g(A());
        }
        return this.i0;
    }

    public String H(int i) {
        String str;
        long q = q();
        u(i);
        if (this.e0 == q && (str = this.h0) != null) {
            return str;
        }
        this.e0 = q;
        String w = w(q, i);
        this.h0 = w;
        return w;
    }

    @SuppressLint({"DefaultLocale"})
    public String I(boolean z) {
        if (isDirectory()) {
            int r = r(z);
            return r >= 0 ? this.q.getResources().getQuantityString(R.plurals.num_items_plurals, r, Integer.valueOf(r)) : r == -1100 ? HttpUrl.FRAGMENT_ENCODE_SET : this.q.getString(R.string.num_items_unknown);
        }
        long p = p();
        return p == -1 ? "-" : C1809B.i(this.q, p);
    }

    protected Drawable J(Context context, boolean z) {
        return isDirectory() ? ax.s3.b.g(context, this, a0(), z) : C1808A.f(context, E(), z);
    }

    public int K() {
        return isDirectory() ? R.drawable.icon_folder_full_s : C1808A.k(B(), false);
    }

    public int L() {
        return this.c0.b();
    }

    public Drawable M(Context context) {
        return J(context, true);
    }

    public File N() {
        return new File(ax.Z2.a.j(x(), this), B());
    }

    public C3605y O() throws C1495j {
        File N = N();
        return (C3605y) C1835x.f(N).z(N.getAbsolutePath());
    }

    public ax.Q2.f P() {
        return this.c0.d();
    }

    public String Q() {
        return C1809B.U(R(), E());
    }

    public ax.c3.K R() {
        return this.c0;
    }

    public String S() {
        return C1809B.U(R(), T());
    }

    public final String T() {
        String U = U();
        if (!d0.B(U)) {
            ax.Ha.c.h().f().b("!! PARENT PATH NOT NORMALIZED !!").j().g("location :" + P().I() + ", parent : " + U + ", path :" + F()).h();
        }
        return U;
    }

    protected abstract String U();

    public String V() {
        StringBuilder sb = new StringBuilder();
        sb.append(isDirectory() ? 'd' : '-');
        sb.append(d() ? 'r' : '-');
        sb.append(j() ? 'w' : '-');
        return sb.toString();
    }

    public String W() {
        if (this.j0 == null) {
            this.j0 = d0.w(this);
        }
        return this.j0;
    }

    public int X() {
        return this.d0;
    }

    public Drawable Y(Context context) {
        return J(context, false);
    }

    public File Z() {
        return new File(ax.Z2.a.l(x(), this), B());
    }

    public boolean a0() {
        return r(true) > 0;
    }

    public boolean b0() {
        return false;
    }

    public boolean c0() {
        return false;
    }

    public void d0(int i) {
        this.d0 = i;
    }

    protected boolean u(int i) {
        if (i == this.f0) {
            return false;
        }
        this.g0 = null;
        this.h0 = null;
        this.f0 = i;
        return true;
    }

    protected String w(long j, int i) {
        return j <= 0 ? HttpUrl.FRAGMENT_ENCODE_SET : C1831t.f(this.q, j, i);
    }

    Context x() {
        return this.q;
    }
}
