package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class V extends Z {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC3823a abstractC3823a, int i, Object obj, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new U(this, interfaceC3866i2, 1);
            case 1:
                return new X(this, interfaceC3866i2);
            case 2:
                return new C3883m(this, interfaceC3866i2, 4);
            default:
                return new W1(this, interfaceC3866i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(AbstractC3824a0 abstractC3824a0, IntConsumer intConsumer) {
        super(abstractC3824a0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
