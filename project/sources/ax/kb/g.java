package ax.kb;

import ax.mb.AbstractC2550d;
import ax.mb.C2547a;
import ax.mb.C2548b;

/* loaded from: classes3.dex */
public abstract class g extends AbstractC2550d implements c {
    protected int b = -1;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;

    @Override // ax.mb.AbstractC2550d
    public void a(C2547a c2547a) throws C2548b {
        c(c2547a);
        int i = this.b;
        if (i != 12 && i != 2 && i != 3 && i != 13) {
            throw new C2548b("Unexpected ptype: " + this.b);
        }
        if (i == 2 || i == 3) {
            this.f = c2547a.c();
            c2547a.d();
            c2547a.d();
        }
        int i2 = this.b;
        if (i2 == 3 || i2 == 13) {
            this.g = c2547a.c();
        } else {
            d(c2547a);
        }
    }

    @Override // ax.mb.AbstractC2550d
    public void b(C2547a c2547a) throws C2548b {
        int n = c2547a.n();
        c2547a.a(16);
        int i = 0;
        if (this.b == 0) {
            int n2 = c2547a.n();
            c2547a.h(0);
            c2547a.j(0);
            c2547a.j(g());
            i = n2;
        }
        f(c2547a);
        this.d = c2547a.n() - n;
        if (this.b == 0) {
            c2547a.q(i);
            int i2 = this.d - i;
            this.f = i2;
            c2547a.h(i2);
        }
        c2547a.q(n);
        e(c2547a);
        c2547a.q(n + this.d);
    }

    void c(C2547a c2547a) throws C2548b {
        if (c2547a.e() != 5 || c2547a.e() != 0) {
            throw new C2548b("DCERPC version not supported");
        }
        this.b = c2547a.e();
        this.c = c2547a.e();
        if (c2547a.c() != 16) {
            throw new C2548b("Data representation not supported");
        }
        this.d = c2547a.d();
        if (c2547a.d() != 0) {
            throw new C2548b("DCERPC authentication not supported");
        }
        this.e = c2547a.c();
    }

    public abstract void d(C2547a c2547a) throws C2548b;

    void e(C2547a c2547a) {
        c2547a.k(5);
        c2547a.k(0);
        c2547a.k(this.b);
        c2547a.k(this.c);
        c2547a.h(16);
        c2547a.j(this.d);
        c2547a.j(0);
        c2547a.h(this.e);
    }

    public abstract void f(C2547a c2547a) throws C2548b;

    public abstract int g();

    public e h() {
        if (this.g != 0) {
            return new e(this.g);
        }
        return null;
    }

    public boolean i(int i) {
        return (this.c & i) == i;
    }
}
