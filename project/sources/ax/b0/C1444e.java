package ax.b0;

import ax.Gb.l;

/* renamed from: ax.b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1444e<T> implements InterfaceC1443d<T> {
    private final Object[] a;
    private int b;

    public C1444e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    private final boolean c(T t) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.b0.InterfaceC1443d
    public boolean a(T t) {
        l.f(t, "instance");
        if (c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.b = i + 1;
        return true;
    }

    @Override // ax.b0.InterfaceC1443d
    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = (T) this.a[i2];
        l.d(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.a[i2] = null;
        this.b--;
        return t;
    }
}
