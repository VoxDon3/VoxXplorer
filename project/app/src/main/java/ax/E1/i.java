/*
 * Decompiled with CFR 0.152.
 */
package ax.E1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;

public abstract class i
implements C.a {
    public final String a;

    public i(String string) {
        this.a = string;
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
        return this.a;
    }
}

