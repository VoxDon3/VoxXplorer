/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import ax.G7.g;
import ax.G7.l;
import ax.I7.b;
import ax.J7.C;
import ax.J7.H;
import ax.J7.S;
import ax.J7.Z;
import ax.J7.a;
import ax.J7.h;
import ax.J7.i;
import ax.J7.m;
import ax.J7.n;
import ax.J7.p;
import ax.J7.q;
import ax.J7.s;
import ax.J7.x;
import ax.K7.e;
import ax.R7.c;
import ax.R7.d;
import ax.j6.j;
import ax.x7.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r {
    private final Context a;
    private final f b;
    private final x c;
    private final H d;
    private final long e;
    private s f;
    private s g;
    private boolean h;
    private p i;
    private final C j;
    private final ax.O7.g k;
    public final b l;
    private final ax.H7.a m;
    private final ExecutorService n;
    private final n o;
    private final m p;
    private final ax.G7.a q;
    private final l r;

    public r(f f8, C c8, ax.G7.a a8, x x8, b b8, ax.H7.a a9, ax.O7.g g8, ExecutorService executorService, m m8, l l8) {
        this.b = f8;
        this.c = x8;
        this.a = f8.k();
        this.j = c8;
        this.q = a8;
        this.l = b8;
        this.m = a9;
        this.n = executorService;
        this.k = g8;
        this.o = new n(executorService);
        this.p = m8;
        this.r = l8;
        this.e = System.currentTimeMillis();
        this.d = new H();
    }

    private void d() {
        Object object = this.o.h(new Callable<Boolean>(this){
            final r a;
            {
                this.a = r8;
            }

            public Boolean a() throws Exception {
                return this.a.i.s();
            }
        });
        try {
            object = Z.f(object);
            this.h = Boolean.TRUE.equals(object);
            return;
        }
        catch (Exception exception) {
            this.h = false;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private j<Void> f(ax.Q7.i j8) {
        Throwable throwable2;
        block7: {
            this.n();
            try {
                b b8 = this.l;
                q q8 = new q(this);
                b8.a(q8);
                this.i.R();
                if (!j8.b().b.a) {
                    ax.G7.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    j8 = new j<Void>("Collection of crash reports disabled in Crashlytics settings.");
                    j8 = ax.j6.m.d((Exception)((Object)j8));
                    this.m();
                    return j8;
                }
                if (!this.i.z((ax.Q7.i)((Object)j8))) {
                    ax.G7.g.f().k("Previous sessions could not be finalized.");
                }
                j8 = this.i.U(j8.a());
                this.m();
                return j8;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (Exception exception) {}
            {
                ax.G7.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", exception);
                j<Void> j9 = ax.j6.m.d(exception);
                this.m();
                return j9;
            }
        }
        this.m();
        throw throwable2;
    }

    private void h(ax.Q7.i future) {
        block6: {
            InterruptedException interruptedException2;
            block5: {
                ExecutionException executionException2;
                block4: {
                    future = new Runnable(){
                        final r c0;
                        final ax.Q7.i q;
                        {
                            this.c0 = r8;
                            this.q = i8;
                        }

                        @Override
                        public void run() {
                            this.c0.f(this.q);
                        }
                    };
                    future = this.n.submit((Runnable)((Object)future));
                    ax.G7.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
                    try {
                        future.get(3L, TimeUnit.SECONDS);
                        return;
                    }
                    catch (TimeoutException timeoutException) {
                    }
                    catch (ExecutionException executionException2) {
                        break block4;
                    }
                    catch (InterruptedException interruptedException2) {
                        break block5;
                    }
                    ax.G7.g.f().e("Crashlytics timed out during initialization.", timeoutException);
                    break block6;
                }
                ax.G7.g.f().e("Crashlytics encountered a problem during initialization.", executionException2);
                break block6;
            }
            ax.G7.g.f().e("Crashlytics was interrupted during initialization.", interruptedException2);
        }
    }

    public static String i() {
        return "19.0.3";
    }

    static boolean j(String string, boolean bl) {
        if (!bl) {
            ax.G7.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return true;
        }
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  | ");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".   \\ |  | /");
        Log.e((String)"FirebaseCrashlytics", (String)".    \\    /");
        Log.e((String)"FirebaseCrashlytics", (String)".     \\  /");
        Log.e((String)"FirebaseCrashlytics", (String)".      \\/");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)"The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)".      /\\");
        Log.e((String)"FirebaseCrashlytics", (String)".     /  \\");
        Log.e((String)"FirebaseCrashlytics", (String)".    /    \\");
        Log.e((String)"FirebaseCrashlytics", (String)".   / |  | \\");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        return false;
    }

    boolean e() {
        return this.f.c();
    }

    public j<Void> g(ax.Q7.i i8) {
        return Z.h(this.n, new Callable<j<Void>>(){
            final ax.Q7.i a;
            final r b;
            {
                this.b = r8;
                this.a = i8;
            }

            public j<Void> a() throws Exception {
                return this.b.f(this.a);
            }
        });
    }

    public void k(String string) {
        long l8 = System.currentTimeMillis();
        long l9 = this.e;
        this.i.Y(l8 - l9, string);
    }

    public void l(Throwable throwable) {
        this.i.X(Thread.currentThread(), throwable);
    }

    void m() {
        this.o.h(new Callable<Boolean>(this){
            final r a;
            {
                this.a = r8;
            }

            public Boolean a() throws Exception {
                Exception exception2;
                block4: {
                    boolean bl;
                    block3: {
                        try {
                            bl = this.a.f.d();
                            if (bl) break block3;
                        }
                        catch (Exception exception2) {
                            break block4;
                        }
                        ax.G7.g.f().k("Initialization marker file was not properly removed.");
                    }
                    return bl;
                }
                ax.G7.g.f().e("Problem encountered deleting Crashlytics initialization marker.", exception2);
                return Boolean.FALSE;
            }
        });
    }

    void n() {
        this.o.b();
        this.f.a();
        ax.G7.g.f().i("Initialization marker file was created.");
    }

    public boolean o(a a8, ax.Q7.i i8) {
        boolean bl = ax.J7.i.i(this.a, "com.crashlytics.RequireBuildId", true);
        if (ax.J7.r.j(a8.b, bl)) {
            Exception exception2;
            block6: {
                block5: {
                    String string = new h(this.j).toString();
                    try {
                        Object object = new s("crash_marker", this.k);
                        this.g = object;
                        object = new s("initialization_marker", this.k);
                        this.f = object;
                        object = new ax.K7.m(string, this.k, this.o);
                        e e8 = new e(this.k);
                        Object object2 = new c(10);
                        Object object3 = new ax.R7.a(1024, new d[]{object2});
                        this.r.b((ax.K7.m)object);
                        object2 = S.h(this.a, this.j, this.k, a8, e8, (ax.K7.m)object, (d)object3, i8, this.d, this.p);
                        this.i = object3 = new p(this.a, this.o, this.j, this.c, this.k, this.g, a8, (ax.K7.m)object, e8, (S)object2, this.q, this.m, this.p);
                        bl = this.e();
                        this.d();
                        this.i.x(string, Thread.getDefaultUncaughtExceptionHandler(), i8);
                        if (!bl) break block5;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                    if (ax.J7.i.d(this.a)) {
                        ax.G7.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                        this.h(i8);
                        return false;
                    }
                }
                ax.G7.g.f().b("Successfully configured exception handler.");
                return true;
            }
            ax.G7.g.f().e("Crashlytics was not started due to an exception during initialization", exception2);
            this.i = null;
            return false;
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void p(Boolean bl) {
        this.c.h(bl);
    }

    public void q(String string, String string2) {
        this.i.S(string, string2);
    }
}

