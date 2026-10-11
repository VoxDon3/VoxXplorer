package ax.Jc;

import ax.Ec.c;
import ax.Kc.q;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class b {
    private static final c a;
    private static final byte[] b = {-3, 55, 122, 88, 90, 0};
    private static volatile a c;

    enum a {
        DONT_CACHE,
        CACHED_AVAILABLE,
        CACHED_UNAVAILABLE
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", HttpUrl.FRAGMENT_ENCODE_SET);
        hashMap.put("-xz", HttpUrl.FRAGMENT_ENCODE_SET);
        a = new c(hashMap, ".xz");
        c = a.DONT_CACHE;
        c(!q.b());
    }

    public static String a(String str) {
        return a.a(str);
    }

    private static boolean b() {
        try {
            ax.Jc.a.d(null, 0);
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static void c(boolean z) {
        if (!z) {
            c = a.DONT_CACHE;
        } else if (c == a.DONT_CACHE) {
            c = b() ? a.CACHED_AVAILABLE : a.CACHED_UNAVAILABLE;
        }
    }
}
