/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import ax.a6.B0;
import ax.a6.K0;
import ax.a6.p;
import ax.a6.y0;

public final class L0
implements y0 {
    private final B0 a;
    private final B0 b;

    public L0(B0 b02, B0 b03) {
        this.a = b02;
        this.b = b03;
    }

    public final K0 b() {
        return new K0((Application)this.a.a(), (p)this.b.a());
    }
}

