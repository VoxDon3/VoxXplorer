package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static final class a extends ax.G0.d {
        @Override // ax.G0.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ax.Gb.l.f(activity, "activity");
            k.b.c(activity);
        }
    }

    private e() {
    }

    public static final void a(Context context) {
        ax.Gb.l.f(context, "context");
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ax.Gb.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
