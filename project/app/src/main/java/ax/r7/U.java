/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.k;
import java.util.Arrays;
import java.util.Map;

final class U {
    static <T> T[] a(Object[] objectArray, int n8, int n9, T[] TArray) {
        return Arrays.copyOfRange(objectArray, n8, n9, TArray.getClass());
    }

    static <T> T[] b(T[] TArray, int n8) {
        if (TArray.length != 0) {
            TArray = Arrays.copyOf(TArray, 0);
        }
        return Arrays.copyOf(TArray, n8);
    }

    static <K, V> Map<K, V> c(int n8) {
        return k.w(n8);
    }
}

