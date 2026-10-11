package j$.util.stream;

import java.util.function.LongPredicate;

/* loaded from: classes2.dex */
public final class M3 extends AbstractC3841d2 implements S3 {
    public final /* synthetic */ N3 b;

    @Override // j$.util.stream.S3
    public final long f() {
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(N3 n3, InterfaceC3866i2 interfaceC3866i2, boolean z) {
        super(interfaceC3866i2);
        this.b = n3;
    }

    @Override // j$.util.stream.InterfaceC3861h2, j$.util.stream.InterfaceC3866i2
    public final void accept(long j) {
        this.b.getClass();
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
