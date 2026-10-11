/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.V8.b;
import ax.Z8.a;

class h {
    public static byte[] a = new byte[0];

    static byte[] a(String string) {
        if (string != null) {
            return b.h(string);
        }
        return a;
    }

    static byte[] b(byte[] byArray) {
        if (byArray != null) {
            return byArray;
        }
        return a;
    }

    static int c(a.c c8, byte[] byArray, int n8) {
        if (byArray == null) {
            byArray = a;
        }
        c8.s(byArray.length);
        c8.s(byArray.length);
        c8.u(n8);
        return n8 + byArray.length;
    }
}

