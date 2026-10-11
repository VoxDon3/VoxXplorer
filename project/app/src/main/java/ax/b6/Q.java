/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.P;
import ax.b6.Z2;
import ax.b6.s;

final class Q
implements P {
    private final Z2 a;
    private final String b;

    public Q(Z2 z22, String string) {
        this.a = z22;
        this.b = string;
    }

    @Override
    public final Z2 a(s s8) {
        Z2 z22 = this.a.d();
        z22.e(this.b, s8);
        return z22;
    }
}

