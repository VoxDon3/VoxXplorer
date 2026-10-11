/*
 * Decompiled with CFR 0.152.
 */
package ax.j4;

import ax.k4.h;
import java.security.MessageDigest;

public final class b
implements ax.M3.h {
    private final Object b;

    public b(Object object) {
        this.b = h.d(object);
    }

    @Override
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(ax.M3.h.a));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof b) {
            object = (b)object;
            return this.b.equals(((b)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ObjectKey{object=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

