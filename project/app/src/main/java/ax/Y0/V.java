/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.annotation.SuppressLint;

public final class V {
    public static int a(int n8) {
        return V.c(n8, 0, 0, 0);
    }

    public static int b(int n8, int n9, int n10) {
        return V.e(n8, n9, n10, 0, 128, 0);
    }

    public static int c(int n8, int n9, int n10, int n11) {
        return V.e(n8, n9, n10, 0, 128, n11);
    }

    public static int d(int n8, int n9, int n10, int n11, int n12) {
        return V.e(n8, n9, n10, n11, n12, 0);
    }

    @SuppressLint(value={"WrongConstant"})
    public static int e(int n8, int n9, int n10, int n11, int n12, int n13) {
        return n8 | n9 | n10 | n11 | n12 | n13;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int f(int n8) {
        return n8 & 0x18;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int g(int n8) {
        return n8 & 0xE00;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int h(int n8) {
        return n8 & 0x180;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int i(int n8) {
        return n8 & 7;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int j(int n8) {
        return n8 & 0x40;
    }

    @SuppressLint(value={"WrongConstant"})
    public static int k(int n8) {
        return n8 & 0x20;
    }

    public static boolean l(int n8, boolean bl) {
        return (n8 = V.i(n8)) == 4 || bl && n8 == 3;
        {
        }
    }
}

