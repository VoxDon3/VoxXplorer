package ax.J;

import android.view.View;
import ax.F.e;

/* loaded from: classes.dex */
public abstract class c extends e {
    public abstract void b(View view, float f);

    public static class a extends c {
        public void c(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // ax.J.c
        public void b(View view, float f) {
        }
    }
}
