package ax.b6;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class J2 implements M2 {
    private static final Map<Uri, J2> h = new ax.B.a();
    private static final String[] i = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final Runnable c;
    private final ContentObserver d;
    private final Object e;
    private volatile Map<String, String> f;
    private final List<K2> g;

    private J2(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        L2 l2 = new L2(this, null);
        this.d = l2;
        this.e = new Object();
        this.g = new ArrayList();
        ax.q7.n.n(contentResolver);
        ax.q7.n.n(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, l2);
    }

    public static J2 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        J2 j2;
        synchronized (J2.class) {
            Map<Uri, J2> map = h;
            j2 = map.get(uri);
            if (j2 == null) {
                try {
                    J2 j22 = new J2(contentResolver, uri, runnable);
                    try {
                        map.put(uri, j22);
                    } catch (SecurityException unused) {
                    }
                    j2 = j22;
                } catch (SecurityException unused2) {
                }
            }
        }
        return j2;
    }

    static synchronized void d() {
        synchronized (J2.class) {
            try {
                for (J2 j2 : h.values()) {
                    j2.a.unregisterContentObserver(j2.d);
                }
                h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final Map<String, String> f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) P2.a(new O2() { // from class: ax.b6.I2
                    @Override // ax.b6.O2
                    public final Object a() {
                        return J2.this.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.f;
        if (map == null) {
            synchronized (this.e) {
                try {
                    map = this.f;
                    if (map == null) {
                        map = f();
                        this.f = map;
                    }
                } finally {
                }
            }
        }
        return map != null ? map : Collections.EMPTY_MAP;
    }

    final /* synthetic */ Map c() {
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map aVar = count <= 256 ? new ax.B.a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                Iterator<K2> it = this.g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.b6.M2
    public final /* synthetic */ Object h(String str) {
        return b().get(str);
    }
}
