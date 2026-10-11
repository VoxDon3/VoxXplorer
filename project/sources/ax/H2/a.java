package ax.H2;

import ax.Gb.l;
import ax.K2.v;

/* loaded from: classes.dex */
public final class a extends c<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ax.I2.h<Boolean> hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    @Override // ax.H2.c
    public boolean b(v vVar) {
        l.f(vVar, "workSpec");
        return vVar.j.g();
    }

    @Override // ax.H2.c
    public /* bridge */ /* synthetic */ boolean c(Boolean bool) {
        return i(bool.booleanValue());
    }

    public boolean i(boolean z) {
        return !z;
    }
}
