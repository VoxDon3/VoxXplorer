package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class r extends Z1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC3823a abstractC3823a, int i, Object obj, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new C3903q(this, interfaceC3866i2, 0);
            case 1:
                return new U(this, interfaceC3866i2, 0);
            case 2:
                return new C3829b0(this, interfaceC3866i2, 0);
            case 3:
                return new C3883m(this, interfaceC3866i2, 1);
            case 4:
                return new C3883m(this, interfaceC3866i2, 2);
            case 5:
                return new C3883m(this, interfaceC3866i2, 3);
            default:
                return new C3878l(this, interfaceC3866i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC3826a2 abstractC3826a2, Consumer consumer) {
        super(abstractC3826a2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
