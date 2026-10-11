/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.z;

class V<E>
extends z<E> {
    static final z<Object> f0 = new V<Object>(new Object[0], 0);
    final transient Object[] d0;
    private final transient int e0;

    V(Object[] objectArray, int n8) {
        this.d0 = objectArray;
        this.e0 = n8;
    }

    @Override
    int g(Object[] objectArray, int n8) {
        System.arraycopy(this.d0, 0, objectArray, n8, this.e0);
        return n8 + this.e0;
    }

    @Override
    public E get(int n8) {
        n.l(n8, this.e0);
        Object object = this.d0[n8];
        j.Objects.requireNonNull((Object)object);
        return (E)object;
    }

    @Override
    Object[] h() {
        return this.d0;
    }

    @Override
    int i() {
        return this.e0;
    }

    @Override
    int k() {
        return 0;
    }

    @Override
    boolean l() {
        return false;
    }

    @Override
    public int size() {
        return this.e0;
    }
}

