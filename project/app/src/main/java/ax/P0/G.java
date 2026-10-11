/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.S0.a;
import ax.S0.d0;

public final class G {
    public static final G d = new G(1.0f);
    private static final String e = d0.G0(0);
    private static final String f = d0.G0(1);
    public final float a;
    public final float b;
    private final int c;

    public G(float f8) {
        this(f8, 1.0f);
    }

    public G(float f8, float f9) {
        boolean bl = false;
        boolean bl2 = f8 > 0.0f;
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (f9 > 0.0f) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        this.a = f8;
        this.b = f9;
        this.c = Math.round(f8 * 1000.0f);
    }

    public long a(long l8) {
        return l8 * (long)this.c;
    }

    public G b(float f8) {
        return new G(f8, this.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && G.class == object.getClass()) {
            object = (G)object;
            if (this.a == ((G)object).a && this.b == ((G)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + Float.floatToRawIntBits(this.a)) * 31 + Float.floatToRawIntBits(this.b);
    }

    public String toString() {
        return d0.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}

