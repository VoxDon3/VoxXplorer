package ax.b6;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: ax.b6.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1693w2 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
