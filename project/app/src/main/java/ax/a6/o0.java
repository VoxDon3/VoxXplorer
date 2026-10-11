/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.f0;
import ax.a6.g0;
import ax.a6.l0;
import ax.a6.m0;
import ax.a6.n0;
import ax.a6.r0;
import ax.a6.v0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class o0
extends l0
implements List,
RandomAccess,
j.List {
    private static final v0 c0 = new m0(r0.g0, 0);
    public static final int d0 = 0;

    o0() {
    }

    static o0 l(Object[] objectArray, int n8) {
        if (n8 == 0) {
            return r0.g0;
        }
        return new r0(objectArray, n8);
    }

    @Deprecated
    public final void add(int n8, Object object) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int n8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    int e(Object[] objectArray, int n8) {
        int n9 = this.size();
        for (n8 = 0; n8 < n9; ++n8) {
            objectArray[n8] = this.get(n8);
        }
        return n9;
    }

    @Override
    public final boolean equals(Object iterator) {
        if (iterator == this) {
            return true;
        }
        if (!(iterator instanceof List)) {
            return false;
        }
        Object object = (List)((Object)iterator);
        int n8 = this.size();
        if (n8 != object.size()) {
            return false;
        }
        if (object instanceof RandomAccess) {
            for (int i8 = 0; i8 < n8; ++i8) {
                if (f0.a(this.get(i8), object.get(i8))) continue;
                return false;
            }
            return true;
        }
        iterator = this.iterator();
        object = object.iterator();
        while (iterator.hasNext()) {
            if (!object.hasNext()) {
                return false;
            }
            if (f0.a(iterator.next(), object.next())) continue;
            return false;
        }
        return !object.hasNext();
    }

    @Override
    public final int hashCode() {
        int n8 = this.size();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + this.get(i8).hashCode();
        }
        return n9;
    }

    @Override
    public final int indexOf(Object object) {
        if (object == null) {
            return -1;
        }
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!object.equals(this.get(i8))) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return this.n(0);
    }

    public o0 k(int n8, int n9) {
        g0.c(n8, n9, this.size());
        if ((n9 -= n8) == this.size()) {
            return this;
        }
        if (n9 == 0) {
            return r0.g0;
        }
        return new n0(this, n8, n9);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        for (int i8 = this.size() - 1; i8 >= 0; --i8) {
            if (!object.equals(this.get(i8))) continue;
            return i8;
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return this.n(0);
    }

    public final v0 n(int n8) {
        g0.b(n8, this.size(), "index");
        if (this.isEmpty()) {
            return c0;
        }
        return new m0(this, n8);
    }

    @Deprecated
    public final Object remove(int n8) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        j.List._CC.$default$replaceAll((List)this, (UnaryOperator)unaryOperator);
    }

    @Deprecated
    public final Object set(int n8, Object object) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void sort(Comparator comparator) {
        j.List._CC.$default$sort((List)this, (Comparator)comparator);
    }
}

