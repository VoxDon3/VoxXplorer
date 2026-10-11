package ax.F6;

import android.os.Build;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class i {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static boolean b() {
        return c() || e();
    }

    public static boolean c() {
        return a().equals("lge");
    }

    public static boolean d() {
        return a().equals("meizu");
    }

    public static boolean e() {
        return a().equals("samsung");
    }
}
