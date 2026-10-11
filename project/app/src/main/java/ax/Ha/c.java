/*
 * Decompiled with CFR 0.152.
 */
package ax.Ha;

import android.content.Context;
import android.content.pm.PackageManager;
import ax.Ha.a;
import ax.Ha.b;
import com.socialnmobile.commons.reporter.ReporterService;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.logging.Logger;

public class c {
    protected static final Logger c = Logger.getLogger("snmcommons.Reporter");
    private static final Object d = new Object();
    private static c e;
    private static c f;
    private static boolean g;
    private Context a;
    private String b;

    static {
        g = true;
    }

    public c(a a8) {
    }

    static c b(Context context, String string, String string2, boolean bl) throws PackageManager.NameNotFoundException {
        return ax.Ha.c.c("BACKUPINIT", 0, "0.0", string, string2, bl);
    }

    public static c c(String string, int n8, String string2, String string3, String string4, boolean bl) {
        return new c(null);
    }

    public static c d() {
        return ax.Ha.c.e(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c e(Context object) {
        Object object2 = d;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                c c8;
                try {
                    c8 = e;
                    if (c8 != null) {
                        return c8;
                    }
                    ax.Ha.c.g();
                    c8 = e;
                    if (c8 != null) {
                        return c8;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                c8 = f;
                if (c8 != null) return f;
                try {
                    f = ax.Ha.c.b(object, "backup", "", true);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return f;
                }
                return f;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c f(String string, int n8, String string2, String string3, String string4, boolean bl) {
        Object object = d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (e != null) break block3;
                        e = ax.Ha.c.c(string, n8, string2, string3, string4, bl);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return e;
            }
            throw throwable2;
        }
    }

    public static boolean g() {
        Thread.currentThread().setContextClassLoader(ReporterService.class.getClassLoader());
        Iterator<ReporterService> iterator = ServiceLoader.load(ReporterService.class).iterator();
        int n8 = 0;
        boolean bl = false;
        while (iterator.hasNext()) {
            iterator.next().initializeService();
            bl = true;
        }
        if (!bl) {
            while (n8 < 5) {
                c.severe("REPORTER CANNOT FIND REPORTER SERVICE IMPL!!!!!");
                ++n8;
            }
        }
        return bl;
    }

    public static b h() {
        return ax.Ha.c.d().a();
    }

    public static b i(Context context) {
        return ax.Ha.c.e(context).a();
    }

    public static void k(boolean bl) {
        g = bl;
    }

    public b a() {
        b b8 = new b(null);
        b8.i(false);
        return b8;
    }

    public void j(Context context) {
        this.a = context;
    }

    public void l(String string) {
        this.b = string;
    }
}

