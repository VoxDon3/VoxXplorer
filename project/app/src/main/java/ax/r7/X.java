/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.C;
import ax.r7.j0;
import ax.r7.w;
import ax.r7.z;

final class X<E>
extends C<E> {
    private static final Object[] i0;
    static final X<Object> j0;
    final transient Object[] d0;
    private final transient int e0;
    final transient Object[] f0;
    private final transient int g0;
    private final transient int h0;

    static {
        Object[] objectArray = new Object[]{};
        i0 = objectArray;
        j0 = new X(objectArray, 0, objectArray, 0, 0);
    }

    X(Object[] objectArray, int n8, Object[] objectArray2, int n9, int n10) {
        this.d0 = objectArray;
        this.e0 = n8;
        this.f0 = objectArray2;
        this.g0 = n9;
        this.h0 = n10;
    }

    @Override
    public boolean contains(Object object) {
        Object[] objectArray = this.f0;
        if (object != null && objectArray.length != 0) {
            int n8 = w.c(object);
            while (true) {
                Object object2;
                if ((object2 = objectArray[n8 &= this.g0]) == null) {
                    return false;
                }
                if (object2.equals(object)) {
                    return true;
                }
                ++n8;
            }
        }
        return false;
    }

    @Override
    int g(Object[] objectArray, int n8) {
        System.arraycopy(this.d0, 0, objectArray, n8, this.h0);
        return n8 + this.h0;
    }

    @Override
    Object[] h() {
        return this.d0;
    }

    @Override
    public int hashCode() {
        return this.e0;
    }

    @Override
    int i() {
        return this.h0;
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
    public j0<E> n() {
        return this.e().n();
    }

    @Override
    public int size() {
        return this.h0;
    }

    @Override
    z<E> w() {
        return z.q(this.d0, this.h0);
    }

    @Override
    boolean x() {
        return true;
    }
}

