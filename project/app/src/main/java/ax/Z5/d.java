/*
 * Decompiled with CFR 0.152.
 */
package ax.Z5;

import android.os.Build;

public final class d {
    public static final int a;

    static {
        int n8 = Build.VERSION.SDK_INT >= 23 ? 0x4000000 : 0;
        a = n8;
    }
}

