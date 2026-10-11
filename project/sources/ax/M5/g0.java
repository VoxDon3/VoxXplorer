package ax.M5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ax.J5.C0742c;
import ax.M5.AbstractC0808c;

/* loaded from: classes3.dex */
public final class g0 extends S {
    public final IBinder g;
    final /* synthetic */ AbstractC0808c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC0808c abstractC0808c, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC0808c, i, bundle);
        this.h = abstractC0808c;
        this.g = iBinder;
    }

    @Override // ax.M5.S
    protected final void f(C0742c c0742c) {
        if (this.h.w0 != null) {
            this.h.w0.r(c0742c);
        }
        this.h.L(c0742c);
    }

    @Override // ax.M5.S
    protected final boolean g() {
        AbstractC0808c.a aVar;
        AbstractC0808c.a aVar2;
        try {
            IBinder iBinder = this.g;
            C0821p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s = this.h.s(this.g);
            if (s == null || !(AbstractC0808c.g0(this.h, 2, 4, s) || AbstractC0808c.g0(this.h, 3, 4, s))) {
                return false;
            }
            this.h.A0 = null;
            AbstractC0808c abstractC0808c = this.h;
            Bundle x = abstractC0808c.x();
            aVar = abstractC0808c.v0;
            if (aVar == null) {
                return true;
            }
            aVar2 = this.h.v0;
            aVar2.B(x);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
