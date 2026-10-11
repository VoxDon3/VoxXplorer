/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import ax.M5.m0;
import ax.M5.r0;
import java.util.concurrent.Executor;

public abstract class h {
    private static final Object a = new Object();
    private static r0 b;
    static HandlerThread c;
    private static Executor d;
    private static boolean e = false;

    public static int b() {
        return 4225;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h c(Context context) {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    r0 r02;
                    Context context2;
                    try {
                        if (b == null) {
                            context2 = context.getApplicationContext();
                            context = e ? h.d().getLooper() : context.getMainLooper();
                        }
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    b = r02 = new r0(context2, (Looper)context, d);
                }
                return b;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HandlerThread d() {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                HandlerThread handlerThread;
                try {
                    handlerThread = c;
                    if (handlerThread != null) {
                        return handlerThread;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                c = handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                return c;
            }
            throw throwable2;
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String string, Executor executor) {
        return this.h(new m0(componentName, 4225), serviceConnection, string, executor);
    }

    public void e(ComponentName componentName, ServiceConnection serviceConnection, String string) {
        this.f(new m0(componentName, 4225), serviceConnection, string);
    }

    protected abstract void f(m0 var1, ServiceConnection var2, String var3);

    public final void g(String string, String string2, int n8, ServiceConnection serviceConnection, String string3, boolean bl) {
        this.f(new m0(string, string2, 4225, bl), serviceConnection, string3);
    }

    protected abstract boolean h(m0 var1, ServiceConnection var2, String var3, Executor var4);
}

