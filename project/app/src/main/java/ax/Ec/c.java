/*
 * Decompiled with CFR 0.152.
 */
package ax.Ec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class c {
    private final Map<String, String> a = new HashMap<String, String>();
    private final Map<String, String> b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public c(Map<String, String> object, String string) {
        this.b = java.util.DesugarCollections.unmodifiableMap(object);
        Iterator<Map.Entry<String, String>> iterator = object.entrySet().iterator();
        int n8 = Integer.MIN_VALUE;
        int n9 = Integer.MIN_VALUE;
        int n10 = Integer.MAX_VALUE;
        int n11 = Integer.MAX_VALUE;
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            int n12 = entry.getKey().length();
            int n13 = n8;
            if (n12 > n8) {
                n13 = n12;
            }
            int n14 = n10;
            if (n12 < n10) {
                n14 = n12;
            }
            object = entry.getValue();
            int n15 = ((String)object).length();
            n8 = n13;
            n10 = n14;
            if (n15 <= 0) continue;
            if (!this.a.containsKey(object)) {
                this.a.put((String)object, entry.getKey());
            }
            n12 = n9;
            if (n15 > n9) {
                n12 = n15;
            }
            n8 = n13;
            n9 = n12;
            n10 = n14;
            if (n15 >= n11) continue;
            n11 = n15;
            n8 = n13;
            n9 = n12;
            n10 = n14;
        }
        this.c = n8;
        this.e = n9;
        this.d = n10;
        this.f = n11;
        this.g = string;
    }

    public String a(String string) {
        CharSequence charSequence = string.toLowerCase(Locale.ENGLISH);
        int n8 = ((String)charSequence).length();
        for (int i8 = this.d; i8 <= this.c && i8 < n8; ++i8) {
            Object object = this.b;
            int n9 = n8 - i8;
            if ((object = object.get(((String)charSequence).substring(n9))) == null) continue;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string.substring(0, n9));
            ((StringBuilder)charSequence).append((String)object);
            return ((StringBuilder)charSequence).toString();
        }
        return string;
    }
}

