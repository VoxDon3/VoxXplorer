/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import java.util.HashSet;

public final class z {
    private static final HashSet<String> a = new HashSet();
    private static String b = "media3.common";

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string) {
        synchronized (z.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!a.add(string)) break block4;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(", ");
                        stringBuilder.append(string);
                        b = stringBuilder.toString();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b() {
        synchronized (z.class) {
            return b;
        }
    }
}

