package ax.a6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: ax.a6.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1425y implements Application.ActivityLifecycleCallbacks {
    private final Activity a;
    final /* synthetic */ C1373C b;

    public C1425y(C1373C c1373c, Activity activity) {
        this.b = c1373c;
        this.a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.b.a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1373C c1373c = this.b;
        if (c1373c.f == null || !c1373c.l) {
            return;
        }
        c1373c.f.setOwnerActivity(activity);
        if (c1373c.b != null) {
            c1373c.b.a(activity);
        }
        C1425y c1425y = (C1425y) c1373c.k.getAndSet(null);
        if (c1425y != null) {
            c1425y.b();
            C1425y c1425y2 = new C1425y(c1373c, activity);
            c1373c.a.registerActivityLifecycleCallbacks(c1425y2);
            c1373c.k.set(c1425y2);
        }
        if (c1373c.f != null) {
            c1373c.f.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.a) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            C1373C c1373c = this.b;
            if (c1373c.l && c1373c.f != null) {
                c1373c.f.dismiss();
                return;
            }
        }
        this.b.i(new F0(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
