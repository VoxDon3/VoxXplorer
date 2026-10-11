package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3844e0 extends AbstractC3854g0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3844e0(AbstractC3823a abstractC3823a, int i, Object obj, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new C3839d0(this, interfaceC3866i2);
            case 1:
                return new C3829b0(this, interfaceC3866i2, 5);
            case 2:
                return new W1(this, interfaceC3866i2);
            default:
                return new C3883m(this, interfaceC3866i2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844e0(AbstractC3859h0 abstractC3859h0, LongConsumer longConsumer) {
        super(abstractC3859h0, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
