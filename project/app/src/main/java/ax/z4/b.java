/*
 * Decompiled with CFR 0.152.
 */
package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.z4.f;
import java.io.IOException;
import java.util.Arrays;

public final class b {
    public static final b c = new b().d(ax.z4.b$c.q);
    public static final b d = new b().d(ax.z4.b$c.c0);
    public static final b e = new b().d(ax.z4.b$c.d0);
    public static final b f = new b().d(ax.z4.b$c.e0);
    public static final b g = new b().d(ax.z4.b$c.f0);
    public static final b h = new b().d(ax.z4.b$c.h0);
    public static final b i = new b().d(ax.z4.b$c.i0);
    private c a;
    private f b;

    private b() {
    }

    public static b b(f f8) {
        if (f8 != null) {
            return new b().e(ax.z4.b$c.g0, f8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private b d(c c8) {
        b b8 = new b();
        b8.a = c8;
        return b8;
    }

    private b e(c c8, f f8) {
        b b8 = new b();
        b8.a = c8;
        b8.b = f8;
        return b8;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof b) {
            Object object2 = (b)object;
            object = this.a;
            if (object != ((b)object2).a) {
                return false;
            }
            switch (ax.z4.b$a.a[((Enum)object).ordinal()]) {
                default: {
                    return false;
                }
                case 7: 
                case 8: {
                    return true;
                }
                case 6: {
                    object = this.b;
                    object2 = ((b)object2).b;
                    if (object == object2 || ((f)object).equals(object2)) break;
                    return false;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.z4.b$b.b.j(this, false);
    }

    public static class b
    extends ax.v4.f<b> {
        public static final b b = new b();

        public b s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = ax.v4.c.i(j8);
                j8.H();
                bl = true;
            } else {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                object = "invalid_access_token".equals(object) ? c : ("invalid_select_user".equals(object) ? d : ("invalid_select_admin".equals(object) ? e : ("user_suspended".equals(object) ? f : ("expired_access_token".equals(object) ? g : ("missing_scope".equals(object) ? ax.z4.b.b(f.a.b.u(j8, true)) : ("route_access_denied".equals(object) ? h : i))))));
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(b b8, g g8) throws IOException, ax.T4.f {
            switch (ax.z4.b$a.a[b8.c().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 7: {
                    g8.s0("route_access_denied");
                    return;
                }
                case 6: {
                    g8.o0();
                    this.r("missing_scope", g8);
                    f.a.b.v(b8.b, g8, true);
                    g8.m();
                    return;
                }
                case 5: {
                    g8.s0("expired_access_token");
                    return;
                }
                case 4: {
                    g8.s0("user_suspended");
                    return;
                }
                case 3: {
                    g8.s0("invalid_select_admin");
                    return;
                }
                case 2: {
                    g8.s0("invalid_select_user");
                    return;
                }
                case 1: 
            }
            g8.s0("invalid_access_token");
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        public static final /* enum */ c g0;
        public static final /* enum */ c h0;
        public static final /* enum */ c i0;
        private static final c[] j0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            c c14;
            c c15;
            q = c15 = new c();
            c0 = c14 = new c();
            d0 = c13 = new c();
            e0 = c12 = new c();
            f0 = c11 = new c();
            g0 = c10 = new c();
            h0 = c9 = new c();
            i0 = c8 = new c();
            j0 = new c[]{c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])j0.clone();
        }
    }
}

