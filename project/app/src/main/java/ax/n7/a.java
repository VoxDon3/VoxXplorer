/*
 * Decompiled with CFR 0.152.
 */
package ax.n7;

import ax.n7.b;
import ax.n7.c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public final class a {
    private static final b a = new c("-_.*", true);
    private static final b b = new c("-_.*", false);
    private static final b c = new c("-_.!~*'()@:$&,;=+");
    private static final b d = new c("-_.!~*'()@:$&,;=+/?");
    private static final b e = new c("-_.!~*'():$&,;=");
    private static final b f = new c("-_.!~*'()@:$,;/?:");

    public static String a(String string) {
        try {
            string = j.URLDecoder.decode((String)string, (String)StandardCharsets.UTF_8.name());
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static String b(String string) {
        if (string == null) {
            return null;
        }
        try {
            string = j.URLDecoder.decode((String)string.replace("+", "%2B"), (String)StandardCharsets.UTF_8.name());
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    @Deprecated
    public static String c(String string) {
        return a.a(string);
    }

    public static String d(String string) {
        return b.a(string);
    }

    public static String e(String string) {
        return c.a(string);
    }

    public static String f(String string) {
        return d.a(string);
    }

    public static String g(String string) {
        return f.a(string);
    }

    public static String h(String string) {
        return e.a(string);
    }
}

