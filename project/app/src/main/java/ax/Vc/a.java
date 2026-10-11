/*
 * Decompiled with CFR 0.152.
 */
package ax.Vc;

import java.nio.charset.Charset;

public class a {
    public static Charset a(String string) {
        if (string == null) {
            return Charset.defaultCharset();
        }
        return Charset.forName(string);
    }
}

