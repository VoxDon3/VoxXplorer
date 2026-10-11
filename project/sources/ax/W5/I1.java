package ax.W5;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
class I1 extends AbstractMap {
    private List c0 = Collections.EMPTY_LIST;
    private Map d0;
    private boolean e0;
    private volatile G1 f0;
    private Map g0;
    private final int q;

    /* synthetic */ I1(int i, H1 h1) {
        this.q = i;
        Map map = Collections.EMPTY_MAP;
        this.d0 = map;
        this.g0 = map;
    }

    private final int l(Comparable comparable) {
        int size = this.c0.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((C1) this.c0.get(i)).d());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((C1) this.c0.get(i3)).d());
            if (compareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i) {
        o();
        Object value = ((C1) this.c0.remove(i)).getValue();
        if (!this.d0.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.c0;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.d0.isEmpty() && !(this.d0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d0 = treeMap;
            this.g0 = treeMap.descendingMap();
        }
        return (SortedMap) this.d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.e0) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.e0) {
            return;
        }
        this.d0 = this.d0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.d0);
        this.g0 = this.g0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.g0);
        this.e0 = true;
    }

    public final int b() {
        return this.c0.size();
    }

    public final Iterable c() {
        return this.d0.isEmpty() ? B1.a() : this.d0.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
        if (this.d0.isEmpty()) {
            return;
        }
        this.d0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.d0.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int l = l(comparable);
        if (l >= 0) {
            return ((C1) this.c0.get(l)).setValue(obj);
        }
        o();
        if (this.c0.isEmpty() && !(this.c0 instanceof ArrayList)) {
            this.c0 = new ArrayList(this.q);
        }
        int i = -(l + 1);
        if (i >= this.q) {
            return n().put(comparable, obj);
        }
        int size = this.c0.size();
        int i2 = this.q;
        if (size == i2) {
            C1 c1 = (C1) this.c0.remove(i2 - 1);
            n().put(c1.d(), c1.getValue());
        }
        this.c0.add(i, new C1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f0 == null) {
            this.f0 = new G1(this, null);
        }
        return this.f0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return super.equals(obj);
        }
        I1 i1 = (I1) obj;
        int size = size();
        if (size != i1.size()) {
            return false;
        }
        int b = b();
        if (b != i1.b()) {
            return entrySet().equals(i1.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!g(i).equals(i1.g(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.d0.equals(i1.d0);
        }
        return true;
    }

    public final Map.Entry g(int i) {
        return (Map.Entry) this.c0.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l = l(comparable);
        return l >= 0 ? ((C1) this.c0.get(l)).getValue() : this.d0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((C1) this.c0.get(i2)).hashCode();
        }
        return this.d0.size() > 0 ? i + this.d0.hashCode() : i;
    }

    public final boolean k() {
        return this.e0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int l = l(comparable);
        if (l >= 0) {
            return m(l);
        }
        if (this.d0.isEmpty()) {
            return null;
        }
        return this.d0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c0.size() + this.d0.size();
    }
}
