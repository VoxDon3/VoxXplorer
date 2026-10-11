package ax.F9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class a implements b {
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

    public static boolean e(int i) {
        return (i & (i + (-1))) == 0;
    }

    private double h() {
        double d = this.c[this.a & this.d];
        this.a = (this.a + 1) & this.e;
        return d;
    }

    private void k(double d) {
        this.c[this.b & this.d] = d;
        this.b = (this.b + 1) & this.e;
    }

    @Override // ax.F9.b
    public void a(double[] dArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            b(dArr[i3 + i]);
        }
    }

    @Override // ax.F9.b
    public void b(double d) {
        if (this.f) {
            this.i.lock();
            while (this.h && d() == this.c.length) {
                try {
                    try {
                        this.j.await();
                    } catch (InterruptedException unused) {
                        return;
                    }
                } finally {
                    this.i.unlock();
                }
            }
            if (this.h) {
                k(d);
            }
        } else if (d() != this.c.length) {
            k(d);
        }
        if (this.g) {
            this.i.lock();
            this.k.signal();
        }
    }

    public void c(int i) {
        if (!e(i)) {
            throw new IllegalArgumentException("Size must be a power of two.");
        }
        this.c = new double[i];
        this.d = i - 1;
        this.e = (i * 2) - 1;
    }

    public int d() {
        return (this.b - this.a) & this.e;
    }

    public double f() {
        if (this.g) {
            this.i.lock();
            while (this.h && d() < 1) {
                try {
                    try {
                        this.k.await();
                    } catch (InterruptedException unused) {
                        return Double.NaN;
                    }
                } finally {
                    this.i.unlock();
                }
            }
            r1 = this.h ? h() : Double.NaN;
        } else if (this.h && this.a != this.b) {
            r1 = h();
        }
        if (this.f) {
            this.i.lock();
            this.j.signal();
        }
        return r1;
    }

    public int g(double[] dArr, int i, int i2) {
        if (!this.h) {
            return 0;
        }
        if (!this.g) {
            i2 = Math.min(d(), i2);
        }
        int i3 = 0;
        for (int i4 = 0; this.h && i4 < i2; i4++) {
            double f = f();
            if (Double.isNaN(f)) {
                break;
            }
            dArr[i4 + i] = f;
            i3++;
        }
        return i3;
    }

    public void i(boolean z) {
        this.g = z;
    }

    public void j(boolean z) {
        this.f = z;
    }
}
