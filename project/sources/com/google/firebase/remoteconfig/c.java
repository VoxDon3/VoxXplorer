package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import ax.R5.e;
import ax.R5.h;
import ax.f1.C2015i;
import ax.j6.m;
import ax.j8.k;
import ax.j8.o;
import ax.k8.C2412a;
import ax.l8.InterfaceC2482a;
import ax.m8.f;
import ax.x7.C3471f;
import ax.y7.C3511c;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class c implements InterfaceC2482a {
    private static final e j = h.c();
    private static final Random k = new Random();
    private static final Map<String, com.google.firebase.remoteconfig.a> l = new HashMap();
    private final Map<String, com.google.firebase.remoteconfig.a> a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final C3471f d;
    private final ax.b8.e e;
    private final C3511c f;
    private final ax.a8.b<ax.A7.a> g;
    private final String h;
    private Map<String, String> i;

    private static class a implements ComponentCallbacks2C3607a.InterfaceC0545a {
        private static final AtomicReference<a> a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (C2015i.a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C3607a.c(application);
                    ComponentCallbacks2C3607a.b().a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C3607a.InterfaceC0545a
        public void a(boolean z) {
            c.q(z);
        }
    }

    c(Context context, @ax.C7.b ScheduledExecutorService scheduledExecutorService, C3471f c3471f, ax.b8.e eVar, C3511c c3511c, ax.a8.b<ax.A7.a> bVar) {
        this(context, scheduledExecutorService, c3471f, eVar, c3511c, bVar, true);
    }

    public static /* synthetic */ ax.A7.a b() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.b f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.b.h(this.c, com.google.firebase.remoteconfig.internal.h.c(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    private k j(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return new k(this.c, bVar, bVar2);
    }

    static com.google.firebase.remoteconfig.internal.e k(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.e(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static o l(C3471f c3471f, String str, ax.a8.b<ax.A7.a> bVar) {
        if (p(c3471f) && str.equals("firebase")) {
            return new o(bVar);
        }
        return null;
    }

    private ax.k8.e n(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return new ax.k8.e(bVar, C2412a.a(bVar, bVar2), this.c);
    }

    private static boolean o(C3471f c3471f, String str) {
        return str.equals("firebase") && p(c3471f);
    }

    private static boolean p(C3471f c3471f) {
        return c3471f.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void q(boolean z) {
        synchronized (c.class) {
            Iterator<com.google.firebase.remoteconfig.a> it = l.values().iterator();
            while (it.hasNext()) {
                it.next().n(z);
            }
        }
    }

    @Override // ax.l8.InterfaceC2482a
    public void a(String str, f fVar) {
        e(str).j().e(fVar);
    }

    synchronized com.google.firebase.remoteconfig.a d(C3471f c3471f, String str, ax.b8.e eVar, C3511c c3511c, Executor executor, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2, com.google.firebase.remoteconfig.internal.b bVar3, d dVar, k kVar, com.google.firebase.remoteconfig.internal.e eVar2, ax.k8.e eVar3) {
        c cVar;
        String str2;
        try {
            try {
                if (this.a.containsKey(str)) {
                    cVar = this;
                    str2 = str;
                } else {
                    cVar = this;
                    str2 = str;
                    com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.b, c3471f, eVar, o(c3471f, str) ? c3511c : null, executor, bVar, bVar2, bVar3, dVar, kVar, eVar2, m(c3471f, eVar, dVar, bVar2, this.b, str, eVar2), eVar3);
                    aVar.o();
                    cVar.a.put(str2, aVar);
                    l.put(str2, aVar);
                }
                return cVar.a.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) {
        Throwable th;
        try {
            try {
                com.google.firebase.remoteconfig.internal.b f = f(str, "fetch");
                com.google.firebase.remoteconfig.internal.b f2 = f(str, "activate");
                com.google.firebase.remoteconfig.internal.b f3 = f(str, "defaults");
                com.google.firebase.remoteconfig.internal.e k2 = k(this.b, this.h, str);
                k j2 = j(f2, f3);
                final o l2 = l(this.d, str, this.g);
                if (l2 != null) {
                    try {
                        j2.b(new ax.R5.d() { // from class: ax.i8.m
                            @Override // ax.R5.d
                            public final void a(Object obj, Object obj2) {
                                ax.j8.o.this.a((String) obj, (com.google.firebase.remoteconfig.internal.c) obj2);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return d(this.d, str, this.e, this.f, this.c, f, f2, f3, h(str, f, k2), j2, k2, n(f2, f3));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized d h(String str, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.e eVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new d(this.e, p(this.d) ? this.g : new ax.a8.b() { // from class: ax.i8.n
            @Override // ax.a8.b
            public final Object get() {
                return com.google.firebase.remoteconfig.c.b();
            }
        }, this.c, j, k, bVar, i(this.d.n().b(), str, eVar), eVar, this.i);
    }

    ConfigFetchHttpClient i(String str, String str2, com.google.firebase.remoteconfig.internal.e eVar) {
        return new ConfigFetchHttpClient(this.b, this.d.n().c(), str, str2, eVar.b(), eVar.b());
    }

    synchronized com.google.firebase.remoteconfig.internal.f m(C3471f c3471f, ax.b8.e eVar, d dVar, com.google.firebase.remoteconfig.internal.b bVar, Context context, String str, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new com.google.firebase.remoteconfig.internal.f(c3471f, eVar, dVar, bVar, context, str, eVar2, this.c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, C3471f c3471f, ax.b8.e eVar, C3511c c3511c, ax.a8.b<ax.A7.a> bVar, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = c3471f;
        this.e = eVar;
        this.f = c3511c;
        this.g = bVar;
        this.h = c3471f.n().c();
        a.c(context);
        if (z) {
            m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.g();
                }
            });
        }
    }
}
