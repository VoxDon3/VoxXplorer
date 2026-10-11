package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3937x extends AbstractC3947z {
    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final C sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final C parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC3947z, j$.util.stream.C
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC3947z.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3947z, j$.util.stream.C
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC3947z.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g unordered() {
        return !V2.ORDERED.q(this.f) ? this : new C3912s(this, V2.r, 1);
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
