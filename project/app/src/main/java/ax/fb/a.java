/*
 * Decompiled with CFR 0.152.
 */
package ax.fb;

import ax.cb.b;
import ax.db.h;
import ax.db.o;
import ax.db.p;

public final class a {
    public static o a(h object) {
        b.b(object, "event");
        if (object instanceof o) {
            return (o)object;
        }
        p p8 = (p)object;
        object = p8.e() == p.b.c0 ? o.b.c0 : o.b.q;
        return o.a((o.b)((Object)object), p8.d()).d(p8.f()).b(p8.b()).a();
    }

    public static p b(h object) {
        b.b(object, "event");
        if (object instanceof p) {
            return (p)object;
        }
        o o8 = (o)object;
        object = o8.d() == o.b.c0 ? p.b.c0 : p.b.q;
        return p.a((p.b)((Object)object), o8.c()).d(o8.e()).b(o8.b()).a();
    }
}

