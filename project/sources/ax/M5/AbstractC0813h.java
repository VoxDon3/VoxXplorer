package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: ax.M5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0813h {
    private static final Object a = new Object();
    private static r0 b = null;
    static HandlerThread c = null;
    private static Executor d = null;
    private static boolean e = false;

    public static int b() {
        return 4225;
    }

    public static AbstractC0813h c(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new r0(context.getApplicationContext(), e ? d().getLooper() : context.getMainLooper(), d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static HandlerThread d() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return h(new m0(componentName, 4225), serviceConnection, str, executor);
    }

    public void e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        f(new m0(componentName, 4225), serviceConnection, str);
    }

    protected abstract void f(m0 m0Var, ServiceConnection serviceConnection, String str);

    public final void g(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        f(new m0(str, str2, 4225, z), serviceConnection, str3);
    }

    protected abstract boolean h(m0 m0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
