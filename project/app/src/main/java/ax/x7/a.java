/*
 * Decompiled with CFR 0.152.
 */
package ax.x7;

import ax.x7.o;

final class a
extends o {
    private final long a;
    private final long b;
    private final long c;

    a(long l8, long l9, long l10) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof o && this.a == ((o)(object = (o)object)).c() && this.b == ((o)object).b() && this.c == ((o)object).d();
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        int n9 = (int)(l8 ^ l8 >>> 32);
        l8 = this.c;
        return (int)(l8 ^ l8 >>> 32) ^ ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StartupTime{epochMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", elapsedRealtime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

