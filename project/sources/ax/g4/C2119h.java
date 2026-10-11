package ax.g4;

import android.graphics.drawable.Drawable;
import android.util.Log;
import ax.P3.i;
import ax.P3.o;
import ax.P3.s;
import ax.b0.InterfaceC1443d;
import ax.l4.AbstractC2469b;
import ax.l4.C2468a;
import ax.o.C2653a;
import okhttp3.HttpUrl;

/* renamed from: ax.g4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2119h<R> implements InterfaceC2113b, ax.h4.d, InterfaceC2118g, C2468a.f {
    private static final InterfaceC1443d<C2119h<?>> x0 = C2468a.d(150, new a());
    private static boolean y0 = true;
    private InterfaceC2114c d0;
    private ax.J3.e e0;
    private Object f0;
    private Class<R> g0;
    private C2117f h0;
    private int i0;
    private int j0;
    private ax.J3.g k0;
    private ax.h4.e<R> l0;
    private ax.P3.i m0;
    private ax.i4.c<? super R> n0;
    private s<R> o0;
    private i.d p0;
    private long q0;
    private b r0;
    private Drawable s0;
    private Drawable t0;
    private Drawable u0;
    private int v0;
    private int w0;
    private final String q = String.valueOf(super.hashCode());
    private final AbstractC2469b c0 = AbstractC2469b.a();

    /* renamed from: ax.g4.h$a */
    static class a implements C2468a.d<C2119h<?>> {
        a() {
        }

        @Override // ax.l4.C2468a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2119h<?> a() {
            return new C2119h<>();
        }
    }

    /* renamed from: ax.g4.h$b */
    private enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    C2119h() {
    }

    private void A(s<?> sVar) {
        this.m0.k(sVar);
        this.o0 = null;
    }

    private void B() {
        if (g()) {
            Drawable n = this.f0 == null ? n() : null;
            if (n == null) {
                n = m();
            }
            if (n == null) {
                n = o();
            }
            this.l0.i(n);
        }
    }

    private boolean g() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c == null || interfaceC2114c.b(this);
    }

    private boolean j() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c == null || interfaceC2114c.g(this);
    }

    private Drawable m() {
        if (this.s0 == null) {
            Drawable m = this.h0.m();
            this.s0 = m;
            if (m == null && this.h0.l() > 0) {
                this.s0 = r(this.h0.l());
            }
        }
        return this.s0;
    }

    private Drawable n() {
        if (this.u0 == null) {
            Drawable n = this.h0.n();
            this.u0 = n;
            if (n == null && this.h0.o() > 0) {
                this.u0 = r(this.h0.o());
            }
        }
        return this.u0;
    }

    private Drawable o() {
        if (this.t0 == null) {
            Drawable w = this.h0.w();
            this.t0 = w;
            if (w == null && this.h0.x() > 0) {
                this.t0 = r(this.h0.x());
            }
        }
        return this.t0;
    }

    private void p(ax.J3.e eVar, Object obj, Class<R> cls, C2117f c2117f, int i, int i2, ax.J3.g gVar, ax.h4.e<R> eVar2, InterfaceC2116e<R> interfaceC2116e, InterfaceC2114c interfaceC2114c, ax.P3.i iVar, ax.i4.c<? super R> cVar) {
        this.e0 = eVar;
        this.f0 = obj;
        this.g0 = cls;
        this.h0 = c2117f;
        this.i0 = i;
        this.j0 = i2;
        this.k0 = gVar;
        this.l0 = eVar2;
        this.d0 = interfaceC2114c;
        this.m0 = iVar;
        this.n0 = cVar;
        this.r0 = b.PENDING;
    }

    private boolean q() {
        InterfaceC2114c interfaceC2114c = this.d0;
        return interfaceC2114c == null || !interfaceC2114c.a();
    }

    private Drawable r(int i) {
        return y0 ? t(i) : s(i);
    }

    private Drawable s(int i) {
        return ax.S.h.e(this.e0.getResources(), i, this.h0.D());
    }

    private Drawable t(int i) {
        try {
            return C2653a.b(this.e0, i);
        } catch (NoClassDefFoundError unused) {
            y0 = false;
            return s(i);
        }
    }

    private void u(String str) {
        Log.v("Request", str + " this: " + this.q);
    }

    private static int v(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private void w() {
        InterfaceC2114c interfaceC2114c = this.d0;
        if (interfaceC2114c != null) {
            interfaceC2114c.e(this);
        }
    }

    public static <R> C2119h<R> x(ax.J3.e eVar, Object obj, Class<R> cls, C2117f c2117f, int i, int i2, ax.J3.g gVar, ax.h4.e<R> eVar2, InterfaceC2116e<R> interfaceC2116e, InterfaceC2114c interfaceC2114c, ax.P3.i iVar, ax.i4.c<? super R> cVar) {
        C2119h<?> b2 = x0.b();
        if (b2 == null) {
            b2 = new C2119h<>();
        }
        C2119h<R> c2119h = (C2119h<R>) b2;
        c2119h.p(eVar, obj, cls, c2117f, i, i2, gVar, eVar2, interfaceC2116e, interfaceC2114c, iVar, cVar);
        return c2119h;
    }

    private void y(o oVar, int i) {
        this.c0.c();
        int d = this.e0.d();
        if (d <= i) {
            Log.w("Glide", "Load failed for " + this.f0 + " with size [" + this.v0 + "x" + this.w0 + "]", oVar);
            if (d <= 4) {
                oVar.g("Glide");
            }
        }
        this.p0 = null;
        this.r0 = b.FAILED;
        B();
    }

    private void z(s<R> sVar, R r, ax.M3.a aVar) {
        boolean q = q();
        this.r0 = b.COMPLETE;
        this.o0 = sVar;
        if (this.e0.d() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.f0 + " with size [" + this.v0 + "x" + this.w0 + "] in " + ax.k4.d.a(this.q0) + " ms");
        }
        this.l0.c(r, this.n0.a(aVar, q));
        w();
    }

    @Override // ax.g4.InterfaceC2118g
    public void a(o oVar) {
        y(oVar, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.g4.InterfaceC2118g
    public void b(s<?> sVar, ax.M3.a aVar) {
        this.c0.c();
        this.p0 = null;
        if (sVar == null) {
            a(new o("Expected to receive a Resource<R> with an object of " + this.g0 + " inside, but instead got null."));
            return;
        }
        Object obj = sVar.get();
        if (obj != null && this.g0.isAssignableFrom(obj.getClass())) {
            if (j()) {
                z(sVar, obj, aVar);
                return;
            } else {
                A(sVar);
                this.r0 = b.COMPLETE;
                return;
            }
        }
        A(sVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.g0);
        sb.append(" but instead got ");
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb.append(obj != null ? obj.getClass() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(sVar);
        sb.append("}.");
        if (obj == null) {
            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
        }
        sb.append(str);
        a(new o(sb.toString()));
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean c() {
        return i();
    }

    @Override // ax.g4.InterfaceC2113b
    public void clear() {
        ax.k4.i.b();
        b bVar = this.r0;
        b bVar2 = b.CLEARED;
        if (bVar == bVar2) {
            return;
        }
        k();
        s<R> sVar = this.o0;
        if (sVar != null) {
            A(sVar);
        }
        if (g()) {
            this.l0.l(o());
        }
        this.r0 = bVar2;
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean d(InterfaceC2113b interfaceC2113b) {
        if (interfaceC2113b instanceof C2119h) {
            C2119h c2119h = (C2119h) interfaceC2113b;
            if (this.i0 == c2119h.i0 && this.j0 == c2119h.j0 && ax.k4.i.c(this.f0, c2119h.f0) && this.g0.equals(c2119h.g0) && this.h0.equals(c2119h.h0) && this.k0 == c2119h.k0) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.h4.d
    public void e(int i, int i2) {
        this.c0.c();
        if (Log.isLoggable("Request", 2)) {
            u("Got onSizeReady in " + ax.k4.d.a(this.q0));
        }
        if (this.r0 != b.WAITING_FOR_SIZE) {
            return;
        }
        this.r0 = b.RUNNING;
        float C = this.h0.C();
        this.v0 = v(i, C);
        this.w0 = v(i2, C);
        if (Log.isLoggable("Request", 2)) {
            u("finished setup for calling load in " + ax.k4.d.a(this.q0));
        }
        this.p0 = this.m0.g(this.e0, this.f0, this.h0.B(), this.v0, this.w0, this.h0.z(), this.g0, this.k0, this.h0.k(), this.h0.E(), this.h0.L(), this.h0.I(), this.h0.s(), this.h0.G(), this.h0.F(), this.h0.r(), this);
        if (Log.isLoggable("Request", 2)) {
            u("finished onSizeReady in " + ax.k4.d.a(this.q0));
        }
    }

    @Override // ax.g4.InterfaceC2113b
    public void f() {
        clear();
        this.r0 = b.PAUSED;
    }

    @Override // ax.g4.InterfaceC2113b
    public void h() {
        this.c0.c();
        this.q0 = ax.k4.d.b();
        if (this.f0 == null) {
            if (ax.k4.i.r(this.i0, this.j0)) {
                this.v0 = this.i0;
                this.w0 = this.j0;
            }
            y(new o("Received null model"), n() == null ? 5 : 3);
            return;
        }
        b bVar = this.r0;
        b bVar2 = b.RUNNING;
        if (bVar == bVar2) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (bVar == b.COMPLETE) {
            b(this.o0, ax.M3.a.MEMORY_CACHE);
            return;
        }
        b bVar3 = b.WAITING_FOR_SIZE;
        this.r0 = bVar3;
        if (ax.k4.i.r(this.i0, this.j0)) {
            e(this.i0, this.j0);
        } else {
            this.l0.g(this);
        }
        b bVar4 = this.r0;
        if ((bVar4 == bVar2 || bVar4 == bVar3) && g()) {
            this.l0.j(o());
        }
        if (Log.isLoggable("Request", 2)) {
            u("finished run method in " + ax.k4.d.a(this.q0));
        }
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean i() {
        return this.r0 == b.COMPLETE;
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean isCancelled() {
        b bVar = this.r0;
        return bVar == b.CANCELLED || bVar == b.CLEARED;
    }

    @Override // ax.g4.InterfaceC2113b
    public boolean isRunning() {
        b bVar = this.r0;
        return bVar == b.RUNNING || bVar == b.WAITING_FOR_SIZE;
    }

    void k() {
        this.c0.c();
        this.l0.d(this);
        this.r0 = b.CANCELLED;
        i.d dVar = this.p0;
        if (dVar != null) {
            dVar.a();
            this.p0 = null;
        }
    }

    @Override // ax.l4.C2468a.f
    public AbstractC2469b l() {
        return this.c0;
    }

    @Override // ax.g4.InterfaceC2113b
    public void recycle() {
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = -1;
        this.j0 = -1;
        this.l0 = null;
        this.d0 = null;
        this.n0 = null;
        this.p0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = -1;
        this.w0 = -1;
        x0.a(this);
    }
}
