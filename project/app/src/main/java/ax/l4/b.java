/*
 * Decompiled with CFR 0.152.
 */
package ax.l4;

public abstract class b {
    private b() {
    }

    public static b a() {
        return new b();
    }

    abstract void b(boolean var1);

    public abstract void c();

    private static class b
    extends b {
        private volatile boolean a;

        b() {
        }

        @Override
        public void b(boolean bl) {
            this.a = bl;
        }

        @Override
        public void c() {
            if (!this.a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}

