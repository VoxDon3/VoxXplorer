package ax.J;

import android.view.View;

/* loaded from: classes.dex */
public abstract class b extends ax.F.d {
    public abstract void b(View view, float f);

    public static class a extends b {
        public void c(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // ax.J.b
        public void b(View view, float f) {
        }
    }
}
