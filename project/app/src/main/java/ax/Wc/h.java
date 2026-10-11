/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.g;

public class h {
    static final g[] d = new g[0];
    private g[] a;
    private int b;
    private boolean c;

    public h() {
        this(10);
    }

    public h(int n8) {
        if (n8 >= 0) {
            g[] gArray = n8 == 0 ? d : new g[n8];
            this.a = gArray;
            this.b = 0;
            this.c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    static g[] b(g[] gArray) {
        if (gArray.length < 1) {
            return d;
        }
        return (g[])gArray.clone();
    }

    private void e(int n8) {
        g[] gArray = new g[Math.max(this.a.length, n8 + (n8 >> 1))];
        System.arraycopy(this.a, 0, gArray, 0, this.b);
        this.a = gArray;
        this.c = false;
    }

    public void a(g g8) {
        if (g8 != null) {
            int n8 = this.a.length;
            int n9 = this.b;
            boolean bl = true;
            if (++n9 <= n8) {
                bl = false;
            }
            if (this.c | bl) {
                this.e(n9);
            }
            this.a[this.b] = g8;
            this.b = n9;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    g[] c() {
        int n8 = this.b;
        if (n8 == 0) {
            return d;
        }
        g[] gArray = new g[n8];
        System.arraycopy(this.a, 0, gArray, 0, n8);
        return gArray;
    }

    public g d(int n8) {
        if (n8 < this.b) {
            return this.a[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append(" >= ");
        stringBuilder.append(this.b);
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public int f() {
        return this.b;
    }

    g[] g() {
        int n8 = this.b;
        if (n8 == 0) {
            return d;
        }
        g[] gArray = this.a;
        if (gArray.length == n8) {
            this.c = true;
            return gArray;
        }
        g[] gArray2 = new g[n8];
        System.arraycopy(gArray, 0, gArray2, 0, n8);
        return gArray2;
    }
}

