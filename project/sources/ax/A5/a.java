package ax.A5;

import android.util.SparseArray;
import ax.n5.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {
    private static SparseArray<e> a = new SparseArray<>();
    private static HashMap<e, Integer> b;

    static {
        HashMap<e, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(e.DEFAULT, 0);
        b.put(e.VERY_LOW, 1);
        b.put(e.HIGHEST, 2);
        for (e eVar : b.keySet()) {
            a.append(b.get(eVar).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i) {
        e eVar = a.get(i);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
