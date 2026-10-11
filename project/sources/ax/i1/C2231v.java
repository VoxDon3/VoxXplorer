package ax.i1;

import ax.N1.t;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import ax.m1.f;

/* renamed from: ax.i1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2231v extends AbstractC2211a {
    private final InterfaceC2229t h;
    private final long i;
    private C0915y j;

    @Override // ax.i1.AbstractC2211a
    protected void A(ax.U0.z zVar) {
        B(new h0(this.i, true, false, false, null, j()));
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public synchronized void a(C0915y c0915y) {
        this.j = c0915y;
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        ((C2230u) interfaceC2206C).k();
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        C0915y j2 = j();
        C0968a.e(j2.b);
        C0968a.f(j2.b.b, "Externally loaded mediaItems require a MIME type.");
        C0915y.h hVar = j2.b;
        return new C2230u(hVar.a, hVar.b, this.h);
    }

    @Override // ax.i1.InterfaceC2209F
    public synchronized C0915y j() {
        return this.j;
    }

    private C2231v(C0915y c0915y, long j, InterfaceC2229t interfaceC2229t) {
        this.j = c0915y;
        this.i = j;
        this.h = interfaceC2229t;
    }

    /* renamed from: ax.i1.v$b */
    public static final class b implements InterfaceC2209F.a {
        private final long a;
        private final InterfaceC2229t b;

        public b(long j, InterfaceC2229t interfaceC2229t) {
            this.a = j;
            this.b = interfaceC2229t;
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a a(t.a aVar) {
            return C2208E.d(this, aVar);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a b(int i) {
            return C2208E.b(this, i);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a c(boolean z) {
            return C2208E.a(this, z);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public /* synthetic */ InterfaceC2209F.a d(f.a aVar) {
            return C2208E.c(this, aVar);
        }

        @Override // ax.i1.InterfaceC2209F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C2231v e(C0915y c0915y) {
            return new C2231v(c0915y, this.a, this.b);
        }

        @Override // ax.i1.InterfaceC2209F.a
        public InterfaceC2209F.a f(ax.b1.z zVar) {
            return this;
        }

        @Override // ax.i1.InterfaceC2209F.a
        public InterfaceC2209F.a g(ax.m1.m mVar) {
            return this;
        }
    }

    @Override // ax.i1.AbstractC2211a
    protected void C() {
    }

    @Override // ax.i1.InterfaceC2209F
    public void k() {
    }
}
