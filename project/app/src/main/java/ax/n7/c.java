/*
 * Decompiled with CFR 0.152.
 */
package ax.n7;

import ax.n7.e;

public class c
extends e {
    private static final char[] c = new char[]{'+'};
    private static final char[] d = "0123456789ABCDEF".toCharArray();
    private final boolean a;
    private final boolean[] b;

    public c(String string) {
        this(string, false);
    }

    @Deprecated
    public c(String string, boolean bl) {
        if (!string.matches(".*[0-9A-Za-z].*")) {
            if (bl && string.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (!string.contains("%")) {
                this.a = bl;
                this.b = ax.n7.c.g(string);
                return;
            }
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
    }

    private static boolean[] g(String object) {
        int n8;
        char[] cArray = ((String)object).toCharArray();
        int n9 = cArray.length;
        int n10 = 0;
        int n11 = 122;
        for (n8 = 0; n8 < n9; ++n8) {
            n11 = Math.max(cArray[n8], n11);
        }
        object = new boolean[n11 + 1];
        for (n8 = 48; n8 <= 57; ++n8) {
            object[n8] = true;
        }
        for (n8 = 65; n8 <= 90; ++n8) {
            object[n8] = true;
        }
        for (n8 = 97; n8 <= 122; ++n8) {
            object[n8] = true;
        }
        n11 = cArray.length;
        for (n8 = n10; n8 < n11; ++n8) {
            object[cArray[n8]] = true;
        }
        return object;
    }

    @Override
    public String a(String string) {
        Object object;
        block1: {
            int n8 = string.length();
            int n9 = 0;
            while (true) {
                object = string;
                if (n9 >= n8) break block1;
                char c8 = string.charAt(n9);
                if (c8 >= ((Object)(object = (Object)this.b)).length || object[c8] == false) break;
                ++n9;
            }
            object = this.d(string, n9);
        }
        return object;
    }

    @Override
    protected char[] c(int n8) {
        Object object = this.b;
        if (n8 < ((boolean[])object).length && object[n8]) {
            return null;
        }
        if (n8 == 32 && this.a) {
            return c;
        }
        if (n8 <= 127) {
            object = d;
            char c8 = object[n8 & 0xF];
            return new char[]{'%', (char)object[n8 >>> 4], c8};
        }
        if (n8 <= 2047) {
            object = d;
            char c9 = object[n8 & 0xF];
            char c10 = object[n8 >>> 4 & 3 | 8];
            Object object2 = object[n8 >>> 6 & 0xF];
            return new char[]{'%', (char)object[n8 >>> 10 | 0xC], (char)object2, '%', c10, c9};
        }
        if (n8 <= 65535) {
            object = d;
            char c11 = object[n8 & 0xF];
            Object object3 = object[n8 >>> 4 & 3 | 8];
            Object object4 = object[n8 >>> 6 & 0xF];
            Object object5 = object[n8 >>> 10 & 3 | 8];
            return new char[]{'%', 'E', (char)object[n8 >>> 12], '%', (char)object5, (char)object4, '%', (char)object3, c11};
        }
        if (n8 <= 0x10FFFF) {
            object = d;
            char c12 = object[n8 & 0xF];
            Object object6 = object[n8 >>> 4 & 3 | 8];
            Object object7 = object[n8 >>> 6 & 0xF];
            Object object8 = object[n8 >>> 10 & 3 | 8];
            Object object9 = object[n8 >>> 12 & 0xF];
            Object object10 = object[n8 >>> 16 & 3 | 8];
            return new char[]{'%', 'F', (char)object[n8 >>> 18 & 7], '%', (char)object10, (char)object9, '%', (char)object8, (char)object7, '%', (char)object6, c12};
        }
        object = new StringBuilder();
        object.append("Invalid unicode character value ");
        object.append(n8);
        throw new IllegalArgumentException(object.toString());
    }

    @Override
    protected int f(CharSequence charSequence, int n8, int n9) {
        boolean[] blArray;
        char c8;
        while (n8 < n9 && (c8 = charSequence.charAt(n8)) < (blArray = this.b).length && blArray[c8]) {
            ++n8;
        }
        return n8;
    }
}

