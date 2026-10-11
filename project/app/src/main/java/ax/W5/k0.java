/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.j0;
import ax.W5.t0;
import java.util.Comparator;

final class k0
implements Comparator {
    k0() {
    }

    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (t0)object;
        object2 = (t0)object2;
        j0 j02 = new j0((t0)object);
        j0 j03 = new j0((t0)object2);
        while (j02.hasNext() && j03.hasNext()) {
            int n8 = Integer.valueOf(j02.a() & 0xFF).compareTo(j03.a() & 0xFF);
            if (n8 == 0) continue;
            return n8;
        }
        return Integer.valueOf(((t0)object).h()).compareTo(((t0)object2).h());
    }
}

