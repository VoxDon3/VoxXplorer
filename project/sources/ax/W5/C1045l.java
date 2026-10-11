package ax.W5;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: ax.W5.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1045l {
    static HashMap f;
    private static Object k;
    static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    static final HashMap g = new HashMap(16, 1.0f);
    static final HashMap h = new HashMap(16, 1.0f);
    static final HashMap i = new HashMap(16, 1.0f);
    static final HashMap j = new HashMap(16, 1.0f);
    static final String[] m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C1045l.class) {
            try {
                String str3 = null;
                if (f == null) {
                    e.set(false);
                    f = new HashMap(16, 1.0f);
                    k = new Object();
                    l = false;
                    contentResolver.registerContentObserver(a, true, new C1042k(null));
                } else if (e.getAndSet(false)) {
                    f.clear();
                    g.clear();
                    h.clear();
                    i.clear();
                    j.clear();
                    k = new Object();
                    l = false;
                }
                Object obj = k;
                if (f.containsKey(str)) {
                    String str4 = (String) f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = m.length;
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        c(obj, str, null);
                        query.close();
                        return null;
                    }
                    String string = query.getString(1);
                    query.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (C1045l.class) {
            try {
                if (obj == k) {
                    f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
