/*
 * Decompiled with CFR 0.152.
 */
package ax.G8;

public class a {
    public static void a(boolean bl, String string, Object ... objectArray) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.format(string, objectArray));
    }

    public static void b(boolean bl, String string, Object ... objectArray) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.format(string, objectArray));
    }
}

