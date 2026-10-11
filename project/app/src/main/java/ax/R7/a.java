/*
 * Decompiled with CFR 0.152.
 */
package ax.R7;

import ax.R7.b;
import ax.R7.d;

public class a
implements d {
    private final int a;
    private final d[] b;
    private final b c;

    public a(int n8, d ... dArray) {
        this.a = n8;
        this.b = dArray;
        this.c = new b(n8);
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArray) {
        if (stackTraceElementArray.length <= this.a) {
            return stackTraceElementArray;
        }
        d[] dArray = this.b;
        int n8 = dArray.length;
        StackTraceElement[] stackTraceElementArray2 = stackTraceElementArray;
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = dArray[i8];
            if (stackTraceElementArray2.length <= this.a) break;
            stackTraceElementArray2 = d8.a(stackTraceElementArray);
        }
        if (stackTraceElementArray2.length > this.a) {
            return this.c.a(stackTraceElementArray2);
        }
        return stackTraceElementArray2;
    }
}

