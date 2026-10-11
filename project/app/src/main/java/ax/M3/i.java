/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

import ax.M3.h;
import java.security.MessageDigest;

public final class i<T> {
    private static final b<Object> e = new b<Object>(){

        @Override
        public void a(byte[] byArray, Object object, MessageDigest messageDigest) {
        }
    };
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    i(String string, T t8, b<T> b8) {
        this.c = ax.k4.h.b(string);
        this.a = t8;
        this.b = ax.k4.h.d(b8);
    }

    public static <T> i<T> a(String string, T t8, b<T> b8) {
        return new i<T>(string, t8, b8);
    }

    private static <T> b<T> b() {
        return e;
    }

    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(h.a);
        }
        return this.d;
    }

    public static <T> i<T> e(String string) {
        return new i<Object>(string, null, i.<T>b());
    }

    public static <T> i<T> f(String string, T t8) {
        return new i<T>(string, t8, i.<T>b());
    }

    public T c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof i) {
            object = (i)object;
            return this.c.equals(((i)object).c);
        }
        return false;
    }

    public void g(T t8, MessageDigest messageDigest) {
        this.b.a(this.d(), t8, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Option{key='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static interface b<T> {
        public void a(byte[] var1, T var2, MessageDigest var3);
    }
}

