package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final class I3 extends AbstractC3836c2 implements S3 {
    public final /* synthetic */ J3 b;

    @Override // j$.util.stream.S3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(J3 j3, InterfaceC3866i2 interfaceC3866i2, boolean z) {
        super(interfaceC3866i2);
        this.b = j3;
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        this.b.getClass();
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
