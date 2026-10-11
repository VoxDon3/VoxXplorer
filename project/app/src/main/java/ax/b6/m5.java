/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.q5;
import ax.b6.s5;
import ax.b6.x5;
import ax.b6.z5;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class m5<K extends Comparable<K>, V>
extends AbstractMap<K, V> {
    private Map<K, V> c0;
    private boolean d0;
    private volatile x5 e0;
    private Map<K, V> f0;
    private volatile q5 g0;
    private List<s5> q = Collections.EMPTY_LIST;

    private m5() {
        Map map;
        this.c0 = map = Collections.EMPTY_MAP;
        this.f0 = map;
    }

    /* synthetic */ m5(z5 z52) {
        this();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int b(K k8) {
        int n8;
        int n9 = this.q.size();
        int n10 = n9 - 1;
        if (n10 >= 0) {
            n8 = k8.compareTo((Comparable)((Comparable)this.q.get(n10).getKey()));
            if (n8 > 0) {
                n10 = n9 + 1;
                return -n10;
            }
            if (n8 == 0) {
                return n10;
            }
        }
        n9 = 0;
        while (n9 <= n10) {
            int n11 = (n9 + n10) / 2;
            n8 = k8.compareTo((Comparable)((Comparable)this.q.get(n11).getKey()));
            if (n8 < 0) {
                n10 = n11 - 1;
                continue;
            }
            if (n8 <= 0) return n11;
            n9 = n11 + 1;
        }
        n10 = n9 + 1;
        return -n10;
    }

    static /* synthetic */ Object c(m5 m52, int n8) {
        return m52.i(n8);
    }

    static /* bridge */ /* synthetic */ List e(m5 m52) {
        return m52.q;
    }

    private final V i(int n8) {
        this.q();
        Object object = this.q.remove(n8).getValue();
        if (!this.c0.isEmpty()) {
            Iterator<Map.Entry<K, V>> iterator = this.p().entrySet().iterator();
            this.q.add(new s5(this, iterator.next()));
            iterator.remove();
        }
        return (V)object;
    }

    static /* bridge */ /* synthetic */ Map j(m5 m52) {
        return m52.c0;
    }

    static /* bridge */ /* synthetic */ Map k(m5 m52) {
        return m52.f0;
    }

    static /* synthetic */ void n(m5 m52) {
        m52.q();
    }

    private final SortedMap<K, V> p() {
        this.q();
        if (this.c0.isEmpty() && !(this.c0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c0 = treeMap;
            this.f0 = treeMap.descendingMap();
        }
        return (SortedMap)this.c0;
    }

    private final void q() {
        if (!this.d0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int a() {
        return this.q.size();
    }

    @Override
    public void clear() {
        this.q();
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b(object = (Comparable)object) >= 0 || this.c0.containsKey(object);
        {
        }
    }

    public final V d(K k8, V v8) {
        this.q();
        int n8 = this.b(k8);
        if (n8 >= 0) {
            return (V)this.q.get(n8).setValue((Object)v8);
        }
        this.q();
        if (this.q.isEmpty() && !(this.q instanceof ArrayList)) {
            this.q = new ArrayList<s5>(16);
        }
        if ((n8 = -(n8 + 1)) >= 16) {
            return this.p().put(k8, v8);
        }
        if (this.q.size() == 16) {
            s5 s52 = this.q.remove(15);
            this.p().put((Comparable)s52.getKey(), s52.getValue());
        }
        this.q.add(n8, new s5(this, (Comparable)k8, v8));
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e0 == null) {
            this.e0 = new x5(this, null);
        }
        return this.e0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m5)) {
            return super.equals(object);
        }
        object = (m5)object;
        int n8 = this.size();
        if (n8 != ((m5)object).size()) {
            return false;
        }
        int n9 = this.a();
        if (n9 != ((m5)object).a()) {
            return ((Object)this.entrySet()).equals(((m5)object).entrySet());
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            if (((Object)this.f(i8)).equals(((m5)object).f(i8))) continue;
            return false;
        }
        if (n9 != n8) {
            return ((Object)this.c0).equals(((m5)object).c0);
        }
        return true;
    }

    public final Map.Entry<K, V> f(int n8) {
        return this.q.get(n8);
    }

    public final Iterable<Map.Entry<K, V>> g() {
        if (this.c0.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.c0.entrySet();
    }

    @Override
    public V get(Object object) {
        int n8 = this.b(object = (Comparable)object);
        if (n8 >= 0) {
            return (V)this.q.get(n8).getValue();
        }
        return this.c0.get(object);
    }

    @Override
    public int hashCode() {
        int n8;
        int n9 = this.a();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += this.q.get(n8).hashCode();
        }
        n8 = n10;
        if (this.c0.size() > 0) {
            n8 = n10 + ((Object)this.c0).hashCode();
        }
        return n8;
    }

    final Set<Map.Entry<K, V>> l() {
        if (this.g0 == null) {
            this.g0 = new q5(this, null);
        }
        return this.g0;
    }

    public void m() {
        if (!this.d0) {
            Map map = this.c0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap(this.c0);
            this.c0 = map;
            map = this.f0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap(this.f0);
            this.f0 = map;
            this.d0 = true;
        }
    }

    public final boolean o() {
        return this.d0;
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.d((Comparable)object, object2);
    }

    @Override
    public V remove(Object object) {
        this.q();
        object = (Comparable)object;
        int n8 = this.b(object);
        if (n8 >= 0) {
            return this.i(n8);
        }
        if (this.c0.isEmpty()) {
            return null;
        }
        return this.c0.remove(object);
    }

    @Override
    public int size() {
        return this.q.size() + this.c0.size();
    }
}

