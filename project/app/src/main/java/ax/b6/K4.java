/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.f5;

final class K4 {
    static final int[] a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int[] nArray = new int[f5.values().length];
        a = nArray;
        try {
            nArray[f5.c0.ordinal()] = 1;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

