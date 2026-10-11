/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.ab.a;
import ax.db.m;
import ax.db.q;
import ax.db.r;

public abstract class y {
    private static final b a = new b();

    protected y() {
    }

    static y a() {
        return a;
    }

    public final r b(String string) {
        return this.c(string, m.a());
    }

    public abstract r c(String var1, q var2);

    public final a d(q q8) {
        return m.b(ax.cb.b.b(q8, "span"), false);
    }

    private static final class b
    extends y {
        private b() {
        }

        @Override
        public r c(String string, q q8) {
            return r.a.c(string, q8);
        }
    }
}

