package ax.Vb;

import ax.Vb.C;

/* loaded from: classes3.dex */
public final class D<S extends C<S>> {
    public static final S b(Object obj) {
        if (obj == C0997d.a) {
            throw new IllegalStateException("Does not contain segment");
        }
        ax.Gb.l.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean c(Object obj) {
        return obj == C0997d.a;
    }

    public static <S extends C<S>> Object a(Object obj) {
        return obj;
    }
}
