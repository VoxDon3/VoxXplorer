/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.h;
import ax.M3.j;
import ax.M3.m;
import ax.k4.e;
import ax.k4.i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class u
implements h {
    private static final e<Class<?>, byte[]> i = new e(50);
    private final h b;
    private final h c;
    private final int d;
    private final int e;
    private final Class<?> f;
    private final j g;
    private final m<?> h;

    public u(h h8, h h9, int n8, int n9, m<?> m8, Class<?> clazz, j j8) {
        this.b = h8;
        this.c = h9;
        this.d = n8;
        this.e = n9;
        this.h = m8;
        this.f = clazz;
        this.g = j8;
    }

    private byte[] c() {
        byte[] byArray;
        e<Class<?>, byte[]> e8 = i;
        byte[] byArray2 = byArray = e8.g(this.f);
        if (byArray == null) {
            byArray2 = this.f.getName().getBytes(ax.M3.h.a);
            e8.k(this.f, byArray2);
        }
        return byArray2;
    }

    @Override
    public void a(MessageDigest messageDigest) {
        Object object = ByteBuffer.allocate(8).putInt(this.d).putInt(this.e).array();
        this.c.a(messageDigest);
        this.b.a(messageDigest);
        messageDigest.update((byte[])object);
        object = this.h;
        if (object != null) {
            object.a(messageDigest);
        }
        this.g.a(messageDigest);
        messageDigest.update(this.c());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof u) {
            object = (u)object;
            if (this.e == ((u)object).e && this.d == ((u)object).d && ax.k4.i.c(this.h, ((u)object).h) && this.f.equals(((u)object).f) && this.b.equals(((u)object).b) && this.c.equals(((u)object).c) && this.g.equals(((u)object).g)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = ((this.b.hashCode() * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e;
        m<?> m8 = this.h;
        int n9 = n8;
        if (m8 != null) {
            n9 = n8 * 31 + m8.hashCode();
        }
        return (n9 * 31 + this.f.hashCode()) * 31 + this.g.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourceCacheKey{sourceKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.c);
        stringBuilder.append(", width=");
        stringBuilder.append(this.d);
        stringBuilder.append(", height=");
        stringBuilder.append(this.e);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(this.f);
        stringBuilder.append(", transformation='");
        stringBuilder.append(this.h);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

