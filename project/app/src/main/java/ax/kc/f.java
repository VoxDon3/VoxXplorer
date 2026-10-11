/*
 * Decompiled with CFR 0.152.
 */
package ax.kc;

import ax.cc.b;
import ax.fc.a;
import ax.fc.d;
import ax.jc.g;
import java.util.Collection;
import java.util.Iterator;

public class f {
    private final g a;
    private final Collection<a> b;
    private final b c;

    public f(b b8, g g8, Collection<a> collection) {
        this.c = b8;
        this.a = g8;
        this.b = collection;
    }

    public g a() {
        return this.a;
    }

    public b b() {
        return this.c;
    }

    public final void c(d d8) {
        Iterator<a> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(d8);
        }
    }
}

