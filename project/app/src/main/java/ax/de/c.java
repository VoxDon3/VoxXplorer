/*
 * Decompiled with CFR 0.152.
 */
package ax.de;

public class c {
    public static int a(long l8) {
        int n8;
        long l9;
        int n9 = 0;
        do {
            n8 = n9 + 1;
            l9 = l8 >> 7;
            n9 = n8;
            l8 = l9;
        } while (l9 != 0L);
        return n8;
    }
}

