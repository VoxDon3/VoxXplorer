/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import ax.b0.g;

final class A {
    private final a a;
    private final int b;
    private int c = -1;

    A(int n8, a a8) {
        this.b = n8;
        this.a = a8;
    }

    private void a(int n8, int n9) {
        boolean bl = this.c == -1;
        g.b(bl, "End has already been set.");
        this.c = n8;
        int n10 = this.b;
        if (n8 > n10) {
            this.f(n10 + 1, n8, true, n9);
            return;
        }
        if (n8 < n10) {
            this.f(n8, n10 - 1, true, n9);
        }
    }

    private void c(int n8, int n9) {
        int n10 = this.c;
        if (n8 < n10) {
            int n11 = this.b;
            if (n8 < n11) {
                this.f(n11 + 1, n10, false, n9);
                this.f(n8, this.b - 1, true, n9);
                return;
            }
            this.f(n8 + 1, n10, false, n9);
            return;
        }
        if (n8 > n10) {
            this.f(n10 + 1, n8, true, n9);
        }
    }

    private void d(int n8, int n9) {
        int n10 = this.c;
        if (n8 > n10) {
            int n11 = this.b;
            if (n8 > n11) {
                this.f(n10, n11 - 1, false, n9);
                this.f(this.b + 1, n8, true, n9);
                return;
            }
            this.f(n10, n8 - 1, false, n9);
            return;
        }
        if (n8 < n10) {
            this.f(n8, n10 - 1, true, n9);
        }
    }

    private void e(int n8, int n9) {
        int n10 = this.c;
        boolean bl = false;
        boolean bl2 = n10 != -1;
        g.b(bl2, "End must already be set.");
        bl2 = bl;
        if (this.b != this.c) {
            bl2 = true;
        }
        g.b(bl2, "Beging and end point to same position.");
        n10 = this.c;
        int n11 = this.b;
        if (n10 > n11) {
            this.c(n8, n9);
        } else if (n10 < n11) {
            this.d(n8, n9);
        }
        this.c = n8;
    }

    private void f(int n8, int n9, boolean bl, int n10) {
        this.a.a(n8, n9, bl, n10);
    }

    void b(int n8, int n9) {
        boolean bl = n8 != -1;
        g.b(bl, "Position cannot be NO_POSITION.");
        int n10 = this.c;
        if (n10 != -1 && n10 != this.b) {
            this.e(n8, n9);
            return;
        }
        this.c = -1;
        this.a(n8, n9);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Range{begin=");
        stringBuilder.append(this.b);
        stringBuilder.append(", end=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static abstract class a {
        a() {
        }

        abstract void a(int var1, int var2, boolean var3, int var4);
    }
}

