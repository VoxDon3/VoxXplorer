package ax.M5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class f0 implements ServiceConnection {
    final /* synthetic */ AbstractC0808c c0;
    private final int q;

    public f0(AbstractC0808c abstractC0808c, int i) {
        this.c0 = abstractC0808c;
        this.q = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC0808c abstractC0808c = this.c0;
        if (iBinder == null) {
            AbstractC0808c.d0(abstractC0808c, 16);
            return;
        }
        obj = abstractC0808c.o0;
        synchronized (obj) {
            try {
                AbstractC0808c abstractC0808c2 = this.c0;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0808c2.p0 = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0817l)) ? new V(iBinder) : (InterfaceC0817l) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c0.e0(0, null, this.q);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.c0.o0;
        synchronized (obj) {
            this.c0.p0 = null;
        }
        AbstractC0808c abstractC0808c = this.c0;
        int i = this.q;
        Handler handler = abstractC0808c.m0;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
