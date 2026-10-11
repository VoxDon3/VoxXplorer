package ax.T1;

import android.text.Layout;

/* loaded from: classes.dex */
final class g {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private String l;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private b r;
    private String t;
    private String u;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    private g t(g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.c && gVar.c) {
                z(gVar.b);
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.a == null && (str = gVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.g == -1) {
                this.g = gVar.g;
            }
            if (this.n == -1) {
                this.n = gVar.n;
            }
            if (this.o == null && (alignment2 = gVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = gVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = gVar.q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.r == null) {
                this.r = gVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gVar.s;
            }
            if (this.t == null) {
                this.t = gVar.t;
            }
            if (this.u == null) {
                this.u = gVar.u;
            }
            if (z && !this.e && gVar.e) {
                w(gVar.d);
            }
            if (z && this.m == -1 && (i = gVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public g A(String str) {
        this.a = str;
        return this;
    }

    public g B(float f) {
        this.k = f;
        return this;
    }

    public g C(int i) {
        this.j = i;
        return this;
    }

    public g D(String str) {
        this.l = str;
        return this;
    }

    public g E(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public g F(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public g H(String str) {
        this.t = str;
        return this;
    }

    public g I(int i) {
        this.n = i;
        return this;
    }

    public g J(int i) {
        this.m = i;
        return this;
    }

    public g K(float f) {
        this.s = f;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public g M(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.r = bVar;
        return this;
    }

    public g O(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
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
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
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

    public g w(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public g x(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.u = str;
        return this;
    }

    public g z(int i) {
        this.b = i;
        this.c = true;
        return this;
    }
}
