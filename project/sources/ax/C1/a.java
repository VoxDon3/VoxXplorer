package ax.C1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import ax.P0.D;
import ax.S0.G;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements C.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static a d(G g) {
        int v = g.v();
        String t = D.t(g.K(g.v(), StandardCharsets.US_ASCII));
        String J = g.J(g.v());
        int v2 = g.v();
        int v3 = g.v();
        int v4 = g.v();
        int v5 = g.v();
        int v6 = g.v();
        byte[] bArr = new byte[v6];
        g.q(bArr, 0, v6);
        return new a(v, t, J, v2, v3, v4, v5, bArr);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public void b(A.b bVar) {
        bVar.K(this.h, this.a);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
