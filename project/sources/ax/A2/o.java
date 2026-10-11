package ax.A2;

import android.content.Context;

/* loaded from: classes.dex */
final class o implements m {
    public static final o b = new o();

    private o() {
    }

    @Override // ax.A2.m
    public float a(Context context) {
        ax.Gb.l.f(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }
}
