package ax.H2;

import ax.Gb.l;
import ax.K2.v;

/* loaded from: classes.dex */
public final class b extends c<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ax.I2.c cVar) {
        super(cVar);
        l.f(cVar, "tracker");
    }

    @Override // ax.H2.c
    public boolean b(v vVar) {
        l.f(vVar, "workSpec");
        return vVar.j.f();
    }

    @Override // ax.H2.c
    public /* bridge */ /* synthetic */ boolean c(Boolean bool) {
        return i(bool.booleanValue());
    }

    public boolean i(boolean z) {
        return !z;
    }
}
