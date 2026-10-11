package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class o0 implements ServiceConnection, s0 {
    private boolean d0;
    private IBinder e0;
    private final m0 f0;
    private ComponentName g0;
    final /* synthetic */ r0 h0;
    private final Map q = new HashMap();
    private int c0 = 2;

    public o0(r0 r0Var, m0 m0Var) {
        this.h0 = r0Var;
        this.f0 = m0Var;
    }

    public final int a() {
        return this.c0;
    }

    public final ComponentName b() {
        return this.g0;
    }

    public final IBinder c() {
        return this.e0;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.q.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        ax.Q5.b bVar;
        Context context;
        m0 m0Var;
        Context context2;
        ax.Q5.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.c0 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (ax.R5.l.k()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            r0 r0Var = this.h0;
            bVar = r0Var.j;
            context = r0Var.g;
            m0Var = this.f0;
            context2 = r0Var.g;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean d = bVar.d(context, str, m0Var.b(context2), this, 4225, executor);
            this.d0 = d;
            if (d) {
                handler = this.h0.h;
                Message obtainMessage = handler.obtainMessage(1, this.f0);
                handler2 = this.h0.h;
                j = this.h0.l;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.c0 = 2;
                try {
                    r0 r0Var2 = this.h0;
                    bVar2 = r0Var2.j;
                    context3 = r0Var2.g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.q.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        ax.Q5.b bVar;
        Context context;
        m0 m0Var = this.f0;
        handler = this.h0.h;
        handler.removeMessages(1, m0Var);
        r0 r0Var = this.h0;
        bVar = r0Var.j;
        context = r0Var.g;
        bVar.c(context, this);
        this.d0 = false;
        this.c0 = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.q.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.q.isEmpty();
    }

    public final boolean j() {
        return this.d0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.h0.f;
        synchronized (hashMap) {
            try {
                handler = this.h0.h;
                handler.removeMessages(1, this.f0);
                this.e0 = iBinder;
                this.g0 = componentName;
                Iterator it = this.q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.c0 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.h0.f;
        synchronized (hashMap) {
            try {
                handler = this.h0.h;
                handler.removeMessages(1, this.f0);
                this.e0 = null;
                this.g0 = componentName;
                Iterator it = this.q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.c0 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
