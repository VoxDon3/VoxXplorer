package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class Y extends AbstractC3824a0 {
    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final IntStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final IntStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC3824a0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEach(intConsumer);
        } else {
            AbstractC3824a0.T(O()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3824a0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.a.k) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC3824a0.T(O()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g unordered() {
        return !V2.ORDERED.q(this.f) ? this : new C3917t(this, V2.r, 2);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        throw new UnsupportedOperationException();
    }
}
