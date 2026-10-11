package ax.J7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ax.j6.AbstractC2327j;
import ax.x7.C3471f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class r {
    private final Context a;
    private final C3471f b;
    private final C0778x c;
    private C0773s f;
    private C0773s g;
    private boolean h;
    private C0771p i;
    private final C j;
    private final ax.O7.g k;
    public final ax.I7.b l;
    private final ax.H7.a m;
    private final ExecutorService n;
    private final C0769n o;
    private final C0768m p;
    private final ax.G7.a q;
    private final ax.G7.l r;
    private final long e = System.currentTimeMillis();
    private final H d = new H();

    class a implements Callable<AbstractC2327j<Void>> {
        final /* synthetic */ ax.Q7.i a;

        a(ax.Q7.i iVar) {
            this.a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2327j<Void> call() throws Exception {
            return r.this.f(this.a);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ax.Q7.i q;

        b(ax.Q7.i iVar) {
            this.q = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f(this.q);
        }
    }

    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean d = r.this.f.d();
                if (!d) {
                    ax.G7.g.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                ax.G7.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(r.this.i.s());
        }
    }

    public r(C3471f c3471f, C c2, ax.G7.a aVar, C0778x c0778x, ax.I7.b bVar, ax.H7.a aVar2, ax.O7.g gVar, ExecutorService executorService, C0768m c0768m, ax.G7.l lVar) {
        this.b = c3471f;
        this.c = c0778x;
        this.a = c3471f.k();
        this.j = c2;
        this.q = aVar;
        this.l = bVar;
        this.m = aVar2;
        this.n = executorService;
        this.k = gVar;
        this.o = new C0769n(executorService);
        this.p = c0768m;
        this.r = lVar;
    }

    private void d() {
        try {
            this.h = Boolean.TRUE.equals((Boolean) Z.f(this.o.h(new d())));
        } catch (Exception unused) {
            this.h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2327j<Void> f(ax.Q7.i iVar) {
        n();
        try {
            this.l.a(new ax.I7.a() { // from class: ax.J7.q
                @Override // ax.I7.a
                public final void a(String str) {
                    r.this.k(str);
                }
            });
            this.i.R();
            if (!iVar.b().b.a) {
                ax.G7.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return ax.j6.m.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.z(iVar)) {
                ax.G7.g.f().k("Previous sessions could not be finalized.");
            }
            return this.i.U(iVar.a());
        } catch (Exception e) {
            ax.G7.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return ax.j6.m.d(e);
        } finally {
            m();
        }
    }

    private void h(ax.Q7.i iVar) {
        Future<?> submit = this.n.submit(new b(iVar));
        ax.G7.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            ax.G7.g.f().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            ax.G7.g.f().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            ax.G7.g.f().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String i() {
        return "19.0.3";
    }

    static boolean j(String str, boolean z) {
        if (!z) {
            ax.G7.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean e() {
        return this.f.c();
    }

    public AbstractC2327j<Void> g(ax.Q7.i iVar) {
        return Z.h(this.n, new a(iVar));
    }

    public void k(String str) {
        this.i.Y(System.currentTimeMillis() - this.e, str);
    }

    public void l(Throwable th) {
        this.i.X(Thread.currentThread(), th);
    }

    void m() {
        this.o.h(new c());
    }

    void n() {
        this.o.b();
        this.f.a();
        ax.G7.g.f().i("Initialization marker file was created.");
    }

    public boolean o(C0756a c0756a, ax.Q7.i iVar) {
        if (!j(c0756a.b, C0764i.i(this.a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c0763h = new C0763h(this.j).toString();
        try {
            this.g = new C0773s("crash_marker", this.k);
            this.f = new C0773s("initialization_marker", this.k);
            ax.K7.m mVar = new ax.K7.m(c0763h, this.k, this.o);
            ax.K7.e eVar = new ax.K7.e(this.k);
            ax.R7.a aVar = new ax.R7.a(1024, new ax.R7.c(10));
            this.r.b(mVar);
            this.i = new C0771p(this.a, this.o, this.j, this.c, this.k, this.g, c0756a, mVar, eVar, S.h(this.a, this.j, this.k, c0756a, eVar, mVar, aVar, iVar, this.d, this.p), this.q, this.m, this.p);
            boolean e = e();
            d();
            this.i.x(c0763h, Thread.getDefaultUncaughtExceptionHandler(), iVar);
            if (!e || !C0764i.d(this.a)) {
                ax.G7.g.f().b("Successfully configured exception handler.");
                return true;
            }
            ax.G7.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            h(iVar);
            return false;
        } catch (Exception e2) {
            ax.G7.g.f().e("Crashlytics was not started due to an exception during initialization", e2);
            this.i = null;
            return false;
        }
    }

    public void p(Boolean bool) {
        this.c.h(bool);
    }

    public void q(String str, String str2) {
        this.i.S(str, str2);
    }
}
