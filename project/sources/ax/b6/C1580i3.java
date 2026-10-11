package ax.b6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580i3 implements M2 {
    private static final Map<String, C1580i3> g = new ax.B.a();
    private final SharedPreferences a;
    private final Runnable b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private final Object d;
    private volatile Map<String, ?> e;
    private final List<K2> f;

    private C1580i3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ax.b6.l3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                C1580i3.this.d(sharedPreferences2, str);
            }
        };
        this.c = onSharedPreferenceChangeListener;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            if (H2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str.substring(12), 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    static C1580i3 b(Context context, String str, Runnable runnable) {
        C1580i3 c1580i3;
        if (!((!H2.a() || str.startsWith("direct_boot:")) ? true : H2.c(context))) {
            return null;
        }
        synchronized (C1580i3.class) {
            try {
                Map<String, C1580i3> map = g;
                c1580i3 = map.get(str);
                if (c1580i3 == null) {
                    c1580i3 = new C1580i3(a(context, str), runnable);
                    map.put(str, c1580i3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1580i3;
    }

    static synchronized void c() {
        synchronized (C1580i3.class) {
            try {
                for (C1580i3 c1580i3 : g.values()) {
                    c1580i3.a.unregisterOnSharedPreferenceChangeListener(c1580i3.c);
                }
                g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.d) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                Iterator<K2> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.b6.M2
    public final Object h(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                try {
                    map = this.e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.a.getAll();
                            this.e = all;
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
