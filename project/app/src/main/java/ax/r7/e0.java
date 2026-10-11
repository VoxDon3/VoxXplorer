/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.C;
import ax.r7.G;
import ax.r7.j0;
import ax.r7.z;

final class e0<E>
extends C<E> {
    final transient E d0;

    e0(E e8) {
        this.d0 = n.n(e8);
    }

    @Override
    public boolean contains(Object object) {
        return this.d0.equals(object);
    }

    @Override
    public z<E> e() {
        return z.A(this.d0);
    }

    @Override
    int g(Object[] objectArray, int n8) {
        objectArray[n8] = this.d0;
        return n8 + 1;
    }

    @Override
    public final int hashCode() {
        return this.d0.hashCode();
    }

    @Override
    boolean l() {
        return false;
    }

    @Override
    public j0<E> n() {
        return G.t(this.d0);
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.d0.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

