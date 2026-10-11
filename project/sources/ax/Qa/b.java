package ax.Qa;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class b<T> {
    private final SortedMap<c, List<T>> a = new TreeMap();

    public synchronized void a(c cVar, T t) {
        try {
            List<T> list = this.a.get(cVar);
            if (list == null) {
                list = new LinkedList<>();
                this.a.put(cVar, list);
            }
            list.add(t);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List<T> b(c cVar) {
        List<T> remove;
        if (!this.a.isEmpty()) {
            c firstKey = this.a.firstKey();
            remove = firstKey.compareTo(cVar) <= 0 ? this.a.remove(firstKey) : null;
        }
        return remove;
    }
}
