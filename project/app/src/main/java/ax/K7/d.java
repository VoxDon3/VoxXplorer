/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.G7.g;
import ax.J7.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class d {
    private final Map<String, String> a = new HashMap<String, String>();
    private final int b;
    private final int c;

    public d(int n8, int n9) {
        this.b = n8;
        this.c = n9;
    }

    private String b(String string) {
        if (string != null) {
            return d.c(string, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String string, int n8) {
        String string2 = string;
        if (string != null) {
            string2 = string = string.trim();
            if (string.length() > n8) {
                string2 = string.substring(0, n8);
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map<String, String> a() {
        synchronized (this) {
            Map<String, String> map = new Map<String, String>(this.a);
            return java.util.DesugarCollections.unmodifiableMap(map);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(String string, String charSequence) {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block6: {
                try {
                    object = this.b(string);
                    if (this.a.size() >= this.b && !this.a.containsKey(object)) {
                        object = g.f();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("Ignored entry \"");
                        ((StringBuilder)charSequence).append(string);
                        ((StringBuilder)charSequence).append("\" when adding custom keys. Maximum allowable: ");
                        ((StringBuilder)charSequence).append(this.b);
                        ((g)object).k(((StringBuilder)charSequence).toString());
                        return false;
                    }
                    string = d.c((String)charSequence, this.c);
                    boolean bl = i.y(this.a.get(object), string);
                    if (!bl) break block6;
                }
                catch (Throwable throwable2) {}
                return false;
            }
            Map<String, String> map = this.a;
            if (charSequence == null) {
                string = "";
            }
            map.put((String)object, string);
            return true;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(Map<String, String> object) {
        synchronized (this) {
            try {
                Object object2;
                Iterator iterator = object.entrySet().iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    object = iterator.next();
                    object2 = this.b((String)object.getKey());
                    if (this.a.size() >= this.b && !this.a.containsKey(object2)) {
                        ++n8;
                        continue;
                    }
                    object = (String)object.getValue();
                    Map<String, String> map = this.a;
                    object = object == null ? "" : d.c((String)object, this.c);
                    map.put((String)object2, (String)object);
                }
                if (n8 > 0) {
                    object2 = g.f();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Ignored ");
                    ((StringBuilder)object).append(n8);
                    ((StringBuilder)object).append(" entries when adding custom keys. Maximum allowable: ");
                    ((StringBuilder)object).append(this.b);
                    ((g)object2).k(((StringBuilder)object).toString());
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

