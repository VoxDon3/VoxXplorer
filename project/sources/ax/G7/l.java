package ax.G7;

import ax.K7.m;
import ax.a8.InterfaceC1430a;
import ax.l8.InterfaceC2482a;

/* loaded from: classes3.dex */
public class l {
    private final InterfaceC1430a<InterfaceC2482a> a;

    public l(InterfaceC1430a<InterfaceC2482a> interfaceC1430a) {
        this.a = interfaceC1430a;
    }

    public static /* synthetic */ void a(e eVar, ax.a8.b bVar) {
        ((InterfaceC2482a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(m mVar) {
        if (mVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(mVar);
            this.a.a(new InterfaceC1430a.InterfaceC0254a() { // from class: ax.G7.k
                @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
                public final void a(ax.a8.b bVar) {
                    l.a(e.this, bVar);
                }
            });
        }
    }
}
