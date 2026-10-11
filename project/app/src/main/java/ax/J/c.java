/*
 * Decompiled with CFR 0.152.
 */
package ax.J;

import android.view.View;
import ax.F.e;

public abstract class c
extends e {
    public abstract void b(View var1, float var2);

    public static class a
    extends c {
        @Override
        public void b(View view, float f8) {
        }

        public void c(View view, float f8, double d8, double d9) {
            view.setRotation(this.a(f8) + (float)Math.toDegrees(Math.atan2(d9, d8)));
        }
    }
}

