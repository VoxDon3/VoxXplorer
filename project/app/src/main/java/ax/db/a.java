/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.c;

public abstract class a {
    a() {
    }

    public static a a(long l8) {
        return a.c(l8);
    }

    public static a b(String string) {
        return b.c(string);
    }

    static abstract class a
    extends a {
        a() {
        }

        static a c(Long l8) {
            return new ax.db.b(ax.cb.b.b(l8, "longValue"));
        }

        abstract Long d();
    }

    static abstract class b
    extends a {
        b() {
        }

        static a c(String string) {
            return new c(ax.cb.b.b(string, "stringValue"));
        }

        abstract String d();
    }
}

