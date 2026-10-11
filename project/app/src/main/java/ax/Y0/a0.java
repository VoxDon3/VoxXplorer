/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import ax.P0.G;
import ax.S0.d0;
import ax.S0.h;
import ax.Y0.Q;
import ax.Y0.S;

public final class a0
implements S {
    private boolean c0;
    private long d0;
    private long e0;
    private G f0;
    private final h q;

    public a0(h h8) {
        this.q = h8;
        this.f0 = G.d;
    }

    public void a(long l8) {
        this.d0 = l8;
        if (this.c0) {
            this.e0 = this.q.b();
        }
    }

    public void b() {
        if (!this.c0) {
            this.e0 = this.q.b();
            this.c0 = true;
        }
    }

    public void c() {
        if (this.c0) {
            this.a(this.w());
            this.c0 = false;
        }
    }

    @Override
    public void e(G g8) {
        if (this.c0) {
            this.a(this.w());
        }
        this.f0 = g8;
    }

    @Override
    public G h() {
        return this.f0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long w() {
        long l8 = this.d0;
        if (!this.c0) return l8;
        long l9 = this.q.b() - this.e0;
        G g8 = this.f0;
        if (g8.a == 1.0f) {
            l9 = ax.S0.d0.a1(l9);
            return l8 + l9;
        }
        l9 = g8.a(l9);
        return l8 + l9;
    }

    @Override
    public /* synthetic */ boolean z() {
        return Q.a(this);
    }
}

