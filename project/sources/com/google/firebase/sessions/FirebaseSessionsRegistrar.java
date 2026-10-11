package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.G;
import ax.b8.e;
import ax.n5.i;
import ax.n8.C2589C;
import ax.n8.C2594H;
import ax.n8.C2597K;
import ax.n8.C2605h;
import ax.n8.C2609l;
import ax.n8.C2622y;
import ax.n8.InterfaceC2593G;
import ax.p8.f;
import ax.tb.C3139o;
import ax.x7.C3471f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F<G> backgroundDispatcher;
    private static final F<G> blockingDispatcher;
    private static final F<C3471f> firebaseApp;
    private static final F<e> firebaseInstallationsApi;
    private static final F<InterfaceC2593G> sessionLifecycleServiceBinder;
    private static final F<f> sessionsSettings;
    private static final F<i> transportFactory;

    private static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    static {
        F<C3471f> b = F.b(C3471f.class);
        l.e(b, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b;
        F<e> b2 = F.b(e.class);
        l.e(b2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b2;
        F<G> a2 = F.a(ax.C7.a.class, G.class);
        l.e(a2, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a2;
        F<G> a3 = F.a(ax.C7.b.class, G.class);
        l.e(a3, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a3;
        F<i> b3 = F.b(i.class);
        l.e(b3, "unqualified(TransportFactory::class.java)");
        transportFactory = b3;
        F<f> b4 = F.b(f.class);
        l.e(b4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b4;
        F<InterfaceC2593G> b5 = F.b(InterfaceC2593G.class);
        l.e(b5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2609l getComponents$lambda$0(InterfaceC0663e interfaceC0663e) {
        Object c = interfaceC0663e.c(firebaseApp);
        l.e(c, "container[firebaseApp]");
        Object c2 = interfaceC0663e.c(sessionsSettings);
        l.e(c2, "container[sessionsSettings]");
        Object c3 = interfaceC0663e.c(backgroundDispatcher);
        l.e(c3, "container[backgroundDispatcher]");
        Object c4 = interfaceC0663e.c(sessionLifecycleServiceBinder);
        l.e(c4, "container[sessionLifecycleServiceBinder]");
        return new C2609l((C3471f) c, (f) c2, (ax.wb.i) c3, (InterfaceC2593G) c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(InterfaceC0663e interfaceC0663e) {
        return new c(C2597K.a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(InterfaceC0663e interfaceC0663e) {
        Object c = interfaceC0663e.c(firebaseApp);
        l.e(c, "container[firebaseApp]");
        Object c2 = interfaceC0663e.c(firebaseInstallationsApi);
        l.e(c2, "container[firebaseInstallationsApi]");
        Object c3 = interfaceC0663e.c(sessionsSettings);
        l.e(c3, "container[sessionsSettings]");
        ax.a8.b g = interfaceC0663e.g(transportFactory);
        l.e(g, "container.getProvider(transportFactory)");
        C2605h c2605h = new C2605h(g);
        Object c4 = interfaceC0663e.c(backgroundDispatcher);
        l.e(c4, "container[backgroundDispatcher]");
        return new C2589C((C3471f) c, (e) c2, (f) c3, c2605h, (ax.wb.i) c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f getComponents$lambda$3(InterfaceC0663e interfaceC0663e) {
        Object c = interfaceC0663e.c(firebaseApp);
        l.e(c, "container[firebaseApp]");
        Object c2 = interfaceC0663e.c(blockingDispatcher);
        l.e(c2, "container[blockingDispatcher]");
        Object c3 = interfaceC0663e.c(backgroundDispatcher);
        l.e(c3, "container[backgroundDispatcher]");
        Object c4 = interfaceC0663e.c(firebaseInstallationsApi);
        l.e(c4, "container[firebaseInstallationsApi]");
        return new f((C3471f) c, (ax.wb.i) c2, (ax.wb.i) c3, (e) c4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(InterfaceC0663e interfaceC0663e) {
        Context k = ((C3471f) interfaceC0663e.c(firebaseApp)).k();
        l.e(k, "container[firebaseApp].applicationContext");
        Object c = interfaceC0663e.c(backgroundDispatcher);
        l.e(c, "container[backgroundDispatcher]");
        return new C2622y(k, (ax.wb.i) c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2593G getComponents$lambda$5(InterfaceC0663e interfaceC0663e) {
        Object c = interfaceC0663e.c(firebaseApp);
        l.e(c, "container[firebaseApp]");
        return new C2594H((C3471f) c);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<? extends Object>> getComponents() {
        C0661c.b g = C0661c.e(C2609l.class).g(LIBRARY_NAME);
        F<C3471f> f = firebaseApp;
        C0661c.b b = g.b(r.i(f));
        F<f> f2 = sessionsSettings;
        C0661c.b b2 = b.b(r.i(f2));
        F<G> f3 = backgroundDispatcher;
        C0661c c = b2.b(r.i(f3)).b(r.i(sessionLifecycleServiceBinder)).e(new h() { // from class: ax.n8.n
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                C2609l components$lambda$0;
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC0663e);
                return components$lambda$0;
            }
        }).d().c();
        C0661c c2 = C0661c.e(c.class).g("session-generator").e(new h() { // from class: ax.n8.o
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                com.google.firebase.sessions.c components$lambda$1;
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC0663e);
                return components$lambda$1;
            }
        }).c();
        C0661c.b b3 = C0661c.e(b.class).g("session-publisher").b(r.i(f));
        F<e> f4 = firebaseInstallationsApi;
        return C3139o.l(c, c2, b3.b(r.i(f4)).b(r.i(f2)).b(r.k(transportFactory)).b(r.i(f3)).e(new h() { // from class: ax.n8.p
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                com.google.firebase.sessions.b components$lambda$2;
                components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(interfaceC0663e);
                return components$lambda$2;
            }
        }).c(), C0661c.e(f.class).g("sessions-settings").b(r.i(f)).b(r.i(blockingDispatcher)).b(r.i(f3)).b(r.i(f4)).e(new h() { // from class: ax.n8.q
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                ax.p8.f components$lambda$3;
                components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(interfaceC0663e);
                return components$lambda$3;
            }
        }).c(), C0661c.e(com.google.firebase.sessions.a.class).g("sessions-datastore").b(r.i(f)).b(r.i(f3)).e(new h() { // from class: ax.n8.r
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                com.google.firebase.sessions.a components$lambda$4;
                components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(interfaceC0663e);
                return components$lambda$4;
            }
        }).c(), C0661c.e(InterfaceC2593G.class).g("sessions-service-binder").b(r.i(f)).e(new h() { // from class: ax.n8.s
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                InterfaceC2593G components$lambda$5;
                components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(interfaceC0663e);
                return components$lambda$5;
            }
        }).c(), ax.h8.h.b(LIBRARY_NAME, "2.0.3"));
    }
}
