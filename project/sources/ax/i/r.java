package ax.i;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class r {
    private boolean a;
    private final CopyOnWriteArrayList<InterfaceC2187c> b = new CopyOnWriteArrayList<>();
    private ax.Fb.a<ax.sb.t> c;

    public r(boolean z) {
        this.a = z;
    }

    public final void a(InterfaceC2187c interfaceC2187c) {
        ax.Gb.l.f(interfaceC2187c, "cancellable");
        this.b.add(interfaceC2187c);
    }

    public final ax.Fb.a<ax.sb.t> b() {
        return this.c;
    }

    public abstract void d();

    public void e(C2186b c2186b) {
        ax.Gb.l.f(c2186b, "backEvent");
    }

    public void f(C2186b c2186b) {
        ax.Gb.l.f(c2186b, "backEvent");
    }

    public final boolean g() {
        return this.a;
    }

    public final void h() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC2187c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC2187c interfaceC2187c) {
        ax.Gb.l.f(interfaceC2187c, "cancellable");
        this.b.remove(interfaceC2187c);
    }

    public final void j(boolean z) {
        this.a = z;
        ax.Fb.a<ax.sb.t> aVar = this.c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(ax.Fb.a<ax.sb.t> aVar) {
        this.c = aVar;
    }

    public void c() {
    }
}
