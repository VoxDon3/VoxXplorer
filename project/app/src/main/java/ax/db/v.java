/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.y;

public abstract class v {
    static v c() {
        return new b();
    }

    public abstract ax.eb.b a();

    public abstract y b();

    private static final class b
    extends v {
        private final ax.eb.b a = ax.eb.b.b();

        private b() {
        }

        @Override
        public ax.eb.b a() {
            return this.a;
        }

        @Override
        public y b() {
            return y.a();
        }
    }
}

