/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.f;
import ax.N9.V;
import ax.N9.q;
import ax.O9.A;
import ax.P9.a;
import ax.S9.c;
import java.util.Iterator;
import java.util.List;

public class j
extends ax.M9.c
implements A {
    public j(String string, f f8, List<c> list, String string2) {
        super(string, f8, list);
        if (string2 != null) {
            this.e.add(new ax.S9.a("q", string2));
        }
    }

    @Override
    public V a() {
        return this.q(this.o());
    }

    public V q(List<c> object) {
        object = new q(this.d(), this.i(), (List<c>)object);
        Iterator<ax.S9.a> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((a)object).e(iterator.next());
        }
        return object;
    }
}

