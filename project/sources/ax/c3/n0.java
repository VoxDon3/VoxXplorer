package ax.c3;

import android.net.Uri;
import android.provider.MediaStore;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class n0 {
    public static final Uri a = Uri.parse("content://media");
    private static final Pattern b = Pattern.compile("(?i)^/storage/(?:emulated/[0-9]+/|[^/]+/)");
    private static final Pattern c = Pattern.compile("(?i)^/storage/([^/]+)");
    private static final Pattern d = Pattern.compile("(?i)^/storage/emulated/([0-9]+)");

    public static String a(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = c.matcher(str);
        return (!matcher.find() || (group = matcher.group(1)) == null || group.equals("emulated")) ? "external" : d(group);
    }

    public static Uri b(String str) {
        return a.buildUpon().appendPath(str).appendPath("dir").build();
    }

    public static Uri c(String str) {
        return MediaStore.Files.getContentUri(str);
    }

    private static String d(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ROOT);
        }
        return null;
    }
}
