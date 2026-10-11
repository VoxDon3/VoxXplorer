package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class H3 extends AbstractC3836c2 {
    public final boolean b;

    public H3(B2 b2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        if (this.b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3836c2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
