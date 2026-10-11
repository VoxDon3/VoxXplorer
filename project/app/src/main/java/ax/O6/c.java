/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.RectF;
import ax.O6.d;
import ax.W.a;
import java.util.Arrays;

public final class c
implements d {
    private final float a;

    public c(float f8) {
        this.a = f8;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override
    public float a(RectF rectF) {
        return ax.W.a.a(this.a, 0.0f, c.b(rectF));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.a == ((c)object).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}

