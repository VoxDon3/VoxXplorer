package ax.a6;

import ax.Y6.f;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.a6.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1377G {
    private final C0 a;
    private final Executor b;
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();

    C1377G(C0 c0, Executor executor) {
        this.a = c0;
        this.b = executor;
    }

    public final void a(f.b bVar, f.a aVar) {
        C1392c0.a();
        C1379I c1379i = (C1379I) this.c.get();
        if (c1379i == null) {
            aVar.b(new F0(3, "No available form can be built.").a());
        } else {
            ((InterfaceC1422v) this.a.a()).a(c1379i).b().a().g(bVar, aVar);
        }
    }
}
