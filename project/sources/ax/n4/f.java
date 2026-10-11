package ax.n4;

/* loaded from: classes.dex */
public final class f {
    private char[] a;
    private int b;

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.a = new char[i];
    }

    private void c(int i) {
        char[] cArr = new char[Math.max(this.a.length << 1, i)];
        System.arraycopy(this.a, 0, cArr, 0, this.b);
        this.a = cArr;
    }

    public void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.b + length;
        if (i > this.a.length) {
            c(i);
        }
        str.getChars(0, length, this.a, this.b);
        this.b = i;
    }

    public char b(int i) {
        return this.a[i];
    }

    public String d(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 > this.b) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= i2) {
            return new String(this.a, i, i2 - i);
        }
        throw new IndexOutOfBoundsException();
    }

    public String e(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 > this.b) {
            throw new IndexOutOfBoundsException();
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException();
        }
        while (i < i2 && g.a(this.a[i])) {
            i++;
        }
        while (i2 > i && g.a(this.a[i2 - 1])) {
            i2--;
        }
        return new String(this.a, i, i2 - i);
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }
}
