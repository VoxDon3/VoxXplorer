/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.net.Uri;
import android.provider.MediaStore;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n0 {
    public static final Uri a = Uri.parse((String)"content://media");
    private static final Pattern b = Pattern.compile("(?i)^/storage/(?:emulated/[0-9]+/|[^/]+/)");
    private static final Pattern c = Pattern.compile("(?i)^/storage/([^/]+)");
    private static final Pattern d = Pattern.compile("(?i)^/storage/emulated/([0-9]+)");

    public static String a(String object) {
        if (object == null) {
            return null;
        }
        if (((Matcher)(object = c.matcher((CharSequence)object))).find() && (object = ((Matcher)object).group(1)) != null) {
            if (((String)object).equals("emulated")) {
                return "external";
            }
            return n0.d((String)object);
        }
        return "external";
    }

    public static Uri b(String string) {
        return a.buildUpon().appendPath(string).appendPath("dir").build();
    }

    public static Uri c(String string) {
        return MediaStore.Files.getContentUri((String)string);
    }

    private static String d(String string) {
        if (string != null) {
            return string.toLowerCase(Locale.ROOT);
        }
        return null;
    }
}

