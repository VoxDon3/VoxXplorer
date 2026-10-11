package ax.Yd;

import ax.Xd.g;
import ax.Zd.m;
import java.util.Queue;

/* loaded from: classes3.dex */
public class a extends ax.Zd.d {
    m c0;
    Queue<d> d0;
    String q;

    public a(m mVar, Queue<d> queue) {
        this.c0 = mVar;
        this.q = mVar.getName();
        this.d0 = queue;
    }

    @Override // ax.Zd.a
    protected void F(b bVar, g gVar, String str, Object[] objArr, Throwable th) {
        d dVar = new d();
        dVar.k(System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.c0);
        dVar.g(this.q);
        if (gVar != null) {
            dVar.a(gVar);
        }
        dVar.h(str);
        dVar.i(Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th);
        this.d0.add(dVar);
    }

    @Override // ax.Xd.d
    public boolean c() {
        return true;
    }

    @Override // ax.Xd.d
    public boolean e() {
        return true;
    }

    @Override // ax.Xd.d
    public String getName() {
        return this.q;
    }

    @Override // ax.Xd.d
    public boolean j() {
        return true;
    }

    @Override // ax.Xd.d
    public boolean l() {
        return true;
    }

    @Override // ax.Xd.d
    public boolean o() {
        return true;
    }
}
