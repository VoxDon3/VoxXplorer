package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
public final class j implements ax.G0.h {
    public static final b i = new b(null);
    private static final j j = new j();
    private int a;
    private int b;
    private Handler e;
    private boolean c = true;
    private boolean d = true;
    private final g f = new g(this);
    private final Runnable g = new Runnable() { // from class: ax.G0.n
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.j.i(androidx.lifecycle.j.this);
        }
    };
    private final k.a h = new d();

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            ax.Gb.l.f(activity, "activity");
            ax.Gb.l.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        public final ax.G0.h a() {
            return j.j;
        }

        public final void b(Context context) {
            ax.Gb.l.f(context, "context");
            j.j.h(context);
        }

        private b() {
        }
    }

    public static final class c extends ax.G0.d {

        public static final class a extends ax.G0.d {
            final /* synthetic */ j this$0;

            a(j jVar) {
                this.this$0 = jVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ax.Gb.l.f(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ax.Gb.l.f(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // ax.G0.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ax.Gb.l.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                k.b.b(activity).e(j.this.h);
            }
        }

        @Override // ax.G0.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ax.Gb.l.f(activity, "activity");
            j.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            ax.Gb.l.f(activity, "activity");
            a.a(activity, new a(j.this));
        }

        @Override // ax.G0.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ax.Gb.l.f(activity, "activity");
            j.this.g();
        }
    }

    public static final class d implements k.a {
        d() {
        }

        @Override // androidx.lifecycle.k.a
        public void a() {
        }

        @Override // androidx.lifecycle.k.a
        public void b() {
            j.this.f();
        }

        @Override // androidx.lifecycle.k.a
        public void c() {
            j.this.e();
        }
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j jVar) {
        ax.Gb.l.f(jVar, "this$0");
        jVar.j();
        jVar.k();
    }

    public final void d() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            Handler handler = this.e;
            ax.Gb.l.c(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.h(d.a.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                ax.Gb.l.c(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }

    public final void f() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.h(d.a.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        this.a--;
        k();
    }

    @Override // ax.G0.h
    public androidx.lifecycle.d getLifecycle() {
        return this.f;
    }

    public final void h(Context context) {
        ax.Gb.l.f(context, "context");
        this.e = new Handler();
        this.f.h(d.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        ax.Gb.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.b == 0) {
            this.c = true;
            this.f.h(d.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.a == 0 && this.c) {
            this.f.h(d.a.ON_STOP);
            this.d = true;
        }
    }
}
