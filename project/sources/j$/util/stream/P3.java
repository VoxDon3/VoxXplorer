package j$.util.stream;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final class P3 extends AbstractC3831b2 implements S3 {
    public final /* synthetic */ Q3 b;

    @Override // j$.util.stream.S3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(Q3 q3, InterfaceC3866i2 interfaceC3866i2, boolean z) {
        super(interfaceC3866i2);
        this.b = q3;
    }

    @Override // j$.util.stream.InterfaceC3851f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.getClass();
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }
}
