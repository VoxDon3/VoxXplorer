/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import ax.M5.m0;
import ax.M5.n0;
import ax.M5.r0;
import ax.M5.s0;
import ax.Q5.b;
import ax.R5.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

final class o0
implements ServiceConnection,
s0 {
    private int c0;
    private boolean d0;
    private IBinder e0;
    private final m0 f0;
    private ComponentName g0;
    final r0 h0;
    private final Map q;

    public o0(r0 r02, m0 m02) {
        this.h0 = r02;
        this.f0 = m02;
        this.q = new HashMap();
        this.c0 = 2;
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

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String string) {
        this.q.put(serviceConnection, serviceConnection2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String object, Executor executor) {
        StrictMode.VmPolicy vmPolicy;
        block8: {
            RuntimeException var1_3;
            block9: {
                block7: {
                    Context context;
                    b b8;
                    r0 r02;
                    this.c0 = 3;
                    vmPolicy = StrictMode.getVmPolicy();
                    if (l.k()) {
                        StrictMode.setVmPolicy((StrictMode.VmPolicy)n0.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
                    }
                    try {
                        r02 = this.h0;
                        b8 = r0.l(r02);
                        context = r0.j(r02);
                        r02 = this.f0.b(r0.j(r02));
                    }
                    catch (Throwable throwable) {}
                    try {
                        boolean bl;
                        this.d0 = bl = b8.d(context, (String)object, (Intent)r02, this, 4225, executor);
                        if (!bl) break block7;
                        object = r0.k(this.h0).obtainMessage(1, (Object)this.f0);
                        r0.k(this.h0).sendMessageDelayed((Message)object, r0.i(this.h0));
                        break block8;
                    }
                    catch (Throwable throwable) {
                        break block9;
                    }
                }
                this.c0 = 2;
                try {
                    object = this.h0;
                    r0.l((r0)object).c(r0.j((r0)object), this);
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {}
            }
            StrictMode.setVmPolicy((StrictMode.VmPolicy)vmPolicy);
            throw var1_3;
        }
        StrictMode.setVmPolicy((StrictMode.VmPolicy)vmPolicy);
    }

    public final void f(ServiceConnection serviceConnection, String string) {
        this.q.remove(serviceConnection);
    }

    public final void g(String object) {
        object = this.f0;
        r0.k(this.h0).removeMessages(1, object);
        object = this.h0;
        r0.l((r0)object).c(r0.j((r0)object), this);
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

    public final void onBindingDied(ComponentName componentName) {
        this.onServiceDisconnected(componentName);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap = r0.m(this.h0);
        synchronized (hashMap) {
            try {
                r0.k(this.h0).removeMessages(1, (Object)this.f0);
                this.e0 = iBinder;
                this.g0 = componentName;
                Iterator iterator = this.q.values().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.c0 = 1;
                        return;
                    }
                    ((ServiceConnection)iterator.next()).onServiceConnected(componentName, iBinder);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap = r0.m(this.h0);
        synchronized (hashMap) {
            try {
                r0.k(this.h0).removeMessages(1, (Object)this.f0);
                this.e0 = null;
                this.g0 = componentName;
                Iterator iterator = this.q.values().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.c0 = 2;
                        return;
                    }
                    ((ServiceConnection)iterator.next()).onServiceDisconnected(componentName);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

