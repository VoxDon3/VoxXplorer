package ax.L5;

import android.app.Activity;
import ax.M5.C0821p;

/* renamed from: ax.L5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0793e {
    private final Object a;

    public C0793e(Activity activity) {
        C0821p.m(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final androidx.fragment.app.f b() {
        return (androidx.fragment.app.f) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof androidx.fragment.app.f;
    }
}
