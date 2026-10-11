/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

import ax.Yd.a;
import ax.Yd.b;
import ax.Yd.c;
import ax.Yd.d;
import ax.Zd.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public class m
implements ax.Xd.d {
    private volatile ax.Xd.d c0;
    private Boolean d0;
    private Method e0;
    private a f0;
    private final Queue<d> g0;
    public final boolean h0;
    private final String q;

    public m(String string, Queue<d> queue, boolean bl) {
        this.q = string;
        this.g0 = queue;
        this.h0 = bl;
    }

    private ax.Xd.d E() {
        if (this.f0 == null) {
            this.f0 = new a(this, this.g0);
        }
        return this.f0;
    }

    @Override
    public void A(String string) {
        this.D().A(string);
    }

    @Override
    public void B(String string, Object ... objectArray) {
        this.D().B(string, objectArray);
    }

    @Override
    public void C(String string, Object object, Object object2) {
        this.D().C(string, object, object2);
    }

    public ax.Xd.d D() {
        if (this.c0 != null) {
            return this.c0;
        }
        if (this.h0) {
            return f.q;
        }
        return this.E();
    }

    public boolean F() {
        Boolean bl = this.d0;
        if (bl != null) {
            return bl;
        }
        try {
            this.e0 = this.c0.getClass().getMethod("log", c.class);
            this.d0 = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.d0 = Boolean.FALSE;
        }
        return this.d0;
    }

    public boolean G() {
        return this.c0 instanceof f;
    }

    public boolean H() {
        return this.c0 == null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void I(c c8) {
        if (!this.F()) return;
        try {
            this.e0.invoke(this.c0, c8);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public void J(ax.Xd.d d8) {
        this.c0 = d8;
    }

    @Override
    public void a(String string, Object object) {
        this.D().a(string, object);
    }

    @Override
    public void b(String string, Object object) {
        this.D().b(string, object);
    }

    @Override
    public boolean c() {
        return this.D().c();
    }

    @Override
    public void d(String string, Object object, Object object2) {
        this.D().d(string, object, object2);
    }

    @Override
    public boolean e() {
        return this.D().e();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (m)object;
            return this.q.equals(((m)object).q);
        }
        return false;
    }

    @Override
    public void f(String string) {
        this.D().f(string);
    }

    @Override
    public void g(String string, Object object) {
        this.D().g(string, object);
    }

    @Override
    public String getName() {
        return this.q;
    }

    @Override
    public void h(String string, Throwable throwable) {
        this.D().h(string, throwable);
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public void i(String string, Object object, Object object2) {
        this.D().i(string, object, object2);
    }

    @Override
    public boolean j() {
        return this.D().j();
    }

    @Override
    public void k(String string, Object ... objectArray) {
        this.D().k(string, objectArray);
    }

    @Override
    public boolean l() {
        return this.D().l();
    }

    @Override
    public void m(String string, Object object, Object object2) {
        this.D().m(string, object, object2);
    }

    @Override
    public void n(String string) {
        this.D().n(string);
    }

    @Override
    public boolean o() {
        return this.D().o();
    }

    @Override
    public void p(String string, Object object, Object object2) {
        this.D().p(string, object, object2);
    }

    @Override
    public void q(String string, Object ... objectArray) {
        this.D().q(string, objectArray);
    }

    @Override
    public boolean r(b b8) {
        return this.D().r(b8);
    }

    @Override
    public void s(String string, Object object) {
        this.D().s(string, object);
    }

    @Override
    public void t(String string, Object object) {
        this.D().t(string, object);
    }

    @Override
    public void u(String string, Object ... objectArray) {
        this.D().u(string, objectArray);
    }

    @Override
    public void v(String string, Throwable throwable) {
        this.D().v(string, throwable);
    }

    @Override
    public void w(String string, Throwable throwable) {
        this.D().w(string, throwable);
    }

    @Override
    public void x(String string, Throwable throwable) {
        this.D().x(string, throwable);
    }

    @Override
    public void y(String string, Throwable throwable) {
        this.D().y(string, throwable);
    }

    @Override
    public void z(String string) {
        this.D().z(string);
    }
}

