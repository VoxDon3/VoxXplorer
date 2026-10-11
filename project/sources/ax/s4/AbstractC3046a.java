package ax.s4;

import ax.w4.C3343c;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3046a {
    public static final long a = TimeUnit.SECONDS.toMillis(20);
    public static final long b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: ax.s4.a$a, reason: collision with other inner class name */
    public static final class C0448a {
        private final String a;
        private final String b;

        public C0448a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    /* renamed from: ax.s4.a$b */
    public static final class b {
        private final int a;
        private final InputStream b;
        private final Map<String, List<String>> c;

        public b(int i, InputStream inputStream, Map<String, ? extends List<String>> map) {
            this.a = i;
            this.b = inputStream;
            this.c = a(map);
        }

        private static final Map<String, List<String>> a(Map<String, ? extends List<String>> map) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getKey().trim().length() != 0) {
                    treeMap.put(entry.getKey(), DesugarCollections.unmodifiableList(entry.getValue()));
                }
            }
            return DesugarCollections.unmodifiableMap(treeMap);
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

    /* renamed from: ax.s4.a$c */
    public static abstract class c {
        public abstract void a();

        public abstract b b() throws IOException;

        public abstract OutputStream c();

        public abstract void d(C3343c.d dVar);

        public void e(InputStream inputStream) throws IOException {
            OutputStream c = c();
            try {
                C3343c.c(inputStream, c);
            } finally {
                c.close();
            }
        }

        public void f(byte[] bArr) throws IOException {
            OutputStream c = c();
            try {
                c.write(bArr);
            } finally {
                c.close();
            }
        }
    }

    public abstract c a(String str, Iterable<C0448a> iterable) throws IOException;

    public abstract c b(String str, Iterable<C0448a> iterable) throws IOException;
}
