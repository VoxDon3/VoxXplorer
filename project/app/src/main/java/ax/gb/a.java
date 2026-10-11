/*
 * Decompiled with CFR 0.152.
 */
package ax.gb;

import ax.db.s;

public abstract class a {
    private static final b a = new b();

    public abstract <C> void a(s var1, C var2, c<C> var3);

    private static final class b
    extends a {
        private b() {
        }

        @Override
        public <C> void a(s s8, C c8, c<C> c9) {
            ax.cb.b.b(s8, "spanContext");
            ax.cb.b.b(c8, "carrier");
            ax.cb.b.b(c9, "setter");
        }
    }

    public static abstract class c<C> {
        public abstract void a(C var1, String var2, String var3);
    }
}

