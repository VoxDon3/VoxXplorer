package ax.Lb;

import ax.Gb.l;

/* loaded from: classes3.dex */
class g {
    public static final void a(boolean z, Number number) {
        l.f(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
