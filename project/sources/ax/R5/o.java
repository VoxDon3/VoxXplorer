package ax.R5;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class o {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
