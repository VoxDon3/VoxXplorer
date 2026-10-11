package ax.K9;

import android.app.Activity;
import android.content.Context;
import ax.P9.o;
import ax.U9.f;
import ax.U9.g;
import ax.U9.h;
import ax.U9.j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class b implements ax.K9.a {
    private ax.Q9.b a = new ax.Q9.a();
    private final ax.U9.e b;

    class a implements g {
        final /* synthetic */ ax.L9.c a;

        a(ax.L9.c cVar) {
            this.a = cVar;
        }

        @Override // ax.U9.g
        public void a(j jVar, h hVar, Object obj) {
            b.this.a.a("Logout complete");
            this.a.c(null);
        }

        @Override // ax.U9.g
        public void b(f fVar, Object obj) {
            ax.M9.d dVar = new ax.M9.d("Logout failure", fVar, ax.M9.e.AuthenticationFailure);
            b.this.a.b(dVar.getMessage(), dVar);
            this.a.b(dVar);
        }
    }

    /* renamed from: ax.K9.b$b, reason: collision with other inner class name */
    class C0112b implements g {
        final /* synthetic */ ax.L9.c a;

        C0112b(ax.L9.c cVar) {
            this.a = cVar;
        }

        @Override // ax.U9.g
        public void a(j jVar, h hVar, Object obj) {
            b.this.a.a(String.format("LiveStatus: %s, LiveConnectSession good?: %s, UserState %s", jVar, Boolean.valueOf(hVar != null), obj));
            if (jVar == j.NOT_CONNECTED) {
                b.this.a.a("Received invalid login failure from silent authentication, ignoring.");
                return;
            }
            if (jVar == j.CONNECTED) {
                b.this.a.a("Login completed");
                this.a.c(null);
            } else {
                ax.M9.d dVar = new ax.M9.d("Unable to login successfully", null, ax.M9.e.AuthenticationFailure);
                b.this.a.b(dVar.getMessage(), dVar);
                this.a.b(dVar);
            }
        }

        @Override // ax.U9.g
        public void b(f fVar, Object obj) {
            ax.M9.d dVar = new ax.M9.d("Login failure", fVar, ax.M9.e.AuthenticationFailure);
            b.this.a.b(dVar.getMessage(), dVar);
            this.a.b(dVar);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String c0;
        final /* synthetic */ g d0;
        final /* synthetic */ Activity q;

        c(Activity activity, String str, g gVar) {
            this.q = activity;
            this.c0 = str;
            this.d0 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b.i(this.q, null, null, this.c0, this.d0);
        }
    }

    class d implements g {
        final /* synthetic */ ax.L9.c a;

        d(ax.L9.c cVar) {
            this.a = cVar;
        }

        @Override // ax.U9.g
        public void a(j jVar, h hVar, Object obj) {
            b.this.a.a(String.format("LiveStatus: %s, LiveConnectSession good?: %s, UserState %s", jVar, Boolean.valueOf(hVar != null), obj));
            if (jVar == j.CONNECTED) {
                b.this.a.a("Login completed");
                this.a.c(null);
            } else {
                ax.M9.d dVar = new ax.M9.d("Unable to login silently", null, ax.M9.e.AuthenticationFailure);
                b.this.a.b(dVar.getMessage(), dVar);
                this.a.b(dVar);
            }
        }

        @Override // ax.U9.g
        public void b(f fVar, Object obj) {
            ax.M9.d dVar = new ax.M9.d("Unable to login silently", null, ax.M9.e.AuthenticationFailure);
            b.this.a.b(dVar.getMessage(), dVar);
            this.a.b(dVar);
        }
    }

    class e implements ax.L9.c<Void> {
        final /* synthetic */ AtomicReference a;
        final /* synthetic */ ax.L9.f b;
        final /* synthetic */ AtomicReference c;

        e(AtomicReference atomicReference, ax.L9.f fVar, AtomicReference atomicReference2) {
            this.a = atomicReference;
            this.b = fVar;
            this.c = atomicReference2;
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
            this.c.set(dVar);
            this.b.a();
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Void r2) {
            this.a.set(r2);
            this.b.a();
        }
    }

    public b(Context context) {
        this.b = new ax.U9.e(context.getApplicationContext(), e(), Arrays.asList(g()), ax.K9.c.e());
    }

    private boolean h() {
        return (this.b.g() == null || this.b.g().b() == null) ? false : true;
    }

    private Void k() throws ax.M9.d {
        ax.L9.f fVar = new ax.L9.f();
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        j(new e(atomicReference, fVar, atomicReference2));
        fVar.b();
        if (atomicReference2.get() == null) {
            return (Void) atomicReference.get();
        }
        throw ((ax.M9.d) atomicReference2.get());
    }

    @Override // ax.K9.a
    public void a(o oVar) {
        this.a.a("Authenticating request, " + oVar.d());
        Iterator<ax.S9.b> it = oVar.a().iterator();
        while (it.hasNext()) {
            if (it.next().a().equals("Authorization")) {
                this.a.a("Found an existing authorization header!");
                return;
            }
        }
        try {
            oVar.k("Authorization", "bearer " + d());
        } catch (ax.M9.d e2) {
            ax.M9.d dVar = new ax.M9.d("Unable to authenticate request, No active account found", e2, ax.M9.e.AuthenticationFailure);
            this.a.b("Unable to authenticate request, No active account found", dVar);
            throw dVar;
        }
    }

    public String d() throws ax.M9.d {
        if (!h()) {
            ax.M9.d dVar = new ax.M9.d("Unable to get access token, No active account found", null, ax.M9.e.AuthenticationFailure);
            this.a.b("Unable to get access token, No active account found", dVar);
            throw dVar;
        }
        this.a.a("Found account information");
        if (this.b.g().d()) {
            this.a.a("Account access token is expired, refreshing");
            k();
        }
        return this.b.g().b();
    }

    public abstract String e();

    public String f() throws ax.M9.d {
        if (!h()) {
            ax.M9.d dVar = new ax.M9.d("Unable to get access token, No active account found", null, ax.M9.e.AuthenticationFailure);
            this.a.b("Unable to get access token, No active account found", dVar);
            throw dVar;
        }
        this.a.a("Found account information");
        if (this.b.g().d()) {
            this.a.a("Account access token is expired, refreshing");
            k();
        }
        return this.b.g().c();
    }

    public abstract String[] g();

    public void i(Activity activity, String str, ax.L9.c<Void> cVar) {
        this.a.a("Login started");
        if (cVar == null) {
            throw new IllegalArgumentException("callback");
        }
        if (!h()) {
            activity.runOnUiThread(new c(activity, str, new C0112b(cVar)));
        } else {
            this.a.a("Already logged in");
            cVar.c(null);
        }
    }

    public void j(ax.L9.c<Void> cVar) {
        this.a.a("Login silent started");
        if (cVar == null) {
            throw new IllegalArgumentException("callback");
        }
        this.b.j(new d(cVar));
    }

    public void l(ax.L9.c<Void> cVar) {
        this.a.a("Logout started");
        if (cVar == null) {
            throw new IllegalArgumentException("callback");
        }
        this.b.l(new a(cVar));
    }
}
