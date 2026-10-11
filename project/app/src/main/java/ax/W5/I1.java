/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.B1;
import ax.W5.C1;
import ax.W5.G1;
import ax.W5.H1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class I1
extends AbstractMap {
    private List c0;
    private Map d0;
    private boolean e0;
    private volatile G1 f0;
    private Map g0;
    private final int q;

    /* synthetic */ I1(int n8, H1 object) {
        this.q = n8;
        this.c0 = Collections.EMPTY_LIST;
        this.d0 = object = Collections.EMPTY_MAP;
        this.g0 = object;
    }

    static /* bridge */ /* synthetic */ Object d(I1 i12, int n8) {
        return i12.m(n8);
    }

    static /* bridge */ /* synthetic */ List f(I1 i12) {
        return i12.c0;
    }

    static /* bridge */ /* synthetic */ Map i(I1 i12) {
        return i12.d0;
    }

    static /* bridge */ /* synthetic */ void j(I1 i12) {
        i12.o();
    }

    private final int l(Comparable comparable) {
        int n8 = this.c0.size();
        int n9 = n8 - 1;
        int n10 = 0;
        int n11 = n9;
        int n12 = n10;
        if (n9 >= 0) {
            n12 = comparable.compareTo(((C1)this.c0.get(n9)).d());
            if (n12 > 0) {
                return -(n8 + 1);
            }
            if (n12 != 0) {
                n11 = n9;
                n12 = n10;
            } else {
                return n9;
            }
        }
        while (n12 <= n11) {
            n9 = (n12 + n11) / 2;
            n10 = comparable.compareTo(((C1)this.c0.get(n9)).d());
            if (n10 < 0) {
                n11 = n9 - 1;
                continue;
            }
            if (n10 > 0) {
                n12 = n9 + 1;
                continue;
            }
            return n9;
        }
        return -(n12 + 1);
    }

    private final Object m(int n8) {
        this.o();
        Object object = ((C1)this.c0.remove(n8)).getValue();
        if (!this.d0.isEmpty()) {
            Iterator iterator = this.n().entrySet().iterator();
            List list = this.c0;
            Map.Entry entry = iterator.next();
            list.add(new C1(this, (Comparable)entry.getKey(), entry.getValue()));
            iterator.remove();
        }
        return object;
    }

    private final SortedMap n() {
        this.o();
        if (this.d0.isEmpty() && !(this.d0 instanceof TreeMap)) {
            TreeMap treeMap;
            this.d0 = treeMap = new TreeMap();
            this.g0 = treeMap.descendingMap();
        }
        return (SortedMap)this.d0;
    }

    private final void o() {
        if (!this.e0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void a() {
        if (!this.e0) {
            Map map = this.d0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap((Map)this.d0);
            this.d0 = map;
            map = this.g0.isEmpty() ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap((Map)this.g0);
            this.g0 = map;
            this.e0 = true;
        }
    }

    public final int b() {
        return this.c0.size();
    }

    public final Iterable c() {
        if (this.d0.isEmpty()) {
            return B1.a();
        }
        return this.d0.entrySet();
    }

    @Override
    public final void clear() {
        this.o();
        if (!this.c0.isEmpty()) {
            this.c0.clear();
        }
        if (!this.d0.isEmpty()) {
            this.d0.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.l((Comparable)(object = (Comparable)object)) >= 0 || this.d0.containsKey(object);
        {
        }
    }

    public final Object e(Comparable comparable, Object object) {
        int n8;
        int n9;
        this.o();
        int n10 = this.l(comparable);
        if (n10 >= 0) {
            return ((C1)this.c0.get(n10)).setValue(object);
        }
        this.o();
        if (this.c0.isEmpty() && !(this.c0 instanceof ArrayList)) {
            this.c0 = new ArrayList(this.q);
        }
        if ((n9 = -(n10 + 1)) >= this.q) {
            return this.n().put(comparable, object);
        }
        n10 = this.c0.size();
        if (n10 == (n8 = this.q)) {
            C1 c12 = (C1)this.c0.remove(n8 - 1);
            this.n().put(c12.d(), c12.getValue());
        }
        this.c0.add(n9, new C1(this, comparable, object));
        return null;
    }

    @Override
    public final Set entrySet() {
        if (this.f0 == null) {
            this.f0 = new G1(this, null);
        }
        return this.f0;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof I1)) {
            return super.equals(object);
        }
        object = (I1)object;
        int n8 = this.size();
        if (n8 != ((I1)object).size()) {
            return false;
        }
        int n9 = this.b();
        if (n9 == ((I1)object).b()) {
            for (int i8 = 0; i8 < n9; ++i8) {
                if (((Object)this.g(i8)).equals(((I1)object).g(i8))) continue;
                return false;
            }
            if (n9 != n8) {
                return ((Object)this.d0).equals(((I1)object).d0);
            }
            return true;
        }
        return ((Object)this.entrySet()).equals(((I1)object).entrySet());
    }

    public final Map.Entry g(int n8) {
        return (Map.Entry)this.c0.get(n8);
    }

    @Override
    public final Object get(Object object) {
        int n8 = this.l((Comparable)(object = (Comparable)object));
        if (n8 >= 0) {
            return ((C1)this.c0.get(n8)).getValue();
        }
        return this.d0.get(object);
    }

    @Override
    public final int hashCode() {
        int n8;
        int n9 = this.b();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += ((C1)this.c0.get(n8)).hashCode();
        }
        n8 = n10;
        if (this.d0.size() > 0) {
            n8 = n10 + ((Object)this.d0).hashCode();
        }
        return n8;
    }

    public final boolean k() {
        return this.e0;
    }

    @Override
    public final Object remove(Object object) {
        this.o();
        object = (Comparable)object;
        int n8 = this.l((Comparable)object);
        if (n8 >= 0) {
            return this.m(n8);
        }
        if (this.d0.isEmpty()) {
            return null;
        }
        return this.d0.remove(object);
    }

    @Override
    public final int size() {
        return this.c0.size() + this.d0.size();
    }
}

