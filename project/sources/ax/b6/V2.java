package ax.b6;

import android.content.Context;
import android.net.Uri;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class V2 {
    private static final ax.B.a<String, Uri> a = new ax.B.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (V2.class) {
            ax.B.a<String, Uri> aVar = a;
            uri = aVar.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + HttpUrl.FRAGMENT_ENCODE_SET + context.getPackageName();
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
