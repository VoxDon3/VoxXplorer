/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.RectF;
import ax.O6.d;
import java.util.Arrays;

public final class b
implements d {
    private final d a;
    private final float b;

    public b(float f8, d d8) {
        while (d8 instanceof b) {
            d8 = ((b)d8).a;
            f8 += ((b)d8).b;
        }
        this.a = d8;
        this.b = f8;
    }

    @Override
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.a.equals(((b)object).a) && this.b == ((b)object).b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

