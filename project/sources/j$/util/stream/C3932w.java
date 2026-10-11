package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3932w extends AbstractC3942y {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3932w(AbstractC3823a abstractC3823a, int i, Object obj, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3932w(AbstractC3947z abstractC3947z, DoubleConsumer doubleConsumer) {
        super(abstractC3947z, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new C3927v(this, interfaceC3866i2);
            case 1:
                return new C3903q(this, interfaceC3866i2, 5);
            case 2:
                return new C3883m(this, interfaceC3866i2, 6);
            default:
                return new W1(this, interfaceC3866i2);
        }
    }
}
