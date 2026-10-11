package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public final class e0 extends U {
    private AbstractC0808c e;
    private final int f;

    public e0(AbstractC0808c abstractC0808c, int i) {
        this.e = abstractC0808c;
        this.f = i;
    }

    @Override // ax.M5.InterfaceC0816k
    public final void R0(int i, IBinder iBinder, Bundle bundle) {
        C0821p.m(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
        this.e.N(i, iBinder, bundle, this.f);
        this.e = null;
    }

    @Override // ax.M5.InterfaceC0816k
    public final void c1(int i, IBinder iBinder, i0 i0Var) {
        AbstractC0808c abstractC0808c = this.e;
        C0821p.m(abstractC0808c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C0821p.l(i0Var);
        AbstractC0808c.c0(abstractC0808c, i0Var);
        R0(i, iBinder, i0Var.q);
    }

    @Override // ax.M5.InterfaceC0816k
    public final void q0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
