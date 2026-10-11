package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class Q3 extends AbstractC3942y implements R3 {
    @Override // j$.util.stream.AbstractC3823a
    public final Spliterator K(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return V2.ORDERED.q(abstractC3823a.f) ? J(abstractC3823a, spliterator, new L3(2)).spliterator() : new V3((j$.util.S) abstractC3823a.S(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC3823a
    public final E0 J(AbstractC3823a abstractC3823a, Spliterator spliterator, IntFunction intFunction) {
        return (E0) new T3(this, abstractC3823a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        return new P3(this, interfaceC3866i2, false);
    }

    @Override // j$.util.stream.R3
    public final S3 j(InterfaceC3933w0 interfaceC3933w0, boolean z) {
        return new P3(this, interfaceC3933w0, z);
    }
}
