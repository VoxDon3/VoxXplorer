/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import ax.ne.i;
import ax.ne.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class n {
    private static final Map<String, m> a = java.util.DesugarCollections.synchronizedMap(new HashMap());

    static m a(i.f f8) {
        m m8;
        String string = f8.d;
        if (string == null) {
            string = f8.a.getClassName();
        }
        Map<String, m> map = a;
        m m9 = m8 = map.get(string);
        if (m8 == null) {
            m9 = new m(f8);
            map.put(string, m9);
        }
        return m9;
    }

    static void b(m object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Map.Entry<String, m> entry : a.entrySet()) {
            if (entry.getValue() != object) continue;
            arrayList.add(entry.getKey());
        }
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            object = arrayList.get(i8);
            object = (String)object;
            a.remove(object);
        }
    }
}

