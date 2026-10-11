/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import ax.S0.d0;
import ax.m1.a;
import ax.m1.b;
import java.util.Arrays;

public final class h
implements b {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private a[] g;

    public h(boolean bl, int n8) {
        this(bl, n8, 0);
    }

    public h(boolean bl, int n8, int n9) {
        boolean bl2 = true;
        boolean bl3 = n8 > 0;
        ax.S0.a.a(bl3);
        bl3 = n9 >= 0 ? bl2 : false;
        ax.S0.a.a(bl3);
        this.a = bl;
        this.b = n8;
        this.f = n9;
        this.g = new a[n9 + 100];
        if (n9 > 0) {
            this.c = new byte[n9 * n8];
            for (int i8 = 0; i8 < n9; ++i8) {
                this.g[i8] = new a(this.c, i8 * n8);
            }
            return;
        }
        this.c = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(a a8) {
        synchronized (this) {
            a[] aArray = this.g;
            int n8 = this.f;
            this.f = n8 + 1;
            aArray[n8] = a8;
            --this.e;
            this.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public a b() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                int n8;
                block6: {
                    block5: {
                        try {
                            ++this.e;
                            n8 = this.f;
                            if (n8 <= 0) break block5;
                            object = this.g;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    a a8 = new a(new byte[this.b], 0);
                    n8 = this.e;
                    a[] aArray = this.g;
                    object = a8;
                    if (n8 <= aArray.length) return object;
                    this.g = Arrays.copyOf(aArray, aArray.length * 2);
                    return a8;
                }
                this.f = --n8;
                object = ax.S0.a.e(object[n8]);
                this.g[this.f] = null;
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c() {
        synchronized (this) {
            Throwable throwable2;
            int n8;
            block11: {
                int n9;
                int n10;
                int n11;
                block10: {
                    n8 = d0.k(this.d, this.b);
                    n11 = this.e;
                    n10 = 0;
                    n9 = Math.max(0, n8 - n11);
                    n11 = this.f;
                    if (n9 < n11) break block10;
                    return;
                }
                n8 = n9;
                if (this.c == null) break block11;
                --n11;
                n8 = n10;
                while (n8 <= n11) {
                    a a8;
                    a a9;
                    block13: {
                        block12: {
                            a9 = ax.S0.a.e(this.g[n8]);
                            if (a9.a != this.c) break block12;
                            ++n8;
                            continue;
                        }
                        a8 = ax.S0.a.e(this.g[n11]);
                        if (a8.a == this.c) break block13;
                        --n11;
                        continue;
                    }
                    a[] aArray = this.g;
                    aArray[n8] = a8;
                    aArray[n11] = a9;
                    --n11;
                    ++n8;
                }
                try {
                    n11 = Math.max(n9, n8);
                    n9 = this.f;
                    n8 = n11;
                    if (n11 < n9) break block11;
                }
                catch (Throwable throwable2) {}
                return;
            }
            Arrays.fill(this.g, n8, this.f, null);
            this.f = n8;
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(b.a a8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                while (a8 != null) {
                    try {
                        a[] aArray = this.g;
                        int n8 = this.f;
                        this.f = n8 + 1;
                        aArray[n8] = a8.a();
                        --this.e;
                        a8 = a8.next();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.notifyAll();
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public int e() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int f() {
        synchronized (this) {
            int n8 = this.e;
            int n9 = this.b;
            return n8 * n9;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!this.a) break block4;
                        this.h(0);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
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
    public void h(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl = n8 < this.d;
                        this.d = n8;
                        if (!bl) break block4;
                        this.c();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

