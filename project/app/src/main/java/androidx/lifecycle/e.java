/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k;
import ax.G0.d;
import ax.Gb.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e {
    public static final e a = new e();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private e() {
    }

    public static final void a(Context context) {
        l.f(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        context = context.getApplicationContext();
        l.d(context, "null cannot be cast to non-null type android.app.Application");
        ((Application)context).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new a());
    }

    public static final class a
    extends d {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            k.b.c(activity);
        }
    }
}

