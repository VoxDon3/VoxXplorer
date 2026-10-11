package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class Z extends AbstractC3824a0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(AbstractC3823a abstractC3823a, int i, int i2) {
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

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final IntStream sequential() {
        switch (this.l) {
            case 0:
                this.a.k = false;
                break;
            default:
                this.a.k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final IntStream parallel() {
        switch (this.l) {
            case 0:
                this.a.k = true;
                break;
            default:
                this.a.k = true;
                break;
        }
        return this;
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
        return new C3917t(this, V2.r, 2);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
        }
        return spliterator();
    }
}
