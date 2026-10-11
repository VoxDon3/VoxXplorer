/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.app.Activity;
import androidx.fragment.app.f;
import ax.M5.p;

public class e {
    private final Object a;

    public e(Activity activity) {
        p.m(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity)this.a;
    }

    public final f b() {
        return (f)this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof f;
    }
}

