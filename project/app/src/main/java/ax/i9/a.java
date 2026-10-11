/*
 * Decompiled with CFR 0.152.
 */
package ax.i9;

public final class a {
    private boolean a;
    private boolean b;

    private a() {
    }

    private a(a a8) {
        this();
        this.a = a8.a;
        this.b = a8.b;
    }

    static /* synthetic */ boolean a(a a8, boolean bl) {
        a8.a = bl;
        return bl;
    }

    static /* synthetic */ boolean b(a a8, boolean bl) {
        a8.b = bl;
        return bl;
    }

    public static b c() {
        return new b().c(true).b(false);
    }

    public static a d() {
        return ax.i9.a.c().a();
    }

    public static class b {
        private a a = new a();

        b() {
        }

        public a a() {
            return new a(this.a);
        }

        public b b(boolean bl) {
            ax.i9.a.b(this.a, bl);
            return this;
        }

        public b c(boolean bl) {
            ax.i9.a.a(this.a, bl);
            return this;
        }
    }
}

