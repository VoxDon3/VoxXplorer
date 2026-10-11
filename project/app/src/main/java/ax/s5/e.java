/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.X7.d;

public final class e {
    private static final e c = new a().a();
    private final long a;
    private final long b;

    e(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public static a c() {
        return new a();
    }

    @d(tag=1)
    public long a() {
        return this.a;
    }

    @d(tag=2)
    public long b() {
        return this.b;
    }

    public static final class a {
        private long a = 0L;
        private long b = 0L;

        a() {
        }

        public e a() {
            return new e(this.a, this.b);
        }

        public a b(long l8) {
            this.a = l8;
            return this;
        }

        public a c(long l8) {
            this.b = l8;
            return this;
        }
    }
}

