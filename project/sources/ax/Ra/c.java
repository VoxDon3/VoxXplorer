package ax.Ra;

/* loaded from: classes3.dex */
final class c<T> {
    private Object[] a = new Object[32];
    private int b = 0;

    c() {
    }

    private void d() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            this.a = objArr2;
        }
    }

    public int a(int i) {
        return b(i, this.b);
    }

    public int b(int i, int i2) {
        int i3 = this.b;
        if (i2 < i3) {
            for (int i4 = i2; i4 < i3; i4++) {
                Object[] objArr = this.a;
                objArr[i4 - i] = objArr[i4];
            }
            this.b -= i;
        } else {
            this.b = i3 - ((i - i2) + i3);
        }
        if (this.b < 0) {
            this.b = 0;
        }
        return i2 - i;
    }

    public void c() {
        this.b--;
    }

    public void e(T t) {
        int i = this.b;
        int i2 = i - 1;
        this.b = i2;
        if (i2 <= 0 || this.a[i - 2] != t) {
            return;
        }
        this.b = i - 2;
    }

    public T f(int i) {
        return (T) this.a[i];
    }

    public T g() {
        return (T) this.a[this.b - 1];
    }

    public void h(T t) {
        d();
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = t;
    }

    public void i(int i, T t) {
        if (i < 0) {
            i = 0;
        }
        d();
        for (int i2 = this.b - 1; i2 >= i; i2--) {
            Object[] objArr = this.a;
            objArr[i2 + 1] = objArr[i2];
        }
        this.a[i] = t;
        this.b++;
    }

    public int j() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.b; i++) {
            sb.append(this.a[i]);
            sb.append('>');
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }
}
