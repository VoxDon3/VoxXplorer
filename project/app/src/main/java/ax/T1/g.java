/*
 * Decompiled with CFR 0.152.
 */
package ax.T1;

import android.text.Layout;
import ax.T1.b;

final class g {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private int m = -1;
    private int n = -1;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private int q = -1;
    private b r;
    private float s = Float.MAX_VALUE;
    private String t;
    private String u;

    private g t(g g8, boolean bl) {
        if (g8 != null) {
            int n8;
            String string;
            if (!this.c && g8.c) {
                this.z(g8.b);
            }
            if (this.h == -1) {
                this.h = g8.h;
            }
            if (this.i == -1) {
                this.i = g8.i;
            }
            if (this.a == null && (string = g8.a) != null) {
                this.a = string;
            }
            if (this.f == -1) {
                this.f = g8.f;
            }
            if (this.g == -1) {
                this.g = g8.g;
            }
            if (this.n == -1) {
                this.n = g8.n;
            }
            if (this.o == null && (string = g8.o) != null) {
                this.o = string;
            }
            if (this.p == null && (string = g8.p) != null) {
                this.p = string;
            }
            if (this.q == -1) {
                this.q = g8.q;
            }
            if (this.j == -1) {
                this.j = g8.j;
                this.k = g8.k;
            }
            if (this.r == null) {
                this.r = g8.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = g8.s;
            }
            if (this.t == null) {
                this.t = g8.t;
            }
            if (this.u == null) {
                this.u = g8.u;
            }
            if (bl && !this.e && g8.e) {
                this.w(g8.d);
            }
            if (bl && this.m == -1 && (n8 = g8.m) != -1) {
                this.m = n8;
            }
        }
        return this;
    }

    public g A(String string) {
        this.a = string;
        return this;
    }

    public g B(float f8) {
        this.k = f8;
        return this;
    }

    public g C(int n8) {
        this.j = n8;
        return this;
    }

    public g D(String string) {
        this.l = string;
        return this;
    }

    public g E(boolean bl) {
        this.i = bl ? 1 : 0;
        return this;
    }

    public g F(boolean bl) {
        this.f = bl ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public g H(String string) {
        this.t = string;
        return this;
    }

    public g I(int n8) {
        this.n = n8;
        return this;
    }

    public g J(int n8) {
        this.m = n8;
        return this;
    }

    public g K(float f8) {
        this.s = f8;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public g M(boolean bl) {
        this.q = bl ? 1 : 0;
        return this;
    }

    public g N(b b8) {
        this.r = b8;
        return this;
    }

    public g O(boolean bl) {
        this.g = bl ? 1 : 0;
        return this;
    }

    public g a(g g8) {
        return this.t(g8, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.u;
    }

    public int d() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.a;
    }

    public float f() {
        return this.k;
    }

    public int g() {
        return this.j;
    }

    public String h() {
        return this.l;
    }

    public Layout.Alignment i() {
        return this.p;
    }

    public String j() {
        return this.t;
    }

    public int k() {
        return this.n;
    }

    public int l() {
        return this.m;
    }

    public float m() {
        return this.s;
    }

    public int n() {
        int n8 = this.h;
        if (n8 == -1 && this.i == -1) {
            return -1;
        }
        int n9 = 0;
        n8 = n8 == 1 ? 1 : 0;
        if (this.i == 1) {
            n9 = 2;
        }
        return n8 | n9;
    }

    public Layout.Alignment o() {
        return this.o;
    }

    public boolean p() {
        return this.q == 1;
    }

    public b q() {
        return this.r;
    }

    public boolean r() {
        return this.e;
    }

    public boolean s() {
        return this.c;
    }

    public boolean u() {
        return this.f == 1;
    }

    public boolean v() {
        return this.g == 1;
    }

    public g w(int n8) {
        this.d = n8;
        this.e = true;
        return this;
    }

    public g x(boolean bl) {
        this.h = bl ? 1 : 0;
        return this;
    }

    public g y(String string) {
        this.u = string;
        return this;
    }

    public g z(int n8) {
        this.b = n8;
        this.c = true;
        return this;
    }
}

