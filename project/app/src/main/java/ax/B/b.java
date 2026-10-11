/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.c;
import ax.B.d;
import ax.B.g;
import ax.Gb.l;
import ax.tb.i;
import ax.tb.o;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class b<E>
implements Collection<E>,
Set<E>,
ax.Hb.a {
    private Object[] c0;
    private int d0;
    private int[] q;

    public b() {
        this(0, 1, null);
    }

    public b(int n8) {
        this.q = ax.C.a.a;
        this.c0 = ax.C.a.c;
        if (n8 > 0) {
            d.a(this, n8);
        }
    }

    public /* synthetic */ b(int n8, int n9, ax.Gb.g g8) {
        if ((n9 & 1) != 0) {
            n8 = 0;
        }
        this(n8);
    }

    public b(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            this.addAll(collection);
        }
    }

    @Override
    public boolean add(E e8) {
        Object[] objectArray;
        int[] nArray;
        int n8;
        int n9;
        int n10 = this.l();
        int n11 = 0;
        if (e8 == null) {
            n9 = d.d(this);
            n8 = 0;
        } else {
            n8 = e8.hashCode();
            n9 = d.c(this, e8, n8);
        }
        if (n9 >= 0) {
            return false;
        }
        int n12 = ~n9;
        if (n10 >= this.i().length) {
            n9 = 8;
            if (n10 >= 8) {
                n9 = (n10 >> 1) + n10;
            } else if (n10 < 4) {
                n9 = 4;
            }
            nArray = this.i();
            objectArray = this.g();
            d.a(this, n9);
            if (n10 == this.l()) {
                n9 = n11;
                if (this.i().length == 0) {
                    n9 = 1;
                }
                if (n9 == 0) {
                    i.i(nArray, this.i(), 0, 0, nArray.length, 6, null);
                    i.j(objectArray, this.g(), 0, 0, objectArray.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (n12 < n10) {
            objectArray = this.i();
            nArray = this.i();
            n9 = n12 + 1;
            i.e(objectArray, nArray, n9, n12, n10);
            i.g(this.g(), this.g(), n9, n12, n10);
        }
        if (n10 == this.l() && n12 < this.i().length) {
            this.i()[n12] = n8;
            this.g()[n12] = e8;
            this.r(this.l() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> object) {
        l.f(object, "elements");
        this.e(this.l() + object.size());
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.add(object.next());
        }
        return bl;
    }

    @Override
    public void clear() {
        if (this.l() != 0) {
            this.q(ax.C.a.a);
            this.p(ax.C.a.c);
            this.r(0);
        }
        if (this.l() == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    public boolean containsAll(Collection<? extends Object> object) {
        l.f(object, "elements");
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    public final void e(int n8) {
        int n9 = this.l();
        if (this.i().length < n8) {
            int[] nArray = this.i();
            Object[] objectArray = this.g();
            d.a(this, n8);
            if (this.l() > 0) {
                i.i(nArray, this.i(), 0, 0, this.l(), 6, null);
                i.j(objectArray, this.g(), 0, 0, this.l(), 6, null);
            }
        }
        if (this.l() == n9) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        if (this.size() != ((Set)object).size()) {
            return false;
        }
        try {
            int n8 = this.l();
            int i8 = 0;
            while (i8 < n8) {
                E e8 = this.s(i8);
                boolean bl = ((Set)object).contains(e8);
                if (!bl) {
                    return false;
                }
                ++i8;
            }
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public final Object[] g() {
        return this.c0;
    }

    @Override
    public int hashCode() {
        int[] nArray = this.i();
        int n8 = this.l();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += nArray[i8];
        }
        return n9;
    }

    public final int[] i() {
        return this.q;
    }

    public final int indexOf(Object object) {
        if (object == null) {
            return d.d(this);
        }
        return d.c(this, object, object.hashCode());
    }

    @Override
    public boolean isEmpty() {
        return this.l() <= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new a(this);
    }

    public int k() {
        return this.d0;
    }

    public final int l() {
        return this.d0;
    }

    public final E n(int n8) {
        int n9 = this.l();
        Object object = this.g()[n8];
        if (n9 <= 1) {
            this.clear();
            return (E)object;
        }
        int n10 = n9 - 1;
        int n11 = this.i().length;
        int n12 = 8;
        if (n11 > 8 && this.l() < this.i().length / 3) {
            if (this.l() > 8) {
                n12 = this.l() + (this.l() >> 1);
            }
            int[] nArray = this.i();
            Object[] objectArray = this.g();
            d.a(this, n12);
            if (n8 > 0) {
                i.i(nArray, this.i(), 0, 0, n8, 6, null);
                i.j(objectArray, this.g(), 0, 0, n8, 6, null);
            }
            if (n8 < n10) {
                int[] nArray2 = this.i();
                n12 = n8 + 1;
                i.e(nArray, nArray2, n8, n12, n9);
                i.g(objectArray, this.g(), n8, n12, n9);
            }
        } else {
            if (n8 < n10) {
                int[] nArray = this.i();
                int[] nArray3 = this.i();
                n12 = n8 + 1;
                i.e(nArray, nArray3, n8, n12, n9);
                i.g(this.g(), this.g(), n8, n12, n9);
            }
            this.g()[n10] = null;
        }
        if (n9 == this.l()) {
            this.r(n10);
            return (E)object;
        }
        throw new ConcurrentModificationException();
    }

    public final void p(Object[] objectArray) {
        l.f(objectArray, "<set-?>");
        this.c0 = objectArray;
    }

    public final void q(int[] nArray) {
        l.f(nArray, "<set-?>");
        this.q = nArray;
    }

    public final void r(int n8) {
        this.d0 = n8;
    }

    @Override
    public boolean remove(Object object) {
        int n8 = this.indexOf(object);
        if (n8 >= 0) {
            this.n(n8);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<? extends Object> object) {
        l.f(object, "elements");
        object = object.iterator();
        boolean bl = false;
        while (object.hasNext()) {
            bl |= this.remove(object.next());
        }
        return bl;
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        boolean bl = false;
        for (int i8 = this.l() - 1; -1 < i8; --i8) {
            if (o.z((Iterable)collection, this.g()[i8])) continue;
            this.n(i8);
            bl = true;
        }
        return bl;
    }

    public final E s(int n8) {
        return (E)this.g()[n8];
    }

    @Override
    public final Object[] toArray() {
        return i.l(this.c0, 0, this.d0);
    }

    @Override
    public final <T> T[] toArray(T[] TArray) {
        l.f(TArray, "array");
        TArray = c.a(TArray, this.d0);
        i.g(this.c0, TArray, 0, 0, this.d0);
        l.e(TArray, "result");
        return TArray;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder(this.l() * 14);
        ((StringBuilder)charSequence).append('{');
        int n8 = this.l();
        for (int i8 = 0; i8 < n8; ++i8) {
            E e8;
            if (i8 > 0) {
                ((StringBuilder)charSequence).append(", ");
            }
            if ((e8 = this.s(i8)) != this) {
                ((StringBuilder)charSequence).append(e8);
                continue;
            }
            ((StringBuilder)charSequence).append("(this Set)");
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        l.e(charSequence, "StringBuilder(capacity).\u2026builderAction).toString()");
        return charSequence;
    }

    private final class a
    extends g<E> {
        final b<E> e0;

        public a(b b8) {
            this.e0 = b8;
            super(b8.l());
        }

        @Override
        protected E b(int n8) {
            return this.e0.s(n8);
        }

        @Override
        protected void c(int n8) {
            this.e0.n(n8);
        }
    }
}

