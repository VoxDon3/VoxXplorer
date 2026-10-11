package ax.n4;

/* loaded from: classes.dex */
public class l {
    private final int a;
    private final int b;
    private int c;

    public l(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.a = i;
        this.b = i2;
        this.c = i;
    }

    public boolean a() {
        return this.c >= this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public void d(int i) {
        if (i < this.a) {
            throw new IndexOutOfBoundsException();
        }
        if (i > this.b) {
            throw new IndexOutOfBoundsException();
        }
        this.c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append('[');
        sb.append(this.a);
        sb.append('>');
        sb.append(this.c);
        sb.append('>');
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
