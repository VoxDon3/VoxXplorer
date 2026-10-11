package ax.N1;

import ax.S0.C0968a;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q extends androidx.media3.decoder.a implements k {
    private k f0;
    private long g0;

    public void C(long j, k kVar, long j2) {
        this.c0 = j;
        this.f0 = kVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.g0 = j;
    }

    @Override // ax.N1.k
    public int d(long j) {
        return ((k) C0968a.e(this.f0)).d(j - this.g0);
    }

    @Override // ax.N1.k
    public long h(int i) {
        return ((k) C0968a.e(this.f0)).h(i) + this.g0;
    }

    @Override // ax.N1.k
    public List<ax.R0.a> j(long j) {
        return ((k) C0968a.e(this.f0)).j(j - this.g0);
    }

    @Override // ax.N1.k
    public int l() {
        return ((k) C0968a.e(this.f0)).l();
    }

    @Override // androidx.media3.decoder.a, ax.V0.a
    public void p() {
        super.p();
        this.f0 = null;
    }
}
