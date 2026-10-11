/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import ax.P0.z;
import ax.S0.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class k {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    static {
        z.a("media3.datasource");
    }

    private k(Uri uri, long l8, int n8, byte[] byArray, Map<String, String> map, long l9, long l10, String string, int n9, Object object) {
        boolean bl;
        long l11;
        block5: {
            block4: {
                l11 = l8 + l9;
                boolean bl2 = false;
                bl = l11 >= 0L;
                ax.S0.a.a(bl);
                bl = l9 >= 0L;
                ax.S0.a.a(bl);
                if (l10 > 0L) break block4;
                bl = bl2;
                if (l10 != -1L) break block5;
            }
            bl = true;
        }
        ax.S0.a.a(bl);
        this.a = ax.S0.a.e(uri);
        this.b = l8;
        this.c = n8;
        if (byArray == null || byArray.length == 0) {
            byArray = null;
        }
        this.d = byArray;
        this.e = java.util.DesugarCollections.unmodifiableMap(new HashMap<String, String>(map));
        this.g = l9;
        this.f = l11;
        this.h = l10;
        this.i = string;
        this.j = n9;
        this.k = object;
    }

    public static String c(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public b a() {
        return new b(this);
    }

    public final String b() {
        return ax.U0.k.c(this.c);
    }

    public boolean d(int n8) {
        return (this.j & n8) == n8;
    }

    public k e(long l8) {
        long l9 = this.h;
        long l10 = -1L;
        if (l9 != -1L) {
            l10 = l9 - l8;
        }
        return this.f(l8, l10);
    }

    public k f(long l8, long l9) {
        if (l8 == 0L && this.h == l9) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, this.e, this.g + l8, l9, this.i, this.j, this.k);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSpec[");
        stringBuilder.append(this.b());
        stringBuilder.append(" ");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.g);
        stringBuilder.append(", ");
        stringBuilder.append(this.h);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class b {
        private Uri a;
        private long b;
        private int c;
        private byte[] d;
        private Map<String, String> e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        public b() {
            this.c = 1;
            this.e = Collections.EMPTY_MAP;
            this.g = -1L;
        }

        private b(k k8) {
            this.a = k8.a;
            this.b = k8.b;
            this.c = k8.c;
            this.d = k8.d;
            this.e = k8.e;
            this.f = k8.g;
            this.g = k8.h;
            this.h = k8.i;
            this.i = k8.j;
            this.j = k8.k;
        }

        public k a() {
            ax.S0.a.j(this.a, "The uri must be set.");
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public b b(int n8) {
            this.i = n8;
            return this;
        }

        public b c(byte[] byArray) {
            this.d = byArray;
            return this;
        }

        public b d(int n8) {
            this.c = n8;
            return this;
        }

        public b e(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public b f(String string) {
            this.h = string;
            return this;
        }

        public b g(long l8) {
            this.g = l8;
            return this;
        }

        public b h(long l8) {
            this.f = l8;
            return this;
        }

        public b i(Uri uri) {
            this.a = uri;
            return this;
        }

        public b j(String string) {
            this.a = Uri.parse((String)string);
            return this;
        }
    }
}

