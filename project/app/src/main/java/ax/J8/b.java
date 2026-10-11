/*
 * Decompiled with CFR 0.152.
 */
package ax.J8;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class b {
    private final long a;

    public b(long l8) {
        this.a = l8;
    }

    public static b b() {
        return b.d(System.currentTimeMillis());
    }

    public static b c(long l8, TimeUnit timeUnit) {
        return new b(TimeUnit.NANOSECONDS.convert(l8, timeUnit) / 100L + 116444736000000000L);
    }

    public static b d(long l8) {
        return b.c(l8, TimeUnit.MILLISECONDS);
    }

    public long a() {
        return this.a;
    }

    public Date e() {
        return new Date(this.g());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (b)object;
            if (this.a == ((b)object).a) {
                return true;
            }
        }
        return false;
    }

    public long f(TimeUnit timeUnit) {
        return timeUnit.convert((this.a - 116444736000000000L) * 100L, TimeUnit.NANOSECONDS);
    }

    public long g() {
        return this.f(TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        long l8 = this.a;
        return (int)(l8 ^ l8 >>> 32);
    }

    public String toString() {
        return this.e().toString();
    }
}

