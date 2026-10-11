/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import ax.B.a;
import ax.W5.n;
import ax.W5.w;
import java.util.Iterator;
import java.util.Map;

public final class P
implements w {
    private static final Map b = new a();
    private final SharedPreferences a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static P b(Context object, String string, Runnable runnable2) {
        if (n.b()) {
            throw null;
        }
        synchronized (P.class) {
            Throwable throwable22222;
            block8: {
                object = (P)b.get(null);
                if (object != null) {
                    return object;
                }
                {
                    catch (Throwable throwable22222) {
                        break block8;
                    }
                    string = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    }
                    catch (Throwable throwable3) {}
                    {
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)string);
                        throw throwable3;
                    }
                }
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c() {
        synchronized (P.class) {
            Throwable throwable2;
            Iterator iterator;
            Map map;
            block4: {
                try {
                    map = b;
                    iterator = map.values().iterator();
                    if (iterator.hasNext()) break block4;
                    map.clear();
                }
                catch (Throwable throwable2) {}
                return;
            }
            map = ((P)iterator.next()).a;
            throw null;
            throw throwable2;
        }
    }

    @Override
    public final Object a(String string) {
        throw null;
    }
}

