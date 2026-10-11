package androidx.media3.exoplayer;

import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;

/* renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0607k implements ax.Y0.S {
    private final a c0;
    private M0 d0;
    private ax.Y0.S e0;
    private boolean f0 = true;
    private boolean g0;
    private final ax.Y0.a0 q;

    /* renamed from: androidx.media3.exoplayer.k$a */
    public interface a {
        void j(ax.P0.G g);
    }

    public C0607k(a aVar, InterfaceC0975h interfaceC0975h) {
        this.c0 = aVar;
        this.q = new ax.Y0.a0(interfaceC0975h);
    }

    private boolean d(boolean z) {
        M0 m0 = this.d0;
        if (m0 == null || m0.c()) {
            return true;
        }
        if (z && this.d0.getState() != 2) {
            return true;
        }
        if (this.d0.isReady()) {
            return false;
        }
        return z || this.d0.n();
    }

    private void j(boolean z) {
        if (d(z)) {
            this.f0 = true;
            if (this.g0) {
                this.q.b();
                return;
            }
            return;
        }
        ax.Y0.S s = (ax.Y0.S) C0968a.e(this.e0);
        long w = s.w();
        if (this.f0) {
            if (w < this.q.w()) {
                this.q.c();
                return;
            } else {
                this.f0 = false;
                if (this.g0) {
                    this.q.b();
                }
            }
        }
        this.q.a(w);
        ax.P0.G h = s.h();
        if (h.equals(this.q.h())) {
            return;
        }
        this.q.e(h);
        this.c0.j(h);
    }

    public void a(M0 m0) {
        if (m0 == this.d0) {
            this.e0 = null;
            this.d0 = null;
            this.f0 = true;
        }
    }

    public void b(M0 m0) throws C0622s {
        ax.Y0.S s;
        ax.Y0.S H = m0.H();
        if (H == null || H == (s = this.e0)) {
            return;
        }
        if (s != null) {
            throw C0622s.f(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.e0 = H;
        this.d0 = m0;
        H.e(this.q.h());
    }

    public void c(long j) {
        this.q.a(j);
    }

    @Override // ax.Y0.S
    public void e(ax.P0.G g) {
        ax.Y0.S s = this.e0;
        if (s != null) {
            s.e(g);
            g = this.e0.h();
        }
        this.q.e(g);
    }

    public void f() {
        this.g0 = true;
        this.q.b();
    }

    public void g() {
        this.g0 = false;
        this.q.c();
    }

    @Override // ax.Y0.S
    public ax.P0.G h() {
        ax.Y0.S s = this.e0;
        return s != null ? s.h() : this.q.h();
    }

    public long i(boolean z) {
        j(z);
        return w();
    }

    @Override // ax.Y0.S
    public long w() {
        return this.f0 ? this.q.w() : ((ax.Y0.S) C0968a.e(this.e0)).w();
    }

    @Override // ax.Y0.S
    public boolean z() {
        return this.f0 ? this.q.z() : ((ax.Y0.S) C0968a.e(this.e0)).z();
    }
}
