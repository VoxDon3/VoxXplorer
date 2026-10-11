/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.text.TextUtils;
import ax.U3.h;
import ax.U3.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j
implements h {
    private final Map<String, List<i>> c;
    private volatile Map<String, String> d;

    j(Map<String, List<i>> map) {
        this.c = java.util.DesugarCollections.unmodifiableMap(map);
    }

    private Map<String, String> b() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Map.Entry<String, List<i>> entry : this.c.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            List<i> list = entry.getValue();
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string = list.get(i8).a();
                if (TextUtils.isEmpty((CharSequence)string)) continue;
                stringBuilder.append(string);
                if (i8 == list.size() - 1) continue;
                stringBuilder.append(',');
            }
            if (TextUtils.isEmpty((CharSequence)stringBuilder.toString())) continue;
            hashMap.put(entry.getKey(), stringBuilder.toString());
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Map<String, String> a() {
        if (this.d != null) return this.d;
        synchronized (this) {
            try {
                if (this.d != null) return this.d;
                this.d = java.util.DesugarCollections.unmodifiableMap(this.b());
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean equals(Object object) {
        if (object instanceof j) {
            object = (j)object;
            return this.c.equals(((j)object).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LazyHeaders{headers=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a {
        private static final String d;
        private static final Map<String, List<i>> e;
        private boolean a = true;
        private Map<String, List<i>> b = e;
        private boolean c = true;

        static {
            String string;
            d = string = System.getProperty("http.agent");
            HashMap<String, List<b>> hashMap = new HashMap<String, List<b>>(2);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(string)));
            }
            e = java.util.DesugarCollections.unmodifiableMap(hashMap);
        }

        public j a() {
            this.a = true;
            return new j(this.b);
        }
    }

    static final class b
    implements i {
        private final String a;

        b(String string) {
            this.a = string;
        }

        @Override
        public String a() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                object = (b)object;
                return this.a.equals(((b)object).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("StringHeaderFactory{value='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }
}

