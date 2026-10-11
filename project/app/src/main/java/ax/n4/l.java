/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

public class l {
    private final int a;
    private final int b;
    private int c;

    public l(int n8, int n9) {
        if (n8 >= 0) {
            if (n8 <= n9) {
                this.a = n8;
                this.b = n9;
                this.c = n8;
                return;
            }
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be negative");
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

    public void d(int n8) {
        if (n8 >= this.a) {
            if (n8 <= this.b) {
                this.c = n8;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append('[');
        stringBuilder.append(this.a);
        stringBuilder.append('>');
        stringBuilder.append(this.c);
        stringBuilder.append('>');
        stringBuilder.append(this.b);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

