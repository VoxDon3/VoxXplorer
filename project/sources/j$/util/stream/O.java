package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class O extends P {
    public final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public O(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
