/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import ax.B.a;
import ax.b6.I2;
import ax.b6.K2;
import ax.b6.L2;
import ax.b6.M2;
import ax.b6.P2;
import ax.q7.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class J2
implements M2 {
    private static final Map<Uri, J2> h = new a<Uri, J2>();
    private static final String[] i = new String[]{"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final Runnable c;
    private final ContentObserver d;
    private final Object e;
    private volatile Map<String, String> f;
    private final List<K2> g;

    private J2(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        L2 l22 = new L2(this, null);
        this.d = l22;
        this.e = new Object();
        this.g = new ArrayList<K2>();
        n.n(contentResolver);
        n.n(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable2;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)l22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static J2 a(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        synchronized (J2.class) {
            try {
                J2 j23;
                Map<Uri, J2> map = h;
                J2 j22 = j23 = map.get(uri);
                if (j23 != null) return j22;
                try {
                    j22 = new J2(contentResolver, uri, runnable2);
                }
                catch (SecurityException securityException) {
                    return j23;
                }
                try {
                    map.put(uri, j22);
                }
                catch (SecurityException securityException) {}
                return j22;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void d() {
        synchronized (J2.class) {
            Throwable throwable2;
            block5: {
                try {
                    for (J2 j22 : h.values()) {
                        j22.a.unregisterContentObserver(j22.d);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                h.clear();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Map<String, String> f() {
        Throwable throwable2222222;
        StrictMode.ThreadPolicy threadPolicy;
        block4: {
            threadPolicy = StrictMode.allowThreadDiskReads();
            Object object = new I2(this);
            object = (Map)P2.a(object);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (SQLiteException | IllegalStateException | SecurityException throwable3) {}
                {
                    Log.e((String)"ConfigurationContentLdr", (String)"PhenotypeFlag unable to load ContentProvider, using default values");
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return null;
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map<String, String> b() {
        Map<String, String> map;
        block7: {
            Map<String, String> map2;
            map = map2 = this.f;
            if (map2 == null) {
                Object object = this.e;
                synchronized (object) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                map = map2 = this.f;
                                if (map2 != null) break block5;
                                this.f = map = this.f();
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final /* synthetic */ Map c() {
        Throwable throwable2;
        Cursor cursor;
        block6: {
            int n8;
            block5: {
                Map map;
                cursor = this.a.query(this.b, i, null, null, null);
                if (cursor == null) {
                    return Collections.EMPTY_MAP;
                }
                try {
                    n8 = cursor.getCount();
                    if (n8 != 0) break block5;
                    map = Collections.EMPTY_MAP;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                cursor.close();
                return map;
            }
            Map<String, String> map = n8 <= 256 ? new Map<String, String>(n8) : new HashMap(n8, 1.0f);
            {
                while (cursor.moveToNext()) {
                    map.put(cursor.getString(0), cursor.getString(1));
                }
            }
            cursor.close();
            return map;
        }
        cursor.close();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Iterator<K2> iterator = this.e;
        synchronized (iterator) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                iterator = this.g.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    iterator.next().a();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final /* synthetic */ Object h(String string) {
        return this.b().get(string);
    }
}

