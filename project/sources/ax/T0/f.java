package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.u7.C3215c;

/* loaded from: classes.dex */
public final class f implements C.a {
    public final float a;
    public final float b;

    public f(float f, float f2) {
        C0968a.b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ void b(A.b bVar) {
        B.c(this, bVar);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.a == fVar.a && this.b == fVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C3215c.a(this.a)) * 31) + C3215c.a(this.b);
    }

    public String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
