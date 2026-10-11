/*
 * Decompiled with CFR 0.152.
 */
package ax.R7;

import ax.R7.d;
import java.util.HashMap;

public class c
implements d {
    private final int a;

    public c(int n8) {
        this.a = n8;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArray, int n8, int n9) {
        int n10 = n9 - n8;
        if (n9 + n10 > stackTraceElementArray.length) {
            return false;
        }
        for (int i8 = 0; i8 < n10; ++i8) {
            if (stackTraceElementArray[n8 + i8].equals(stackTraceElementArray[n9 + i8])) continue;
            return false;
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] stackTraceElementArray, int n8) {
        HashMap<StackTraceElement, Integer> hashMap = new HashMap<StackTraceElement, Integer>();
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[stackTraceElementArray.length];
        int n9 = 0;
        int n10 = 0;
        int n11 = 1;
        while (n9 < stackTraceElementArray.length) {
            int n12;
            StackTraceElement stackTraceElement = stackTraceElementArray[n9];
            Integer n13 = (Integer)hashMap.get(stackTraceElement);
            if (n13 != null && c.b(stackTraceElementArray, n13, n9)) {
                int n14 = n9 - n13;
                int n15 = n10;
                n12 = n11;
                if (n11 < n8) {
                    System.arraycopy(stackTraceElementArray, n9, stackTraceElementArray2, n10, n14);
                    n15 = n10 + n14;
                    n12 = n11 + 1;
                }
                n14 = n14 - 1 + n9;
                n10 = n15;
                n11 = n12;
                n12 = n14;
            } else {
                stackTraceElementArray2[n10] = stackTraceElementArray[n9];
                ++n10;
                n12 = n9;
                n11 = 1;
            }
            hashMap.put(stackTraceElement, n9);
            n9 = n12 + 1;
        }
        stackTraceElementArray = new StackTraceElement[n10];
        System.arraycopy(stackTraceElementArray2, 0, stackTraceElementArray, 0, n10);
        return stackTraceElementArray;
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArray) {
        StackTraceElement[] stackTraceElementArray2 = c.c(stackTraceElementArray, this.a);
        if (stackTraceElementArray2.length < stackTraceElementArray.length) {
            return stackTraceElementArray2;
        }
        return stackTraceElementArray;
    }
}

