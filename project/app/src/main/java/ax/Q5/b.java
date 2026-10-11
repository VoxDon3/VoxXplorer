/*
 * Decompiled with CFR 0.152.
 */
package ax.Q5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.M5.p;
import ax.M5.s0;
import ax.Q5.a;
import ax.R5.l;
import ax.S5.e;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

public class b {
    private static final Object b = new Object();
    private static volatile b c;
    public final j.ConcurrentHashMap a = new j.ConcurrentHashMap();

    private b() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b b() {
        Object object;
        block6: {
            if (c == null) {
                object = b;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                b b8;
                                if (c != null) break block4;
                                c = b8 = new b();
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = c;
        p.l(object);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException runtimeException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean f(Context context, String string, Intent intent, ServiceConnection serviceConnection, int n8, boolean bl, Executor executor) {
        block8: {
            ComponentName componentName = intent.getComponent();
            if (componentName != null) {
                String string2 = componentName.getPackageName();
                "com.google.android.gms".equals(string2);
                try {
                    int n9 = e.a((Context)context).b((String)string2, (int)0).flags;
                    if ((n9 & 0x200000) == 0) break block8;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    // empty catch block
                    break block8;
                }
                Log.w((String)"ConnectionTracker", (String)"Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        if (!ax.Q5.b.g(serviceConnection)) {
            return ax.Q5.b.h(context, intent, serviceConnection, n8, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w((String)"ConnectionTracker", (String)String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, string, intent.getAction()));
        }
        try {
            bl = ax.Q5.b.h(context, intent, serviceConnection, n8, executor);
            if (!bl) return false;
            return bl;
        }
        finally {
            this.a.remove((Object)serviceConnection, (Object)serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof s0);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int n8, Executor executor) {
        Executor executor2 = executor;
        if (executor == null) {
            executor2 = null;
        }
        if (l.i() && executor2 != null) {
            return ax.Q5.a.a(context, intent, n8, executor2, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n8);
    }

    @ResultIgnorabilityUnspecified
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int n8) {
        return this.f(context, context.getClass().getName(), intent, serviceConnection, n8, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (ax.Q5.b.g(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                ax.Q5.b.e(context, (ServiceConnection)this.a.get((Object)serviceConnection));
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        ax.Q5.b.e(context, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(Context context, String string, Intent intent, ServiceConnection serviceConnection, int n8, Executor executor) {
        return this.f(context, string, intent, serviceConnection, 4225, true, executor);
    }
}

