package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC3826a2 {
    @Override // j$.util.stream.AbstractC3826a2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC3826a2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g unordered() {
        return !V2.ORDERED.q(this.f) ? this : new X1(this, V2.r, 1);
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
