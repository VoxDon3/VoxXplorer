package ax.Vb;

import ax.Vb.M;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public class L<T extends M & Comparable<? super T>> {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(L.class, "_size");
    private volatile int _size;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new M[4];
            this.a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((M[]) copyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void j(int i) {
        b.set(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends ax.Vb.M & java.lang.Comparable<? super T>[] r2 = r5.a
            ax.Gb.l.c(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            ax.Gb.l.c(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            ax.Gb.l.c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            ax.Gb.l.c(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            ax.Gb.l.c(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Vb.L.k(int):void");
    }

    private final void l(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            ax.Gb.l.c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            ax.Gb.l.c(t);
            T t2 = tArr[i];
            ax.Gb.l.c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    private final void m(int i, int i2) {
        T[] tArr = this.a;
        ax.Gb.l.c(tArr);
        T t = tArr[i2];
        ax.Gb.l.c(t);
        T t2 = tArr[i];
        ax.Gb.l.c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.n(i);
        t2.n(i2);
    }

    public final void a(T t) {
        t.l(this);
        T[] f = f();
        int c = c();
        j(c + 1);
        f[c] = t;
        t.n(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b2;
        synchronized (this) {
            b2 = b();
        }
        return b2;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            if (t.j() == null) {
                z = false;
            } else {
                h(t.p());
                z = true;
            }
        }
        return z;
    }

    public final T h(int i) {
        T[] tArr = this.a;
        ax.Gb.l.c(tArr);
        j(c() - 1);
        if (i < c()) {
            m(i, c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                ax.Gb.l.c(t);
                T t2 = tArr[i2];
                ax.Gb.l.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i, i2);
                    l(i2);
                }
            }
            k(i);
        }
        T t3 = tArr[c()];
        ax.Gb.l.c(t3);
        t3.l(null);
        t3.n(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T h;
        synchronized (this) {
            h = c() > 0 ? h(0) : null;
        }
        return h;
    }
}
