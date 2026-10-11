package ax.tc;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: ax.tc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3143b {
    public static final String a = File.separator;
    public static final Charset b;
    public static final Charset c;

    static {
        Charset forName = Charset.forName("UTF-8");
        b = forName;
        c = forName;
    }
}
