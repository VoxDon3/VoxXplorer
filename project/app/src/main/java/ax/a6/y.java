/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ax.a6.C;
import ax.a6.F0;

final class y
implements Application.ActivityLifecycleCallbacks {
    private final Activity a;
    final C b;

    public y(C c8, Activity activity) {
        this.b = c8;
        this.a = activity;
    }

    static /* bridge */ /* synthetic */ void a(y y8) {
        y8.b();
    }

    private final void b() {
        C.b(this.b).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
    }

    public final void onActivityCreated(Activity object, Bundle object2) {
        object2 = this.b;
        if (C.c((C)object2) != null && object2.l) {
            y y8;
            C.c((C)object2).setOwnerActivity(object);
            if (C.e((C)object2) != null) {
                C.e((C)object2).a((Activity)object);
            }
            if ((y8 = (y)C.f((C)object2).getAndSet(null)) != null) {
                y8.b();
                object = new y((C)object2, (Activity)object);
                C.b((C)object2).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
                C.f((C)object2).set(object);
            }
            if (C.c((C)object2) != null) {
                C.c((C)object2).show();
            }
        }
    }

    public final void onActivityDestroyed(Activity object) {
        if (object != this.a) {
            return;
        }
        if (object.isChangingConfigurations()) {
            object = this.b;
            if (object.l && C.c((C)object) != null) {
                C.c((C)object).dismiss();
                return;
            }
        }
        this.b.i(new F0(3, "Activity is destroyed."));
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

