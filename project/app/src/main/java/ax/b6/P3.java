/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.O3;
import ax.b6.Q3;
import ax.b6.s4;

public abstract class P3 {
    private static volatile int b = 100;
    int a = b;

    private P3() {
    }

    /* synthetic */ P3(Q3 q32) {
        this();
    }

    public static long b(long l8) {
        return -(l8 & 1L) ^ l8 >>> 1;
    }

    static P3 c(byte[] object, int n8, int n9, boolean bl) {
        object = new O3((byte[])object, 0, n9, false, null);
        try {
            ((P3)object).a(n9);
            return object;
        }
        catch (s4 s42) {
            throw new IllegalArgumentException(s42);
        }
    }

    public static int e(int n8) {
        return -(n8 & 1) ^ n8 >>> 1;
    }

    public abstract int a(int var1) throws s4;

    public abstract int d();
}

