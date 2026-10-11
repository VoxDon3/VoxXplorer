package ax.K7;

import ax.J7.C0764i;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class d {
    private final Map<String, String> a = new HashMap();
    private final int b;
    private final int c;

    public d(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    public synchronized Map<String, String> a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public synchronized boolean d(String str, String str2) {
        String b = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(b)) {
            ax.G7.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String c = c(str2, this.c);
        if (C0764i.y(this.a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.a;
        if (str2 == null) {
            c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map.put(b, c);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String b = b(entry.getKey());
                if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                    i++;
                }
                String value = entry.getValue();
                this.a.put(b, value == null ? HttpUrl.FRAGMENT_ENCODE_SET : c(value, this.c));
            }
            if (i > 0) {
                ax.G7.g.f().k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
