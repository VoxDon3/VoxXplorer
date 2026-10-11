package ax.Y0;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public final /* synthetic */ class V {
    public static int a(int i) {
        return c(i, 0, 0, 0);
    }

    public static int b(int i, int i2, int i3) {
        return e(i, i2, i3, 0, 128, 0);
    }

    public static int c(int i, int i2, int i3, int i4) {
        return e(i, i2, i3, 0, 128, i4);
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return e(i, i2, i3, i4, i5, 0);
    }

    @SuppressLint({"WrongConstant"})
    public static int e(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    @SuppressLint({"WrongConstant"})
    public static int f(int i) {
        return i & 24;
    }

    @SuppressLint({"WrongConstant"})
    public static int g(int i) {
        return i & 3584;
    }

    @SuppressLint({"WrongConstant"})
    public static int h(int i) {
        return i & 384;
    }

    @SuppressLint({"WrongConstant"})
    public static int i(int i) {
        return i & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int j(int i) {
        return i & 64;
    }

    @SuppressLint({"WrongConstant"})
    public static int k(int i) {
        return i & 32;
    }

    public static boolean l(int i, boolean z) {
        int i2 = i(i);
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }
}
