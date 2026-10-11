/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;

public final class d
implements C.a {
    public final int a;

    public d(int n8) {
        this.a = n8;
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
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        return this.a == ((d)object).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mp4AlternateGroup: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

