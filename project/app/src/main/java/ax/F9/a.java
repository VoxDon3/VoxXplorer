/*
 * Decompiled with CFR 0.152.
 */
package ax.F9;

import ax.F9.b;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a
implements b {
    private volatile int a;
    private volatile int b;
    private volatile double[] c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;
    private volatile boolean h = true;
    final Lock i;
    final Condition j;
    final Condition k;

    public a() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.i = reentrantLock;
        this.j = reentrantLock.newCondition();
        this.k = reentrantLock.newCondition();
    }

    public static boolean e(int n8) {
        return (n8 & n8 - 1) == 0;
    }

    private double h() {
        double d8 = this.c[this.a & this.d];
        this.a = this.a + 1 & this.e;
        return d8;
    }

    private void k(double d8) {
        this.c[this.b & this.d] = d8;
        this.b = this.b + 1 & this.e;
    }

    @Override
    public void a(double[] dArray, int n8, int n9) {
        for (int i8 = 0; i8 < n9; ++i8) {
            this.b(dArray[i8 + n8]);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(double d8) {
        block12: {
            block11: {
                Throwable throwable2;
                block10: {
                    block9: {
                        if (!this.f) break block11;
                        this.i.lock();
                        try {
                            int n8;
                            int n9;
                            while (this.h && (n9 = this.d()) == (n8 = this.c.length)) {
                                this.j.await();
                            }
                            break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (InterruptedException interruptedException) {
                            this.i.unlock();
                            return;
                        }
                    }
                    if (this.h) {
                        this.k(d8);
                    }
                    this.i.unlock();
                    break block12;
                }
                this.i.unlock();
                throw throwable2;
            }
            if (this.d() != this.c.length) {
                this.k(d8);
            }
        }
        if (this.g) {
            this.i.lock();
            this.k.signal();
            this.i.unlock();
        }
    }

    public void c(int n8) {
        if (ax.F9.a.e(n8)) {
            this.c = new double[n8];
            this.d = n8 - 1;
            this.e = n8 * 2 - 1;
            return;
        }
        throw new IllegalArgumentException("Size must be a power of two.");
    }

    public int d() {
        return this.b - this.a & this.e;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public double f() {
        double d8;
        block13: {
            boolean bl = this.g;
            double d9 = Double.NaN;
            if (bl) {
                Throwable throwable2;
                block12: {
                    block11: {
                        this.i.lock();
                        try {
                            int n8;
                            while (this.h && (n8 = this.d()) < 1) {
                                this.k.await();
                            }
                            break block11;
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                        catch (InterruptedException interruptedException) {
                            this.i.unlock();
                            return Double.NaN;
                        }
                    }
                    d8 = d9;
                    {
                        if (this.h) {
                            d8 = this.h();
                        }
                        this.i.unlock();
                        break block13;
                    }
                }
                this.i.unlock();
                throw throwable2;
            }
            d8 = d9;
            if (this.h) {
                d8 = d9;
                if (this.a != this.b) {
                    d8 = this.h();
                }
            }
        }
        if (this.f) {
            this.i.lock();
            this.j.signal();
            this.i.unlock();
        }
        return d8;
    }

    public int g(double[] dArray, int n8, int n9) {
        double d8;
        boolean bl = this.h;
        int n10 = 0;
        if (!bl) {
            return 0;
        }
        int n11 = n9;
        if (!this.g) {
            n11 = Math.min(this.d(), n9);
        }
        int n12 = 0;
        n9 = n10;
        n10 = n12;
        while (this.h && n9 < n11 && !Double.isNaN(d8 = this.f())) {
            dArray[n9 + n8] = d8;
            ++n10;
            ++n9;
        }
        return n10;
    }

    public void i(boolean bl) {
        this.g = bl;
    }

    public void j(boolean bl) {
        this.f = bl;
    }
}

