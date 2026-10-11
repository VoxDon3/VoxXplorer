/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.U;

public final class S {
    static Object a(Object object, int n8) {
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("at index ");
        ((StringBuilder)object).append(n8);
        throw new NullPointerException(((StringBuilder)object).toString());
    }

    static Object[] b(Object ... objectArray) {
        S.c(objectArray, objectArray.length);
        return objectArray;
    }

    static Object[] c(Object[] objectArray, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            S.a(objectArray[i8], i8);
        }
        return objectArray;
    }

    public static <T> T[] d(T[] TArray, int n8) {
        return U.b(TArray, n8);
    }
}

