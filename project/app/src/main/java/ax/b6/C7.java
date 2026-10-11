/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B7;
import ax.b6.E7;
import ax.b6.F7;
import ax.b6.G7;
import ax.b6.Z2;
import ax.b6.n;
import ax.b6.s;
import java.util.List;

public final class C7
extends n {
    private final G7 d0;

    public C7(G7 g72) {
        super("internal.logger");
        this.d0 = g72;
        this.c0.put("log", new F7(this, false, true));
        this.c0.put("silent", new B7(this, "silent"));
        ((n)this.c0.get("silent")).n("log", new F7(this, true, true));
        this.c0.put("unmonitored", new E7(this, "unmonitored"));
        ((n)this.c0.get("unmonitored")).n("log", new F7(this, false, false));
    }

    static /* bridge */ /* synthetic */ G7 d(C7 c72) {
        return c72.d0;
    }

    @Override
    public final s a(Z2 z22, List<s> list) {
        return s.f;
    }
}

