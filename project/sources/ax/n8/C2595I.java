package ax.n8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: ax.n8.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2595I implements Application.ActivityLifecycleCallbacks {
    public static final C2595I a = new C2595I();
    private static boolean b;
    private static C2591E c;

    private C2595I() {
    }

    public final void a(C2591E c2591e) {
        c = c2591e;
        if (c2591e == null || !b) {
            return;
        }
        b = false;
        c2591e.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ax.Gb.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ax.Gb.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ax.Gb.l.f(activity, "activity");
        C2591E c2591e = c;
        if (c2591e != null) {
            c2591e.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ax.sb.t tVar;
        ax.Gb.l.f(activity, "activity");
        C2591E c2591e = c;
        if (c2591e != null) {
            c2591e.k();
            tVar = ax.sb.t.a;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ax.Gb.l.f(activity, "activity");
        ax.Gb.l.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ax.Gb.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ax.Gb.l.f(activity, "activity");
    }
}
