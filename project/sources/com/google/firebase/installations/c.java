package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import ax.D7.x;
import ax.M5.C0821p;
import ax.c8.InterfaceC1847a;
import ax.d8.C1948b;
import ax.d8.C1949c;
import ax.e8.AbstractC1988d;
import ax.e8.AbstractC1990f;
import ax.e8.C1987c;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.j6.m;
import ax.x7.C3471f;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c implements ax.b8.e {
    private static final Object m = new Object();
    private static final ThreadFactory n = new a();
    private final C3471f a;
    private final C1987c b;
    private final C1949c c;
    private final i d;
    private final x<C1948b> e;
    private final ax.b8.g f;
    private final Object g;
    private final ExecutorService h;
    private final Executor i;
    private String j;
    private Set<InterfaceC1847a> k;
    private final List<h> l;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AbstractC1990f.b.values().length];
            b = iArr;
            try {
                iArr[AbstractC1990f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[AbstractC1990f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[AbstractC1990f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC1988d.b.values().length];
            a = iArr2;
            try {
                iArr2[AbstractC1988d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC1988d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final C3471f c3471f, ax.a8.b<ax.Z7.i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c3471f, new C1987c(c3471f.k(), bVar), new C1949c(c3471f), i.c(), new x(new ax.a8.b() { // from class: ax.b8.a
            @Override // ax.a8.b
            public final Object get() {
                return com.google.firebase.installations.c.f(C3471f.this);
            }
        }), new ax.b8.g());
    }

    private void A(ax.d8.d dVar) {
        synchronized (this.g) {
            try {
                Iterator<h> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void B(String str) {
        this.j = str;
    }

    private synchronized void C(ax.d8.d dVar, ax.d8.d dVar2) {
        if (this.k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<InterfaceC1847a> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    public static /* synthetic */ C1948b f(C3471f c3471f) {
        return new C1948b(c3471f);
    }

    private AbstractC2327j<g> g() {
        C2328k c2328k = new C2328k();
        i(new e(this.d, c2328k));
        return c2328k.a();
    }

    private AbstractC2327j<String> h() {
        C2328k c2328k = new C2328k();
        i(new f(c2328k));
        return c2328k.a();
    }

    private void i(h hVar) {
        synchronized (this.g) {
            this.l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(boolean r3) {
        /*
            r2 = this;
            ax.d8.d r0 = r2.s()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.i r3 = r2.d     // Catch: com.google.firebase.installations.d -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            ax.d8.d r3 = r2.l(r0)     // Catch: com.google.firebase.installations.d -> L1d
            goto L28
        L24:
            ax.d8.d r3 = r2.y(r0)     // Catch: com.google.firebase.installations.d -> L1d
        L28:
            r2.v(r3)
            r2.C(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.B(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.z(r3)
            return
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.z(r3)
            return
        L5d:
            r2.A(r3)
            return
        L61:
            r2.z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.j(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(final boolean z) {
        ax.d8.d t = t();
        if (z) {
            t = t.p();
        }
        A(t);
        this.i.execute(new Runnable() { // from class: ax.b8.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.j(z);
            }
        });
    }

    private ax.d8.d l(ax.d8.d dVar) throws d {
        AbstractC1990f e = this.b.e(m(), dVar.d(), u(), dVar.f());
        int i = b.b[e.b().ordinal()];
        if (i == 1) {
            return dVar.o(e.c(), e.d(), this.d.b());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        B(null);
        return dVar.r();
    }

    private synchronized String o() {
        return this.j;
    }

    private C1948b p() {
        return this.e.get();
    }

    public static c q() {
        return r(C3471f.l());
    }

    public static c r(C3471f c3471f) {
        C0821p.b(c3471f != null, "Null is not a valid value of FirebaseApp.");
        return (c) c3471f.j(ax.b8.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private ax.d8.d s() {
        ax.d8.d d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                try {
                    d = this.c.d();
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d;
    }

    /* JADX WARN: Finally extract failed */
    private ax.d8.d t() {
        ax.d8.d d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                try {
                    d = this.c.d();
                    if (d.j()) {
                        d = this.c.b(d.t(x(d)));
                    }
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d;
    }

    /* JADX WARN: Finally extract failed */
    private void v(ax.d8.d dVar) {
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.k(), "generatefid.lock");
                try {
                    this.c.b(dVar);
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void w() {
        C0821p.g(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0821p.g(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0821p.g(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0821p.b(i.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C0821p.b(i.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(ax.d8.d dVar) {
        if ((!this.a.m().equals("CHIME_ANDROID_SDK") && !this.a.u()) || !dVar.m()) {
            return this.f.a();
        }
        String f = p().f();
        return TextUtils.isEmpty(f) ? this.f.a() : f;
    }

    private ax.d8.d y(ax.d8.d dVar) throws d {
        AbstractC1988d d = this.b.d(m(), dVar.d(), u(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i = b.a[d.e().ordinal()];
        if (i == 1) {
            return dVar.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void z(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator<h> it = this.l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.b8.e
    public AbstractC2327j<String> a() {
        w();
        String o = o();
        if (o != null) {
            return m.e(o);
        }
        AbstractC2327j<String> h = h();
        this.h.execute(new Runnable() { // from class: ax.b8.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.k(false);
            }
        });
        return h;
    }

    @Override // ax.b8.e
    public AbstractC2327j<g> b(final boolean z) {
        w();
        AbstractC2327j<g> g = g();
        this.h.execute(new Runnable() { // from class: ax.b8.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.k(z);
            }
        });
        return g;
    }

    String m() {
        return this.a.n().b();
    }

    String n() {
        return this.a.n().c();
    }

    String u() {
        return this.a.n().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, C3471f c3471f, C1987c c1987c, C1949c c1949c, i iVar, x<C1948b> xVar, ax.b8.g gVar) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = c3471f;
        this.b = c1987c;
        this.c = c1949c;
        this.d = iVar;
        this.e = xVar;
        this.f = gVar;
        this.h = executorService;
        this.i = executor;
    }
}
