package ax.P3;

import ax.b0.InterfaceC1443d;
import ax.l4.AbstractC2469b;
import ax.l4.C2468a;

/* loaded from: classes.dex */
final class r<Z> implements s<Z>, C2468a.f {
    private static final InterfaceC1443d<r<?>> f0 = C2468a.e(20, new a());
    private s<Z> c0;
    private boolean d0;
    private boolean e0;
    private final AbstractC2469b q = AbstractC2469b.a();

    static class a implements C2468a.d<r<?>> {
        a() {
        }

        @Override // ax.l4.C2468a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r<?> a() {
            return new r<>();
        }
    }

    r() {
    }

    private void a(s<Z> sVar) {
        this.e0 = false;
        this.d0 = true;
        this.c0 = sVar;
    }

    static <Z> r<Z> c(s<Z> sVar) {
        r<Z> rVar = (r) f0.b();
        rVar.a(sVar);
        return rVar;
    }

    private void d() {
        this.c0 = null;
        f0.a(this);
    }

    @Override // ax.P3.s
    public Class<Z> b() {
        return this.c0.b();
    }

    public synchronized void e() {
        this.q.c();
        if (!this.d0) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d0 = false;
        if (this.e0) {
            recycle();
        }
    }

    @Override // ax.P3.s
    public Z get() {
        return this.c0.get();
    }

    @Override // ax.P3.s
    public int getSize() {
        return this.c0.getSize();
    }

    @Override // ax.l4.C2468a.f
    public AbstractC2469b l() {
        return this.q;
    }

    @Override // ax.P3.s
    public synchronized void recycle() {
        this.q.c();
        this.e0 = true;
        if (!this.d0) {
            this.c0.recycle();
            d();
        }
    }
}
