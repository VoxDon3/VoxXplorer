/*
 * Decompiled with CFR 0.152.
 */
package ax.J;

import android.view.View;
import ax.F.c;
import ax.F.f;

public abstract class d
extends f {
    public float a(float object, long l8, View object2, c c8) {
        this.a.c((double)object, this.g);
        object2 = this.g;
        object = object2[1];
        if (object == 0.0f) {
            this.h = false;
            return (float)object2[2];
        }
        if (Float.isNaN(this.j)) {
            throw null;
        }
        long l9 = this.i;
        this.j = (float)(((double)this.j + (double)(l8 - l9) * 1.0E-9 * (double)object) % 1.0);
        throw null;
    }

    public abstract boolean b(View var1, float var2, long var3, c var5);

    public static class a
    extends d {
        @Override
        public boolean b(View view, float f8, long l8, c c8) {
            return this.h;
        }

        public boolean c(View view, c c8, float f8, long l8, double d8, double d9) {
            view.setRotation(this.a(f8, l8, view, c8) + (float)Math.toDegrees(Math.atan2(d9, d8)));
            return this.h;
        }
    }
}

