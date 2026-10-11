package ax.B;

import ax.tb.C3133i;
import ax.tb.C3139o;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, ax.Hb.a {
    private Object[] c0;
    private int d0;
    private int[] q;

    private final class a extends g<E> {
        public a() {
            super(b.this.l());
        }

        @Override // ax.B.g
        protected E b(int i) {
            return b.this.s(i);
        }

        @Override // ax.B.g
        protected void c(int i) {
            b.this.n(i);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int c;
        int l = l();
        if (e == null) {
            c = d.d(this);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            c = d.c(this, e, hashCode);
        }
        if (c >= 0) {
            return false;
        }
        int i2 = ~c;
        if (l >= i().length) {
            int i3 = 8;
            if (l >= 8) {
                i3 = (l >> 1) + l;
            } else if (l < 4) {
                i3 = 4;
            }
            int[] i4 = i();
            Object[] g = g();
            d.a(this, i3);
            if (l != l()) {
                throw new ConcurrentModificationException();
            }
            if (!(i().length == 0)) {
                C3133i.i(i4, i(), 0, 0, i4.length, 6, null);
                C3133i.j(g, g(), 0, 0, g.length, 6, null);
            }
        }
        if (i2 < l) {
            int i5 = i2 + 1;
            C3133i.e(i(), i(), i5, i2, l);
            C3133i.g(g(), g(), i5, i2, l);
        }
        if (l != l() || i2 >= i().length) {
            throw new ConcurrentModificationException();
        }
        i()[i2] = i;
        g()[i2] = e;
        r(l() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        ax.Gb.l.f(collection, "elements");
        e(l() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (l() != 0) {
            q(ax.C.a.a);
            p(ax.C.a.c);
            r(0);
        }
        if (l() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        ax.Gb.l.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i) {
        int l = l();
        if (i().length < i) {
            int[] i2 = i();
            Object[] g = g();
            d.a(this, i);
            if (l() > 0) {
                C3133i.i(i2, i(), 0, 0, l(), 6, null);
                C3133i.j(g, g(), 0, 0, l(), 6, null);
            }
        }
        if (l() != l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int l = l();
            for (int i = 0; i < l; i++) {
                if (!((Set) obj).contains(s(i))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object[] g() {
        return this.c0;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] i = i();
        int l = l();
        int i2 = 0;
        for (int i3 = 0; i3 < l; i3++) {
            i2 += i[i3];
        }
        return i2;
    }

    public final int[] i() {
        return this.q;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return l() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public int k() {
        return this.d0;
    }

    public final int l() {
        return this.d0;
    }

    public final E n(int i) {
        int i2;
        Object[] objArr;
        int l = l();
        E e = (E) g()[i];
        if (l <= 1) {
            clear();
            return e;
        }
        int i3 = l - 1;
        if (i().length <= 8 || l() >= i().length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                C3133i.e(i(), i(), i, i4, l);
                C3133i.g(g(), g(), i, i4, l);
            }
            g()[i3] = null;
        } else {
            int l2 = l() > 8 ? l() + (l() >> 1) : 8;
            int[] i5 = i();
            Object[] g = g();
            d.a(this, l2);
            if (i > 0) {
                C3133i.i(i5, i(), 0, 0, i, 6, null);
                objArr = g;
                C3133i.j(objArr, g(), 0, 0, i, 6, null);
                i2 = i;
            } else {
                i2 = i;
                objArr = g;
            }
            if (i2 < i3) {
                int i6 = i2 + 1;
                C3133i.e(i5, i(), i2, i6, l);
                C3133i.g(objArr, g(), i2, i6, l);
            }
        }
        if (l != l()) {
            throw new ConcurrentModificationException();
        }
        r(i3);
        return e;
    }

    public final void p(Object[] objArr) {
        ax.Gb.l.f(objArr, "<set-?>");
        this.c0 = objArr;
    }

    public final void q(int[] iArr) {
        ax.Gb.l.f(iArr, "<set-?>");
        this.q = iArr;
    }

    public final void r(int i) {
        this.d0 = i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        ax.Gb.l.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        ax.Gb.l.f(collection, "elements");
        boolean z = false;
        for (int l = l() - 1; -1 < l; l--) {
            if (!C3139o.z(collection, g()[l])) {
                n(l);
                z = true;
            }
        }
        return z;
    }

    public final E s(int i) {
        return (E) g()[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return k();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C3133i.l(this.c0, 0, this.d0);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(l() * 14);
        sb.append('{');
        int l = l();
        for (int i = 0; i < l; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E s = s(i);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ax.Gb.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public b(int i) {
        this.q = ax.C.a.a;
        this.c0 = ax.C.a.c;
        if (i > 0) {
            d.a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        ax.Gb.l.f(tArr, "array");
        T[] tArr2 = (T[]) c.a(tArr, this.d0);
        C3133i.g(this.c0, tArr2, 0, 0, this.d0);
        ax.Gb.l.e(tArr2, "result");
        return tArr2;
    }

    public /* synthetic */ b(int i, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public b(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
