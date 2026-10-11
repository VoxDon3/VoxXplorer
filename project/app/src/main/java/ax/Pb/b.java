/*
 * Decompiled with CFR 0.152.
 */
package ax.Pb;

import java.text.DecimalFormat;

public final class b {
    private static final boolean a = false;
    private static final ThreadLocal<DecimalFormat>[] b;

    static {
        ThreadLocal[] threadLocalArray = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; ++i8) {
            threadLocalArray[i8] = new ThreadLocal();
        }
        b = threadLocalArray;
    }

    public static final boolean a() {
        return a;
    }
}

