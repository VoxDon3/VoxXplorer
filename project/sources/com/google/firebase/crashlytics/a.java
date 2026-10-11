package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import ax.G7.d;
import ax.G7.g;
import ax.G7.l;
import ax.J7.C;
import ax.J7.C0756a;
import ax.J7.C0761f;
import ax.J7.C0764i;
import ax.J7.C0768m;
import ax.J7.C0778x;
import ax.J7.C0780z;
import ax.J7.r;
import ax.Q7.f;
import ax.a8.InterfaceC1430a;
import ax.b8.e;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import ax.j6.m;
import ax.l8.InterfaceC2482a;
import ax.o8.C2732a;
import ax.x7.C3471f;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class a {
    final r a;

    /* renamed from: com.google.firebase.crashlytics.a$a, reason: collision with other inner class name */
    class C0561a implements InterfaceC2319b<Void, Object> {
        C0561a() {
        }

        @Override // ax.j6.InterfaceC2319b
        public Object a(AbstractC2327j<Void> abstractC2327j) throws Exception {
            if (abstractC2327j.m()) {
                return null;
            }
            g.f().e("Error fetching settings.", abstractC2327j.i());
            return null;
        }
    }

    class b implements Callable<Void> {
        final /* synthetic */ boolean a;
        final /* synthetic */ r b;
        final /* synthetic */ f c;

        b(boolean z, r rVar, f fVar) {
            this.a = z;
            this.b = rVar;
            this.c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!this.a) {
                return null;
            }
            this.b.g(this.c);
            return null;
        }
    }

    private a(r rVar) {
        this.a = rVar;
    }

    public static a a() {
        a aVar = (a) C3471f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a b(C3471f c3471f, e eVar, InterfaceC1430a<ax.G7.a> interfaceC1430a, InterfaceC1430a<ax.A7.a> interfaceC1430a2, InterfaceC1430a<InterfaceC2482a> interfaceC1430a3) {
        Context k = c3471f.k();
        String packageName = k.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + r.i() + " for " + packageName);
        ax.O7.g gVar = new ax.O7.g(k);
        C0778x c0778x = new C0778x(c3471f);
        C c = new C(k, packageName, eVar, c0778x);
        d dVar = new d(interfaceC1430a);
        ax.F7.d dVar2 = new ax.F7.d(interfaceC1430a2);
        ExecutorService c2 = C0780z.c("Crashlytics Exception Handler");
        C0768m c0768m = new C0768m(c0778x, gVar);
        C2732a.e(c0768m);
        r rVar = new r(c3471f, c, dVar, c0778x, dVar2.e(), dVar2.d(), gVar, c2, c0768m, new l(interfaceC1430a3));
        String c3 = c3471f.n().c();
        String m = C0764i.m(k);
        List<C0761f> j = C0764i.j(k);
        g.f().b("Mapping file ID is: " + m);
        for (C0761f c0761f : j) {
            g.f().b(String.format("Build id for %s on %s: %s", c0761f.c(), c0761f.a(), c0761f.b()));
        }
        try {
            C0756a a = C0756a.a(k, c, c3, m, j, new ax.G7.f(k));
            g.f().i("Installer package name is: " + a.d);
            ExecutorService c4 = C0780z.c("com.google.firebase.crashlytics.startup");
            f l = f.l(k, c3, c, new ax.N7.b(), a.f, a.g, gVar, c0778x);
            l.p(c4).g(c4, new C0561a());
            m.c(c4, new b(rVar.o(a, l), rVar, l));
            return new a(rVar);
        } catch (PackageManager.NameNotFoundException e) {
            g.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public void c(Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.l(th);
        }
    }

    public void d(boolean z) {
        this.a.p(Boolean.valueOf(z));
    }

    public void e(String str, String str2) {
        this.a.q(str, str2);
    }
}
