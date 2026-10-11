package ax.P3;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import ax.P3.f;
import ax.P3.n;
import ax.R3.a;
import ax.R3.h;
import ax.b0.InterfaceC1443d;
import ax.g4.InterfaceC2118g;
import ax.l4.C2468a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i implements k, h.a, n.a {
    private final Map<ax.M3.h, j<?>> a;
    private final m b;
    private final ax.R3.h c;
    private final b d;
    private final Map<ax.M3.h, WeakReference<n<?>>> e;
    private final v f;
    private final c g;
    private final a h;
    private ReferenceQueue<n<?>> i;

    static class a {
        final f.e a;
        final InterfaceC1443d<ax.P3.f<?>> b = C2468a.d(150, new C0169a());
        private int c;

        /* renamed from: ax.P3.i$a$a, reason: collision with other inner class name */
        class C0169a implements C2468a.d<ax.P3.f<?>> {
            C0169a() {
            }

            @Override // ax.l4.C2468a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ax.P3.f<?> a() {
                a aVar = a.this;
                return new ax.P3.f<>(aVar.a, aVar.b);
            }
        }

        a(f.e eVar) {
            this.a = eVar;
        }

        <R> ax.P3.f<R> a(ax.J3.e eVar, Object obj, l lVar, ax.M3.h hVar, int i, int i2, Class<?> cls, Class<R> cls2, ax.J3.g gVar, h hVar2, Map<Class<?>, ax.M3.m<?>> map, boolean z, boolean z2, boolean z3, ax.M3.j jVar, f.b<R> bVar) {
            ax.P3.f<?> b = this.b.b();
            int i3 = this.c;
            this.c = i3 + 1;
            return (ax.P3.f<R>) b.B(eVar, obj, lVar, hVar, i, i2, cls, cls2, gVar, hVar2, map, z, z2, z3, jVar, bVar, i3);
        }
    }

    static class b {
        final ax.S3.a a;
        final ax.S3.a b;
        final ax.S3.a c;
        final k d;
        final InterfaceC1443d<j<?>> e = C2468a.d(150, new a());

        class a implements C2468a.d<j<?>> {
            a() {
            }

            @Override // ax.l4.C2468a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public j<?> a() {
                b bVar = b.this;
                return new j<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
            }
        }

        b(ax.S3.a aVar, ax.S3.a aVar2, ax.S3.a aVar3, k kVar) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = kVar;
        }

        <R> j<R> a(ax.M3.h hVar, boolean z, boolean z2) {
            return (j<R>) this.e.b().k(hVar, z, z2);
        }
    }

    private static class c implements f.e {
        private final a.InterfaceC0183a a;
        private volatile ax.R3.a b;

        public c(a.InterfaceC0183a interfaceC0183a) {
            this.a = interfaceC0183a;
        }

        @Override // ax.P3.f.e
        public ax.R3.a a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = this.a.g();
                        }
                        if (this.b == null) {
                            this.b = new ax.R3.b();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public static class d {
        private final j<?> a;
        private final InterfaceC2118g b;

        public d(InterfaceC2118g interfaceC2118g, j<?> jVar) {
            this.b = interfaceC2118g;
            this.a = jVar;
        }

        public void a() {
            this.a.o(this.b);
        }
    }

    private static class e implements MessageQueue.IdleHandler {
        private final Map<ax.M3.h, WeakReference<n<?>>> a;
        private final ReferenceQueue<n<?>> b;

        public e(Map<ax.M3.h, WeakReference<n<?>>> map, ReferenceQueue<n<?>> referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            f fVar = (f) this.b.poll();
            if (fVar == null) {
                return true;
            }
            this.a.remove(fVar.a);
            return true;
        }
    }

    private static class f extends WeakReference<n<?>> {
        final ax.M3.h a;

        public f(ax.M3.h hVar, n<?> nVar, ReferenceQueue<? super n<?>> referenceQueue) {
            super(nVar, referenceQueue);
            this.a = hVar;
        }
    }

    public i(ax.R3.h hVar, a.InterfaceC0183a interfaceC0183a, ax.S3.a aVar, ax.S3.a aVar2, ax.S3.a aVar3) {
        this(hVar, interfaceC0183a, aVar, aVar2, aVar3, null, null, null, null, null, null);
    }

    private n<?> e(ax.M3.h hVar) {
        s<?> d2 = this.c.d(hVar);
        if (d2 == null) {
            return null;
        }
        return d2 instanceof n ? (n) d2 : new n<>(d2, true);
    }

    private ReferenceQueue<n<?>> f() {
        if (this.i == null) {
            this.i = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new e(this.e, this.i));
        }
        return this.i;
    }

    private n<?> h(ax.M3.h hVar, boolean z) {
        WeakReference<n<?>> weakReference;
        if (!z || (weakReference = this.e.get(hVar)) == null) {
            return null;
        }
        n<?> nVar = weakReference.get();
        if (nVar != null) {
            nVar.a();
            return nVar;
        }
        this.e.remove(hVar);
        return nVar;
    }

    private n<?> i(ax.M3.h hVar, boolean z) {
        if (!z) {
            return null;
        }
        n<?> e2 = e(hVar);
        if (e2 != null) {
            e2.a();
            this.e.put(hVar, new f(hVar, e2, f()));
        }
        return e2;
    }

    private static void j(String str, long j, ax.M3.h hVar) {
        Log.v("Engine", str + " in " + ax.k4.d.a(j) + "ms, key: " + hVar);
    }

    @Override // ax.P3.k
    public void a(ax.M3.h hVar, n<?> nVar) {
        ax.k4.i.b();
        if (nVar != null) {
            nVar.e(hVar, this);
            if (nVar.c()) {
                this.e.put(hVar, new f(hVar, nVar, f()));
            }
        }
        this.a.remove(hVar);
    }

    @Override // ax.P3.n.a
    public void b(ax.M3.h hVar, n nVar) {
        ax.k4.i.b();
        this.e.remove(hVar);
        if (nVar.c()) {
            this.c.e(hVar, nVar);
        } else {
            this.f.a(nVar);
        }
    }

    @Override // ax.R3.h.a
    public void c(s<?> sVar) {
        ax.k4.i.b();
        this.f.a(sVar);
    }

    @Override // ax.P3.k
    public void d(j jVar, ax.M3.h hVar) {
        ax.k4.i.b();
        if (jVar.equals(this.a.get(hVar))) {
            this.a.remove(hVar);
        }
    }

    public <R> d g(ax.J3.e eVar, Object obj, ax.M3.h hVar, int i, int i2, Class<?> cls, Class<R> cls2, ax.J3.g gVar, h hVar2, Map<Class<?>, ax.M3.m<?>> map, boolean z, boolean z2, ax.M3.j jVar, boolean z3, boolean z4, boolean z5, InterfaceC2118g interfaceC2118g) {
        ax.k4.i.b();
        long b2 = ax.k4.d.b();
        l a2 = this.b.a(obj, hVar, i, i2, map, cls, cls2, jVar);
        n<?> i3 = i(a2, z3);
        if (i3 != null) {
            interfaceC2118g.b(i3, ax.M3.a.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from cache", b2, a2);
            }
            return null;
        }
        n<?> h = h(a2, z3);
        if (h != null) {
            interfaceC2118g.b(h, ax.M3.a.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from active resources", b2, a2);
            }
            return null;
        }
        j<?> jVar2 = this.a.get(a2);
        if (jVar2 != null) {
            jVar2.d(interfaceC2118g);
            if (Log.isLoggable("Engine", 2)) {
                j("Added to existing load", b2, a2);
            }
            return new d(interfaceC2118g, jVar2);
        }
        j<R> a3 = this.d.a(a2, z3, z4);
        ax.P3.f<R> a4 = this.h.a(eVar, obj, a2, hVar, i, i2, cls, cls2, gVar, hVar2, map, z, z2, z5, jVar, a3);
        this.a.put(a2, a3);
        a3.d(interfaceC2118g);
        a3.p(a4);
        if (Log.isLoggable("Engine", 2)) {
            j("Started new load", b2, a2);
        }
        return new d(interfaceC2118g, a3);
    }

    public void k(s<?> sVar) {
        ax.k4.i.b();
        if (!(sVar instanceof n)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((n) sVar).d();
    }

    i(ax.R3.h hVar, a.InterfaceC0183a interfaceC0183a, ax.S3.a aVar, ax.S3.a aVar2, ax.S3.a aVar3, Map<ax.M3.h, j<?>> map, m mVar, Map<ax.M3.h, WeakReference<n<?>>> map2, b bVar, a aVar4, v vVar) {
        this.c = hVar;
        c cVar = new c(interfaceC0183a);
        this.g = cVar;
        this.e = map2 == null ? new HashMap<>() : map2;
        this.b = mVar == null ? new m() : mVar;
        this.a = map == null ? new HashMap<>() : map;
        this.d = bVar == null ? new b(aVar, aVar2, aVar3, this) : bVar;
        this.h = aVar4 == null ? new a(cVar) : aVar4;
        this.f = vVar == null ? new v() : vVar;
        hVar.c(this);
    }
}
