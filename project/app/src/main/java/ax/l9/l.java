/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.k9.d;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class l {
    private AtomicLong a = new AtomicLong(0L);
    private Semaphore b = new Semaphore(1);

    private long[] e(long l8, long l9) {
        int n8 = (int)(l9 - l8);
        long[] lArray = new long[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8] = (long)i8 + l8;
        }
        return lArray;
    }

    public int a() {
        return this.b.availablePermits();
    }

    public void b(int n8) {
        this.b.release(n8);
    }

    long c() {
        return this.d(1)[0];
    }

    long[] d(int n8) {
        block3: {
            Object object;
            try {
                if (!this.b.tryAcquire(n8, 5000L, TimeUnit.MILLISECONDS)) break block3;
                object = this.a;
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got interrupted waiting for ");
                stringBuilder.append(n8);
                stringBuilder.append(" to be available. Credits available at this moment: ");
                stringBuilder.append(this.b.availablePermits());
                throw new d(stringBuilder.toString());
            }
            long l8 = n8;
            long l9 = ((AtomicLong)object).getAndAdd(l8);
            object = this.e(l9, l8 + l9);
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not enough credits (");
        stringBuilder.append(this.b.availablePermits());
        stringBuilder.append(" available) to hand out ");
        stringBuilder.append(n8);
        stringBuilder.append(" sequence numbers");
        throw new d(stringBuilder.toString());
    }
}

