/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

class e {
    private static final long d = TimeUnit.HOURS.toMillis(24L);
    private static final long e = TimeUnit.MINUTES.toMillis(30L);
    private final i a = i.c();
    private long b;
    private int c;

    e() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long a(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (!ax.e8.e.c(n8)) {
                        return d;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                double d8 = Math.min(Math.pow(2.0, this.c) + (double)this.a.e(), (double)e);
                return (long)d8;
            }
            throw throwable2;
        }
    }

    private static boolean c(int n8) {
        return n8 == 429 || n8 >= 500 && n8 < 600;
        {
        }
    }

    private static boolean d(int n8) {
        return n8 >= 200 && n8 < 300 || n8 == 401 || n8 == 404;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        synchronized (this) {
            this.c = 0;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b() {
        synchronized (this) {
            try {
                long l8;
                if (this.c == 0) return true;
                long l9 = this.a.a();
                if (l9 <= (l8 = this.b)) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (ax.e8.e.d(n8)) {
                        this.e();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ++this.c;
                long l8 = this.a(n8);
                this.b = this.a.a() + l8;
                return;
            }
            throw throwable2;
        }
    }
}

