package ax.z2;

import android.app.Activity;
import android.content.Context;
import ax.A2.m;
import ax.A2.v;
import ax.Gb.g;
import ax.Gb.l;
import ax.c0.F0;
import ax.tb.C3139o;
import java.util.ArrayList;

/* renamed from: ax.z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3542d implements InterfaceC3541c {
    private final m b;
    private final ArrayList<Integer> c;

    public C3542d(m mVar) {
        l.f(mVar, "densityCompatHelper");
        this.b = mVar;
        this.c = C3139o.f(Integer.valueOf(F0.m.g()), Integer.valueOf(F0.m.f()), Integer.valueOf(F0.m.a()), Integer.valueOf(F0.m.c()), Integer.valueOf(F0.m.i()), Integer.valueOf(F0.m.e()), Integer.valueOf(F0.m.j()), Integer.valueOf(F0.m.b()));
    }

    @Override // ax.z2.InterfaceC3541c
    public C3539a a(Context context) {
        l.f(context, "context");
        return v.a.a().a(context, this.b);
    }

    @Override // ax.z2.InterfaceC3541c
    public C3539a b(Activity activity) {
        l.f(activity, "activity");
        return v.a.a().b(activity, this.b);
    }

    public /* synthetic */ C3542d(m mVar, int i, g gVar) {
        this((i & 1) != 0 ? m.a.a() : mVar);
    }
}
