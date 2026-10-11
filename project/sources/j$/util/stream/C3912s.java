package j$.util.stream;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3912s extends AbstractC3942y {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3912s(AbstractC3823a abstractC3823a, int i, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new C3903q(this, interfaceC3866i2, 1);
            case 1:
                return interfaceC3866i2;
            case 2:
                return new C3903q(this, interfaceC3866i2, 4);
            case 3:
                return new W(1, interfaceC3866i2);
            case 4:
                return new U(this, interfaceC3866i2, 4);
            case 5:
                return new C3834c0(interfaceC3866i2);
            default:
                return new C3829b0(this, interfaceC3866i2, 3);
        }
    }
}
