/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.h;

public final class u0 {
    static final int a = u0.c(1, 3);
    static final int b = u0.c(1, 4);
    static final int c = u0.c(2, 0);
    static final int d = u0.c(3, 2);

    public static int a(int n8) {
        return n8 >>> 3;
    }

    public static int b(int n8) {
        return n8 & 7;
    }

    static int c(int n8, int n9) {
        return n8 << 3 | n9;
    }

    public static class b
    extends Enum<b> {
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        public static final /* enum */ b j0;
        public static final /* enum */ b k0;
        public static final /* enum */ b l0;
        public static final /* enum */ b m0;
        public static final /* enum */ b n0;
        public static final /* enum */ b o0;
        public static final /* enum */ b p0;
        public static final /* enum */ b q0;
        public static final /* enum */ b r0;
        public static final /* enum */ b s0;
        public static final /* enum */ b t0;
        public static final /* enum */ b u0;
        private static final b[] v0;
        private final int c0;
        private final c q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            b b15;
            b b16;
            b b17;
            b b18;
            b b19;
            b b20;
            b b21;
            b b22;
            d0 = b22 = new b(ax.r0.u0$c.f0, 1);
            e0 = b21 = new b(ax.r0.u0$c.e0, 5);
            Enum enum_ = ax.r0.u0$c.d0;
            f0 = b20 = new b((c)enum_, 0);
            g0 = b19 = new b((c)enum_, 0);
            Enum enum_2 = ax.r0.u0$c.c0;
            h0 = b18 = new b((c)enum_2, 0);
            i0 = b17 = new b((c)enum_, 1);
            j0 = b16 = new b((c)enum_2, 5);
            k0 = b15 = new b(ax.r0.u0$c.g0, 0);
            l0 = b14 = new b(ax.r0.u0$c.h0, 2){};
            Enum enum_3 = ax.r0.u0$c.k0;
            m0 = b13 = new b((c)enum_3, 3){};
            n0 = b12 = new b((c)enum_3, 2){};
            o0 = b11 = new b(ax.r0.u0$c.i0, 2){};
            p0 = b10 = new b((c)enum_2, 0);
            q0 = b9 = new b(ax.r0.u0$c.j0, 0);
            r0 = enum_3 = new b((c)enum_2, 5);
            s0 = b8 = new b((c)enum_, 1);
            t0 = enum_2 = new b((c)enum_2, 0);
            u0 = enum_ = new b((c)enum_, 0);
            v0 = new b[]{b22, b21, b20, b19, b18, b17, b16, b15, b14, b13, b12, b11, b10, b9, enum_3, b8, enum_2, enum_};
        }

        private b(c c8, int n9) {
            this.q = c8;
            this.c0 = n9;
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])v0.clone();
        }

        public c d() {
            return this.q;
        }

        public int h() {
            return this.c0;
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
        private static final c[] l0;
        private final Object q;

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
            c0 = c16 = new c(0);
            d0 = c15 = new c(0L);
            e0 = c14 = new c(Float.valueOf(0.0f));
            f0 = c13 = new c(0.0);
            g0 = c12 = new c(Boolean.FALSE);
            h0 = c11 = new c("");
            i0 = c10 = new c(h.c0);
            j0 = c9 = new c(null);
            k0 = c8 = new c(null);
            l0 = new c[]{c16, c15, c14, c13, c12, c11, c10, c9, c8};
        }

        private c(Object object) {
            this.q = object;
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])l0.clone();
        }
    }
}

