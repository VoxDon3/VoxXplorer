package ax.w5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ax.n5.C2580b;
import ax.q5.g;
import ax.s5.C3048a;
import ax.s5.C3050c;
import ax.t5.C3102a;
import ax.x5.AbstractC3451k;
import ax.x5.InterfaceC3443c;
import ax.x5.InterfaceC3444d;
import ax.y5.C3506a;
import ax.y5.InterfaceC3507b;
import ax.z5.InterfaceC3550a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ax.w5.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3364r {
    private final Context a;
    private final ax.q5.e b;
    private final InterfaceC3444d c;
    private final InterfaceC3370x d;
    private final Executor e;
    private final InterfaceC3507b f;
    private final InterfaceC3550a g;
    private final InterfaceC3550a h;
    private final InterfaceC3443c i;

    public C3364r(Context context, ax.q5.e eVar, InterfaceC3444d interfaceC3444d, InterfaceC3370x interfaceC3370x, Executor executor, InterfaceC3507b interfaceC3507b, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, InterfaceC3443c interfaceC3443c) {
        this.a = context;
        this.b = eVar;
        this.c = interfaceC3444d;
        this.d = interfaceC3370x;
        this.e = executor;
        this.f = interfaceC3507b;
        this.g = interfaceC3550a;
        this.h = interfaceC3550a2;
        this.i = interfaceC3443c;
    }

    public static /* synthetic */ Object b(C3364r c3364r, Iterable iterable, ax.p5.p pVar, long j) {
        c3364r.c.N0(iterable);
        c3364r.c.V(pVar, c3364r.g.a() + j);
        return null;
    }

    public static /* synthetic */ Object c(C3364r c3364r) {
        c3364r.i.b();
        return null;
    }

    public static /* synthetic */ Object e(C3364r c3364r, Iterable iterable) {
        c3364r.c.w(iterable);
        return null;
    }

    public static /* synthetic */ Object f(C3364r c3364r, ax.p5.p pVar, int i) {
        c3364r.d.a(pVar, i + 1);
        return null;
    }

    public static /* synthetic */ Object g(C3364r c3364r, ax.p5.p pVar, long j) {
        c3364r.c.V(pVar, c3364r.g.a() + j);
        return null;
    }

    public static /* synthetic */ Object h(C3364r c3364r, Map map) {
        c3364r.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            c3364r.i.d(((Integer) r0.getValue()).intValue(), C3050c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final C3364r c3364r, final ax.p5.p pVar, final int i, Runnable runnable) {
        c3364r.getClass();
        try {
            try {
                InterfaceC3507b interfaceC3507b = c3364r.f;
                final InterfaceC3444d interfaceC3444d = c3364r.c;
                Objects.requireNonNull(interfaceC3444d);
                interfaceC3507b.a(new InterfaceC3507b.a() { // from class: ax.w5.i
                    @Override // ax.y5.InterfaceC3507b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC3444d.this.t());
                    }
                });
                if (c3364r.k()) {
                    c3364r.l(pVar, i);
                } else {
                    c3364r.f.a(new InterfaceC3507b.a() { // from class: ax.w5.j
                        @Override // ax.y5.InterfaceC3507b.a
                        public final Object execute() {
                            return C3364r.f(C3364r.this, pVar, i);
                        }
                    });
                }
                runnable.run();
            } catch (C3506a unused) {
                c3364r.d.a(pVar, i + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public ax.p5.i j(ax.q5.m mVar) {
        InterfaceC3507b interfaceC3507b = this.f;
        final InterfaceC3443c interfaceC3443c = this.i;
        Objects.requireNonNull(interfaceC3443c);
        return mVar.a(ax.p5.i.a().i(this.g.a()).o(this.h.a()).n("GDT_CLIENT_METRICS").h(new ax.p5.h(C2580b.b("proto"), ((C3048a) interfaceC3507b.a(new InterfaceC3507b.a() { // from class: ax.w5.h
            @Override // ax.y5.InterfaceC3507b.a
            public final Object execute() {
                return InterfaceC3443c.this.c();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public ax.q5.g l(final ax.p5.p pVar, int i) {
        ax.q5.g b;
        ax.q5.m i2 = this.b.i(pVar.b());
        ax.q5.g e = ax.q5.g.e(0L);
        final long j = 0;
        while (((Boolean) this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.k
            @Override // ax.y5.InterfaceC3507b.a
            public final Object execute() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(C3364r.this.c.s(pVar));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.l
                @Override // ax.y5.InterfaceC3507b.a
                public final Object execute() {
                    Iterable k0;
                    k0 = C3364r.this.c.k0(pVar);
                    return k0;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e;
            }
            if (i2 == null) {
                C3102a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                b = ax.q5.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC3451k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(i2));
                }
                b = i2.b(ax.q5.f.a().b(arrayList).c(pVar.c()).a());
            }
            e = b;
            if (e.c() == g.a.TRANSIENT_ERROR) {
                final ax.p5.p pVar2 = pVar;
                this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.m
                    @Override // ax.y5.InterfaceC3507b.a
                    public final Object execute() {
                        return C3364r.b(C3364r.this, iterable, pVar2, j);
                    }
                });
                this.d.b(pVar2, i + 1, true);
                return e;
            }
            ax.p5.p pVar3 = pVar;
            this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.n
                @Override // ax.y5.InterfaceC3507b.a
                public final Object execute() {
                    return C3364r.e(C3364r.this, iterable);
                }
            });
            if (e.c() == g.a.OK) {
                long max = Math.max(j, e.b());
                if (pVar3.e()) {
                    this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.o
                        @Override // ax.y5.InterfaceC3507b.a
                        public final Object execute() {
                            return C3364r.c(C3364r.this);
                        }
                    });
                }
                j = max;
            } else if (e.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String n = ((AbstractC3451k) it2.next()).b().n();
                    if (hashMap.containsKey(n)) {
                        hashMap.put(n, Integer.valueOf(((Integer) hashMap.get(n)).intValue() + 1));
                    } else {
                        hashMap.put(n, 1);
                    }
                }
                this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.p
                    @Override // ax.y5.InterfaceC3507b.a
                    public final Object execute() {
                        return C3364r.h(C3364r.this, hashMap);
                    }
                });
            }
            pVar = pVar3;
        }
        final ax.p5.p pVar4 = pVar;
        this.f.a(new InterfaceC3507b.a() { // from class: ax.w5.q
            @Override // ax.y5.InterfaceC3507b.a
            public final Object execute() {
                return C3364r.g(C3364r.this, pVar4, j);
            }
        });
        return e;
    }

    public void m(final ax.p5.p pVar, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: ax.w5.g
            @Override // java.lang.Runnable
            public final void run() {
                C3364r.i(C3364r.this, pVar, i, runnable);
            }
        });
    }
}
