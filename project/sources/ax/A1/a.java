package ax.A1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;

/* loaded from: classes.dex */
public final class a implements C.a {
    public final int a;
    public final String b;

    public a(int i, String str) {
        this.a = i;
        this.b = str;
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

    public String toString() {
        return "Ait(controlCode=" + this.a + ",url=" + this.b + ")";
    }
}
