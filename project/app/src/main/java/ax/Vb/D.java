/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.l;
import ax.Vb.C;
import ax.Vb.d;

public final class D<S extends C<S>> {
    public static <S extends C<S>> Object a(Object object) {
        return object;
    }

    public static final S b(Object object) {
        if (object != d.a()) {
            l.d(object, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C)object;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object object) {
        return object == d.a();
    }
}

