package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class E3 extends Z1 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(AbstractC3826a2 abstractC3826a2, int i, Predicate predicate) {
        super(abstractC3826a2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return V2.ORDERED.q(abstractC3823a.f) ? J(abstractC3823a, spliterator, new T(13)).spliterator() : new Y3(abstractC3823a.S(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        return (E0) new U3(this, abstractC3823a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        return new C3878l(this, interfaceC3866i2);
    }
}
