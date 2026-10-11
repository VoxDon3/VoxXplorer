/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.SystemClock;
import ax.S0.a;
import ax.S0.d0;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;

public final class M {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal<Long> d = new ThreadLocal();

    public M(long l8) {
        this.i(l8);
    }

    public static long h(long l8) {
        return d0.p1(l8, 1000000L, 90000L);
    }

    public static long k(long l8) {
        return d0.p1(l8, 90000L, 1000000L);
    }

    public static long l(long l8) {
        return M.k(l8) % 0x200000000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long a(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                long l9;
                block4: {
                    block5: {
                        if (l8 == -9223372036854775807L) {
                            return -9223372036854775807L;
                        }
                        try {
                            long l10;
                            if (this.g()) break block4;
                            l9 = l10 = this.a;
                            if (l10 != 0x7FFFFFFFFFFFFFFEL) break block5;
                            l9 = ax.S0.a.e(this.d.get());
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.b = l9 - l8;
                    this.notifyAll();
                }
                this.c = l8;
                l9 = this.b;
                return l8 + l9;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long b(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                long l9;
                long l10;
                long l11;
                if (l8 == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                try {
                    l11 = this.c;
                    l10 = l8;
                    if (l11 == -9223372036854775807L) return this.a(M.h(l10));
                    l9 = M.k(l11);
                    l10 = (0x100000000L + l9) / 0x200000000L;
                    l11 = (l10 - 1L) * 0x200000000L + l8;
                    l8 += l10 * 0x200000000L;
                    l10 = l8;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (Math.abs(l11 - l9) >= Math.abs(l8 - l9)) return this.a(M.h(l10));
                l10 = l11;
                return this.a(M.h(l10));
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long c(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                long l9;
                long l10;
                long l11;
                if (l8 == -9223372036854775807L) {
                    return -9223372036854775807L;
                }
                try {
                    l11 = this.c;
                    l10 = l8;
                    if (l11 == -9223372036854775807L) return this.a(M.h(l10));
                    l9 = M.k(l11);
                    l10 = l9 / 0x200000000L;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Long.signum(l10);
                l11 = l10 * 0x200000000L + l8;
                l10 = l8 + (l10 + 1L) * 0x200000000L;
                if (l11 < l9) return this.a(M.h(l10));
                l10 = l11;
                return this.a(M.h(l10));
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long d() {
        synchronized (this) {
            long l8 = this.a;
            if (l8 == Long.MAX_VALUE) return -9223372036854775807L;
            long l9 = l8;
            if (l8 != 0x7FFFFFFFFFFFFFFEL) return l9;
            return -9223372036854775807L;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long e() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                long l8;
                try {
                    l8 = this.c;
                    if (l8 == -9223372036854775807L) return this.d();
                    l8 += this.b;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                return l8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long f() {
        synchronized (this) {
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean g() {
        synchronized (this) {
            long l8 = this.b;
            if (l8 == -9223372036854775807L) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(long l8) {
        synchronized (this) {
            this.a = l8;
            l8 = l8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.b = l8;
            this.c = -9223372036854775807L;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(boolean bl, long l8, long l9) throws InterruptedException, TimeoutException {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    try {
                        boolean bl2 = this.a == 0x7FFFFFFFFFFFFFFEL;
                        ax.S0.a.g(bl2);
                        bl2 = this.g();
                        if (!bl2) break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    return;
                }
                if (bl) {
                    this.d.set(l8);
                } else {
                    long l10 = 0L;
                    l8 = l9;
                    while (!this.g()) {
                        if (l9 == 0L) {
                            this.wait();
                            continue;
                        }
                        bl = l8 > 0L;
                        ax.S0.a.g(bl);
                        long l11 = SystemClock.elapsedRealtime();
                        this.wait(l8);
                        if ((l10 += SystemClock.elapsedRealtime() - l11) >= l9 && !this.g()) {
                            Serializable serializable = new StringBuilder();
                            serializable.append("TimestampAdjuster failed to initialize in ");
                            serializable.append(l9);
                            serializable.append(" milliseconds");
                            String string = serializable.toString();
                            serializable = new TimeoutException(string);
                            throw serializable;
                        }
                        l8 = l9 - l10;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

