/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.a;
import java.util.Arrays;

public final class L<V> {
    private long[] a;
    private V[] b;
    private int c;
    private int d;

    public L() {
        this(10);
    }

    public L(int n8) {
        this.a = new long[n8];
        this.b = L.f(n8);
    }

    private void b(long l8, V v8) {
        int n8 = this.c;
        int n9 = this.d;
        V[] VArray = this.b;
        n8 = (n8 + n9) % VArray.length;
        this.a[n8] = l8;
        VArray[n8] = v8;
        this.d = n9 + 1;
    }

    private void d(long l8) {
        int n8;
        int n9;
        int n10 = this.d;
        if (n10 > 0 && l8 <= this.a[((n9 = this.c) + n10 - 1) % (n8 = this.b.length)]) {
            this.c();
        }
    }

    private void e() {
        int n8 = this.b.length;
        if (this.d < n8) {
            return;
        }
        int n9 = n8 * 2;
        long[] lArray = new long[n9];
        V[] VArray = L.f(n9);
        n9 = this.c;
        System.arraycopy(this.a, n9, lArray, 0, n8 -= n9);
        System.arraycopy(this.b, this.c, VArray, 0, n8);
        n9 = this.c;
        if (n9 > 0) {
            System.arraycopy(this.a, 0, lArray, n8, n9);
            System.arraycopy(this.b, 0, VArray, n8, this.c);
        }
        this.a = lArray;
        this.b = VArray;
        this.c = 0;
    }

    private static <V> V[] f(int n8) {
        return new Object[n8];
    }

    private V h(long l8, boolean bl) {
        long l9;
        V v8 = null;
        long l10 = Long.MAX_VALUE;
        while (this.d > 0 && ((l9 = l8 - this.a[this.c]) >= 0L || !bl && -l9 < l10)) {
            v8 = this.k();
            l10 = l9;
        }
        return v8;
    }

    private V k() {
        boolean bl = this.d > 0;
        ax.S0.a.g(bl);
        V[] VArray = this.b;
        int n8 = this.c;
        V v8 = VArray[n8];
        VArray[n8] = null;
        this.c = (n8 + 1) % VArray.length;
        --this.d;
        return v8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(long l8, V v8) {
        synchronized (this) {
            this.d(l8);
            this.e();
            this.b(l8, v8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        synchronized (this) {
            this.c = 0;
            this.d = 0;
            Arrays.fill(this.b, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public V g(long l8) {
        synchronized (this) {
            V v8 = this.h(l8, false);
            return v8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public V i() {
        synchronized (this) {
            V v8 = this.d == 0 ? null : (V)this.k();
            return v8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public V j(long l8) {
        synchronized (this) {
            V v8 = this.h(l8, true);
            return v8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int l() {
        synchronized (this) {
            return this.d;
        }
    }
}

