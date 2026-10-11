/*
 * Decompiled with CFR 0.152.
 */
package ax.eb;

import ax.eb.c;

public abstract class b {
    public static b b() {
        return new b();
    }

    public abstract c a();

    private static final class b
    extends b {
        private final c a = c.a();

        private b() {
        }

        @Override
        public c a() {
            return this.a;
        }
    }
}

