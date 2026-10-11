/*
 * Decompiled with CFR 0.152.
 */
package ax.V5;

import android.os.Parcel;

public final class c {
    private static final ClassLoader a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean bl) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

