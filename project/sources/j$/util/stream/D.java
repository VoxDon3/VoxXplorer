package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class D implements B3 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public D(boolean z, W2 w2, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : V2.r) | V2.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.B3
    public final int d() {
        return this.a;
    }

    @Override // j$.util.stream.B3
    public final Object b(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        C3 c3 = (C3) this.d.get();
        abstractC3823a.Q(spliterator, c3);
        Object obj = c3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.B3
    public final Object c(AbstractC3823a abstractC3823a, Spliterator spliterator) {
        return new J(this, V2.ORDERED.q(abstractC3823a.f), abstractC3823a, spliterator).invoke();
    }
}
