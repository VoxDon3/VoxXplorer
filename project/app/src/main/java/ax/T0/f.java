/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.S0.a;
import ax.u7.c;

public final class f
implements C.a {
    public final float a;
    public final float b;

    public f(float f8, float f9) {
        boolean bl = f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f;
        ax.S0.a.b(bl, "Invalid latitude or longitude");
        this.a = f8;
        this.b = f9;
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && f.class == object.getClass()) {
            object = (f)object;
            if (this.a == ((f)object).a && this.b == ((f)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + c.a(this.a)) * 31 + c.a(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("xyz: latitude=");
        stringBuilder.append(this.a);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

