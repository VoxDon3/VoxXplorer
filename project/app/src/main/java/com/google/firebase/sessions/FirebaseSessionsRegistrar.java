/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.F;
import ax.D7.c;
import ax.D7.e;
import ax.D7.r;
import ax.Gb.g;
import ax.n5.i;
import ax.n8.C;
import ax.n8.G;
import ax.n8.H;
import ax.n8.K;
import ax.n8.h;
import ax.n8.l;
import ax.n8.n;
import ax.n8.p;
import ax.n8.q;
import ax.n8.s;
import ax.n8.y;
import ax.p8.f;
import ax.tb.o;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.b;
import com.google.firebase.sessions.c;
import java.util.List;

@Keep
public final class FirebaseSessionsRegistrar
implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F<ax.Qb.G> backgroundDispatcher;
    private static final F<ax.Qb.G> blockingDispatcher;
    private static final F<ax.x7.f> firebaseApp;
    private static final F<ax.b8.e> firebaseInstallationsApi;
    private static final F<G> sessionLifecycleServiceBinder;
    private static final F<f> sessionsSettings;
    private static final F<i> transportFactory;

    static {
        F<Object> f8 = F.b(ax.x7.f.class);
        ax.Gb.l.e(f8, "unqualified(FirebaseApp::class.java)");
        firebaseApp = f8;
        f8 = F.b(ax.b8.e.class);
        ax.Gb.l.e(f8, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = f8;
        f8 = F.a(ax.C7.a.class, ax.Qb.G.class);
        ax.Gb.l.e(f8, "qualified(Background::cl\u2026neDispatcher::class.java)");
        backgroundDispatcher = f8;
        f8 = F.a(ax.C7.b.class, ax.Qb.G.class);
        ax.Gb.l.e(f8, "qualified(Blocking::clas\u2026neDispatcher::class.java)");
        blockingDispatcher = f8;
        f8 = F.b(i.class);
        ax.Gb.l.e(f8, "unqualified(TransportFactory::class.java)");
        transportFactory = f8;
        f8 = F.b(f.class);
        ax.Gb.l.e(f8, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = f8;
        f8 = F.b(G.class);
        ax.Gb.l.e(f8, "unqualified(SessionLifec\u2026erviceBinder::class.java)");
        sessionLifecycleServiceBinder = f8;
    }

    public static /* synthetic */ com.google.firebase.sessions.a a(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$4(e8);
    }

    public static /* synthetic */ G b(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$5(e8);
    }

    public static /* synthetic */ f c(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$3(e8);
    }

    public static /* synthetic */ b d(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$2(e8);
    }

    public static /* synthetic */ c e(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$1(e8);
    }

    public static /* synthetic */ l f(e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda$0(e8);
    }

    private static final l getComponents$lambda$0(e object) {
        ax.x7.f f8 = object.c(firebaseApp);
        ax.Gb.l.e(f8, "container[firebaseApp]");
        f f9 = object.c(sessionsSettings);
        ax.Gb.l.e(f9, "container[sessionsSettings]");
        ax.wb.i i8 = object.c(backgroundDispatcher);
        ax.Gb.l.e(i8, "container[backgroundDispatcher]");
        i8 = i8;
        object = object.c(sessionLifecycleServiceBinder);
        ax.Gb.l.e(object, "container[sessionLifecycleServiceBinder]");
        return new l(f8, f9, i8, (G)object);
    }

    private static final c getComponents$lambda$1(e e8) {
        return new c(K.a, null, 2, null);
    }

    private static final b getComponents$lambda$2(e object) {
        ax.x7.f f8 = object.c(firebaseApp);
        ax.Gb.l.e(f8, "container[firebaseApp]");
        ax.b8.e e8 = object.c(firebaseInstallationsApi);
        ax.Gb.l.e(e8, "container[firebaseInstallationsApi]");
        f f9 = object.c(sessionsSettings);
        ax.Gb.l.e(f9, "container[sessionsSettings]");
        Object object2 = object.g(transportFactory);
        ax.Gb.l.e(object2, "container.getProvider(transportFactory)");
        object2 = new h((ax.a8.b<i>)object2);
        object = object.c(backgroundDispatcher);
        ax.Gb.l.e(object, "container[backgroundDispatcher]");
        return new C(f8, e8, f9, (ax.n8.i)object2, (ax.wb.i)object);
    }

    private static final f getComponents$lambda$3(e object) {
        ax.x7.f f8 = object.c(firebaseApp);
        ax.Gb.l.e(f8, "container[firebaseApp]");
        ax.wb.i i8 = object.c(blockingDispatcher);
        ax.Gb.l.e(i8, "container[blockingDispatcher]");
        i8 = i8;
        ax.wb.i i9 = object.c(backgroundDispatcher);
        ax.Gb.l.e(i9, "container[backgroundDispatcher]");
        i9 = i9;
        object = object.c(firebaseInstallationsApi);
        ax.Gb.l.e(object, "container[firebaseInstallationsApi]");
        return new f(f8, i8, i9, (ax.b8.e)object);
    }

    private static final com.google.firebase.sessions.a getComponents$lambda$4(e object) {
        Context context = object.c(firebaseApp).k();
        ax.Gb.l.e(context, "container[firebaseApp].applicationContext");
        object = object.c(backgroundDispatcher);
        ax.Gb.l.e(object, "container[backgroundDispatcher]");
        return new y(context, (ax.wb.i)object);
    }

    private static final G getComponents$lambda$5(e object) {
        object = object.c(firebaseApp);
        ax.Gb.l.e(object, "container[firebaseApp]");
        return new H((ax.x7.f)object);
    }

    public List<ax.D7.c<? extends Object>> getComponents() {
        Object object = ax.D7.c.e(l.class).g(LIBRARY_NAME);
        F<ax.x7.f> f8 = firebaseApp;
        Object object2 = ((c.b)object).b(r.i(f8));
        object = sessionsSettings;
        Object object3 = ((c.b)object2).b(r.i(object));
        object2 = backgroundDispatcher;
        object3 = ((c.b)object3).b(r.i(object2)).b(r.i(sessionLifecycleServiceBinder)).e(new n()).d().c();
        ax.D7.c<c> c8 = ax.D7.c.e(c.class).g("session-generator").e(new ax.n8.o()).c();
        c.b<b> b8 = ax.D7.c.e(b.class).g("session-publisher").b(r.i(f8));
        F<ax.b8.e> f9 = firebaseInstallationsApi;
        return o.l(object3, c8, b8.b(r.i(f9)).b(r.i(object)).b(r.k(transportFactory)).b(r.i(object2)).e(new p()).c(), ax.D7.c.e(f.class).g("sessions-settings").b(r.i(f8)).b(r.i(blockingDispatcher)).b(r.i(object2)).b(r.i(f9)).e(new q()).c(), ax.D7.c.e(com.google.firebase.sessions.a.class).g("sessions-datastore").b(r.i(f8)).b(r.i(object2)).e(new ax.n8.r()).c(), ax.D7.c.e(G.class).g("sessions-service-binder").b(r.i(f8)).e(new s()).c(), ax.h8.h.b(LIBRARY_NAME, "2.0.3"));
    }

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

