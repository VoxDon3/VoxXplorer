/*
 * Decompiled with CFR 0.152.
 */
package ax.Td;

import ax.Td.b;

public class c
extends b {
    @Override
    protected int b(byte[] byArray, int n8) {
        if ((byArray[n8] & 0xFF) == 130 && (n8 = byArray[n8 + 1] & 0xFF) >= 159 && n8 <= 241) {
            return n8 - 159;
        }
        return -1;
    }
}

