/*
 * Decompiled with CFR 0.152.
 */
package ax.Qa;

import ax.Qa.c;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class b<T> {
    private final SortedMap<c, List<T>> a = new TreeMap<c, List<T>>();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(c c8, T t8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                LinkedList<T> linkedList;
                block3: {
                    try {
                        LinkedList<T> linkedList2;
                        linkedList = linkedList2 = (LinkedList<T>)this.a.get(c8);
                        if (linkedList2 != null) break block3;
                        linkedList = new LinkedList<T>();
                        this.a.put(c8, linkedList);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                linkedList.add(t8);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<T> b(c object) {
        synchronized (this) {
            try {
                if (this.a.isEmpty()) return null;
                c c8 = this.a.firstKey();
                if (c8.d((c)object) > 0) return null;
                return (List)this.a.remove(c8);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

