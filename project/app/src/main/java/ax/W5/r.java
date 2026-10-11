/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import ax.B.a;
import ax.W5.O;
import ax.W5.q;
import ax.W5.s;
import ax.W5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r
implements w {
    private static final Map h = new a();
    public static final String[] i = new String[]{"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final Runnable c;
    private final ContentObserver d;
    private final Object e;
    private volatile Map f;
    private final List g;

    private r(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        q q8 = new q(this, null);
        this.d = q8;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable2;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)q8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r b(ContentResolver contentResolver, Uri uri, Runnable runnable2) {
        synchronized (r.class) {
            try {
                r r9;
                Map map = h;
                r r8 = r9 = (r)map.get(uri);
                if (r9 != null) return r8;
                try {
                    r8 = new r(contentResolver, uri, runnable2);
                }
                catch (SecurityException securityException) {
                    return r9;
                }
                try {
                    map.put(uri, r8);
                }
                catch (SecurityException securityException) {}
                return r8;
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
        synchronized (r.class) {
            Throwable throwable2;
            block5: {
                try {
                    for (r r8 : h.values()) {
                        r8.a.unregisterContentObserver(r8.d);
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
        Iterator iterator = this.e;
        synchronized (iterator) {
            this.f = null;
            O.c();
        }
        synchronized (this) {
            try {
                iterator = this.g.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    ((s)iterator.next()).a();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

