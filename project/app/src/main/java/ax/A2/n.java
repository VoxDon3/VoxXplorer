/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.content.Context;
import android.view.WindowManager;
import ax.A2.m;
import ax.Gb.l;

final class n
implements m {
    public static final n b = new n();

    private n() {
    }

    @Override
    public float a(Context context) {
        l.f(context, "context");
        return ((WindowManager)context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}

