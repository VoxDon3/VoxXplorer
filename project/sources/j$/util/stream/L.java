package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class L extends P implements InterfaceC3851f2 {
    public final DoubleConsumer b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.util.function.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3851f2
    public final /* synthetic */ void s(Double d) {
        AbstractC3919t1.e(this, d);
    }

    @Override // j$.util.stream.B3
    public final Object b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        abstractC3823a.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.B3
    public final /* bridge */ /* synthetic */ Object c(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        e(abstractC3823a, spliterator);
        return null;
    }

    public L(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC3866i2, j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.accept(d);
    }
}
