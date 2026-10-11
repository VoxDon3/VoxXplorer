/*
 * Decompiled with CFR 0.152.
 */
package ax.Cd;

import ax.Cd.a;

public class b
implements a {
    @Override
    public int a(byte[] byArray, int n8) {
        int n9 = byArray.length;
        byArray[n8] = -128;
        int n10 = n8;
        while (++n10 < byArray.length) {
            byArray[n10] = 0;
        }
        return n9 - n8;
    }
}

