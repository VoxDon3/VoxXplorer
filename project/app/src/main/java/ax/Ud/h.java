/*
 * Decompiled with CFR 0.152.
 */
package ax.Ud;

import ax.Ud.g;

public class h
extends g {
    @Override
    protected int b(byte[] byArray, int n8) {
        block6: {
            int n9;
            block5: {
                block4: {
                    n9 = byArray[n8] & 0xFF;
                    if (n9 < 129 || n9 > 159) break block4;
                    n9 -= 129;
                    break block5;
                }
                if (n9 < 224 || n9 > 239) break block6;
                n9 -= 193;
            }
            int n10 = byArray[n8 + 1] & 0xFF;
            n8 = n9 = n9 * 188 + (n10 - 64);
            if (n10 >= 128) {
                n8 = n9 - 1;
            }
            return n8;
        }
        return -1;
    }
}

