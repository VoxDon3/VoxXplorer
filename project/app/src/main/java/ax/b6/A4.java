/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.d;
import ax.b6.n;
import ax.b6.r;
import ax.b6.s;
import ax.b6.y2;
import java.util.HashMap;
import java.util.List;

public final class A4
extends n {
    private final d d0;

    public A4(d d8) {
        super("internal.eventLogger");
        this.d0 = d8;
    }

    @Override
    public final s a(Z2 map, List<s> list) {
        y2.g(this.q, 3, list);
        String string = ((Z2)((Object)map)).b(list.get(0)).g();
        long l8 = (long)y2.a(((Z2)((Object)map)).b(list.get(1)).f());
        map = ((Z2)((Object)map)).b(list.get(2));
        map = map instanceof r ? y2.e((r)((Object)map)) : new HashMap<String, Object>();
        this.d0.c(string, l8, map);
        return s.f;
    }
}

