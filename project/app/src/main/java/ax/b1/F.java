/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.os.Build;
import ax.V0.b;
import java.util.UUID;

public final class F
implements b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    @Deprecated
    public final boolean c;

    static {
        String string;
        boolean bl = "Amazon".equals(Build.MANUFACTURER) && ("AFTM".equals(string = Build.MODEL) || "AFTB".equals(string));
        d = bl;
    }

    public F(UUID uUID, byte[] byArray) {
        this(uUID, byArray, false);
    }

    @Deprecated
    public F(UUID uUID, byte[] byArray, boolean bl) {
        this.a = uUID;
        this.b = byArray;
        this.c = bl;
    }
}

