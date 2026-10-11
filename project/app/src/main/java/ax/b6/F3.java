/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.K3;

final class F3
extends K3 {
    private final int f0;
    private final int g0;

    F3(byte[] byArray, int n8, int n9) {
        super(byArray);
        B3.i(n8, n8 + n9, byArray.length);
        this.f0 = n8;
        this.g0 = n9;
    }

    @Override
    public final byte e(int n8) {
        int n9 = ((B3)this).s();
        if ((n9 - (n8 + 1) | n8) < 0) {
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder("Index < 0: ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Index > length: ");
            stringBuilder.append(n8);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        return this.e0[this.f0 + n8];
    }

    @Override
    final byte r(int n8) {
        return this.e0[this.f0 + n8];
    }

    @Override
    public final int s() {
        return this.g0;
    }

    @Override
    protected final int x() {
        return this.f0;
    }
}

