/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.S0.l;
import ax.i1.B;
import ax.i1.N;
import ax.i1.y;
import java.io.IOException;

public final class I
implements l {
    public final N.a a;
    public final y b;
    public final B c;
    public final IOException d;
    public final boolean e;

    public /* synthetic */ I(N.a a8, y y8, B b8, IOException iOException, boolean bl) {
        this.a = a8;
        this.b = y8;
        this.c = b8;
        this.d = iOException;
        this.e = bl;
    }

    public final void accept(Object object) {
        N.a.b(this.a, this.b, this.c, this.d, this.e, (N)object);
    }
}

