/*
 * Decompiled with CFR 0.152.
 */
package ax.G1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;

public abstract class b
implements C.a {
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
        stringBuilder.append("SCTE-35 splice command: type=");
        stringBuilder.append(this.getClass().getSimpleName());
        return stringBuilder.toString();
    }
}

