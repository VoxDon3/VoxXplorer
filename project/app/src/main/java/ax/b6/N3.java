/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E3;
import ax.b6.M3;

final class N3
implements E3 {
    private N3() {
    }

    /* synthetic */ N3(M3 m32) {
        this();
    }

    @Override
    public final byte[] a(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        return byArray2;
    }
}

