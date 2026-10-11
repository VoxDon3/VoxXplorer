/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.v;

final class l
extends v {
    private final long a;

    l(long l8) {
        this.a = l8;
    }

    @Override
    public long c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof v && this.a == ((v)(object = (v)object)).c();
    }

    public int hashCode() {
        long l8 = this.a;
        return 0xF4243 ^ (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogResponse{nextRequestWaitMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

