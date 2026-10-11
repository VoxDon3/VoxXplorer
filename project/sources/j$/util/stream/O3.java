package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class O3 extends AbstractC3831b2 {
    public final boolean b;

    public O3(A2 a2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3831b2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
