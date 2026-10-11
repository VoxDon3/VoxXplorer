/*
 * Decompiled with CFR 0.152.
 */
package ax.G0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ax.Gb.l;

public class d
implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        l.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        l.f(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        l.f(activity, "activity");
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

