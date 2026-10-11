/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import java.util.Arrays;

abstract class f {
    static final byte[] a;

    static {
        int n8;
        byte[] byArray = new byte[256];
        a = byArray;
        Arrays.fill(byArray, (byte)-1);
        for (n8 = 48; n8 <= 57; n8 = (int)((char)(n8 + 1))) {
            f.a[n8] = (byte)(n8 - 48);
        }
        for (n8 = 65; n8 <= 70; n8 = (int)((char)(n8 + 1))) {
            f.a[n8] = (byte)(n8 - 55);
        }
        for (n8 = 97; n8 <= 102; n8 = (int)((char)(n8 + 1))) {
            f.a[n8] = (byte)(n8 - 87);
        }
        for (n8 = 46; n8 <= 46; n8 = (int)((char)(n8 + 1))) {
            f.a[n8] = -4;
        }
    }

    f() {
    }

    protected static char a(CharSequence charSequence, int n8, int n9) {
        if (n8 < n9) {
            return charSequence.charAt(n8);
        }
        return '\u0000';
    }

    protected static int b(char c8) {
        if (c8 < '\u0080') {
            return a[c8];
        }
        return -1;
    }
}

