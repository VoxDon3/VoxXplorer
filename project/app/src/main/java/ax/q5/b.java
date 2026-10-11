/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import ax.q5.g;

final class b
extends g {
    private final g.a a;
    private final long b;

    b(g.a a8, long l8) {
        if (a8 != null) {
            this.a = a8;
            this.b = l8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public g.a c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof g && ((Object)((Object)this.a)).equals((Object)((g)(object = (g)object)).c()) && this.b == ((g)object).b();
    }

    public int hashCode() {
        int n8 = ((Object)((Object)this.a)).hashCode();
        long l8 = this.b;
        return (n8 ^ 0xF4243) * 1000003 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BackendResponse{status=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", nextRequestWaitMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

