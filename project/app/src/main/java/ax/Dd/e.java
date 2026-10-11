/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.d;

public class e
extends d {
    public e(byte[] byArray) {
        super(byArray);
        if (!e.c(byArray, 0, byArray.length)) {
            return;
        }
        throw new IllegalArgumentException("attempt to create weak DESede key");
    }

    public static boolean c(byte[] byArray, int n8, int n9) {
        while (n8 < n9) {
            if (d.b(byArray, n8)) {
                return true;
            }
            n8 += 8;
        }
        return false;
    }
}

