package ax.Zd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes3.dex */
public class m implements ax.Xd.d {
    private volatile ax.Xd.d c0;
    private Boolean d0;
    private Method e0;
    private ax.Yd.a f0;
    private final Queue<ax.Yd.d> g0;
    public final boolean h0;
    private final String q;

    public m(String str, Queue<ax.Yd.d> queue, boolean z) {
        this.q = str;
        this.g0 = queue;
        this.h0 = z;
    }

    private ax.Xd.d E() {
        if (this.f0 == null) {
            this.f0 = new ax.Yd.a(this, this.g0);
        }
        return this.f0;
    }

    @Override // ax.Xd.d
    public void A(String str) {
        D().A(str);
    }

    @Override // ax.Xd.d
    public void B(String str, Object... objArr) {
        D().B(str, objArr);
    }

    @Override // ax.Xd.d
    public void C(String str, Object obj, Object obj2) {
        D().C(str, obj, obj2);
    }

    public ax.Xd.d D() {
        return this.c0 != null ? this.c0 : this.h0 ? f.q : E();
    }

    public boolean F() {
        Boolean bool = this.d0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.e0 = this.c0.getClass().getMethod("log", ax.Yd.c.class);
            this.d0 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.d0 = Boolean.FALSE;
        }
        return this.d0.booleanValue();
    }

    public boolean G() {
        return this.c0 instanceof f;
    }

    public boolean H() {
        return this.c0 == null;
    }

    public void I(ax.Yd.c cVar) {
        if (F()) {
            try {
                this.e0.invoke(this.c0, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void J(ax.Xd.d dVar) {
        this.c0 = dVar;
    }

    @Override // ax.Xd.d
    public void a(String str, Object obj) {
        D().a(str, obj);
    }

    @Override // ax.Xd.d
    public void b(String str, Object obj) {
        D().b(str, obj);
    }

    @Override // ax.Xd.d
    public boolean c() {
        return D().c();
    }

    @Override // ax.Xd.d
    public void d(String str, Object obj, Object obj2) {
        D().d(str, obj, obj2);
    }

    @Override // ax.Xd.d
    public boolean e() {
        return D().e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.q.equals(((m) obj).q);
    }

    @Override // ax.Xd.d
    public void f(String str) {
        D().f(str);
    }

    @Override // ax.Xd.d
    public void g(String str, Object obj) {
        D().g(str, obj);
    }

    @Override // ax.Xd.d
    public String getName() {
        return this.q;
    }

    @Override // ax.Xd.d
    public void h(String str, Throwable th) {
        D().h(str, th);
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.Xd.d
    public void i(String str, Object obj, Object obj2) {
        D().i(str, obj, obj2);
    }

    @Override // ax.Xd.d
    public boolean j() {
        return D().j();
    }

    @Override // ax.Xd.d
    public void k(String str, Object... objArr) {
        D().k(str, objArr);
    }

    @Override // ax.Xd.d
    public boolean l() {
        return D().l();
    }

    @Override // ax.Xd.d
    public void m(String str, Object obj, Object obj2) {
        D().m(str, obj, obj2);
    }

    @Override // ax.Xd.d
    public void n(String str) {
        D().n(str);
    }

    @Override // ax.Xd.d
    public boolean o() {
        return D().o();
    }

    @Override // ax.Xd.d
    public void p(String str, Object obj, Object obj2) {
        D().p(str, obj, obj2);
    }

    @Override // ax.Xd.d
    public void q(String str, Object... objArr) {
        D().q(str, objArr);
    }

    @Override // ax.Xd.d
    public boolean r(ax.Yd.b bVar) {
        return D().r(bVar);
    }

    @Override // ax.Xd.d
    public void s(String str, Object obj) {
        D().s(str, obj);
    }

    @Override // ax.Xd.d
    public void t(String str, Object obj) {
        D().t(str, obj);
    }

    @Override // ax.Xd.d
    public void u(String str, Object... objArr) {
        D().u(str, objArr);
    }

    @Override // ax.Xd.d
    public void v(String str, Throwable th) {
        D().v(str, th);
    }

    @Override // ax.Xd.d
    public void w(String str, Throwable th) {
        D().w(str, th);
    }

    @Override // ax.Xd.d
    public void x(String str, Throwable th) {
        D().x(str, th);
    }

    @Override // ax.Xd.d
    public void y(String str, Throwable th) {
        D().y(str, th);
    }

    @Override // ax.Xd.d
    public void z(String str) {
        D().z(str);
    }
}
