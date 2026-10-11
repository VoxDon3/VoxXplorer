/*
 * Decompiled with CFR 0.152.
 */
package ax.s4;

import ax.w4.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public abstract class a {
    public static final long a = TimeUnit.SECONDS.toMillis(20L);
    public static final long b = TimeUnit.MINUTES.toMillis(2L);

    public abstract c a(String var1, Iterable<a> var2) throws IOException;

    public abstract c b(String var1, Iterable<a> var2) throws IOException;

    public static final class a {
        private final String a;
        private final String b;

        public a(String string, String string2) {
            this.a = string;
            this.b = string2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static final class b {
        private final int a;
        private final InputStream b;
        private final Map<String, List<String>> c;

        public b(int n8, InputStream inputStream, Map<String, ? extends List<String>> map) {
            this.a = n8;
            this.b = inputStream;
            this.c = ax.s4.a$b.a(map);
        }

        private static final Map<String, List<String>> a(Map<String, ? extends List<String>> entry2) {
            TreeMap<String, List> treeMap = new TreeMap<String, List>(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, ? extends List<String>> entry2 : entry2.entrySet()) {
                if (entry2.getKey() == null || ((String)entry2.getKey()).trim().length() == 0) continue;
                treeMap.put((String)entry2.getKey(), java.util.DesugarCollections.unmodifiableList((List)((List)entry2.getValue())));
            }
            return java.util.DesugarCollections.unmodifiableMap(treeMap);
        }

        public InputStream b() {
            return this.b;
        }

        public Map<String, List<String>> c() {
            return this.c;
        }

        public int d() {
            return this.a;
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract b b() throws IOException;

        public abstract OutputStream c();

        public abstract void d(c.d var1);

        public void e(InputStream inputStream) throws IOException {
            OutputStream outputStream = this.c();
            try {
                ax.w4.c.c(inputStream, outputStream);
                return;
            }
            finally {
                outputStream.close();
            }
        }

        public void f(byte[] byArray) throws IOException {
            OutputStream outputStream = this.c();
            try {
                outputStream.write(byArray);
                return;
            }
            finally {
                outputStream.close();
            }
        }
    }
}

