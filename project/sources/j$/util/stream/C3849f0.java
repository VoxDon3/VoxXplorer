package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3849f0 extends AbstractC3859h0 {
    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final InterfaceC3874k0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final InterfaceC3874k0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC3859h0, j$.util.stream.InterfaceC3874k0
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            AbstractC3859h0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3859h0, j$.util.stream.InterfaceC3874k0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC3859h0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g unordered() {
        return !V2.ORDERED.q(this.f) ? this : new C3922u(this, V2.r, 4);
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
