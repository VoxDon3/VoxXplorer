package ax.Xb;

import ax.Qb.AbstractC0940i0;

/* loaded from: classes3.dex */
public class f extends AbstractC0940i0 {
    private final int e0;
    private final int f0;
    private final long g0;
    private final String h0;
    private a i0 = Z0();

    public f(int i, int i2, long j, String str) {
        this.e0 = i;
        this.f0 = i2;
        this.g0 = j;
        this.h0 = str;
    }

    private final a Z0() {
        return new a(this.e0, this.f0, this.g0, this.h0);
    }

    public final void a1(Runnable runnable, i iVar, boolean z) {
        this.i0.g(runnable, iVar, z);
    }

    @Override // ax.Qb.G
    public void b(ax.wb.i iVar, Runnable runnable) {
        a.m(this.i0, runnable, null, false, 6, null);
    }
}
