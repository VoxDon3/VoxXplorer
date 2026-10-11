package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class K0 extends AbstractC3838d {
    public final AbstractC3823a h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.AbstractC3838d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3838d abstractC3838d = this.d;
        if (abstractC3838d != null) {
            this.f = (E0) this.j.apply((E0) ((K0) abstractC3838d).f, (E0) ((K0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public K0(AbstractC3823a abstractC3823a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC3823a, spliterator);
        this.h = abstractC3823a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public K0(K0 k0, Spliterator spliterator) {
        super(k0, spliterator);
        this.h = k0.h;
        this.i = k0.i;
        this.j = k0.j;
    }

    @Override // j$.util.stream.AbstractC3838d
    public AbstractC3838d c(Spliterator spliterator) {
        return new K0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3838d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final E0 a() {
        InterfaceC3933w0 interfaceC3933w0 = (InterfaceC3933w0) this.i.apply(this.h.C(this.b));
        this.h.Q(this.b, interfaceC3933w0);
        return interfaceC3933w0.a();
    }
}
