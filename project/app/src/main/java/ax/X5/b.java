/*
 * Decompiled with CFR 0.152.
 */
package ax.X5;

import android.util.Base64;
import java.security.SecureRandom;

public final class b {
    private static final SecureRandom a = new SecureRandom();

    public static String a() {
        byte[] byArray = new byte[16];
        a.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)11);
    }
}

