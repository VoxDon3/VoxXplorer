package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class G3 extends Z1 implements R3 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(AbstractC3826a2 abstractC3826a2, int i, Predicate predicate) {
        super(abstractC3826a2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return V2.ORDERED.q(abstractC3823a.f) ? J(abstractC3823a, spliterator, new T(13)).spliterator() : new Y3(abstractC3823a.S(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        return (E0) new T3(this, abstractC3823a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        return new F3(this, interfaceC3866i2, false);
    }

    @Override // j$.util.stream.R3
    public final S3 j(InterfaceC3933w0 interfaceC3933w0, boolean z) {
        return new F3(this, interfaceC3933w0, z);
    }
}
