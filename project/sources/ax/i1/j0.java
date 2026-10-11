package ax.i1;

import android.net.Uri;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.U0.g;
import ax.U0.k;
import ax.i1.InterfaceC2209F;
import ax.i1.N;
import ax.n1.InterfaceExecutorC2572c;
import ax.q7.C2881h;
import ax.r7.AbstractC2991z;

@Deprecated
/* loaded from: classes.dex */
public final class j0 extends AbstractC2211a {
    private final ax.U0.k h;
    private final g.a i;
    private final C0912v j;
    private final long k;
    private final ax.m1.m l;
    private final boolean m;
    private final ax.P0.N n;
    private final C0915y o;
    private final ax.q7.u<InterfaceExecutorC2572c> p;
    private ax.U0.z q;

    public static final class b {
        private final g.a a;
        private ax.m1.m b = new ax.m1.k();
        private boolean c = true;
        private Object d;
        private String e;
        private ax.q7.u<InterfaceExecutorC2572c> f;

        public b(g.a aVar) {
            this.a = (g.a) C0968a.e(aVar);
        }

        public j0 a(C0915y.k kVar, long j) {
            return new j0(this.e, kVar, this.a, j, this.b, this.c, this.d, this.f);
        }

        public b b(ax.m1.m mVar) {
            if (mVar == null) {
                mVar = new ax.m1.k();
            }
            this.b = mVar;
            return this;
        }
    }

    @Override // ax.i1.AbstractC2211a
    protected void A(ax.U0.z zVar) {
        this.q = zVar;
        B(this.n);
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        ((i0) interfaceC2206C).w();
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        ax.U0.k kVar = this.h;
        g.a aVar = this.i;
        ax.U0.z zVar = this.q;
        C0912v c0912v = this.j;
        long j2 = this.k;
        ax.m1.m mVar = this.l;
        N.a u = u(bVar);
        boolean z = this.m;
        ax.q7.u<InterfaceExecutorC2572c> uVar = this.p;
        return new i0(kVar, aVar, zVar, c0912v, j2, mVar, u, z, uVar != null ? uVar.get() : null);
    }

    @Override // ax.i1.InterfaceC2209F
    public C0915y j() {
        return this.o;
    }

    private j0(String str, C0915y.k kVar, g.a aVar, long j, ax.m1.m mVar, boolean z, Object obj, ax.q7.u<InterfaceExecutorC2572c> uVar) {
        this.i = aVar;
        this.k = j;
        this.l = mVar;
        this.m = z;
        C0915y a2 = new C0915y.c().f(Uri.EMPTY).c(kVar.a.toString()).d(AbstractC2991z.A(kVar)).e(obj).a();
        this.o = a2;
        C0912v.b l0 = new C0912v.b().y0((String) C2881h.a(kVar.b, "text/x-unknown")).n0(kVar.c).A0(kVar.d).w0(kVar.e).l0(kVar.f);
        String str2 = kVar.g;
        this.j = l0.j0(str2 != null ? str2 : str).P();
        this.h = new k.b().i(kVar.a).b(1).a();
        this.n = new h0(j, true, false, false, null, a2);
        this.p = uVar;
    }

    @Override // ax.i1.AbstractC2211a
    protected void C() {
    }

    @Override // ax.i1.InterfaceC2209F
    public void k() {
    }
}
