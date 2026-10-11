/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import ax.W5.k;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class l {
    public static final Uri a = Uri.parse((String)"content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse((String)"content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    static HashMap f;
    static final HashMap g;
    static final HashMap h;
    static final HashMap i;
    static final HashMap j;
    private static Object k;
    static boolean l;
    static final String[] m;

    static {
        g = new HashMap(16, 1.0f);
        h = new HashMap(16, 1.0f);
        i = new HashMap(16, 1.0f);
        j = new HashMap(16, 1.0f);
        m = new String[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String a(ContentResolver object, String string, String string2) {
        Throwable throwable222;
        block16: {
            Object object2;
            block15: {
                block14: {
                    block13: {
                        // MONITORENTER : ax.W5.l.class
                        object2 = f;
                        string2 = null;
                        if (object2 != null) break block13;
                        e.set(false);
                        f = object2 = new HashMap(16, 1.0f);
                        k = object2 = new Object();
                        l = false;
                        Uri uri = a;
                        object2 = new k(null);
                        object.registerContentObserver(uri, true, (ContentObserver)object2);
                        break block14;
                    }
                    if (e.getAndSet(false)) {
                        f.clear();
                        g.clear();
                        h.clear();
                        i.clear();
                        j.clear();
                        k = object2 = new Object();
                        l = false;
                    }
                }
                object2 = k;
                if (f.containsKey(string)) {
                    object = (String)f.get(string);
                    if (object == null) {
                        object = string2;
                    }
                    // MONITOREXIT : ax.W5.l.class
                    return object;
                }
                int n8 = m.length;
                // MONITOREXIT : ax.W5.l.class
                object = object.query(a, null, null, new String[]{string}, null);
                if (object == null) {
                    return null;
                }
                try {
                    if (object.moveToFirst()) break block15;
                    ax.W5.l.c(object2, string, null);
                }
                catch (Throwable throwable222) {}
                object.close();
                return null;
            }
            string2 = object.getString(1);
            break block16;
            object.close();
            object = string2;
            if (string2 != null) {
                object = string2;
                if (string2.equals(null)) {
                    object = null;
                }
            }
            ax.W5.l.c(object2, string, (String)object);
            if (object == null) return null;
            return object;
        }
        object.close();
        throw throwable222;
    }

    static /* bridge */ /* synthetic */ AtomicBoolean b() {
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(Object object, String string, String string2) {
        synchronized (l.class) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (object != k) break block3;
                        f.put(string, string2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

