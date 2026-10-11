/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

import ax.B.a;
import ax.M3.h;
import ax.M3.i;
import java.security.MessageDigest;
import java.util.Map;

public final class j
implements h {
    private final a<i<?>, Object> b = new a();

    private static <T> void f(i<T> i8, Object object, MessageDigest messageDigest) {
        i8.g(object, messageDigest);
    }

    @Override
    public void a(MessageDigest messageDigest) {
        for (Map.Entry<i<?>, Object> entry : this.b.entrySet()) {
            j.f(entry.getKey(), entry.getValue(), messageDigest);
        }
    }

    public <T> T c(i<T> i8) {
        if (this.b.containsKey((Object)i8)) {
            return (T)this.b.get((Object)i8);
        }
        return i8.c();
    }

    public void d(j j8) {
        this.b.g(j8.b);
    }

    public <T> j e(i<T> i8, T t8) {
        this.b.put(i8, t8);
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof j) {
            object = (j)object;
            return this.b.equals(((j)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Options{values=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

