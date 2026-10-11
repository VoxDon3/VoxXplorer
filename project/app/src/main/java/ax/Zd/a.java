/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

import ax.Xd.c;
import ax.Xd.d;
import ax.Xd.g;
import ax.Yd.b;
import ax.Zd.e;
import java.io.Serializable;

public abstract class a
implements d,
Serializable {
    private void D(b b8, g g8, String string, Object object, Object object2) {
        if (object2 instanceof Throwable) {
            object2 = (Throwable)object2;
            this.F(b8, g8, string, new Object[]{object}, (Throwable)object2);
            return;
        }
        this.F(b8, g8, string, new Object[]{object, object2}, null);
    }

    private void E(b b8, g g8, String string, Object[] objectArray) {
        Throwable throwable = e.a(objectArray);
        if (throwable != null) {
            this.F(b8, g8, string, e.b(objectArray), throwable);
            return;
        }
        this.F(b8, g8, string, objectArray, null);
    }

    private void G(b b8, g g8, String string, Throwable throwable) {
        this.F(b8, g8, string, null, throwable);
    }

    private void H(b b8, g g8, String string, Object object) {
        this.F(b8, g8, string, new Object[]{object}, null);
    }

    @Override
    public void A(String string) {
        if (this.c()) {
            this.G(b.e0, null, string, null);
        }
    }

    @Override
    public void B(String string, Object ... objectArray) {
        if (this.l()) {
            this.E(b.f0, null, string, objectArray);
        }
    }

    @Override
    public void C(String string, Object object, Object object2) {
        if (this.l()) {
            this.D(b.f0, null, string, object, object2);
        }
    }

    protected abstract void F(b var1, g var2, String var3, Object[] var4, Throwable var5);

    @Override
    public void a(String string, Object object) {
        if (this.l()) {
            this.H(b.f0, null, string, object);
        }
    }

    @Override
    public void b(String string, Object object) {
        if (this.c()) {
            this.H(b.e0, null, string, object);
        }
    }

    @Override
    public void d(String string, Object object, Object object2) {
        if (this.e()) {
            this.D(b.g0, null, string, object, object2);
        }
    }

    @Override
    public void f(String string) {
        if (this.j()) {
            this.G(b.d0, null, string, null);
        }
    }

    @Override
    public void g(String string, Object object) {
        if (this.o()) {
            this.H(b.h0, null, string, object);
        }
    }

    @Override
    public void h(String string, Throwable throwable) {
        if (this.j()) {
            this.G(b.d0, null, string, throwable);
        }
    }

    @Override
    public void i(String string, Object object, Object object2) {
        if (this.o()) {
            this.D(b.h0, null, string, object, object2);
        }
    }

    @Override
    public void k(String string, Object ... objectArray) {
        if (this.c()) {
            this.E(b.e0, null, string, objectArray);
        }
    }

    @Override
    public void m(String string, Object object, Object object2) {
        if (this.c()) {
            this.D(b.e0, null, string, object, object2);
        }
    }

    @Override
    public void n(String string) {
        if (this.e()) {
            this.G(b.g0, null, string, null);
        }
    }

    @Override
    public void p(String string, Object object, Object object2) {
        if (this.j()) {
            this.D(b.d0, null, string, object, object2);
        }
    }

    @Override
    public void q(String string, Object ... objectArray) {
        if (this.j()) {
            this.E(b.d0, null, string, objectArray);
        }
    }

    @Override
    public /* synthetic */ boolean r(b b8) {
        return c.a(this, b8);
    }

    @Override
    public void s(String string, Object object) {
        if (this.e()) {
            this.H(b.g0, null, string, object);
        }
    }

    @Override
    public void t(String string, Object object) {
        if (this.j()) {
            this.H(b.d0, null, string, object);
        }
    }

    @Override
    public void u(String string, Object ... objectArray) {
        if (this.e()) {
            this.E(b.g0, null, string, objectArray);
        }
    }

    @Override
    public void v(String string, Throwable throwable) {
        if (this.l()) {
            this.G(b.f0, null, string, throwable);
        }
    }

    @Override
    public void w(String string, Throwable throwable) {
        if (this.c()) {
            this.G(b.e0, null, string, throwable);
        }
    }

    @Override
    public void x(String string, Throwable throwable) {
        if (this.o()) {
            this.G(b.h0, null, string, throwable);
        }
    }

    @Override
    public void y(String string, Throwable throwable) {
        if (this.e()) {
            this.G(b.g0, null, string, throwable);
        }
    }

    @Override
    public void z(String string) {
        if (this.l()) {
            this.G(b.f0, null, string, null);
        }
    }
}

