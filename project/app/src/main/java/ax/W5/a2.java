/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.Z1;
import ax.W5.b2;

final class a2
extends Z1 {
    a2() {
    }

    @Override
    final int a(int n8, byte[] byArray, int n9, int n10) {
        while (n9 < n10 && byArray[n9] >= 0) {
            ++n9;
        }
        n8 = n9;
        if (n9 >= n10) {
            return 0;
        }
        while ((n9 = n8) < n10) {
            int n11 = n9 + 1;
            n8 = byArray[n9];
            if (n8 < 0) {
                if (n8 < -32) {
                    if (n11 >= n10) {
                        return n8;
                    }
                    if (n8 >= -62) {
                        n8 = n9 + 2;
                        if (byArray[n11] <= -65) continue;
                    }
                    return -1;
                }
                if (n8 < -16) {
                    if (n11 >= n10 - 1) {
                        return b2.a(byArray, n11, n10);
                    }
                    if ((n11 = byArray[n11]) <= -65) {
                        if (n8 == -32 && n11 < -96) {
                            return -1;
                        }
                        if (n8 == -19 && n11 >= -96) {
                            return -1;
                        }
                        n8 = n9 + 3;
                        if (byArray[n9 + 2] <= -65) continue;
                    }
                    return -1;
                }
                if (n11 >= n10 - 2) {
                    return b2.a(byArray, n11, n10);
                }
                if ((n11 = byArray[n11]) <= -65 && (n8 << 28) + (n11 + 112) >> 30 == 0 && byArray[n9 + 2] <= -65) {
                    n8 = n9 + 4;
                    if (byArray[n9 + 3] <= -65) continue;
                }
                return -1;
            }
            n8 = n11;
        }
        return 0;
    }
}

