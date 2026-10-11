/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import java.util.Locale;

public class P {
    public static boolean a() {
        return !"en".equalsIgnoreCase(Locale.getDefault().getLanguage());
    }

    public static boolean b() {
        String string = Locale.getDefault().getLanguage();
        return "de".equalsIgnoreCase(string) || "in".equalsIgnoreCase(string) || "id".equalsIgnoreCase(string) || "ko".equalsIgnoreCase(string) || "tr".equalsIgnoreCase(string);
        {
        }
    }
}

