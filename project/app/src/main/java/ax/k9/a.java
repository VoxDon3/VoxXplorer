/*
 * Decompiled with CFR 0.152.
 */
package ax.k9;

import java.util.Arrays;

public class a {
    public static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    public static void b(byte[] byArray, byte[] byArray2, String string) {
        if (Arrays.equals(byArray, byArray2)) {
            return;
        }
        throw new IllegalArgumentException(string);
    }
}

