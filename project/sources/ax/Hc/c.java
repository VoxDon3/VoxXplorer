package ax.Hc;

import java.util.LinkedHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class c {
    private static final ax.Ec.c a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(".tgz", ".tar");
        linkedHashMap.put(".taz", ".tar");
        linkedHashMap.put(".svgz", ".svg");
        linkedHashMap.put(".cpgz", ".cpio");
        linkedHashMap.put(".wmz", ".wmf");
        linkedHashMap.put(".emz", ".emf");
        linkedHashMap.put(".gz", HttpUrl.FRAGMENT_ENCODE_SET);
        linkedHashMap.put(".z", HttpUrl.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("-gz", HttpUrl.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("-z", HttpUrl.FRAGMENT_ENCODE_SET);
        linkedHashMap.put("_z", HttpUrl.FRAGMENT_ENCODE_SET);
        a = new ax.Ec.c(linkedHashMap, ".gz");
    }

    public static String a(String str) {
        return a.a(str);
    }
}
