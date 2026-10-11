package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class M extends P implements InterfaceC3856g2 {
    public final IntConsumer b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        p((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.util.function.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3856g2
    public final /* synthetic */ void p(Integer num) {
        AbstractC3919t1.g(this, num);
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

    public M(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        this.b.accept(i);
    }
}
