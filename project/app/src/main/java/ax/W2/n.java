/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.W2.w;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.q;
import com.alphainventor.filemanager.file.o;

public class n
extends j {
    private boolean A;
    private o w;
    private b x;
    private String y;
    private boolean z;

    public n(h.a a8, o o8, String string, boolean bl) {
        super(a8);
        this.w = o8;
        this.y = string;
        this.A = bl;
        o8.n0();
        this.h(this.w.T());
    }

    static /* synthetic */ boolean z0(n n8, boolean bl) {
        n8.z = bl;
        return bl;
    }

    @Override
    public String A() {
        return this.L();
    }

    @Override
    public int B() {
        return 6;
    }

    @Override
    public String C() {
        return this.r().getString(2131951900);
    }

    @Override
    public String F() {
        int n8 = ax.W2.n$a.a[this.D().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return null;
                }
                return this.r().getResources().getString(2131951754);
            }
            if (this.z) {
                return this.r().getResources().getString(2131952343);
            }
            Resources resources = this.r().getResources();
            n8 = this.A ? 2131952331 : 2131952329;
            return resources.getString(n8);
        }
        Resources resources = this.r().getResources();
        n8 = this.A ? 2131952332 : 2131952330;
        return resources.getString(n8);
    }

    @Override
    protected String G() {
        return "";
    }

    @Override
    public K H() {
        return null;
    }

    @Override
    public String J() {
        return "";
    }

    @Override
    public K K() {
        return this.w.T();
    }

    @Override
    public String M() {
        if (TextUtils.isEmpty((CharSequence)this.y)) {
            return "";
        }
        return this.y;
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
        if (this.S(this.x)) {
            this.x.e();
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
        if (this.y != null) {
            ax.B.b<String> b8 = new ax.B.b<String>();
            b8.add(d0.h(this.y));
            ax.W2.w.c().g(this.w.T(), d0.r(this.y), b8);
        }
        int n8 = this.w().H();
        if (this.w().M() == n8) {
            this.t0(h.b.c0);
            return;
        }
        this.t0(h.b.d0);
    }

    @Override
    public void c0() {
        b b8;
        this.j0();
        this.w().e0(0L);
        this.w().d0(1);
        this.k0();
        this.x = b8 = new b(this);
        b8.i(new Void[0]);
    }

    @Override
    public void k() {
        this.w.k0(true);
    }

    @Override
    public void n0() {
        String string = this.A ? "folder_create" : "file_create";
        String string2 = a.c.a(this.D());
        ax.Q2.a.i().m("command", string).c("result", string2).c("loc", this.w.S().I()).e();
    }

    private class b
    extends q<Void, Void, Boolean> {
        private boolean h;
        final n i;

        public b(n n8) {
            this.i = n8;
            super(q.e.f0);
        }

        private boolean w() {
            ax.b3.j j82;
            block8: {
                com.alphainventor.filemanager.file.n n8;
                block7: {
                    try {
                        n8 = this.i.w.z(this.i.y);
                        if (n8 == null) break block7;
                    }
                    catch (ax.b3.j j82) {
                        break block8;
                    }
                    if (n8.n()) {
                        this.h = true;
                        return false;
                    }
                }
                if (this.isCancelled()) {
                    return false;
                }
                if (this.i.A) {
                    return this.i.w.k(n8, false);
                }
                boolean bl = this.i.w.N(n8);
                if (bl && B.P(n8) && ".nomedia".equals(n8.B())) {
                    MediaScannerConnection.scanFile((Context)this.i.r().getApplicationContext(), (String[])new String[]{n8.E()}, null, null);
                }
                return bl;
            }
            j82.printStackTrace();
            this.h = false;
            return false;
        }

        protected Boolean x(Void ... voidArray) {
            boolean bl = this.w();
            if (bl) {
                this.i.w().c(v.b.q, 1);
            } else {
                this.i.w().c(v.b.c0, 1);
                if (this.h) {
                    n.z0(this.i, true);
                } else {
                    n.z0(this.i, false);
                }
            }
            this.i.l0(true);
            return bl;
        }

        protected void y(Boolean bl) {
            this.i.g0();
        }

        protected void z(Boolean bl) {
            this.i.o();
        }
    }
}

