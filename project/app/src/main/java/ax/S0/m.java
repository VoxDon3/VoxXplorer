/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class m<E>
implements Iterable<E> {
    private final Map<E, Integer> c0;
    private Set<E> d0;
    private List<E> e0;
    private final Object q = new Object();

    public m() {
        this.c0 = new HashMap<E, Integer>();
        this.d0 = Collections.EMPTY_SET;
        this.e0 = Collections.EMPTY_LIST;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set<E> H() {
        Object object = this.q;
        synchronized (object) {
            return this.d0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(E e8) {
        Object object = this.q;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                Serializable serializable;
                block4: {
                    try {
                        serializable = new ArrayList(this.e0);
                        serializable.add(e8);
                        this.e0 = java.util.DesugarCollections.unmodifiableList(serializable);
                        serializable = this.c0.get(e8);
                        if (serializable != null) break block4;
                        object2 = new HashSet(this.d0);
                        object2.add(e8);
                        this.d0 = java.util.DesugarCollections.unmodifiableSet((Set)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = this.c0;
                int n8 = 1;
                if (serializable != null) {
                    n8 = 1 + (Integer)serializable;
                }
                object2.put(e8, n8);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int g(E e8) {
        Object object = this.q;
        synchronized (object) {
            try {
                if (!this.c0.containsKey(e8)) return 0;
                return this.c0.get(e8);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(E e8) {
        Object object = this.q;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Serializable serializable;
                try {
                    serializable = this.c0.get(e8);
                    if (serializable == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                ArrayList<E> arrayList = new ArrayList<E>(this.e0);
                arrayList.remove(e8);
                this.e0 = java.util.DesugarCollections.unmodifiableList(arrayList);
                if ((Integer)serializable == 1) {
                    this.c0.remove(e8);
                    serializable = new HashSet(this.d0);
                    serializable.remove(e8);
                    this.d0 = java.util.DesugarCollections.unmodifiableSet((Set)((Object)serializable));
                } else {
                    this.c0.put(e8, (Integer)serializable - 1);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Iterator<E> iterator() {
        Object object = this.q;
        synchronized (object) {
            return this.e0.iterator();
        }
    }
}

