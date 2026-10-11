package ax.Y0;

import ax.S0.InterfaceC0975h;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class a0 implements S {
    private boolean c0;
    private long d0;
    private long e0;
    private ax.P0.G f0 = ax.P0.G.d;
    private final InterfaceC0975h q;

    public a0(InterfaceC0975h interfaceC0975h) {
        this.q = interfaceC0975h;
    }

    public void a(long j) {
        this.d0 = j;
        if (this.c0) {
            this.e0 = this.q.b();
        }
    }

    public void b() {
        if (this.c0) {
            return;
        }
        this.e0 = this.q.b();
        this.c0 = true;
    }

    public void c() {
        if (this.c0) {
            a(w());
            this.c0 = false;
        }
    }

    @Override // ax.Y0.S
    public void e(ax.P0.G g) {
        if (this.c0) {
            a(w());
        }
        this.f0 = g;
    }

    @Override // ax.Y0.S
    public ax.P0.G h() {
        return this.f0;
    }

    @Override // ax.Y0.S
    public long w() {
        long j = this.d0;
        if (!this.c0) {
            return j;
        }
        long b = this.q.b() - this.e0;
        ax.P0.G g = this.f0;
        return j + (g.a == 1.0f ? d0.a1(b) : g.a(b));
    }

    @Override // ax.Y0.S
    public /* synthetic */ boolean z() {
        return Q.a(this);
    }
}
