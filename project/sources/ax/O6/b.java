package ax.O6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements d {
    private final d a;
    private final float b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).a;
            f += ((b) dVar).b;
        }
        this.a = dVar;
        this.b = f;
    }

    @Override // ax.O6.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
