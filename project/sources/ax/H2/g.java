package ax.H2;

import android.os.Build;
import ax.B2.j;
import ax.Gb.l;
import ax.K2.v;

/* loaded from: classes.dex */
public final class g extends c<ax.G2.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ax.I2.h<ax.G2.b> hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    @Override // ax.H2.c
    public boolean b(v vVar) {
        l.f(vVar, "workSpec");
        j d = vVar.j.d();
        if (d != j.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && d == j.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // ax.H2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(ax.G2.b bVar) {
        l.f(bVar, "value");
        return !bVar.a() || bVar.b();
    }
}
