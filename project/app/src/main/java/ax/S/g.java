/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import java.lang.reflect.Array;

final class g {
    public static int[] a(int[] nArray, int n8, int n9) {
        int[] nArray2 = nArray;
        if (n8 + 1 > nArray.length) {
            nArray2 = new int[g.c(n8)];
            System.arraycopy(nArray, 0, nArray2, 0, n8);
        }
        nArray2[n8] = n9;
        return nArray2;
    }

    public static <T> T[] b(T[] TArray, int n8, T t8) {
        Object[] objectArray = TArray;
        if (n8 + 1 > TArray.length) {
            objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), g.c(n8));
            System.arraycopy(TArray, 0, objectArray, 0, n8);
        }
        objectArray[n8] = t8;
        return objectArray;
    }

    public static int c(int n8) {
        if (n8 <= 4) {
            return 8;
        }
        return n8 * 2;
    }
}

