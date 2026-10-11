/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.util.Base64;

public final class c {
    public static String a(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        return Base64.encodeToString((byte[])byArray, (int)11);
    }
}

