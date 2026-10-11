/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.q0;
import ax.W5.t0;

final class m0
extends q0 {
    private final int g0;

    m0(byte[] byArray, int n8, int n9) {
        super(byArray);
        t0.p(0, n9, byArray.length);
        this.g0 = n9;
    }

    @Override
    public final byte e(int n8) {
        int n9 = this.g0;
        if ((n9 - (n8 + 1) | n8) < 0) {
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n8);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        return this.f0[n8];
    }

    @Override
    final byte g(int n8) {
        return this.f0[n8];
    }

    @Override
    public final int h() {
        return this.g0;
    }

    @Override
    protected final int t() {
        return 0;
    }
}

