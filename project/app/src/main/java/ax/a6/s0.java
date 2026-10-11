/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.k0;
import ax.a6.o0;
import ax.a6.p0;
import ax.a6.u0;
import java.util.Iterator;

final class s0
extends p0 {
    private static final Object[] i0;
    static final s0 j0;
    final transient Object[] d0;
    private final transient int e0;
    final transient Object[] f0;
    private final transient int g0;
    private final transient int h0;

    static {
        Object[] objectArray = new Object[]{};
        i0 = objectArray;
        j0 = new s0(objectArray, 0, objectArray, 0, 0);
    }

    s0(Object[] objectArray, int n8, Object[] objectArray2, int n9, int n10) {
        this.d0 = objectArray;
        this.e0 = n8;
        this.f0 = objectArray2;
        this.g0 = n9;
        this.h0 = n10;
    }

    @Override
    public final boolean contains(Object object) {
        Object[] objectArray;
        if (object != null && (objectArray = this.f0).length != 0) {
            int n8 = k0.a(object.hashCode());
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
    final int e(Object[] objectArray, int n8) {
        Object[] objectArray2 = this.d0;
        n8 = this.h0;
        System.arraycopy(objectArray2, 0, objectArray, 0, n8);
        return n8;
    }

    @Override
    final int g() {
        return this.h0;
    }

    @Override
    final int h() {
        return 0;
    }

    @Override
    public final int hashCode() {
        return this.e0;
    }

    @Override
    final Object[] i() {
        return this.d0;
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return this.n().n(0);
    }

    @Override
    public final u0 k() {
        return this.n().n(0);
    }

    @Override
    final o0 p() {
        return o0.l(this.d0, this.h0);
    }

    @Override
    public final int size() {
        return this.h0;
    }

    @Override
    final boolean t() {
        return true;
    }
}

