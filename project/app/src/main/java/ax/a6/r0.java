/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.g0;
import ax.a6.o0;

final class r0
extends o0 {
    static final o0 g0 = new r0(new Object[0], 0);
    final transient Object[] e0;
    private final transient int f0;

    r0(Object[] objectArray, int n8) {
        this.e0 = objectArray;
        this.f0 = n8;
    }

    @Override
    final int e(Object[] objectArray, int n8) {
        Object[] objectArray2 = this.e0;
        n8 = this.f0;
        System.arraycopy(objectArray2, 0, objectArray, 0, n8);
        return n8;
    }

    @Override
    final int g() {
        return this.f0;
    }

    public final Object get(int n8) {
        ax.a6.g0.a(n8, this.f0, "index");
        Object object = this.e0[n8];
        j.Objects.requireNonNull((Object)object);
        return object;
    }

    @Override
    final int h() {
        return 0;
    }

    @Override
    final Object[] i() {
        return this.e0;
    }

    @Override
    public final int size() {
        return this.f0;
    }
}

