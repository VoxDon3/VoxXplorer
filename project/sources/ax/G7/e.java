package ax.G7;

import ax.K7.m;
import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e implements ax.m8.f {
    private final m a;

    public e(m mVar) {
        ax.Gb.l.f(mVar, "userMetadata");
        this.a = mVar;
    }

    @Override // ax.m8.f
    public void a(ax.m8.e eVar) {
        ax.Gb.l.f(eVar, "rolloutsState");
        m mVar = this.a;
        Set<ax.m8.d> b = eVar.b();
        ax.Gb.l.e(b, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(C3139o.s(b, 10));
        for (ax.m8.d dVar : b) {
            arrayList.add(ax.K7.i.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        mVar.n(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
