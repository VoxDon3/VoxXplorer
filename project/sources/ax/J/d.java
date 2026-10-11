package ax.J;

import android.view.View;
import ax.F.f;

/* loaded from: classes.dex */
public abstract class d extends f {

    public static class a extends d {
        @Override // ax.J.d
        public boolean b(View view, float f, long j, ax.F.c cVar) {
            return this.h;
        }

        public boolean c(View view, ax.F.c cVar, float f, long j, double d, double d2) {
            view.setRotation(a(f, j, view, cVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    public float a(float f, long j, View view, ax.F.c cVar) {
        this.a.c(f, this.g);
        float[] fArr = this.g;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            throw null;
        }
        this.j = (float) ((this.j + (((j - this.i) * 1.0E-9d) * f2)) % 1.0d);
        throw null;
    }

    public abstract boolean b(View view, float f, long j, ax.F.c cVar);
}
