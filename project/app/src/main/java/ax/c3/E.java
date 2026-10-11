/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ax.Ha.c;
import ax.c3.A;
import ax.c3.d0;
import ax.c3.v;
import ax.m7.i;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.r;

public class E
extends n {
    private ax.p7.c k0;
    private String l0;
    private Long m0;
    private Boolean n0;
    private Boolean o0;
    private String p0;
    private Boolean q0;
    private Long r0;
    private String s0;
    private String t0;

    public E(r r8, String string) {
        this(r8, null, null, null, string);
    }

    public E(r r8, String string, String string2, ax.p7.c c8, String string3) {
        super(r8);
        this.s0 = string;
        this.t0 = string2;
        this.k0 = c8;
        this.l0 = string3;
    }

    public E(r r8, String string, String string2, String string3) {
        this(r8, string, string2, null, string3);
    }

    public E(r r8, String string, boolean bl, boolean bl2) {
        this(r8, null, null, null, string);
        this.n0 = bl;
        this.o0 = bl2;
    }

    public static boolean k0(ax.p7.c c8) {
        return "application/vnd.google-apps.shortcut".equals(c8.s());
    }

    @Override
    public String C() {
        ax.p7.c c8 = this.k0;
        if (c8 != null) {
            return r.J0(c8);
        }
        return d0.h(this.l0);
    }

    @Override
    public String F() {
        return this.l0;
    }

    @Override
    public String I(boolean bl) {
        if (!this.isDirectory() && (this.j0() || this.p() == -1L)) {
            return "";
        }
        return super.I(bl);
    }

    @Override
    protected Drawable J(Context context, boolean bl) {
        Drawable drawable = A.e(context, this.s(), bl);
        if (drawable != null) {
            return drawable;
        }
        return super.J(context, bl);
    }

    @Override
    public String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean c0() {
        return this.l() && this.p() == -1L;
    }

    @Override
    public boolean d() {
        ax.p7.c c8 = this.k0;
        if (c8 != null && c8.n() != null && this.k0.n().n() != null) {
            return this.k0.n().n();
        }
        return false;
    }

    public int e0(n n8) {
        try {
            int n9 = this.t().compareTo(n8.t());
            return n9;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public String f0() {
        ax.p7.c c8 = this.k0;
        if (c8 == null) {
            return null;
        }
        return c8.C();
    }

    public ax.p7.c g0() {
        return this.k0;
    }

    @Override
    public boolean h() {
        return false;
    }

    public String h0() {
        return this.t0;
    }

    public int hashCode() {
        ax.p7.c c8 = this.k0;
        if (c8 != null) {
            return c8.hashCode();
        }
        return this.l0.hashCode();
    }

    public String i0() {
        ax.p7.c c8 = this.k0;
        if (c8 == null) {
            return null;
        }
        return c8.z();
    }

    @Override
    public boolean isDirectory() {
        if (this.n0 == null) {
            this.n0 = "/".equals(this.l0) ? Boolean.TRUE : (this.k0 == null ? Boolean.FALSE : (this.l() && this.k0.x() != null ? Boolean.valueOf("application/vnd.google-apps.folder".equals(this.k0.x().o())) : Boolean.valueOf("application/vnd.google-apps.folder".equals(this.k0.s()))));
        }
        return this.n0;
    }

    @Override
    public boolean j() {
        ax.p7.c c8 = this.k0;
        if (c8 != null && c8.n() != null && this.k0.n().o() != null) {
            return this.k0.n().o();
        }
        return false;
    }

    public boolean j0() {
        String string = this.s();
        if (string != null && string.startsWith("application/vnd.google-apps.")) {
            return !string.endsWith("shortcut");
        }
        return false;
    }

    @Override
    public boolean l() {
        if (this.q0 == null) {
            ax.p7.c c8 = this.k0;
            this.q0 = c8 != null ? Boolean.valueOf(E.k0(c8)) : Boolean.FALSE;
        }
        return this.q0;
    }

    public void l0(long l8) {
        this.r0 = l8;
    }

    @Override
    public boolean n() {
        Object object = this.o0;
        if (object != null) {
            return (Boolean)object;
        }
        object = this.k0;
        if (object == null) {
            return "/".equals(this.l0);
        }
        if ((object = ((ax.p7.c)object).B()) == null) {
            return true;
        }
        return (Boolean)object ^ true;
    }

    @Override
    public long p() {
        if (this.r0 == null) {
            ax.p7.c c8 = this.k0;
            this.r0 = c8 != null && c8.y() != null ? this.k0.y() : (this.l() ? (this.isDirectory() ? Long.valueOf(0L) : Long.valueOf(-1L)) : Long.valueOf(0L));
        }
        return this.r0;
    }

    @Override
    public long q() {
        if (this.m0 == null) {
            Object object = this.k0;
            this.m0 = object != null ? ((object = ((ax.p7.c)object).t()) != null ? Long.valueOf(((i)object).b()) : ((object = this.k0.o()) != null ? Long.valueOf(((i)object).b()) : Long.valueOf(-1L))) : Long.valueOf(-1L);
        }
        return this.m0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.isDirectory()) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.p0 == null) {
            Object object = this.k0;
            Object object2 = null;
            Object var3_3 = null;
            if (object != null) {
                object = var3_3;
                if (this.l()) {
                    object = var3_3;
                    if (this.k0.x() != null) {
                        object = this.k0.x().o();
                    }
                }
                object2 = object;
                if (object == null) {
                    object2 = this.k0.s();
                }
            }
            if (TextUtils.isEmpty(object2)) {
                object = v.e(this, "");
            } else {
                object = object2;
                if ("application/octet-stream".equals(object2)) {
                    object = v.e(this, "application/octet-stream");
                }
            }
            this.p0 = object;
        }
        return this.p0;
    }

    @Override
    public String t() {
        ax.p7.c c8 = this.k0;
        if (c8 != null) {
            return c8.r();
        }
        if ("/".equals(this.l0)) {
            return "root";
        }
        if ("/.hidden-system-folder".equals(this.l0)) {
            return "noid";
        }
        c.h().f().b("GDID").j().h();
        return null;
    }
}

