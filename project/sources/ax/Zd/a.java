package ax.Zd;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class a implements ax.Xd.d, Serializable {
    private void D(ax.Yd.b bVar, ax.Xd.g gVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            F(bVar, gVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            F(bVar, gVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void E(ax.Yd.b bVar, ax.Xd.g gVar, String str, Object[] objArr) {
        Throwable a = e.a(objArr);
        if (a != null) {
            F(bVar, gVar, str, e.b(objArr), a);
        } else {
            F(bVar, gVar, str, objArr, null);
        }
    }

    private void G(ax.Yd.b bVar, ax.Xd.g gVar, String str, Throwable th) {
        F(bVar, gVar, str, null, th);
    }

    private void H(ax.Yd.b bVar, ax.Xd.g gVar, String str, Object obj) {
        F(bVar, gVar, str, new Object[]{obj}, null);
    }

    @Override // ax.Xd.d
    public void A(String str) {
        if (c()) {
            G(ax.Yd.b.WARN, null, str, null);
        }
    }

    @Override // ax.Xd.d
    public void B(String str, Object... objArr) {
        if (l()) {
            E(ax.Yd.b.INFO, null, str, objArr);
        }
    }

    @Override // ax.Xd.d
    public void C(String str, Object obj, Object obj2) {
        if (l()) {
            D(ax.Yd.b.INFO, null, str, obj, obj2);
        }
    }

    protected abstract void F(ax.Yd.b bVar, ax.Xd.g gVar, String str, Object[] objArr, Throwable th);

    @Override // ax.Xd.d
    public void a(String str, Object obj) {
        if (l()) {
            H(ax.Yd.b.INFO, null, str, obj);
        }
    }

    @Override // ax.Xd.d
    public void b(String str, Object obj) {
        if (c()) {
            H(ax.Yd.b.WARN, null, str, obj);
        }
    }

    @Override // ax.Xd.d
    public void d(String str, Object obj, Object obj2) {
        if (e()) {
            D(ax.Yd.b.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // ax.Xd.d
    public void f(String str) {
        if (j()) {
            G(ax.Yd.b.ERROR, null, str, null);
        }
    }

    @Override // ax.Xd.d
    public void g(String str, Object obj) {
        if (o()) {
            H(ax.Yd.b.TRACE, null, str, obj);
        }
    }

    @Override // ax.Xd.d
    public void h(String str, Throwable th) {
        if (j()) {
            G(ax.Yd.b.ERROR, null, str, th);
        }
    }

    @Override // ax.Xd.d
    public void i(String str, Object obj, Object obj2) {
        if (o()) {
            D(ax.Yd.b.TRACE, null, str, obj, obj2);
        }
    }

    @Override // ax.Xd.d
    public void k(String str, Object... objArr) {
        if (c()) {
            E(ax.Yd.b.WARN, null, str, objArr);
        }
    }

    @Override // ax.Xd.d
    public void m(String str, Object obj, Object obj2) {
        if (c()) {
            D(ax.Yd.b.WARN, null, str, obj, obj2);
        }
    }

    @Override // ax.Xd.d
    public void n(String str) {
        if (e()) {
            G(ax.Yd.b.DEBUG, null, str, null);
        }
    }

    @Override // ax.Xd.d
    public void p(String str, Object obj, Object obj2) {
        if (j()) {
            D(ax.Yd.b.ERROR, null, str, obj, obj2);
        }
    }

    @Override // ax.Xd.d
    public void q(String str, Object... objArr) {
        if (j()) {
            E(ax.Yd.b.ERROR, null, str, objArr);
        }
    }

    @Override // ax.Xd.d
    public /* synthetic */ boolean r(ax.Yd.b bVar) {
        return ax.Xd.c.a(this, bVar);
    }

    @Override // ax.Xd.d
    public void s(String str, Object obj) {
        if (e()) {
            H(ax.Yd.b.DEBUG, null, str, obj);
        }
    }

    @Override // ax.Xd.d
    public void t(String str, Object obj) {
        if (j()) {
            H(ax.Yd.b.ERROR, null, str, obj);
        }
    }

    @Override // ax.Xd.d
    public void u(String str, Object... objArr) {
        if (e()) {
            E(ax.Yd.b.DEBUG, null, str, objArr);
        }
    }

    @Override // ax.Xd.d
    public void v(String str, Throwable th) {
        if (l()) {
            G(ax.Yd.b.INFO, null, str, th);
        }
    }

    @Override // ax.Xd.d
    public void w(String str, Throwable th) {
        if (c()) {
            G(ax.Yd.b.WARN, null, str, th);
        }
    }

    @Override // ax.Xd.d
    public void x(String str, Throwable th) {
        if (o()) {
            G(ax.Yd.b.TRACE, null, str, th);
        }
    }

    @Override // ax.Xd.d
    public void y(String str, Throwable th) {
        if (e()) {
            G(ax.Yd.b.DEBUG, null, str, th);
        }
    }

    @Override // ax.Xd.d
    public void z(String str) {
        if (l()) {
            G(ax.Yd.b.INFO, null, str, null);
        }
    }
}
