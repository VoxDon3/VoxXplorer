package ax.P0;

import ax.S0.C0968a;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class G {
    public static final G d = new G(1.0f);
    private static final String e = d0.G0(0);
    private static final String f = d0.G0(1);
    public final float a;
    public final float b;
    private final int c;

    public G(float f2) {
        this(f2, 1.0f);
    }

    public long a(long j) {
        return j * this.c;
    }

    public G b(float f2) {
        return new G(f2, this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g = (G) obj;
            if (this.a == g.a && this.b == g.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.a)) * 31) + Float.floatToRawIntBits(this.b);
    }

    public String toString() {
        return d0.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }

    public G(float f2, float f3) {
        C0968a.a(f2 > 0.0f);
        C0968a.a(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
