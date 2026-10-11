/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.p0;
import ax.a6.q0;
import ax.a6.u0;
import java.util.Iterator;

final class t0
extends p0 {
    final transient Object d0;

    t0(Object object) {
        object.getClass();
        this.d0 = object;
    }

    @Override
    public final boolean contains(Object object) {
        return this.d0.equals(object);
    }

    @Override
    final int e(Object[] objectArray, int n8) {
        objectArray[0] = this.d0;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.d0.hashCode();
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return new q0(this.d0);
    }

    @Override
    public final u0 k() {
        return new q0(this.d0);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        String string = this.d0.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

