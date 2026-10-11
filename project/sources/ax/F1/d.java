package ax.F1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.u7.C3215c;

/* loaded from: classes.dex */
public final class d implements C.a {
    public final float a;
    public final int b;

    public d(float f, int i) {
        this.a = f;
        this.b = i;
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.b == dVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C3215c.a(this.a)) * 31) + this.b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
