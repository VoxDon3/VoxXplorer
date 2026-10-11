/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.D;
import ax.b6.F;
import ax.b6.J;
import ax.b6.L;
import ax.b6.S;
import ax.b6.U;
import ax.b6.X;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.s;
import ax.b6.v;
import ax.b6.y;
import ax.b6.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class E {
    private Map<String, A> a = new HashMap<String, A>();
    private U b = new U();

    public E() {
        this.b(new y());
        this.b(new D());
        this.b(new F());
        this.b(new J());
        this.b(new L());
        this.b(new S());
        this.b(new X());
    }

    private final void b(A a8) {
        Iterator<Z> iterator = a8.a.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next().toString();
            this.a.put(string, a8);
        }
    }

    public final s a(Z2 z22, s object) {
        y2.b(z22);
        if (object instanceof v) {
            object = (v)object;
            ArrayList<s> arrayList = ((v)object).b();
            String string = ((v)object).a();
            object = this.a.containsKey(string) ? this.a.get(string) : this.b;
            return ((A)object).b(string, z22, arrayList);
        }
        return object;
    }
}

