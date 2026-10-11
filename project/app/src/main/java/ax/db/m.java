/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.ab.a;
import ax.db.k;
import ax.db.q;

final class m {
    static q a() {
        return ax.hb.b.b(ax.hb.b.a());
    }

    static a b(q q8, boolean bl) {
        return new b(q8, bl);
    }

    private static final class b
    implements a,
    AutoCloseable {
        private final q c0;
        private final boolean d0;
        private final k q;

        private b(q q8, boolean bl) {
            this.c0 = q8;
            this.d0 = bl;
            this.q = ax.hb.b.d(ax.hb.b.a(), q8).b();
        }

        @Override
        public void close() {
            ax.hb.b.a().a(this.q);
            if (this.d0) {
                this.c0.f();
            }
        }
    }
}

