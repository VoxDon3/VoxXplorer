package ax.M5;

import android.app.PendingIntent;
import android.os.Bundle;
import ax.J5.C0742c;

/* loaded from: classes3.dex */
abstract class S extends d0 {
    public final int d;
    public final Bundle e;
    final /* synthetic */ AbstractC0808c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected S(AbstractC0808c abstractC0808c, int i, Bundle bundle) {
        super(abstractC0808c, Boolean.TRUE);
        this.f = abstractC0808c;
        this.d = i;
        this.e = bundle;
    }

    @Override // ax.M5.d0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d != 0) {
            this.f.i0(1, null);
            Bundle bundle = this.e;
            f(new C0742c(this.d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f.i0(1, null);
            f(new C0742c(8, null));
        }
    }

    protected abstract void f(C0742c c0742c);

    protected abstract boolean g();

    @Override // ax.M5.d0
    protected final void b() {
    }
}
