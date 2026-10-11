/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.X7.d;

public final class f {
    private static final f c = new a().a();
    private final long a;
    private final long b;

    f(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public static a c() {
        return new a();
    }

    @d(tag=2)
    public long a() {
        return this.b;
    }

    @d(tag=1)
    public long b() {
        return this.a;
    }

    public static final class a {
        private long a = 0L;
        private long b = 0L;

        a() {
        }

        public f a() {
            return new f(this.a, this.b);
        }

        public a b(long l8) {
            this.b = l8;
            return this;
        }

        public a c(long l8) {
            this.a = l8;
            return this;
        }
    }
}

