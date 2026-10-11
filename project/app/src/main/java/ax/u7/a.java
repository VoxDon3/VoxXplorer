/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

public final class a {
    public static boolean a(boolean[] blArray, boolean bl) {
        int n8 = blArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (blArray[i8] != bl) continue;
            return true;
        }
        return false;
    }
}

