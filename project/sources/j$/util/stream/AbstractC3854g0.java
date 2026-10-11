package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3854g0 extends AbstractC3859h0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3854g0(AbstractC3823a abstractC3823a, int i, int i2) {
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
    public final InterfaceC3874k0 sequential() {
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
    public final InterfaceC3874k0 parallel() {
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
        return new C3922u(this, V2.r, 4);
    }

    @Override // j$.util.stream.AbstractC3823a, j$.util.stream.InterfaceC3853g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
        }
        return spliterator();
    }
}
