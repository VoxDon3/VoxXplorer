package androidx.lifecycle;

import androidx.lifecycle.d;
import ax.Qb.x0;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends ax.G0.e implements f {
    private final ax.wb.i c0;
    private final d q;

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        if (i().b().compareTo(d.b.DESTROYED) <= 0) {
            i().c(this);
            x0.d(h(), null, 1, null);
        }
    }

    @Override // ax.Qb.J
    public ax.wb.i h() {
        return this.c0;
    }

    public d i() {
        return this.q;
    }
}
