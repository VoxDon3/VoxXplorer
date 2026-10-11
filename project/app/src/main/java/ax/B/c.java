/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import java.lang.reflect.Array;

class c {
    static <T> T[] a(T[] TArray, int n8) {
        if (TArray.length < n8) {
            return (Object[])Array.newInstance(TArray.getClass().getComponentType(), n8);
        }
        if (TArray.length > n8) {
            TArray[n8] = null;
        }
        return TArray;
    }
}

