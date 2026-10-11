/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.E5;

final class B5
implements E5 {
    private final B3 a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    B5(B3 b32) {
        this.a = b32;
    }

    @Override
    public final int a() {
        return this.a.s();
    }

    @Override
    public final byte d(int n8) {
        return this.a.e(n8);
    }
}

