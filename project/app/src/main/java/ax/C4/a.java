/*
 * Decompiled with CFR 0.152.
 */
package ax.C4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class a {
    public static final a d = new a().f(ax.C4.a$c.q);
    public static final a e = new a().f(ax.C4.a$c.e0);
    private c a;
    private String b;
    private String c;

    private a() {
    }

    public static a c(String string) {
        if (string != null) {
            if (Pattern.matches("[-_0-9a-zA-Z:]+", string)) {
                return new a().g(ax.C4.a$c.d0, string);
            }
            throw new IllegalArgumentException("String does not match pattern");
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static a d(String string) {
        if (string != null) {
            if (Pattern.matches("[-_0-9a-zA-Z:]+", string)) {
                return new a().h(ax.C4.a$c.c0, string);
            }
            throw new IllegalArgumentException("String does not match pattern");
        }
        throw new IllegalArgumentException("Value is null");
    }

    private a f(c c8) {
        a a8 = new a();
        a8.a = c8;
        return a8;
    }

    private a g(c c8, String string) {
        a a8 = new a();
        a8.a = c8;
        a8.c = string;
        return a8;
    }

    private a h(c c8, String string) {
        a a8 = new a();
        a8.a = c8;
        a8.b = string;
        return a8;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof a) {
            object = (a)object;
            Object object2 = this.a;
            if (object2 != ((a)object).a) {
                return false;
            }
            int n8 = ax.C4.a$a.a[object2.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return n8 == 4;
                    }
                    object2 = this.c;
                    object = ((a)object).c;
                    return object2 == object || ((String)object2).equals(object);
                    {
                    }
                }
                object2 = this.b;
                object = ((a)object).b;
                if (object2 != object && !((String)object2).equals(object)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.C4.a$b.b.j(this, false);
    }

    public static class b
    extends f<a> {
        public static final b b = new b();

        public a s(j j8) throws IOException, i {
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
                if ("home".equals(object)) {
                    object = d;
                } else if ("root".equals(object)) {
                    ax.v4.c.f("root", j8);
                    object = ax.C4.a.d(ax.v4.d.f().a(j8));
                } else if ("namespace_id".equals(object)) {
                    ax.v4.c.f("namespace_id", j8);
                    object = ax.C4.a.c(ax.v4.d.f().a(j8));
                } else {
                    object = e;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(a a8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.C4.a$a.a[a8.e().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        g8.s0("other");
                        return;
                    }
                    g8.o0();
                    this.r("namespace_id", g8);
                    g8.o("namespace_id");
                    ax.v4.d.f().k(a8.c, g8);
                    g8.m();
                    return;
                }
                g8.o0();
                this.r("root", g8);
                g8.o("root");
                ax.v4.d.f().k(a8.b, g8);
                g8.m();
                return;
            }
            g8.s0("home");
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            q = c11 = new c();
            c0 = c10 = new c();
            d0 = c9 = new c();
            e0 = c8 = new c();
            f0 = new c[]{c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }
}

