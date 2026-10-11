/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import ax.u7.h;

public final class g
implements C.a {
    public final long a;
    public final long b;
    public final long c;

    public g(long l8, long l9, long l10) {
        this.a = l8;
        this.b = l9;
        this.c = l10;
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
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        return this.a == ((g)object).a && this.b == ((g)object).b && this.c == ((g)object).c;
    }

    public int hashCode() {
        return ((527 + h.g(this.a)) * 31 + h.g(this.b)) * 31 + h.g(this.c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mp4Timestamp: creation time=");
        stringBuilder.append(this.a);
        stringBuilder.append(", modification time=");
        stringBuilder.append(this.b);
        stringBuilder.append(", timescale=");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

