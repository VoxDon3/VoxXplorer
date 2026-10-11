package j$.util.stream;

/* loaded from: classes2.dex */
public final class W extends AbstractC3836c2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i, InterfaceC3866i2 interfaceC3866i2) {
        super(interfaceC3866i2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC3856g2, j$.util.stream.InterfaceC3866i2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
