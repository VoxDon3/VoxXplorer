package ax.H2;

import android.os.Build;
import ax.B2.j;
import ax.Gb.l;
import ax.K2.v;

/* loaded from: classes.dex */
public final class d extends c<ax.G2.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ax.I2.h<ax.G2.b> hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    @Override // ax.H2.c
    public boolean b(v vVar) {
        l.f(vVar, "workSpec");
        return vVar.j.d() == j.CONNECTED;
    }

    @Override // ax.H2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(ax.G2.b bVar) {
        l.f(bVar, "value");
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
