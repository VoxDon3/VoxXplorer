/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

import ax.Gb.l;
import ax.b0.d;

public class e<T>
implements d<T> {
    private final Object[] a;
    private int b;

    public e(int n8) {
        if (n8 > 0) {
            this.a = new Object[n8];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private final boolean c(T t8) {
        int n8 = this.b;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.a[i8] != t8) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(T t8) {
        l.f(t8, "instance");
        if (!this.c(t8)) {
            int n8 = this.b;
            Object[] objectArray = this.a;
            if (n8 < objectArray.length) {
                objectArray[n8] = t8;
                this.b = n8 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override
    public T b() {
        int n8 = this.b;
        if (n8 > 0) {
            Object object = this.a[--n8];
            l.d(object, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.a[n8] = null;
            --this.b;
            return (T)object;
        }
        return null;
    }
}

