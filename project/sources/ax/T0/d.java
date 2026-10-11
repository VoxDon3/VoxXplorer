package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;

/* loaded from: classes.dex */
public final class d implements C.a {
    public final int a;

    public d(int i) {
        this.a = i;
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
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
