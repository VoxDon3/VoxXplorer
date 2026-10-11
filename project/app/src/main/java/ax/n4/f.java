/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.n4.g;

public final class f {
    private char[] a;
    private int b;

    public f(int n8) {
        if (n8 >= 0) {
            this.a = new char[n8];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void c(int n8) {
        char[] cArray = new char[Math.max(this.a.length << 1, n8)];
        System.arraycopy(this.a, 0, cArray, 0, this.b);
        this.a = cArray;
    }

    public void a(String string) {
        int n8;
        int n9;
        String string2 = string;
        if (string == null) {
            string2 = "null";
        }
        if ((n9 = this.b + (n8 = string2.length())) > this.a.length) {
            this.c(n9);
        }
        string2.getChars(0, n8, this.a, this.b);
        this.b = n9;
    }

    public char b(int n8) {
        return this.a[n8];
    }

    public String d(int n8, int n9) {
        if (n8 >= 0) {
            if (n9 <= this.b) {
                if (n8 <= n9) {
                    return new String(this.a, n8, n9 - n8);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public String e(int n8, int n9) {
        if (n8 >= 0) {
            if (n9 <= this.b) {
                if (n8 <= n9) {
                    int n10;
                    while (true) {
                        n10 = n9;
                        if (n8 >= n9) break;
                        n10 = n9;
                        if (!g.a(this.a[n8])) break;
                        ++n8;
                    }
                    while (n10 > n8 && g.a(this.a[n10 - 1])) {
                        --n10;
                    }
                    return new String(this.a, n8, n10 - n8);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }
}

