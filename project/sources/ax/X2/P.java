package ax.X2;

import java.util.Locale;

/* loaded from: classes.dex */
public class P {
    public static boolean a() {
        return !"en".equalsIgnoreCase(Locale.getDefault().getLanguage());
    }

    public static boolean b() {
        String language = Locale.getDefault().getLanguage();
        return "de".equalsIgnoreCase(language) || "in".equalsIgnoreCase(language) || "id".equalsIgnoreCase(language) || "ko".equalsIgnoreCase(language) || "tr".equalsIgnoreCase(language);
    }
}
