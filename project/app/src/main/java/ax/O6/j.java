/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.RectF;
import ax.O6.d;
import java.util.Arrays;

public final class j
implements d {
    private final float a;

    public j(float f8) {
        this.a = f8;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override
    public float a(RectF rectF) {
        return this.a * j.b(rectF);
    }

    public float c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        object = (j)object;
        return this.a == ((j)object).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int)(this.c() * 100.0f));
        stringBuilder.append("%");
        return stringBuilder.toString();
    }
}

