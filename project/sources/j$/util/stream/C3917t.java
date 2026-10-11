package j$.util.stream;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3917t extends Z {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3917t(AbstractC3823a abstractC3823a, int i, int i2) {
        super(abstractC3823a, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final InterfaceC3866i2 M(int i, InterfaceC3866i2 interfaceC3866i2) {
        switch (this.m) {
            case 0:
                return new C3903q(this, interfaceC3866i2, 2);
            case 1:
                return new U(this, interfaceC3866i2, 2);
            case 2:
                return interfaceC3866i2;
            case 3:
                return new U(this, interfaceC3866i2, 5);
            default:
                return new C3829b0(this, interfaceC3866i2, 2);
        }
    }
}
