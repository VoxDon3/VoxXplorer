/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.l;
import ax.S0.a;
import ax.Y0.O;
import ax.c1.i;
import ax.i1.e0;
import java.io.IOException;

final class h
implements e0 {
    private final int a;
    private final l b;
    private int c;

    public h(l l8, int n8) {
        this.b = l8;
        this.a = n8;
        this.c = -1;
    }

    private boolean e() {
        int n8 = this.c;
        return n8 != -1 && n8 != -3 && n8 != -2;
    }

    @Override
    public int a(O o8, ax.V0.i i8, int n8) {
        if (this.c == -3) {
            i8.n(4);
            return -4;
        }
        if (this.e()) {
            return this.b.i0(this.c, o8, i8, n8);
        }
        return -3;
    }

    @Override
    public void b() throws IOException {
        int n8 = this.c;
        if (n8 != -2) {
            if (n8 == -1) {
                this.b.X();
                return;
            }
            if (n8 != -3) {
                this.b.Y(n8);
            }
            return;
        }
        throw new i(this.b.t().c((int)this.a).b((int)0).o);
    }

    @Override
    public int c(long l8) {
        if (this.e()) {
            return this.b.s0(this.c, l8);
        }
        return 0;
    }

    public void d() {
        boolean bl = this.c == -1;
        ax.S0.a.a(bl);
        this.c = this.b.A(this.a);
    }

    public void f() {
        if (this.c != -1) {
            this.b.t0(this.a);
            this.c = -1;
        }
    }

    @Override
    public boolean isReady() {
        return this.c == -3 || this.e() && this.b.S(this.c);
        {
        }
    }
}

