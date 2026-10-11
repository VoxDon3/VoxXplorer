/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import ax.J5.A;
import java.util.Arrays;

final class B
extends A {
    private final byte[] f;

    B(byte[] byArray) {
        super(Arrays.copyOfRange(byArray, 0, 25));
        this.f = byArray;
    }

    @Override
    final byte[] a2() {
        return this.f;
    }
}

