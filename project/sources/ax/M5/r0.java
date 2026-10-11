package ax.M5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class r0 extends AbstractC0813h {
    private final HashMap f = new HashMap();
    private final Context g;
    private volatile Handler h;
    private final q0 i;
    private final ax.Q5.b j;
    private final long k;
    private final long l;
    private volatile Executor m;

    r0(Context context, Looper looper, Executor executor) {
        q0 q0Var = new q0(this, null);
        this.i = q0Var;
        this.g = context.getApplicationContext();
        this.h = new ax.Z5.e(looper, q0Var);
        this.j = ax.Q5.b.b();
        this.k = 5000L;
        this.l = 300000L;
        this.m = executor;
    }

    @Override // ax.M5.AbstractC0813h
    protected final void f(m0 m0Var, ServiceConnection serviceConnection, String str) {
        C0821p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                o0 o0Var = (o0) this.f.get(m0Var);
                if (o0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + m0Var.toString());
                }
                if (!o0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + m0Var.toString());
                }
                o0Var.f(serviceConnection, str);
                if (o0Var.i()) {
                    this.h.sendMessageDelayed(this.h.obtainMessage(0, m0Var), this.k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.M5.AbstractC0813h
    protected final boolean h(m0 m0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C0821p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                o0 o0Var = (o0) this.f.get(m0Var);
                if (executor == null) {
                    executor = this.m;
                }
                if (o0Var == null) {
                    o0Var = new o0(this, m0Var);
                    o0Var.d(serviceConnection, serviceConnection, str);
                    o0Var.e(str, executor);
                    this.f.put(m0Var, o0Var);
                } else {
                    this.h.removeMessages(0, m0Var);
                    if (o0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + m0Var.toString());
                    }
                    o0Var.d(serviceConnection, serviceConnection, str);
                    int a = o0Var.a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(o0Var.b(), o0Var.c());
                    } else if (a == 2) {
                        o0Var.e(str, executor);
                    }
                }
                j = o0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
