/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.h;
import java.security.MessageDigest;

final class b
implements h {
    private final h b;
    private final h c;

    public b(h h8, h h9) {
        this.b = h8;
        this.c = h9;
    }

    @Override
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof b) {
            object = (b)object;
            if (this.b.equals(((b)object).b) && this.c.equals(((b)object).c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 31 + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataCacheKey{sourceKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

