/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.T4.g;
import ax.b5.e;
import java.io.IOException;

public class d
extends e.c {
    public static final String f0;
    public static final d g0;
    private final char[] c0;
    private final int d0;
    private final String e0;

    static {
        String string;
        try {
            string = System.getProperty("line.separator");
        }
        catch (Throwable throwable) {
            string = "\n";
        }
        f0 = string;
        g0 = new d("  ", string);
    }

    public d(String string, String string2) {
        this.d0 = string.length();
        this.c0 = new char[string.length() * 16];
        int n8 = 0;
        for (int i8 = 0; i8 < 16; ++i8) {
            string.getChars(0, string.length(), this.c0, n8);
            n8 += string.length();
        }
        this.e0 = string2;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b(g g8, int n8) throws IOException {
        g8.H(this.e0);
        if (n8 > 0) {
            char[] cArray;
            n8 *= this.d0;
            while (n8 > (cArray = this.c0).length) {
                g8.L(cArray, 0, cArray.length);
                n8 -= this.c0.length;
            }
            g8.L(cArray, 0, n8);
        }
    }
}

