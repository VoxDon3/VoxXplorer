/*
 * Decompiled with CFR 0.152.
 */
package ax.Ra;

final class c<T> {
    private Object[] a = new Object[32];
    private int b = 0;

    c() {
    }

    private void d() {
        int n8 = this.b;
        Object[] objectArray = this.a;
        if (n8 == objectArray.length) {
            Object[] objectArray2 = new Object[n8 * 2];
            System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            this.a = objectArray2;
        }
    }

    public int a(int n8) {
        return this.b(n8, this.b);
    }

    public int b(int n8, int n9) {
        int n10 = this.b;
        if (n9 < n10) {
            for (int i8 = n9; i8 < n10; ++i8) {
                Object[] objectArray = this.a;
                objectArray[i8 - n8] = objectArray[i8];
            }
            this.b -= n8;
        } else {
            this.b = n10 - (n8 - n9 + n10);
        }
        if (this.b < 0) {
            this.b = 0;
        }
        return n9 - n8;
    }

    public void c() {
        --this.b;
    }

    public void e(T t8) {
        int n8;
        int n9 = this.b;
        this.b = n8 = n9 - 1;
        if (n8 > 0 && this.a[n9 - 2] == t8) {
            this.b = n9 - 2;
        }
    }

    public T f(int n8) {
        return (T)this.a[n8];
    }

    public T g() {
        return (T)this.a[this.b - 1];
    }

    public void h(T t8) {
        this.d();
        Object[] objectArray = this.a;
        int n8 = this.b;
        this.b = n8 + 1;
        objectArray[n8] = t8;
    }

    public void i(int n8, T t8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = 0;
        }
        this.d();
        for (n8 = this.b - 1; n8 >= n9; --n8) {
            Object[] objectArray = this.a;
            objectArray[n8 + 1] = objectArray[n8];
        }
        this.a[n9] = t8;
        ++this.b;
    }

    public int j() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < this.b; ++i8) {
            stringBuilder.append(this.a[i8]);
            stringBuilder.append('>');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        }
        return stringBuilder.toString();
    }
}

