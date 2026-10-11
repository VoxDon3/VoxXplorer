/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c<E>
extends AbstractList<E>
implements A.i<E> {
    private boolean q = true;

    c() {
    }

    @Override
    public final void F() {
        this.q = false;
    }

    @Override
    public boolean G0() {
        return this.q;
    }

    @Override
    public boolean add(E e8) {
        this.e();
        return super.add(e8);
    }

    @Override
    public boolean addAll(int n8, Collection<? extends E> collection) {
        this.e();
        return super.addAll(n8, collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        this.e();
        return super.addAll(collection);
    }

    @Override
    public void clear() {
        this.e();
        super.clear();
    }

    protected void e() {
        if (this.q) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        object = (List)object;
        int n8 = this.size();
        if (n8 != object.size()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.get(i8).equals(object.get(i8))) continue;
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = this.size();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + this.get(i8).hashCode();
        }
        return n9;
    }

    @Override
    public boolean remove(Object object) {
        this.e();
        return super.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        this.e();
        return super.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        this.e();
        return super.retainAll(collection);
    }
}

