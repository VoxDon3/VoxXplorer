package ax.S0;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class M {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal<Long> d = new ThreadLocal<>();

    public M(long j) {
        i(j);
    }

    public static long h(long j) {
        return d0.p1(j, 1000000L, 90000L);
    }

    public static long k(long j) {
        return d0.p1(j, 90000L, 1000000L);
    }

    public static long l(long j) {
        return k(j) % 8589934592L;
    }

    public synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    j2 = ((Long) C0968a.e(this.d.get())).longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long k = k(j2);
                long j3 = (4294967296L + k) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - k) < Math.abs(j - k)) {
                    j = j4;
                }
            }
            return a(h(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long k = k(j2);
            long j3 = k / 8589934592L;
            Long.signum(j3);
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= k) {
                j = j4;
            }
        }
        return a(h(j));
    }

    public synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long e() {
        long j;
        try {
            j = this.c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.b : d();
    }

    public synchronized long f() {
        return this.b;
    }

    public synchronized boolean g() {
        return this.b != -9223372036854775807L;
    }

    public synchronized void i(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public synchronized void j(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        try {
            C0968a.g(this.a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                long j3 = 0;
                long j4 = j2;
                while (!g()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        C0968a.g(j4 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j4);
                        j3 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j3 >= j2 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j4 = j2 - j3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
