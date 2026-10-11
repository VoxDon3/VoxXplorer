/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import ax.la.z;

public final class y {
    public static final y c = new a(null).b(false).c(false).a();
    public static final y d = new a(null).b(true).c(false).a();
    public static final y e = new a(null).b(false).c(true).a();
    private final boolean a;
    private final boolean b;

    private y(boolean bl, boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    /* synthetic */ y(boolean bl, boolean bl2, z z8) {
        this(bl, bl2);
    }

    public static a a() {
        return c.b();
    }

    public a b() {
        return new a(this.a, this.b, null);
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && y.class == object.getClass()) {
            object = (y)object;
            if (this.a != ((y)object).a && this.b != ((y)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a * 31 + this.b;
    }

    public static class a {
        private boolean a;
        private boolean b;

        private a() {
        }

        /* synthetic */ a(z z8) {
            this();
        }

        private a(boolean bl, boolean bl2) {
            this.a = bl;
            this.b = bl2;
        }

        /* synthetic */ a(boolean bl, boolean bl2, z z8) {
            this(bl, bl2);
        }

        public y a() {
            return new y(this.a, this.b, null);
        }

        public a b(boolean bl) {
            this.a = bl;
            return this;
        }

        public a c(boolean bl) {
            this.b = bl;
            return this;
        }
    }
}

