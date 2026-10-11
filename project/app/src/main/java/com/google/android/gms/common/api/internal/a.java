/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import ax.R5.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
implements Application.ActivityLifecycleCallbacks,
ComponentCallbacks2 {
    private static final a e = new a();
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean();
    private final ArrayList c = new ArrayList();
    private boolean d = false;

    private a() {
    }

    public static a b() {
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Application application) {
        a a8 = e;
        synchronized (a8) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (a8.d) break block3;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)a8);
                        application.registerComponentCallbacks((ComponentCallbacks)a8);
                        a8.d = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void f(boolean bl) {
        a a8 = e;
        synchronized (a8) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList arrayList = this.c;
                    int n8 = arrayList.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        Object e8 = arrayList.get(i8);
                        ((a)e8).a(bl);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a a8) {
        a a9 = e;
        synchronized (a9) {
            this.c.add(a8);
            return;
        }
    }

    public boolean d() {
        return this.a.get();
    }

    @TargetApi(value=16)
    public boolean e(boolean bl) {
        if (!this.b.get()) {
            if (l.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
                if (!this.b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.a.set(true);
                }
            } else {
                return bl;
            }
        }
        return this.d();
    }

    public final void onActivityCreated(Activity object, Bundle bundle) {
        object = this.b;
        boolean bl = this.a.compareAndSet(true, false);
        ((AtomicBoolean)object).set(true);
        if (bl) {
            this.f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity object) {
        object = this.b;
        boolean bl = this.a.compareAndSet(true, false);
        ((AtomicBoolean)object).set(true);
        if (bl) {
            this.f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int n8) {
        if (n8 == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            this.f(true);
        }
    }

    public static interface a {
        public void a(boolean var1);
    }
}

