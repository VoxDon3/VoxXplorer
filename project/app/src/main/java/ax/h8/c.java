/*
 * Decompiled with CFR 0.152.
 */
package ax.h8;

import ax.D7.e;
import ax.D7.r;
import ax.h8.b;
import ax.h8.d;
import ax.h8.f;
import ax.h8.i;
import java.util.Set;

public class c
implements i {
    private final String a;
    private final d b;

    c(Set<f> set, d d8) {
        this.a = c.d(set);
        this.b = d8;
    }

    public static /* synthetic */ i b(e e8) {
        return new c(e8.f(f.class), d.a());
    }

    public static ax.D7.c<i> c() {
        return ax.D7.c.e(i.class).b(r.m(f.class)).e(new b()).c();
    }

    private static String d(Set<f> object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            f f8 = (f)object.next();
            stringBuilder.append(f8.b());
            stringBuilder.append('/');
            stringBuilder.append(f8.c());
            if (!object.hasNext()) continue;
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    @Override
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(' ');
        stringBuilder.append(c.d(this.b.b()));
        return stringBuilder.toString();
    }
}

