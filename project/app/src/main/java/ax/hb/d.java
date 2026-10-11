/*
 * Decompiled with CFR 0.152.
 */
package ax.hb;

import ax.Za.b;
import ax.cb.b;
import ax.db.j;
import ax.db.q;

@Deprecated
public final class d {
    private static final b.d<q> a = ax.Za.b.m("opencensus-trace-span-key");

    public static q a(ax.Za.b object) {
        q q8 = a.a(b.b(object, "context"));
        object = q8;
        if (q8 == null) {
            object = j.e;
        }
        return object;
    }

    public static ax.Za.b b(ax.Za.b b8, q q8) {
        return b.b(b8, "context").A(a, q8);
    }
}

