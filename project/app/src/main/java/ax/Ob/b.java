/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Lb.e;

class b {
    public static int a(int n8) {
        if (2 <= n8 && n8 < 37) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("radix ");
        stringBuilder.append(n8);
        stringBuilder.append(" was not in valid range ");
        stringBuilder.append(new e(2, 36));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final int b(char c8, int n8) {
        return Character.digit((int)c8, n8);
    }

    public static final boolean c(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
        {
        }
    }
}

