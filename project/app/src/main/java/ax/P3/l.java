/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.j;
import ax.M3.m;
import ax.k4.h;
import java.security.MessageDigest;
import java.util.Map;

class l
implements ax.M3.h {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final ax.M3.h g;
    private final Map<Class<?>, m<?>> h;
    private final j i;
    private int j;

    public l(Object object, ax.M3.h h8, int n8, int n9, Map<Class<?>, m<?>> map, Class<?> clazz, Class<?> clazz2, j j8) {
        this.b = ax.k4.h.d(object);
        this.g = ax.k4.h.e(h8, "Signature must not be null");
        this.c = n8;
        this.d = n9;
        this.h = ax.k4.h.d(map);
        this.e = ax.k4.h.e(clazz, "Resource class must not be null");
        this.f = ax.k4.h.e(clazz2, "Transcode class must not be null");
        this.i = ax.k4.h.d(j8);
    }

    @Override
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof l) {
            object = (l)object;
            if (this.b.equals(((l)object).b) && this.g.equals(((l)object).g) && this.d == ((l)object).d && this.c == ((l)object).c && this.h.equals(((l)object).h) && this.e.equals(((l)object).e) && this.f.equals(((l)object).f) && this.i.equals(((l)object).i)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (this.j == 0) {
            int n8;
            this.j = n8 = this.b.hashCode();
            this.j = n8 = ((n8 * 31 + this.g.hashCode()) * 31 + this.c) * 31 + this.d;
            this.j = n8 = n8 * 31 + this.h.hashCode();
            this.j = n8 = n8 * 31 + this.e.hashCode();
            this.j = n8 = n8 * 31 + this.f.hashCode();
            this.j = n8 * 31 + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EngineKey{model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", width=");
        stringBuilder.append(this.c);
        stringBuilder.append(", height=");
        stringBuilder.append(this.d);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(this.e);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(this.f);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.g);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.j);
        stringBuilder.append(", transformations=");
        stringBuilder.append(this.h);
        stringBuilder.append(", options=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

