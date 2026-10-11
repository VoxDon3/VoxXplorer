/*
 * Decompiled with CFR 0.152.
 */
package ax.Td;

import ax.Td.b;

public class a
extends b {
    @Override
    protected int b(byte[] byArray, int n8) {
        if ((byArray[n8] & 0xFF) == 164 && (n8 = byArray[n8 + 1] & 0xFF) >= 161 && n8 <= 243) {
            return n8 - 161;
        }
        return -1;
    }
}

