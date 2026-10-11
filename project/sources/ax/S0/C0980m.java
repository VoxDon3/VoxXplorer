package ax.S0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.S0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980m<E> implements Iterable<E> {
    private final Object q = new Object();
    private final Map<E, Integer> c0 = new HashMap();
    private Set<E> d0 = Collections.EMPTY_SET;
    private List<E> e0 = Collections.EMPTY_LIST;

    public Set<E> H() {
        Set<E> set;
        synchronized (this.q) {
            set = this.d0;
        }
        return set;
    }

    public void e(E e) {
        synchronized (this.q) {
            try {
                ArrayList arrayList = new ArrayList(this.e0);
                arrayList.add(e);
                this.e0 = DesugarCollections.unmodifiableList(arrayList);
                Integer num = this.c0.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.d0);
                    hashSet.add(e);
                    this.d0 = DesugarCollections.unmodifiableSet(hashSet);
                }
                this.c0.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int g(E e) {
        int intValue;
        synchronized (this.q) {
            try {
                intValue = this.c0.containsKey(e) ? this.c0.get(e).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public void h(E e) {
        synchronized (this.q) {
            try {
                Integer num = this.c0.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.e0);
                arrayList.remove(e);
                this.e0 = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.c0.remove(e);
                    HashSet hashSet = new HashSet(this.d0);
                    hashSet.remove(e);
                    this.d0 = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.c0.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.q) {
            it = this.e0.iterator();
        }
        return it;
    }
}
