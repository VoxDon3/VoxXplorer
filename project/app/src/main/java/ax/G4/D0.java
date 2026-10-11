/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.b;
import ax.G4.G0;
import ax.G4.S0;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class D0 {
    public static final D0 e = new D0().j(ax.G4.D0$c.e0);
    public static final D0 f = new D0().j(ax.G4.D0$c.f0);
    public static final D0 g = new D0().j(ax.G4.D0$c.g0);
    public static final D0 h = new D0().j(ax.G4.D0$c.h0);
    public static final D0 i = new D0().j(ax.G4.D0$c.i0);
    public static final D0 j = new D0().j(ax.G4.D0$c.j0);
    public static final D0 k = new D0().j(ax.G4.D0$c.k0);
    public static final D0 l = new D0().j(ax.G4.D0$c.l0);
    private c a;
    private G0 b;
    private S0 c;
    private ax.E4.b d;

    private D0() {
    }

    public static D0 f(G0 g02) {
        if (g02 != null) {
            return new D0().k(ax.G4.D0$c.q, g02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static D0 g(S0 s02) {
        if (s02 != null) {
            return new D0().l(ax.G4.D0$c.c0, s02);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static D0 h(ax.E4.b b8) {
        if (b8 != null) {
            return new D0().m(ax.G4.D0$c.d0, b8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private D0 j(c c8) {
        D0 d02 = new D0();
        d02.a = c8;
        return d02;
    }

    private D0 k(c c8, G0 g02) {
        D0 d02 = new D0();
        d02.a = c8;
        d02.b = g02;
        return d02;
    }

    private D0 l(c c8, S0 s02) {
        D0 d02 = new D0();
        d02.a = c8;
        d02.c = s02;
        return d02;
    }

    private D0 m(c c8, ax.E4.b b8) {
        D0 d02 = new D0();
        d02.a = c8;
        d02.d = b8;
        return d02;
    }

    public G0 d() {
        if (this.a == ax.G4.D0$c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.LOOKUP_FAILED, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean e() {
        return this.a == ax.G4.D0$c.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof D0) {
            object = (D0)object;
            Object object2 = this.a;
            if (object2 != ((D0)object).a) {
                return false;
            }
            switch (ax.G4.D0$a.a[object2.ordinal()]) {
                default: {
                    return false;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: {
                    return true;
                }
                case 3: {
                    object2 = this.d;
                    object = ((D0)object).d;
                    return object2 == object || ((ax.E4.b)object2).equals(object);
                    {
                    }
                }
                case 2: {
                    object2 = this.c;
                    object = ((D0)object).c;
                    return object2 == object || ((S0)object2).equals(object);
                    {
                    }
                }
                case 1: 
            }
            object2 = this.b;
            object = ((D0)object).b;
            return object2 == object || ((G0)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return ax.G4.D0$b.b.j(this, false);
    }

    static class b
    extends f<D0> {
        public static final b b = new b();

        b() {
        }

        public D0 s(j j8) throws IOException, i {
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
                if ("lookup_failed".equals(object)) {
                    ax.v4.c.f("lookup_failed", j8);
                    object = D0.f(G0.b.b.s(j8));
                } else if ("path".equals(object)) {
                    ax.v4.c.f("path", j8);
                    object = D0.g(S0.b.b.s(j8));
                } else if ("properties_error".equals(object)) {
                    ax.v4.c.f("properties_error", j8);
                    object = D0.h(b.b.b.s(j8));
                } else {
                    object = "too_many_shared_folder_targets".equals(object) ? e : ("too_many_write_operations".equals(object) ? f : ("concurrent_session_data_not_allowed".equals(object) ? g : ("concurrent_session_not_closed".equals(object) ? h : ("concurrent_session_missing_data".equals(object) ? i : ("payload_too_large".equals(object) ? j : ("content_hash_mismatch".equals(object) ? k : l))))));
                }
                if (!bl) {
                    ax.v4.c.n(j8);
                    ax.v4.c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(D0 d02, g g8) throws IOException, ax.T4.f {
            switch (ax.G4.D0$a.a[d02.i().ordinal()]) {
                default: {
                    g8.s0("other");
                    return;
                }
                case 10: {
                    g8.s0("content_hash_mismatch");
                    return;
                }
                case 9: {
                    g8.s0("payload_too_large");
                    return;
                }
                case 8: {
                    g8.s0("concurrent_session_missing_data");
                    return;
                }
                case 7: {
                    g8.s0("concurrent_session_not_closed");
                    return;
                }
                case 6: {
                    g8.s0("concurrent_session_data_not_allowed");
                    return;
                }
                case 5: {
                    g8.s0("too_many_write_operations");
                    return;
                }
                case 4: {
                    g8.s0("too_many_shared_folder_targets");
                    return;
                }
                case 3: {
                    g8.o0();
                    this.r("properties_error", g8);
                    g8.o("properties_error");
                    b.b.b.t(d02.d, g8);
                    g8.m();
                    return;
                }
                case 2: {
                    g8.o0();
                    this.r("path", g8);
                    g8.o("path");
                    S0.b.b.t(d02.c, g8);
                    g8.m();
                    return;
                }
                case 1: 
            }
            g8.o0();
            this.r("lookup_failed", g8);
            g8.o("lookup_failed");
            G0.b.b.t(d02.b, g8);
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
        public static final /* enum */ c j0;
        public static final /* enum */ c k0;
        public static final /* enum */ c l0;
        private static final c[] m0;
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
            c c16;
            c c17;
            c c18;
            q = c18 = new c();
            c0 = c17 = new c();
            d0 = c16 = new c();
            e0 = c15 = new c();
            f0 = c14 = new c();
            g0 = c13 = new c();
            h0 = c12 = new c();
            i0 = c11 = new c();
            j0 = c10 = new c();
            k0 = c9 = new c();
            l0 = c8 = new c();
            m0 = new c[]{c18, c17, c16, c15, c14, c13, c12, c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])m0.clone();
        }
    }
}

