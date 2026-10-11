/*
 * Decompiled with CFR 0.152.
 */
package ax.R7;

import ax.R7.d;

public class b
implements d {
    private final int a;

    public b(int n8) {
        this.a = n8;
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArray) {
        int n8 = stackTraceElementArray.length;
        int n9 = this.a;
        if (n8 <= n9) {
            return stackTraceElementArray;
        }
        n8 = n9 / 2;
        int n10 = n9 - n8;
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[n9];
        System.arraycopy(stackTraceElementArray, 0, stackTraceElementArray2, 0, n10);
        System.arraycopy(stackTraceElementArray, stackTraceElementArray.length - n8, stackTraceElementArray2, n10, n8);
        return stackTraceElementArray2;
    }
}

