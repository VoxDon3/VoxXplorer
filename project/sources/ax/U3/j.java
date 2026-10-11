package ax.U3;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {
    private final Map<String, List<i>> c;
    private volatile Map<String, String> d;

    public static final class a {
        private static final String d;
        private static final Map<String, List<i>> e;
        private boolean a = true;
        private Map<String, List<i>> b = e;
        private boolean c = true;

        static {
            String property = System.getProperty("http.agent");
            d = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            e = DesugarCollections.unmodifiableMap(hashMap);
        }

        public j a() {
            this.a = true;
            return new j(this.b);
        }
    }

    static final class b implements i {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // ax.U3.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    j(Map<String, List<i>> map) {
        this.c = DesugarCollections.unmodifiableMap(map);
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<i> value = entry.getValue();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String a2 = value.get(i).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                hashMap.put(entry.getKey(), sb.toString());
            }
        }
        return hashMap;
    }

    @Override // ax.U3.h
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = DesugarCollections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.c.equals(((j) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }
}
