package ax.W5;

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
public final class r implements InterfaceC1077w {
    private static final Map h = new ax.B.a();
    public static final String[] i = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final Runnable c;
    private final ContentObserver d;
    private final Object e;
    private volatile Map f;
    private final List g;

    private r(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1060q c1060q = new C1060q(this, null);
        this.d = c1060q;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, c1060q);
    }

    public static r b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        r rVar;
        synchronized (r.class) {
            Map map = h;
            rVar = (r) map.get(uri);
            if (rVar == null) {
                try {
                    r rVar2 = new r(contentResolver, uri, runnable);
                    try {
                        map.put(uri, rVar2);
                    } catch (SecurityException unused) {
                    }
                    rVar = rVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return rVar;
    }

    static synchronized void d() {
        synchronized (r.class) {
            try {
                for (r rVar : h.values()) {
                    rVar.a.unregisterContentObserver(rVar.d);
                }
                h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.W5.InterfaceC1077w
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2;
        Map map3 = this.f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.e) {
                Map map5 = this.f;
                if (map5 != null) {
                    map2 = map5;
                } else {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) C1071u.a(new InterfaceC1074v() { // from class: ax.W5.p
                                @Override // ax.W5.InterfaceC1074v
                                public final Object a() {
                                    return r.this.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        }
                        this.f = map;
                        allowThreadDiskReads = map;
                        map2 = allowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
            map4 = map2;
        }
        if (map4 == null) {
            map4 = Collections.EMPTY_MAP;
        }
        return (String) map4.get(str);
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
            O.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1065s) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
