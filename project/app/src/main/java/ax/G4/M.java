/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class M {
    public static final M c = new M().g(ax.G4.M$c.c0);
    public static final M d = new M().g(ax.G4.M$c.d0);
    public static final M e = new M().g(ax.G4.M$c.e0);
    public static final M f = new M().g(ax.G4.M$c.f0);
    public static final M g = new M().g(ax.G4.M$c.g0);
    public static final M h = new M().g(ax.G4.M$c.h0);
    public static final M i = new M().g(ax.G4.M$c.i0);
    private c a;
    private String b;

    private M() {
    }

    public static M d() {
        return M.e(null);
    }

    public static M e(String string) {
        return new M().h(ax.G4.M$c.q, string);
    }

    private M g(c c8) {
        M m8 = new M();
        m8.a = c8;
        return m8;
    }

    private M h(c c8, String string) {
        M m8 = new M();
        m8.a = c8;
        m8.b = string;
        return m8;
    }

    public boolean b() {
        return this.a == ax.G4.M$c.c0;
    }

    public boolean c() {
        return this.a == ax.G4.M$c.f0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof M) {
            Object object2 = (M)object;
            object = this.a;
            if (object != ((M)object2).a) {
                return false;
            }
            switch (ax.G4.M$a.a[((Enum)object).ordinal()]) {
                default: {
                    return false;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: {
                    return true;
                }
                case 1: 
            }
            object = this.b;
            object2 = ((M)object2).b;
            return object == object2 || object != null && ((String)object).equals(object2);
            {
            }
        }
        return false;
    }

    public c f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.M$b.b.j(this, false);
    }

    public static class b
    extends f<M> {
        public static final b b = new b();

        public M s(j j8) throws IOException, i {
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
                if ("malformed_path".equals(object)) {
                    if (j8.j() != m.m0) {
                        ax.v4.c.f("malformed_path", j8);
                        object = ax.v4.d.d(ax.v4.d.f()).a(j8);
                    } else {
                        object = null;
                    }
                    object = object == null ? M.d() : M.e((String)object);
                } else {
                    object = "not_found".equals(object) ? c : ("not_file".equals(object) ? d : ("not_folder".equals(object) ? e : ("restricted_content".equals(object) ? f : ("unsupported_content_type".equals(object) ? g : ("locked".equals(object) ? h : i)))));
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(M m8, g g8) throws IOException, ax.T4.f {
            switch (ax.G4.M$a.a[m8.f().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 7: {
                    g8.s0("locked");
                    return;
                }
                case 6: {
                    g8.s0("unsupported_content_type");
                    return;
                }
                case 5: {
                    g8.s0("restricted_content");
                    return;
                }
                case 4: {
                    g8.s0("not_folder");
                    return;
                }
                case 3: {
                    g8.s0("not_file");
                    return;
                }
                case 2: {
                    g8.s0("not_found");
                    return;
                }
                case 1: 
            }
            g8.o0();
            this.r("malformed_path", g8);
            g8.o("malformed_path");
            ax.v4.d.d(ax.v4.d.f()).k(m8.b, g8);
            g8.m();
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

