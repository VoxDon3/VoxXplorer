/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.W8.e;
import ax.W8.f;
import ax.W8.i;
import java.util.EnumSet;
import java.util.Set;

class c
extends f {
    protected static Set<e> c = EnumSet.of(e.q0, e.x0);
    protected Set<e> a;
    protected i b;

    protected c(Set<e> set, i i8) {
        set = EnumSet.copyOf(set);
        this.a = set;
        set.addAll(c);
        this.b = i8;
    }
}

