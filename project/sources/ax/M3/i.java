package ax.M3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    i(String str, T t, b<T> bVar) {
        this.c = ax.k4.h.b(str);
        this.a = t;
        this.b = (b) ax.k4.h.d(bVar);
    }

    public static <T> i<T> a(String str, T t, b<T> bVar) {
        return new i<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) e;
    }

    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(h.a);
        }
        return this.d;
    }

    public static <T> i<T> e(String str) {
        return new i<>(str, null, b());
    }

    public static <T> i<T> f(String str, T t) {
        return new i<>(str, t, b());
    }

    public T c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.c.equals(((i) obj).c);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + "'}";
    }

    static class a implements b<Object> {
        a() {
        }

        @Override // ax.M3.i.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
