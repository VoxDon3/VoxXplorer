/*
 * Decompiled with CFR 0.152.
 */
package ax.n7;

import ax.n7.b;
import ax.n7.d;

public abstract class e
extends b {
    protected static int b(CharSequence charSequence, int n8, int n9) {
        if (n8 < n9) {
            int n10 = n8 + 1;
            char c8 = charSequence.charAt(n8);
            if (c8 >= '\ud800' && c8 <= '\udfff') {
                if (c8 <= '\udbff') {
                    if (n10 == n9) {
                        return -c8;
                    }
                    char c9 = charSequence.charAt(n10);
                    if (Character.isLowSurrogate(c9)) {
                        return Character.toCodePoint(c8, c9);
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Expected low surrogate but got char '");
                    ((StringBuilder)charSequence).append(c9);
                    ((StringBuilder)charSequence).append("' with value ");
                    ((StringBuilder)charSequence).append((int)c9);
                    ((StringBuilder)charSequence).append(" at index ");
                    ((StringBuilder)charSequence).append(n10);
                    throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Unexpected low surrogate character '");
                ((StringBuilder)charSequence).append(c8);
                ((StringBuilder)charSequence).append("' with value ");
                ((StringBuilder)charSequence).append((int)c8);
                ((StringBuilder)charSequence).append(" at index ");
                ((StringBuilder)charSequence).append(n8);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            return c8;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] e(char[] cArray, int n8, int n9) {
        char[] cArray2 = new char[n9];
        if (n8 > 0) {
            System.arraycopy(cArray, 0, cArray2, 0, n8);
        }
        return cArray2;
    }

    protected abstract char[] c(int var1);

    protected final String d(String string, int n8) {
        char[] cArray;
        int n9 = string.length();
        char[] cArray2 = d.a();
        int n10 = 0;
        int n11 = 0;
        int n12 = n8;
        n8 = n11;
        while (n12 < n9) {
            n11 = e.b(string, n12, n9);
            if (n11 >= 0) {
                char[] cArray3 = this.c(n11);
                n11 = Character.isSupplementaryCodePoint(n11) ? 2 : 1;
                int n13 = n11 + n12;
                cArray = cArray2;
                int n14 = n10;
                n11 = n8;
                if (cArray3 != null) {
                    int n15 = n12 - n10;
                    n14 = n8 + n15;
                    n11 = cArray3.length + n14;
                    cArray = cArray2;
                    if (cArray2.length < n11) {
                        cArray = e.e(cArray2, n8, n11 + n9 - n12 + 32);
                    }
                    n11 = n8;
                    if (n15 > 0) {
                        string.getChars(n10, n12, cArray, n8);
                        n11 = n14;
                    }
                    n8 = n11;
                    if (cArray3.length > 0) {
                        System.arraycopy(cArray3, 0, cArray, n11, cArray3.length);
                        n8 = n11 + cArray3.length;
                    }
                    n14 = n13;
                    n11 = n8;
                }
                n12 = this.f(string, n13, n9);
                cArray2 = cArray;
                n10 = n14;
                n8 = n11;
                continue;
            }
            throw new IllegalArgumentException("Trailing high surrogate at end of input");
        }
        n12 = n9 - n10;
        cArray = cArray2;
        n11 = n8;
        if (n12 > 0) {
            n11 = n12 + n8;
            cArray = cArray2;
            if (cArray2.length < n11) {
                cArray = e.e(cArray2, n8, n11);
            }
            string.getChars(n10, n9, cArray, n8);
        }
        return new String(cArray, 0, n11);
    }

    protected abstract int f(CharSequence var1, int var2, int var3);
}

