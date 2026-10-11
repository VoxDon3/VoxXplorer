package ax.O6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j implements d {
    private final float a;

    public j(float f) {
        this.a = f;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // ax.O6.d
    public float a(RectF rectF) {
        return this.a * b(rectF);
    }

    public float c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a == ((j) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
