/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import ax.G0.h;
import ax.G0.n;
import ax.Gb.l;

public final class j
implements h {
    public static final b i = new b(null);
    private static final j j = new j();
    private int a;
    private int b;
    private boolean c = true;
    private boolean d = true;
    private Handler e;
    private final g f = new g(this);
    private final Runnable g = new n(this);
    private final k.a h = new k.a(this){
        final j a;
        {
            this.a = j8;
        }

        @Override
        public void a() {
        }

        @Override
        public void b() {
            this.a.f();
        }

        @Override
        public void c() {
            this.a.e();
        }
    };

    private j() {
    }

    public static /* synthetic */ void a(j j8) {
        androidx.lifecycle.j.i(j8);
    }

    private static final void i(j j8) {
        l.f(j8, "this$0");
        j8.j();
        j8.k();
    }

    public final void d() {
        int n8;
        this.b = n8 = this.b - 1;
        if (n8 == 0) {
            Handler handler = this.e;
            l.c(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int n8;
        this.b = n8 = this.b + 1;
        if (n8 == 1) {
            if (this.c) {
                this.f.h(d.a.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            l.c(handler);
            handler.removeCallbacks(this.g);
        }
    }

    public final void f() {
        int n8;
        this.a = n8 = this.a + 1;
        if (n8 == 1 && this.d) {
            this.f.h(d.a.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        --this.a;
        this.k();
    }

    @Override
    public d getLifecycle() {
        return this.f;
    }

    public final void h(Context context) {
        l.f(context, "context");
        this.e = new Handler();
        this.f.h(d.a.ON_CREATE);
        context = context.getApplicationContext();
        l.d(context, "null cannot be cast to non-null type android.app.Application");
        ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new ax.G0.d(this){
            final j this$0;
            {
                this.this$0 = j8;
            }

            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                l.f(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    k.b.b(activity).e(this.this$0.h);
                }
            }

            @Override
            public void onActivityPaused(Activity activity) {
                l.f(activity, "activity");
                this.this$0.d();
            }

            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                l.f(activity, "activity");
                androidx.lifecycle.j$a.a(activity, new ax.G0.d(this.this$0){
                    final j this$0;
                    {
                        this.this$0 = j8;
                    }

                    public void onActivityPostResumed(Activity activity) {
                        l.f(activity, "activity");
                        this.this$0.e();
                    }

                    public void onActivityPostStarted(Activity activity) {
                        l.f(activity, "activity");
                        this.this$0.f();
                    }
                });
            }

            @Override
            public void onActivityStopped(Activity activity) {
                l.f(activity, "activity");
                this.this$0.g();
            }
        });
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

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            l.f(activity, "activity");
            l.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ax.Gb.g g8) {
            this();
        }

        public final h a() {
            return j;
        }

        public final void b(Context context) {
            l.f(context, "context");
            j.h(context);
        }
    }
}

