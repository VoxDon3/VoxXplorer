package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class Z1 extends AbstractC3826a2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z1(AbstractC3823a abstractC3823a, int i, int i2) {
        super(abstractC3823a, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC3823a
    public final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC3853g
    public final InterfaceC3853g unordered() {
        switch (this.l) {
            case 0:
                if (!V2.ORDERED.q(this.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!V2.ORDERED.q(this.f)) {
                    break;
                } else {
                    break;
                }
        }
        return new X1(this, V2.r, 1);
    }
}
