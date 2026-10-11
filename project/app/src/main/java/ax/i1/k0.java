/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.util.SparseArray;
import ax.S0.a;
import ax.S0.l;

final class k0<V> {
    private int a;
    private final SparseArray<V> b = new SparseArray();
    private final l<V> c;

    public k0(l<V> l8) {
        this.c = l8;
        this.a = -1;
    }

    public void a(int n8, V v8) {
        boolean bl;
        int n9 = this.a;
        boolean bl2 = false;
        if (n9 == -1) {
            bl = this.b.size() == 0;
            ax.S0.a.g(bl);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray<V> sparseArray = this.b;
            n9 = sparseArray.keyAt(sparseArray.size() - 1);
            bl = bl2;
            if (n8 >= n9) {
                bl = true;
            }
            ax.S0.a.a(bl);
            if (n9 == n8) {
                l<V> l8 = this.c;
                sparseArray = this.b;
                l8.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        this.b.append(n8, v8);
    }

    public void b() {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            this.c.accept(this.b.valueAt(i8));
        }
        this.a = -1;
        this.b.clear();
    }

    public void c(int n8) {
        for (int i8 = this.b.size() - 1; i8 >= 0 && n8 < this.b.keyAt(i8); --i8) {
            this.c.accept(this.b.valueAt(i8));
            this.b.removeAt(i8);
        }
        n8 = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
        this.a = n8;
    }

    public void d(int n8) {
        int n9;
        SparseArray<V> sparseArray;
        int n10 = 0;
        while (n10 < this.b.size() - 1 && n8 >= (sparseArray = this.b).keyAt(n9 = n10 + 1)) {
            this.c.accept(this.b.valueAt(n10));
            this.b.removeAt(n10);
            n10 = this.a;
            if (n10 > 0) {
                this.a = n10 - 1;
            }
            n10 = n9;
        }
    }

    public V e(int n8) {
        int n9;
        if (this.a == -1) {
            this.a = 0;
        }
        while ((n9 = this.a--) > 0 && n8 < this.b.keyAt(n9)) {
        }
        while (this.a < this.b.size() - 1 && n8 >= this.b.keyAt(this.a + 1)) {
            ++this.a;
        }
        return (V)this.b.valueAt(this.a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.b;
        return (V)sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.b.size() == 0;
    }
}

