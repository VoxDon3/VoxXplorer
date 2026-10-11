/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.c;
import ax.kb.e;
import ax.mb.a;
import ax.mb.b;
import ax.mb.d;

public abstract class g
extends d
implements c {
    protected int b = -1;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;

    @Override
    public void a(a object) throws b {
        this.c((a)object);
        int n8 = this.b;
        if (n8 != 12 && n8 != 2 && n8 != 3 && n8 != 13) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected ptype: ");
            ((StringBuilder)object).append(this.b);
            throw new b(((StringBuilder)object).toString());
        }
        if (n8 == 2 || n8 == 3) {
            this.f = ((a)object).c();
            ((a)object).d();
            ((a)object).d();
        }
        if ((n8 = this.b) != 3 && n8 != 13) {
            this.d((a)object);
            return;
        }
        this.g = ((a)object).c();
    }

    @Override
    public void b(a a8) throws b {
        int n8 = a8.n();
        a8.a(16);
        int n9 = this.b;
        int n10 = 0;
        if (n9 == 0) {
            n10 = a8.n();
            a8.h(0);
            a8.j(0);
            a8.j(this.g());
        }
        this.f(a8);
        this.d = a8.n() - n8;
        if (this.b == 0) {
            a8.q(n10);
            this.f = n10 = this.d - n10;
            a8.h(n10);
        }
        a8.q(n8);
        this.e(a8);
        a8.q(n8 + this.d);
    }

    void c(a a8) throws b {
        if (a8.e() == 5 && a8.e() == 0) {
            this.b = a8.e();
            this.c = a8.e();
            if (a8.c() == 16) {
                this.d = a8.d();
                if (a8.d() == 0) {
                    this.e = a8.c();
                    return;
                }
                throw new b("DCERPC authentication not supported");
            }
            throw new b("Data representation not supported");
        }
        throw new b("DCERPC version not supported");
    }

    public abstract void d(a var1) throws b;

    void e(a a8) {
        a8.k(5);
        a8.k(0);
        a8.k(this.b);
        a8.k(this.c);
        a8.h(16);
        a8.j(this.d);
        a8.j(0);
        a8.h(this.e);
    }

    public abstract void f(a var1) throws b;

    public abstract int g();

    public e h() {
        if (this.g != 0) {
            return new e(this.g);
        }
        return null;
    }

    public boolean i(int n8) {
        return (this.c & n8) == n8;
    }
}

