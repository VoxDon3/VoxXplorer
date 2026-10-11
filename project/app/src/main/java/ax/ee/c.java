/*
 * Decompiled with CFR 0.152.
 */
package ax.ee;

import ax.ee.a;

public class c
extends a {
    public c(int n8) {
        super(n8);
    }

    public void a(byte[] byArray, int n8, int n9, byte[] byArray2) {
        for (int i8 = 0; i8 < n9; ++i8) {
            byte[] byArray3 = this.b;
            int n10 = this.a;
            int n11 = this.c;
            byte by = byArray3[n10 + n11 & 0xFF];
            this.c = n11 - 1;
            n10 = n8 + i8;
            byArray3[n11 & 0xFF] = byArray[n10];
            byArray2[i8] = (byte)(byArray[n10] - by);
        }
    }
}

