/*
 * Decompiled with CFR 0.152.
 */
package ax.tc;

import java.io.File;
import java.nio.charset.Charset;

public final class b {
    public static final String a;
    public static final Charset b;
    public static final Charset c;

    static {
        Charset charset;
        a = File.separator;
        b = charset = Charset.forName("UTF-8");
        c = charset;
    }
}

