/*
 * Decompiled with CFR 0.152.
 */
package ax.Ud;

import ax.Ud.g;

public class c
extends g {
    @Override
    protected int b(byte[] byArray, int n8) {
        int n9 = byArray[n8] & 0xFF;
        if (n9 >= 161) {
            return (n9 - 161) * 94 + (byArray[n8 + 1] & 0xFF) - 161;
        }
        return -1;
    }
}

