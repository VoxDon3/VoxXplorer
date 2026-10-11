/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.cb.b;
import ax.db.j;
import ax.db.q;

public abstract class r {
    public abstract r a(boolean var1);

    public abstract q b();

    static final class a
    extends r {
        private a(String string) {
            b.b(string, "name");
        }

        static a c(String string, q q8) {
            return new a(string);
        }

        @Override
        public r a(boolean bl) {
            return this;
        }

        @Override
        public q b() {
            return j.e;
        }
    }
}

