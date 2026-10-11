/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class f {
    public static final f c = new f().d(ax.E4.f$c.c0);
    public static final f d = new f().d(ax.E4.f$c.d0);
    private c a;
    private String b;

    private f() {
    }

    public static f c(String string) {
        if (string != null) {
            if (string.length() >= 1) {
                if (Pattern.matches("(/|ptid:).*", string)) {
                    return new f().e(ax.E4.f$c.q, string);
                }
                throw new IllegalArgumentException("String does not match pattern");
            }
            throw new IllegalArgumentException("String is shorter than 1");
        }
        throw new IllegalArgumentException("Value is null");
    }

    private f d(c c8) {
        f f8 = new f();
        f8.a = c8;
        return f8;
    }

    private f e(c c8, String string) {
        f f8 = new f();
        f8.a = c8;
        f8.b = string;
        return f8;
    }

    public c b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof f) {
            Object object2 = (f)object;
            object = this.a;
            if (object != ((f)object2).a) {
                return false;
            }
            int n8 = ax.E4.f$a.a[((Enum)object).ordinal()];
            if (n8 != 1) {
                return n8 == 2 || n8 == 3;
            }
            object = this.b;
            object2 = ((f)object2).b;
            return object == object2 || ((String)object).equals(object2);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.E4.f$b.b.j(this, false);
    }

    public static class b
    extends ax.v4.f<f> {
        public static final b b = new b();

        public f s(j j8) throws IOException, i {
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
                if ("template_not_found".equals(object)) {
                    ax.v4.c.f("template_not_found", j8);
                    object = f.c(ax.v4.d.f().a(j8));
                } else {
                    object = "restricted_content".equals(object) ? c : d;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(f f8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.E4.f$a.a[f8.b().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.s0("restricted_content");
                return;
            }
            g8.o0();
            this.r("template_not_found", g8);
            g8.o("template_not_found");
            ax.v4.d.f().k(f8.b, g8);
            g8.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            q = c10 = new c();
            c0 = c9 = new c();
            d0 = c8 = new c();
            e0 = new c[]{c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

