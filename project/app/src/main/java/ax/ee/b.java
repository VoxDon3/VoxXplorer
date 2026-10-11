/*
 * Decompiled with CFR 0.152.
 */
package ax.ee;

import ax.ee.a;

public class b
extends a {
    public b(int n8) {
        super(n8);
    }

    public void a(byte[] byArray, int n8, int n9) {
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            byte by;
            byte by2 = byArray[i8];
            byte[] byArray2 = this.b;
            int n10 = this.a;
            int n11 = this.c;
            byArray[i8] = by = (byte)(by2 + byArray2[n10 + n11 & 0xFF]);
            this.c = n11 - 1;
            byArray2[n11 & 0xFF] = by;
        }
    }
}

