/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import ax.U9.f;
import ax.U9.s;
import ax.U9.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class c {
    private final List<s> a = new ArrayList<s>();

    public void a(s s8) {
        this.a.add(s8);
    }

    public void b(f f8) {
        Iterator<s> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(f8);
        }
    }

    public void c(t t8) {
        Iterator<s> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(t8);
        }
    }
}

