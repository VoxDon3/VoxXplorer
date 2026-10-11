/*
 * Decompiled with CFR 0.152.
 */
package ax.C1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.D;
import ax.P0.v;
import ax.S0.G;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class a
implements C.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public a(int n8, String string, String string2, int n9, int n10, int n11, int n12, byte[] byArray) {
        this.a = n8;
        this.b = string;
        this.c = string2;
        this.d = n9;
        this.e = n10;
        this.f = n11;
        this.g = n12;
        this.h = byArray;
    }

    public static a d(G g8) {
        int n8 = g8.v();
        String string = D.t(g8.K(g8.v(), StandardCharsets.US_ASCII));
        String string2 = g8.J(g8.v());
        int n9 = g8.v();
        int n10 = g8.v();
        int n11 = g8.v();
        int n12 = g8.v();
        int n13 = g8.v();
        byte[] byArray = new byte[n13];
        g8.q(byArray, 0, n13);
        return new a(n8, string, string2, n9, n10, n11, n12, byArray);
    }

    @Override
    public /* synthetic */ v a() {
        return B.b(this);
    }

    @Override
    public void b(A.b b8) {
        b8.K(this.h, this.a);
    }

    @Override
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            object = (a)object;
            if (this.a == ((a)object).a && this.b.equals(((a)object).b) && this.c.equals(((a)object).c) && this.d == ((a)object).d && this.e == ((a)object).e && this.f == ((a)object).f && this.g == ((a)object).g && Arrays.equals(this.h, ((a)object).h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((527 + this.a) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + Arrays.hashCode(this.h);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Picture: mimeType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", description=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

