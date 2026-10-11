/*
 * Decompiled with CFR 0.152.
 */
package ax.g6;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import ax.J5.i;
import ax.J5.j;
import ax.J5.k;
import ax.J5.m;
import ax.M5.p;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

public class a {
    private static final i a = i.f();
    private static final Object b = new Object();
    private static Method c = null;
    private static Method d = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context object) throws k, j {
        p.m(object, "Context must not be null");
        a.k((Context)object, 11925000);
        Object object2 = b;
        synchronized (object2) {
            Throwable throwable2;
            block10: {
                Context context;
                block13: {
                    long l8;
                    try {
                        l8 = SystemClock.elapsedRealtime();
                        try {
                            context = DynamiteModule.e(object, DynamiteModule.f, "com.google.android.gms.providerinstaller.dynamite").b();
                        }
                        catch (DynamiteModule.a a8) {
                            Log.w((String)"ProviderInstaller", (String)"Failed to load providerinstaller module: ".concat(String.valueOf(a8.getMessage())));
                            context = null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    if (context != null) {
                        ax.g6.a.c(context, object, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                        return;
                    }
                    long l9 = SystemClock.elapsedRealtime();
                    context = m.d(object);
                    if (context != null) {
                        Exception exception2;
                        block12: {
                            block11: {
                                try {
                                    if (d != null) break block11;
                                    Class<Long> clazz = Long.TYPE;
                                    d = ax.g6.a.b(context, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, clazz, clazz});
                                }
                                catch (Exception exception2) {
                                    break block12;
                                }
                            }
                            d.invoke(null, object, l8, l9);
                            break block13;
                        }
                        Log.w((String)"ProviderInstaller", (String)"Failed to report request stats: ".concat(String.valueOf(exception2.getMessage())));
                    }
                }
                if (context != null) {
                    ax.g6.a.c(context, object, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                }
                Log.e((String)"ProviderInstaller", (String)"Failed to get remote context");
                object = new j(8);
                throw object;
            }
            throw throwable2;
        }
    }

    private static Method b(Context context, String string, String string2, Class[] classArray) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(string).getMethod(string2, classArray);
    }

    private static void c(Context object, Context context, String string) throws j {
        try {
            if (c == null) {
                c = ax.g6.a.b((Context)object, string, "insertProvider", new Class[]{Context.class});
            }
            c.invoke(null, object);
            return;
        }
        catch (Exception exception) {
            object = exception.getCause();
            if (Log.isLoggable((String)"ProviderInstaller", (int)6)) {
                object = object == null ? exception.getMessage() : ((Throwable)object).getMessage();
                Log.e((String)"ProviderInstaller", (String)"Failed to install provider: ".concat(String.valueOf(object)));
            }
            throw new j(8);
        }
    }
}

