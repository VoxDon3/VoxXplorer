/*
 * Decompiled with CFR 0.152.
 */
package ax.Z6;

import android.os.Build;
import ax.m7.v;

public class a {
    public static void a(int n8) {
        v.c(a.b(n8), "running on Android SDK level %s but requires minimum %s", Build.VERSION.SDK_INT, n8);
    }

    public static boolean b(int n8) {
        return Build.VERSION.SDK_INT >= n8;
    }
}

