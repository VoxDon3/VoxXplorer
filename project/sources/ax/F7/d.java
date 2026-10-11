package ax.F7;

import android.os.Bundle;
import ax.A7.a;
import ax.G7.g;
import ax.a8.InterfaceC1430a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {
    private final InterfaceC1430a<ax.A7.a> a;
    private volatile ax.H7.a b;
    private volatile ax.I7.b c;
    private final List<ax.I7.a> d;

    public d(InterfaceC1430a<ax.A7.a> interfaceC1430a) {
        this(interfaceC1430a, new ax.I7.c(), new ax.H7.f());
    }

    public static /* synthetic */ void a(d dVar, ax.a8.b bVar) {
        dVar.getClass();
        g.f().b("AnalyticsConnector now available.");
        ax.A7.a aVar = (ax.A7.a) bVar.get();
        ax.H7.e eVar = new ax.H7.e(aVar);
        e eVar2 = new e();
        if (g(aVar, eVar2) == null) {
            g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        g.f().b("Registered Firebase Analytics listener.");
        ax.H7.d dVar2 = new ax.H7.d();
        ax.H7.c cVar = new ax.H7.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator<ax.I7.a> it = dVar.d.iterator();
                while (it.hasNext()) {
                    dVar2.a(it.next());
                }
                eVar2.d(dVar2);
                eVar2.e(cVar);
                dVar.c = dVar2;
                dVar.b = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, ax.I7.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.c instanceof ax.I7.c) {
                    dVar.d.add(aVar);
                }
                dVar.c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f() {
        this.a.a(new InterfaceC1430a.InterfaceC0254a() { // from class: ax.F7.c
            @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
            public final void a(ax.a8.b bVar) {
                d.a(d.this, bVar);
            }
        });
    }

    private static a.InterfaceC0050a g(ax.A7.a aVar, e eVar) {
        a.InterfaceC0050a c = aVar.c("clx", eVar);
        if (c != null) {
            return c;
        }
        g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        a.InterfaceC0050a c2 = aVar.c("crash", eVar);
        if (c2 != null) {
            g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return c2;
    }

    public ax.H7.a d() {
        return new ax.H7.a() { // from class: ax.F7.b
            @Override // ax.H7.a
            public final void a(String str, Bundle bundle) {
                d.this.b.a(str, bundle);
            }
        };
    }

    public ax.I7.b e() {
        return new ax.I7.b() { // from class: ax.F7.a
            @Override // ax.I7.b
            public final void a(ax.I7.a aVar) {
                d.c(d.this, aVar);
            }
        };
    }

    public d(InterfaceC1430a<ax.A7.a> interfaceC1430a, ax.I7.b bVar, ax.H7.a aVar) {
        this.a = interfaceC1430a;
        this.c = bVar;
        this.d = new ArrayList();
        this.b = aVar;
        f();
    }
}
