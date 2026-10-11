/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.S0.a;

public final class j {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public j(byte[] byArray, int n8, int n9) {
        this.j(byArray, n8, n9);
    }

    private void a() {
        int n8;
        int n9 = this.c;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.b) || n9 == n8 && this.d == 0);
        ax.S0.a.g(bl);
    }

    private int g() {
        int n8 = 0;
        int n9 = 0;
        while (!this.e()) {
            ++n9;
        }
        if (n9 > 0) {
            n8 = this.f(n9);
        }
        return (1 << n9) - 1 + n8;
    }

    private boolean k(int n8) {
        byte[] byArray;
        return 2 <= n8 && n8 < this.b && (byArray = this.a)[n8] == 3 && byArray[n8 - 2] == 0 && byArray[n8 - 1] == 0;
    }

    public void b() {
        int n8 = this.d;
        if (n8 > 0) {
            this.m(8 - n8);
        }
    }

    public boolean c(int n8) {
        int n9 = this.c;
        int n10 = n8 / 8;
        int n11 = n9 + n10;
        int n12 = this.d + n8 - n10 * 8;
        n8 = n11;
        n10 = n12;
        if (n12 > 7) {
            n8 = n11 + 1;
            n10 = n12 - 8;
        }
        boolean bl = true;
        n11 = n8;
        n8 = n9;
        while ((n9 = n8 + 1) <= n11 && n11 < this.b) {
            n8 = n9;
            if (!this.k(n9)) continue;
            ++n11;
            n8 = n9 + 2;
        }
        n8 = this.b;
        boolean bl2 = bl;
        if (n11 >= n8) {
            bl2 = n11 == n8 && n10 == 0 ? bl : false;
        }
        return bl2;
    }

    public boolean d() {
        int n8 = this.c;
        int n9 = this.d;
        int n10 = 0;
        while (this.c < this.b && !this.e()) {
            ++n10;
        }
        boolean bl = this.c == this.b;
        this.c = n8;
        this.d = n9;
        return !bl && this.c(n10 * 2 + 1);
    }

    public boolean e() {
        boolean bl = (this.a[this.c] & 128 >> this.d) != 0;
        this.l();
        return bl;
    }

    public int f(int n8) {
        int n9;
        byte[] byArray;
        int n10;
        int n11;
        this.d += n8;
        int n12 = 0;
        while (true) {
            n11 = this.d;
            n10 = 2;
            if (n11 <= 8) break;
            this.d = n11 -= 8;
            byArray = this.a;
            n9 = this.c;
            n12 |= (byArray[n9] & 0xFF) << n11;
            if (!this.k(n9 + 1)) {
                n10 = 1;
            }
            this.c = n9 + n10;
        }
        byArray = this.a;
        n9 = this.c;
        byte by = byArray[n9];
        if (n11 == 8) {
            this.d = 0;
            if (!this.k(n9 + 1)) {
                n10 = 1;
            }
            this.c = n9 + n10;
        }
        this.a();
        return -1 >>> 32 - n8 & (n12 | (by & 0xFF) >> 8 - n11);
    }

    public int h() {
        int n8 = this.g();
        int n9 = n8 % 2 == 0 ? -1 : 1;
        return n9 * ((n8 + 1) / 2);
    }

    public int i() {
        return this.g();
    }

    public void j(byte[] byArray, int n8, int n9) {
        this.a = byArray;
        this.c = n8;
        this.b = n9;
        this.d = 0;
        this.a();
    }

    public void l() {
        int n8 = this.d;
        int n9 = 1;
        this.d = ++n8;
        if (n8 == 8) {
            this.d = 0;
            n8 = this.c;
            if (this.k(n8 + 1)) {
                n9 = 2;
            }
            this.c = n8 + n9;
        }
        this.a();
    }

    public void m(int n8) {
        int n9;
        int n10 = this.c;
        int n11 = n8 / 8;
        this.c = n9 = n10 + n11;
        this.d = n11 = this.d + (n8 - n11 * 8);
        n8 = n10;
        if (n11 > 7) {
            this.c = n9 + 1;
            this.d = n11 - 8;
            n8 = n10;
        }
        while ((n10 = n8 + 1) <= this.c) {
            n8 = n10;
            if (!this.k(n10)) continue;
            ++this.c;
            n8 = n10 + 2;
        }
        this.a();
    }
}

