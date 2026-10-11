package ax.Db;

import ax.Gb.l;
import ax.Ob.h;
import java.io.File;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f extends e {
    public static String a(File file) {
        l.f(file, "<this>");
        String name = file.getName();
        l.e(name, "getName(...)");
        return h.y0(name, '.', HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
