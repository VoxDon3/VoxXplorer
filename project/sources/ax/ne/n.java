package ax.ne;

import ax.ne.i;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class n {
    private static final Map<String, m> a = DesugarCollections.synchronizedMap(new HashMap());

    static m a(i.f fVar) {
        String str = fVar.d;
        if (str == null) {
            str = fVar.a.getClassName();
        }
        Map<String, m> map = a;
        m mVar = map.get(str);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(fVar);
        map.put(str, mVar2);
        return mVar2;
    }

    static void b(m mVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, m> entry : a.entrySet()) {
            if (entry.getValue() == mVar) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a.remove((String) obj);
        }
    }
}
