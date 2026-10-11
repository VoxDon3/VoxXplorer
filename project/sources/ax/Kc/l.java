package ax.Kc;

import java.io.File;

/* loaded from: classes3.dex */
public class l {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(0, lastIndexOf);
    }
}
