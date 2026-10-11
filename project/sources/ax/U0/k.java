package ax.U0;

import android.net.Uri;
import ax.P0.C0916z;
import ax.S0.C0968a;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
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

        public k a() {
            C0968a.j(this.a, "The uri must be set.");
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public b b(int i) {
            this.i = i;
            return this;
        }

        public b c(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b d(int i) {
            this.c = i;
            return this;
        }

        public b e(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public b f(String str) {
            this.h = str;
            return this;
        }

        public b g(long j) {
            this.g = j;
            return this;
        }

        public b h(long j) {
            this.f = j;
            return this;
        }

        public b i(Uri uri) {
            this.a = uri;
            return this;
        }

        public b j(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        public b() {
            this.c = 1;
            this.e = Collections.EMPTY_MAP;
            this.g = -1L;
        }

        private b(k kVar) {
            this.a = kVar.a;
            this.b = kVar.b;
            this.c = kVar.c;
            this.d = kVar.d;
            this.e = kVar.e;
            this.f = kVar.g;
            this.g = kVar.h;
            this.h = kVar.i;
            this.i = kVar.j;
            this.j = kVar.k;
        }
    }

    static {
        C0916z.a("media3.datasource");
    }

    public static String c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.c);
    }

    public boolean d(int i) {
        return (this.j & i) == i;
    }

    public k e(long j) {
        long j2 = this.h;
        return f(j, j2 != -1 ? j2 - j : -1L);
    }

    public k f(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new k(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + "]";
    }

    private k(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        C0968a.a(j4 >= 0);
        C0968a.a(j2 >= 0);
        C0968a.a(j3 > 0 || j3 == -1);
        this.a = (Uri) C0968a.e(uri);
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }
}
