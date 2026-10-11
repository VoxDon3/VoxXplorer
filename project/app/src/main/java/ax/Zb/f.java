/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.Vb.C;
import ax.Zb.e;
import ax.wb.i;
import java.util.concurrent.atomic.AtomicReferenceArray;

final class f
extends C<f> {
    private final AtomicReferenceArray f0 = new AtomicReferenceArray(e.f());

    public f(long l8, f f8, int n8) {
        super(l8, f8, n8);
    }

    @Override
    public int n() {
        return e.f();
    }

    @Override
    public void o(int n8, Throwable object, i i8) {
        object = e.c();
        this.r().set(n8, object);
        this.p();
    }

    public final AtomicReferenceArray r() {
        return this.f0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SemaphoreSegment[id=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.hashCode());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

