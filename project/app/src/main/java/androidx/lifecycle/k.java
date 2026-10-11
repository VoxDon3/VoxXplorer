/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import ax.G0.h;
import ax.G0.i;
import ax.G0.o;
import ax.Gb.l;

public class k
extends Fragment {
    public static final b b = new b(null);
    private a a;

    private final void a(d.a a8) {
        if (Build.VERSION.SDK_INT < 29) {
            b b8 = b;
            Activity activity = this.getActivity();
            l.e(activity, "activity");
            b8.a(activity, a8);
        }
    }

    private final void b(a a8) {
        if (a8 != null) {
            a8.a();
        }
    }

    private final void c(a a8) {
        if (a8 != null) {
            a8.c();
        }
    }

    private final void d(a a8) {
        if (a8 != null) {
            a8.b();
        }
    }

    public final void e(a a8) {
        this.a = a8;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b(this.a);
        this.a(d.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        this.a(d.a.ON_DESTROY);
        this.a = null;
    }

    public void onPause() {
        super.onPause();
        this.a(d.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.c(this.a);
        this.a(d.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.d(this.a);
        this.a(d.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        this.a(d.a.ON_STOP);
    }

    public static interface a {
        public void a();

        public void b();

        public void c();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ax.Gb.g g8) {
            this();
        }

        public final void a(Activity object, d.a a8) {
            l.f(object, "activity");
            l.f((Object)a8, "event");
            if (object instanceof i) {
                ((i)object).getLifecycle().h(a8);
                return;
            }
            if (object instanceof h && (object = ((h)object).getLifecycle()) instanceof g) {
                ((g)object).h(a8);
            }
        }

        public final k b(Activity activity) {
            l.f(activity, "<this>");
            activity = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            l.d(activity, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (k)activity;
        }

        public final void c(Activity activity) {
            l.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            if ((activity = activity.getFragmentManager()).findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                activity.beginTransaction().add((Fragment)new k(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                activity.executePendingTransactions();
            }
        }
    }

    public static final class c
    implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            l.f(activity, "activity");
            b.a(activity, d.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            l.f(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            l.f(activity, "activity");
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ax.Gb.g g8) {
                this();
            }

            public final void a(Activity activity) {
                l.f(activity, "activity");
                o.a(activity, new c());
            }
        }
    }
}

