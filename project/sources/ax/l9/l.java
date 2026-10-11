package ax.l9;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class l {
    private AtomicLong a = new AtomicLong(0);
    private Semaphore b = new Semaphore(1);

    private long[] e(long j, long j2) {
        int i = (int) (j2 - j);
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = i2 + j;
        }
        return jArr;
    }

    public int a() {
        return this.b.availablePermits();
    }

    public void b(int i) {
        this.b.release(i);
    }

    long c() {
        return d(1)[0];
    }

    long[] d(int i) {
        try {
            if (this.b.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                long j = i;
                long andAdd = this.a.getAndAdd(j);
                return e(andAdd, j + andAdd);
            }
            throw new ax.k9.d("Not enough credits (" + this.b.availablePermits() + " available) to hand out " + i + " sequence numbers");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new ax.k9.d("Got interrupted waiting for " + i + " to be available. Credits available at this moment: " + this.b.availablePermits());
        }
    }
}
