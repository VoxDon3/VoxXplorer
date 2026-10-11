/*
 * Decompiled with CFR 0.152.
 */
package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import ax.z4.d;
import ax.z4.e;
import java.io.IOException;
import java.util.Arrays;

public final class a {
    public static final a d = new a().f(ax.z4.a$c.d0);
    private c a;
    private d b;
    private e c;

    private a() {
    }

    public static a c(d d8) {
        if (d8 != null) {
            return new a().g(ax.z4.a$c.q, d8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static a d(e e8) {
        if (e8 != null) {
            return new a().h(ax.z4.a$c.c0, e8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private a f(c c8) {
        a a8 = new a();
        a8.a = c8;
        return a8;
    }

    private a g(c c8, d d8) {
        a a8 = new a();
        a8.a = c8;
        a8.b = d8;
        return a8;
    }

    private a h(c c8, e e8) {
        a a8 = new a();
        a8.a = c8;
        a8.c = e8;
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
            Enum enum_ = this.a;
            if (enum_ != ((a)object).a) {
                return false;
            }
            int n8 = ax.z4.a$a.a[enum_.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    return n8 == 3;
                }
                enum_ = this.c;
                object = ((a)object).c;
                return enum_ == object || enum_.equals(object);
                {
                }
            }
            enum_ = this.b;
            object = ((a)object).b;
            return enum_ == object || enum_.equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.z4.a$b.b.j(this, false);
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
                if ("invalid_account_type".equals(object)) {
                    ax.v4.c.f("invalid_account_type", j8);
                    object = ax.z4.a.c(d.b.b.s(j8));
                } else if ("paper_access_denied".equals(object)) {
                    ax.v4.c.f("paper_access_denied", j8);
                    object = ax.z4.a.d(e.b.b.s(j8));
                } else {
                    object = d;
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
            int n8 = ax.z4.a$a.a[a8.e().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    g8.s0("other");
                    return;
                }
                g8.o0();
                this.r("paper_access_denied", g8);
                g8.o("paper_access_denied");
                e.b.b.t(a8.c, g8);
                g8.m();
                return;
            }
            g8.o0();
            this.r("invalid_account_type", g8);
            g8.o("invalid_account_type");
            d.b.b.t(a8.b, g8);
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

