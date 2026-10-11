package ax.J8;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b {
    private final long a;

    public b(long j) {
        this.a = j;
    }

    public static b b() {
        return d(System.currentTimeMillis());
    }

    public static b c(long j, TimeUnit timeUnit) {
        return new b((TimeUnit.NANOSECONDS.convert(j, timeUnit) / 100) + 116444736000000000L);
    }

    public static b d(long j) {
        return c(j, TimeUnit.MILLISECONDS);
    }

    public long a() {
        return this.a;
    }

    public Date e() {
        return new Date(g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((b) obj).a;
    }

    public long f(TimeUnit timeUnit) {
        return timeUnit.convert((this.a - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
    }

    public long g() {
        return f(TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return e().toString();
    }
}
