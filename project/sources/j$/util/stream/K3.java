package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class K3 extends AbstractC3841d2 {
    public final boolean b;

    public K3(C2 c2, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.b = true;
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final void m(long j) {
        this.a.m(-1L);
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        if (this.b) {
            LongPredicate longPredicate = null;
            longPredicate.test(j);
            throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3841d2, j$.util.stream.InterfaceC3866i2
    public final boolean q() {
        return !this.b || this.a.q();
    }
}
