package ax.Vc;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class a {
    public static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }
}
