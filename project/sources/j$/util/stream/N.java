package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class N extends P implements InterfaceC3861h2 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.util.function.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3861h2
    public final /* synthetic */ void j(Long l) {
        AbstractC3919t1.i(this, l);
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

    public N(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        this.b.accept(j);
    }
}
