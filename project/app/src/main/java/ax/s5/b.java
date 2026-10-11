/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.X7.d;
import ax.s5.e;

public final class b {
    private static final b b = new a().a();
    private final e a;

    b(e e8) {
        this.a = e8;
    }

    public static a b() {
        return new a();
    }

    @d(tag=1)
    public e a() {
        return this.a;
    }

    public static final class a {
        private e a = null;

        a() {
        }

        public b a() {
            return new b(this.a);
        }

        public a b(e e8) {
            this.a = e8;
            return this;
        }
    }
}

