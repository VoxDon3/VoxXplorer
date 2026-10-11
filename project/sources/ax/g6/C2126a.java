package ax.g6;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import ax.J5.C0748i;
import ax.J5.C0749j;
import ax.J5.C0750k;
import ax.J5.C0752m;
import ax.M5.C0821p;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: ax.g6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2126a {
    private static final C0748i a = C0748i.f();
    private static final Object b = new Object();
    private static Method c = null;
    private static Method d = null;

    public static void a(Context context) throws C0750k, C0749j {
        Context context2;
        C0821p.m(context, "Context must not be null");
        a.k(context, 11925000);
        synchronized (b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context d2 = C0752m.d(context);
            if (d2 != null) {
                try {
                    if (d == null) {
                        Class cls = Long.TYPE;
                        d = b(d2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e2) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (d2 != null) {
                c(d2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C0749j(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) throws C0749j {
        try {
            if (c == null) {
                c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new C0749j(8);
        }
    }
}
