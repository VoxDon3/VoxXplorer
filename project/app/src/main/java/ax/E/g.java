/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.f;

class g<T>
implements f<T> {
    private final Object[] a;
    private int b;

    g(int n8) {
        if (n8 > 0) {
            this.a = new Object[n8];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override
    public boolean a(T t8) {
        int n8 = this.b;
        Object[] objectArray = this.a;
        if (n8 < objectArray.length) {
            objectArray[n8] = t8;
            this.b = n8 + 1;
            return true;
        }
        return false;
    }

    @Override
    public T b() {
        int n8 = this.b;
        if (n8 > 0) {
            int n9 = n8 - 1;
            Object[] objectArray = this.a;
            Object object = objectArray[n9];
            objectArray[n9] = null;
            this.b = n8 - 1;
            return (T)object;
        }
        return null;
    }

    @Override
    public void c(T[] TArray, int n8) {
        int n9 = n8;
        if (n8 > TArray.length) {
            n9 = TArray.length;
        }
        for (n8 = 0; n8 < n9; ++n8) {
            T t8 = TArray[n8];
            int n10 = this.b;
            Object[] objectArray = this.a;
            if (n10 >= objectArray.length) continue;
            objectArray[n10] = t8;
            this.b = n10 + 1;
        }
    }
}

