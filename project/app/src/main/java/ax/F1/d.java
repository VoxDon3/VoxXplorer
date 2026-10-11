/*
 * Decompiled with CFR 0.152.
 */
package ax.F1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.u7.c;

public final class d
implements C.a {
    public final float a;
    public final int b;

    public d(float f8, int n8) {
        this.a = f8;
        this.b = n8;
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
        if (object != null && d.class == object.getClass()) {
            object = (d)object;
            if (this.a == ((d)object).a && this.b == ((d)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + c.a(this.a)) * 31 + this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("smta: captureFrameRate=");
        stringBuilder.append(this.a);
        stringBuilder.append(", svcTemporalLayerCount=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

