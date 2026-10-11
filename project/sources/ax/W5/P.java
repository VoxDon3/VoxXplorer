package ax.W5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class P implements InterfaceC1077w {
    private static final Map b = new ax.B.a();
    private final SharedPreferences a;

    static P b(Context context, String str, Runnable runnable) {
        P p;
        if (C1051n.b()) {
            throw null;
        }
        synchronized (P.class) {
            try {
                p = (P) b.get(null);
                if (p == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p;
    }

    static synchronized void c() {
        synchronized (P.class) {
            Map map = b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((P) it.next()).a;
                throw null;
            }
            map.clear();
        }
    }

    @Override // ax.W5.InterfaceC1077w
    public final Object a(String str) {
        throw null;
    }
}
