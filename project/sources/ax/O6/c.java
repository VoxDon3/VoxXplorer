package ax.O6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c implements d {
    private final float a;

    public c(float f) {
        this.a = f;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // ax.O6.d
    public float a(RectF rectF) {
        return ax.W.a.a(this.a, 0.0f, b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
