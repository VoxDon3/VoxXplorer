/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class g {
    public static final g c = new g().d(ax.E4.g$c.c0);
    private c a;
    private List<String> b;

    private g() {
    }

    public static g b(List<String> list) {
        if (list != null) {
            if (list.size() >= 1) {
                for (String string : list) {
                    if (string != null) {
                        if (string.length() >= 1) {
                            if (Pattern.matches("(/|ptid:).*", string)) continue;
                            throw new IllegalArgumentException("Stringan item in list does not match pattern");
                        }
                        throw new IllegalArgumentException("Stringan item in list is shorter than 1");
                    }
                    throw new IllegalArgumentException("An item in list is null");
                }
                return new g().e(ax.E4.g$c.q, list);
            }
            throw new IllegalArgumentException("List has fewer than 1 items");
        }
        throw new IllegalArgumentException("Value is null");
    }

    private g d(c c8) {
        g g8 = new g();
        g8.a = c8;
        return g8;
    }

    private g e(c c8, List<String> list) {
        g g8 = new g();
        g8.a = c8;
        g8.b = list;
        return g8;
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
        if (object instanceof g) {
            List<String> list = (g)object;
            object = this.a;
            if (object != ((g)((Object)list)).a) {
                return false;
            }
            int n8 = ax.E4.g$a.a[((Enum)object).ordinal()];
            if (n8 != 1) {
                return n8 == 2;
            }
            object = this.b;
            list = ((g)((Object)list)).b;
            return object == list || object.equals(list);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.E4.g$b.b.j(this, false);
    }

    public static class b
    extends f<g> {
        public static final b b = new b();

        public g s(j j8) throws IOException, i {
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
                if ("filter_some".equals(object)) {
                    ax.v4.c.f("filter_some", j8);
                    object = g.b(d.c(d.f()).a(j8));
                } else {
                    object = c;
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(g g8, ax.T4.g g9) throws IOException, ax.T4.f {
            if (ax.E4.g$a.a[g8.c().ordinal()] != 1) {
                g9.s0("other");
                return;
            }
            g9.o0();
            this.r("filter_some", g9);
            g9.o("filter_some");
            d.c(d.f()).k(g8.b, g9);
            g9.m();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            q = c9 = new c();
            c0 = c8 = new c();
            d0 = new c[]{c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }
}

