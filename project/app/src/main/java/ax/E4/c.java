/*
 * Decompiled with CFR 0.152.
 */
package ax.E4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class c {
    public static final c c = new c().d(ax.E4.c$c.c0);
    public static final c d = new c().d(ax.E4.c$c.d0);
    public static final c e = new c().d(ax.E4.c$c.e0);
    public static final c f = new c().d(ax.E4.c$c.f0);
    public static final c g = new c().d(ax.E4.c$c.g0);
    private c a;
    private String b;

    private c() {
    }

    public static c b(String string) {
        if (string != null) {
            return new c().e(ax.E4.c$c.q, string);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private c d(c c8) {
        c c9 = new c();
        c9.a = c8;
        return c9;
    }

    private c e(c c8, String string) {
        c c9 = new c();
        c9.a = c8;
        c9.b = string;
        return c9;
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
        if (object instanceof c) {
            Object object2 = (c)object;
            object = this.a;
            if (object != ((c)object2).a) {
                return false;
            }
            switch (ax.E4.c$a.a[((Enum)object).ordinal()]) {
                default: {
                    return false;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: {
                    return true;
                }
                case 1: 
            }
            object = this.b;
            object2 = ((c)object2).b;
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
        return ax.E4.c$b.b.j(this, false);
    }

    static class b
    extends f<c> {
        public static final b b = new b();

        b() {
        }

        public c s(j j8) throws IOException, i {
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
                    ax.v4.c.f("malformed_path", j8);
                    object = ax.E4.c.b(ax.v4.d.f().a(j8));
                } else {
                    object = "not_found".equals(object) ? c : ("not_file".equals(object) ? d : ("not_folder".equals(object) ? e : ("restricted_content".equals(object) ? f : g)));
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(c c8, g g8) throws IOException, ax.T4.f {
            int n8 = ax.E4.c$a.a[c8.c().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                g8.s0("other");
                                return;
                            }
                            g8.s0("restricted_content");
                            return;
                        }
                        g8.s0("not_folder");
                        return;
                    }
                    g8.s0("not_file");
                    return;
                }
                g8.s0("not_found");
                return;
            }
            g8.o0();
            this.r("malformed_path", g8);
            g8.o("malformed_path");
            ax.v4.d.f().k(c8.b, g8);
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
        private static final c[] h0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            c c13;
            q = c13 = new c();
            c0 = c12 = new c();
            d0 = c11 = new c();
            e0 = c10 = new c();
            f0 = c9 = new c();
            g0 = c8 = new c();
            h0 = new c[]{c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])h0.clone();
        }
    }
}

