package ax.Ha;

import android.content.Context;
import android.content.pm.PackageManager;
import com.socialnmobile.commons.reporter.ReporterService;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class c {
    private static c e;
    private static c f;
    private Context a;
    private String b;
    protected static final Logger c = Logger.getLogger("snmcommons.Reporter");
    private static final Object d = new Object();
    private static boolean g = true;

    public c(a aVar) {
    }

    static c b(Context context, String str, String str2, boolean z) throws PackageManager.NameNotFoundException {
        return c("BACKUPINIT", 0, "0.0", str, str2, z);
    }

    public static c c(String str, int i, String str2, String str3, String str4, boolean z) {
        return new c(null);
    }

    public static c d() {
        return e(null);
    }

    public static c e(Context context) {
        synchronized (d) {
            try {
                c cVar = e;
                if (cVar != null) {
                    return cVar;
                }
                g();
                c cVar2 = e;
                if (cVar2 != null) {
                    return cVar2;
                }
                if (f == null) {
                    try {
                        f = b(context, "backup", HttpUrl.FRAGMENT_ENCODE_SET, true);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static c f(String str, int i, String str2, String str3, String str4, boolean z) {
        synchronized (d) {
            try {
                if (e == null) {
                    e = c(str, i, str2, str3, str4, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    public static boolean g() {
        Thread.currentThread().setContextClassLoader(ReporterService.class.getClassLoader());
        Iterator it = ServiceLoader.load(ReporterService.class).iterator();
        boolean z = false;
        while (it.hasNext()) {
            ((ReporterService) it.next()).initializeService();
            z = true;
        }
        if (!z) {
            for (int i = 0; i < 5; i++) {
                c.severe("REPORTER CANNOT FIND REPORTER SERVICE IMPL!!!!!");
            }
        }
        return z;
    }

    public static b h() {
        return d().a();
    }

    public static b i(Context context) {
        return e(context).a();
    }

    public static void k(boolean z) {
        g = z;
    }

    public b a() {
        b bVar = new b(null);
        bVar.i(false);
        return bVar;
    }

    public void j(Context context) {
        this.a = context;
    }

    public void l(String str) {
        this.b = str;
    }
}
