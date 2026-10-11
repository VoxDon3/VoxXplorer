/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.he.g;

final class f {
    final g a = new g();
    final int[] b = new int[4];
    int c;
    int d;
    int e;
    boolean f;
    boolean g;
    int h;
    int i;

    f() {
    }

    void a() {
        this.c = 0x40000000;
    }

    void b(int n8, int n9, int n10) {
        this.c = n8;
        this.d = n9;
        this.e = n10;
        this.f = false;
    }

    void c(int n8, int n9, int n10) {
        this.c = n8;
        this.d = n9 + 1;
        this.e = n10;
        this.f = true;
        this.g = false;
    }

    void d(int n8, int n9, int n10, int n11, int n12) {
        this.c = n8;
        this.d = n11 + n9 + 1;
        this.e = n12;
        this.f = true;
        this.g = true;
        this.h = n9;
        this.i = n10;
    }
}

