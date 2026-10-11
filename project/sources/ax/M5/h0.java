package ax.M5;

import android.os.Bundle;
import ax.J5.C0742c;

/* loaded from: classes3.dex */
public final class h0 extends S {
    final /* synthetic */ AbstractC0808c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AbstractC0808c abstractC0808c, int i, Bundle bundle) {
        super(abstractC0808c, i, null);
        this.g = abstractC0808c;
    }

    @Override // ax.M5.S
    protected final void f(C0742c c0742c) {
        if (this.g.t() && AbstractC0808c.h0(this.g)) {
            AbstractC0808c.d0(this.g, 16);
        } else {
            this.g.q0.c(c0742c);
            this.g.L(c0742c);
        }
    }

    @Override // ax.M5.S
    protected final boolean g() {
        this.g.q0.c(C0742c.f0);
        return true;
    }
}
