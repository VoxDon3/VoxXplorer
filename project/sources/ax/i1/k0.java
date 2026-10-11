package ax.i1;

import android.util.SparseArray;
import ax.S0.C0968a;
import ax.S0.InterfaceC0979l;

/* loaded from: classes.dex */
final class k0<V> {
    private final InterfaceC0979l<V> c;
    private final SparseArray<V> b = new SparseArray<>();
    private int a = -1;

    public k0(InterfaceC0979l<V> interfaceC0979l) {
        this.c = interfaceC0979l;
    }

    public void a(int i, V v) {
        if (this.a == -1) {
            C0968a.g(this.b.size() == 0);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray<V> sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C0968a.a(i >= keyAt);
            if (keyAt == i) {
                InterfaceC0979l<V> interfaceC0979l = this.c;
                SparseArray<V> sparseArray2 = this.b;
                interfaceC0979l.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, v);
    }

    public void b() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void c(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.a = this.b.size() > 0 ? Math.min(this.a, this.b.size() - 1) : -1;
    }

    public void d(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.a;
            if (i4 > 0) {
                this.a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public V e(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public V f() {
        return this.b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.b.size() == 0;
    }
}
