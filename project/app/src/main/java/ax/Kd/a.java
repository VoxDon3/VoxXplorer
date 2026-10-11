/*
 * Decompiled with CFR 0.152.
 */
package ax.Kd;

public abstract class a {
    public static int a(int n8, int n9, int n10) {
        return n8 ^ ((n9 &= n8 >>> n10 ^ n8) ^ n9 << n10);
    }

    public static long b(long l8, long l9, int n8) {
        return l8 ^ ((l9 &= l8 >>> n8 ^ l8) ^ l9 << n8);
    }
}

