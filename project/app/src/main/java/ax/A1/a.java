/*
 * Decompiled with CFR 0.152.
 */
package ax.A1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;

public final class a
implements C.a {
    public final int a;
    public final String b;

    public a(int n8, String string) {
        this.a = n8;
        this.b = string;
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ait(controlCode=");
        stringBuilder.append(this.a);
        stringBuilder.append(",url=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

