/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ax.Gb.l;
import ax.n8.E;
import ax.sb.t;

public final class I
implements Application.ActivityLifecycleCallbacks {
    public static final I a = new I();
    private static boolean b;
    private static E c;

    private I() {
    }

    public final void a(E e8) {
        c = e8;
        if (e8 != null && b) {
            b = false;
            e8.k();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        l.f(activity, "activity");
    }

    public void onActivityPaused(Activity object) {
        l.f(object, "activity");
        object = c;
        if (object != null) {
            ((E)object).h();
        }
    }

    public void onActivityResumed(Activity object) {
        l.f(object, "activity");
        object = c;
        if (object != null) {
            ((E)object).k();
            object = t.a;
        } else {
            object = null;
        }
        if (object == null) {
            b = true;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.f(activity, "activity");
        l.f(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        l.f(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        l.f(activity, "activity");
    }
}

