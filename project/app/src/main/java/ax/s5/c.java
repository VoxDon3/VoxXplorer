/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.X7.d;

public final class c {
    private static final c c = new a().a();
    private final long a;
    private final b b;

    c(long l8, b b8) {
        this.a = l8;
        this.b = b8;
    }

    public static a c() {
        return new a();
    }

    @d(tag=1)
    public long a() {
        return this.a;
    }

    @d(tag=3)
    public b b() {
        return this.b;
    }

    public static final class a {
        private long a = 0L;
        private b b = ax.s5.c$b.c0;

        a() {
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(long l8) {
            this.a = l8;
            return this;
        }

        public a c(b b8) {
            this.b = b8;
            return this;
        }
    }

    public static final class b
    extends Enum<b>
    implements ax.X7.c {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        private static final b[] j0;
        private final int q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            c0 = b14 = new b(0);
            d0 = b13 = new b(1);
            e0 = b12 = new b(2);
            f0 = b11 = new b(3);
            g0 = b10 = new b(4);
            h0 = b9 = new b(5);
            i0 = b8 = new b(6);
            j0 = new b[]{b14, b13, b12, b11, b10, b9, b8};
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])j0.clone();
        }

        @Override
        public int g() {
            return this.q;
        }
    }
}

