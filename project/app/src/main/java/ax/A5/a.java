/*
 * Decompiled with CFR 0.152.
 */
package ax.A5;

import android.util.SparseArray;
import ax.n5.e;
import java.util.HashMap;

public final class a {
    private static SparseArray<e> a = new SparseArray();
    private static HashMap<e, Integer> b;

    static {
        HashMap<e, Integer> object2 = new HashMap<e, Integer>();
        b = object2;
        object2.put(e.q, 0);
        b.put(e.c0, 1);
        b.put(e.d0, 2);
        for (e e8 : b.keySet()) {
            a.append(b.get((Object)e8).intValue(), (Object)e8);
        }
    }

    public static int a(e e8) {
        Comparable<Integer> comparable = b.get((Object)e8);
        if (comparable != null) {
            return (Integer)comparable;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("PriorityMapping is missing known Priority value ");
        ((StringBuilder)comparable).append((Object)e8);
        throw new IllegalStateException(((StringBuilder)comparable).toString());
    }

    public static e b(int n8) {
        Object object = (e)((Object)a.get(n8));
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown Priority for value ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

