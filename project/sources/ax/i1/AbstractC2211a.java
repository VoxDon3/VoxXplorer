package ax.i1;

import android.os.Handler;
import android.os.Looper;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.Z0.I1;
import ax.b1.InterfaceC1471u;
import ax.i1.InterfaceC2209F;
import ax.i1.N;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: ax.i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2211a implements InterfaceC2209F {
    private final ArrayList<InterfaceC2209F.c> a = new ArrayList<>(1);
    private final HashSet<InterfaceC2209F.c> b = new HashSet<>(1);
    private final N.a c = new N.a();
    private final InterfaceC1471u.a d = new InterfaceC1471u.a();
    private Looper e;
    private ax.P0.N f;
    private I1 g;

    protected abstract void A(ax.U0.z zVar);

    protected final void B(ax.P0.N n) {
        this.f = n;
        ArrayList<InterfaceC2209F.c> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            InterfaceC2209F.c cVar = arrayList.get(i);
            i++;
            cVar.a(this, n);
        }
    }

    protected abstract void C();

    @Override // ax.i1.InterfaceC2209F
    public /* synthetic */ void a(C0915y c0915y) {
        C2207D.c(this, c0915y);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void b(InterfaceC2209F.c cVar) {
        this.a.remove(cVar);
        if (!this.a.isEmpty()) {
            q(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        C();
    }

    @Override // ax.i1.InterfaceC2209F
    public final void c(Handler handler, N n) {
        C0968a.e(handler);
        C0968a.e(n);
        this.c.h(handler, n);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void d(InterfaceC2209F.c cVar) {
        C0968a.e(this.e);
        boolean isEmpty = this.b.isEmpty();
        this.b.add(cVar);
        if (isEmpty) {
            w();
        }
    }

    @Override // ax.i1.InterfaceC2209F
    public final void g(N n) {
        this.c.x(n);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void l(InterfaceC2209F.c cVar, ax.U0.z zVar, I1 i1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        C0968a.a(looper == null || looper == myLooper);
        this.g = i1;
        ax.P0.N n = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(cVar);
            A(zVar);
        } else if (n != null) {
            d(cVar);
            cVar.a(this, n);
        }
    }

    @Override // ax.i1.InterfaceC2209F
    public /* synthetic */ boolean m() {
        return C2207D.b(this);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void n(InterfaceC1471u interfaceC1471u) {
        this.d.n(interfaceC1471u);
    }

    @Override // ax.i1.InterfaceC2209F
    public /* synthetic */ ax.P0.N o() {
        return C2207D.a(this);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void p(Handler handler, InterfaceC1471u interfaceC1471u) {
        C0968a.e(handler);
        C0968a.e(interfaceC1471u);
        this.d.g(handler, interfaceC1471u);
    }

    @Override // ax.i1.InterfaceC2209F
    public final void q(InterfaceC2209F.c cVar) {
        boolean isEmpty = this.b.isEmpty();
        this.b.remove(cVar);
        if (isEmpty || !this.b.isEmpty()) {
            return;
        }
        v();
    }

    protected final InterfaceC1471u.a r(int i, InterfaceC2209F.b bVar) {
        return this.d.o(i, bVar);
    }

    protected final InterfaceC1471u.a s(InterfaceC2209F.b bVar) {
        return this.d.o(0, bVar);
    }

    protected final N.a t(int i, InterfaceC2209F.b bVar) {
        return this.c.A(i, bVar);
    }

    protected final N.a u(InterfaceC2209F.b bVar) {
        return this.c.A(0, bVar);
    }

    protected final I1 x() {
        return (I1) C0968a.i(this.g);
    }

    protected final boolean y() {
        return !this.b.isEmpty();
    }

    public final void z(InterfaceC2209F.c cVar, ax.U0.z zVar) {
        l(cVar, zVar, I1.d);
    }

    protected void v() {
    }

    protected void w() {
    }
}
