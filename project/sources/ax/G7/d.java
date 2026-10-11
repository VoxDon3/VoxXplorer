package ax.G7;

import ax.L7.F;
import ax.L7.G;
import ax.a8.InterfaceC1430a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements ax.G7.a {
    private static final h c = new b();
    private final InterfaceC1430a<ax.G7.a> a;
    private final AtomicReference<ax.G7.a> b = new AtomicReference<>(null);

    private static final class b implements h {
        private b() {
        }

        @Override // ax.G7.h
        public File a() {
            return null;
        }

        @Override // ax.G7.h
        public File b() {
            return null;
        }

        @Override // ax.G7.h
        public File c() {
            return null;
        }

        @Override // ax.G7.h
        public F.a d() {
            return null;
        }

        @Override // ax.G7.h
        public File e() {
            return null;
        }

        @Override // ax.G7.h
        public File f() {
            return null;
        }

        @Override // ax.G7.h
        public File g() {
            return null;
        }
    }

    public d(InterfaceC1430a<ax.G7.a> interfaceC1430a) {
        this.a = interfaceC1430a;
        interfaceC1430a.a(new InterfaceC1430a.InterfaceC0254a() { // from class: ax.G7.b
            @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
            public final void a(ax.a8.b bVar) {
                d.f(d.this, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, ax.a8.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.b.set((ax.G7.a) bVar.get());
    }

    @Override // ax.G7.a
    public h a(String str) {
        ax.G7.a aVar = this.b.get();
        return aVar == null ? c : aVar.a(str);
    }

    @Override // ax.G7.a
    public boolean b() {
        ax.G7.a aVar = this.b.get();
        return aVar != null && aVar.b();
    }

    @Override // ax.G7.a
    public boolean c(String str) {
        ax.G7.a aVar = this.b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // ax.G7.a
    public void d(final String str, final String str2, final long j, final G g) {
        g.f().i("Deferring native open session: " + str);
        this.a.a(new InterfaceC1430a.InterfaceC0254a() { // from class: ax.G7.c
            @Override // ax.a8.InterfaceC1430a.InterfaceC0254a
            public final void a(ax.a8.b bVar) {
                ((a) bVar.get()).d(str, str2, j, g);
            }
        });
    }
}
