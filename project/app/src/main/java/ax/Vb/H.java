/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

final class H {
    private static final int a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return a;
    }

    public static final String b(String string) {
        try {
            string = System.getProperty(string);
            return string;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }
}

