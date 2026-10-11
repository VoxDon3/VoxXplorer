/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import ax.B.a;
import ax.b6.H2;
import ax.b6.K2;
import ax.b6.M2;
import ax.b6.l3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class i3
implements M2 {
    private static final Map<String, i3> g = new a<String, i3>();
    private final SharedPreferences a;
    private final Runnable b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private final Object d;
    private volatile Map<String, ?> e;
    private final List<K2> f;

    private i3(SharedPreferences sharedPreferences, Runnable runnable2) {
        l3 l32 = new l3(this);
        this.c = l32;
        this.d = new Object();
        this.f = new ArrayList<K2>();
        this.a = sharedPreferences;
        this.b = runnable2;
        sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)l32);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static SharedPreferences a(Context context, String string) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block5: {
            block4: {
                threadPolicy = StrictMode.allowThreadDiskReads();
                try {
                    if (!string.startsWith("direct_boot:")) break block4;
                    Context context2 = context;
                    if (H2.a()) {
                        context2 = ax.g2.a.a(context);
                    }
                    context = context2.getSharedPreferences(string.substring(12), 0);
                }
                catch (Throwable throwable2) {}
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return context;
            }
            context = context.getSharedPreferences(string, 0);
            break block5;
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return context;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static i3 b(Context context, String string, Runnable runnable2) {
        boolean bl = H2.a() && !string.startsWith("direct_boot:") ? H2.c(context) : true;
        if (!bl) {
            return null;
        }
        synchronized (i3.class) {
            Throwable throwable2;
            block5: {
                i3 i32;
                block4: {
                    try {
                        i3 i33;
                        Map<String, i3> map = g;
                        i32 = i33 = map.get(string);
                        if (i33 != null) break block4;
                        i32 = new i3(i3.a(context, string), runnable2);
                        map.put(string, i32);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return i32;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c() {
        synchronized (i3.class) {
            Throwable throwable2;
            block5: {
                try {
                    for (i3 i32 : g.values()) {
                        i32.a.unregisterOnSharedPreferenceChangeListener(i32.c);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                g.clear();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final /* synthetic */ void d(SharedPreferences object, String string) {
        object = this.d;
        synchronized (object) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                object = this.f.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        return;
                    }
                    ((K2)object.next()).a();
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
    @Override
    public final Object h(String string) {
        Object object;
        block8: {
            StrictMode.ThreadPolicy threadPolicy;
            object = threadPolicy = this.e;
            if (threadPolicy != null) break block8;
            Object object2 = this.d;
            synchronized (object2) {
                Throwable throwable2;
                block9: {
                    block7: {
                        try {
                            object = threadPolicy = this.e;
                            if (threadPolicy != null) break block7;
                            threadPolicy = StrictMode.allowThreadDiskReads();
                        }
                        catch (Throwable throwable2) {}
                        try {
                            this.e = object = this.a.getAll();
                        }
                        catch (Throwable throwable3) {
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                            throw throwable3;
                        }
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                        break block7;
                        break block9;
                    }
                    break block8;
                }
                throw throwable2;
            }
        }
        if (object != null) {
            return object.get(string);
        }
        return null;
    }
}

