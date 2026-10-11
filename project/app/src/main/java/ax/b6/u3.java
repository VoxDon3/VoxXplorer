/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.t4;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class u3<E>
extends AbstractList<E>
implements t4<E> {
    private boolean q;

    u3(boolean bl) {
        this.q = bl;
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
    public final void b() {
        if (this.q) {
            this.q = false;
        }
    }

    @Override
    public final boolean c() {
        return this.q;
    }

    @Override
    public void clear() {
        this.e();
        super.clear();
    }

    protected final void e() {
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
    public abstract E remove(int var1);

    @Override
    public boolean remove(Object object) {
        this.e();
        int n8 = this.indexOf(object);
        if (n8 == -1) {
            return false;
        }
        this.remove(n8);
        return true;
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

