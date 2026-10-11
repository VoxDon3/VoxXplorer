/*
 * Decompiled with CFR 0.152.
 */
package ax.x5;

import ax.p5.i;
import ax.p5.p;
import ax.x5.k;

final class b
extends k {
    private final long a;
    private final p b;
    private final i c;

    b(long l8, p p8, i i8) {
        this.a = l8;
        if (p8 != null) {
            this.b = p8;
            if (i8 != null) {
                this.c = i8;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override
    public i b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public p d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof k && this.a == ((k)(object = (k)object)).c() && this.b.equals(((k)object).d()) && this.c.equals(((k)object).b());
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        return this.c.hashCode() ^ ((n8 ^ 0xF4243) * 1000003 ^ n9) * 1000003;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersistedEvent{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", transportContext=");
        stringBuilder.append(this.b);
        stringBuilder.append(", event=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

