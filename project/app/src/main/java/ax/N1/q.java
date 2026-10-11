/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.k;
import ax.S0.a;
import java.util.List;

public abstract class q
extends androidx.media3.decoder.a
implements k {
    private k f0;
    private long g0;

    public void C(long l8, k k8, long l9) {
        this.c0 = l8;
        this.f0 = k8;
        if (l9 != Long.MAX_VALUE) {
            l8 = l9;
        }
        this.g0 = l8;
    }

    @Override
    public int d(long l8) {
        return a.e(this.f0).d(l8 - this.g0);
    }

    @Override
    public long h(int n8) {
        return a.e(this.f0).h(n8) + this.g0;
    }

    @Override
    public List<ax.R0.a> j(long l8) {
        return a.e(this.f0).j(l8 - this.g0);
    }

    @Override
    public int l() {
        return a.e(this.f0).l();
    }

    @Override
    public void p() {
        super.p();
        this.f0 = null;
    }
}

