package ax.n7;

import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* renamed from: ax.n7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2584a {
    private static final AbstractC2585b a = new C2586c("-_.*", true);
    private static final AbstractC2585b b = new C2586c("-_.*", false);
    private static final AbstractC2585b c = new C2586c("-_.!~*'()@:$&,;=+");
    private static final AbstractC2585b d = new C2586c("-_.!~*'()@:$&,;=+/?");
    private static final AbstractC2585b e = new C2586c("-_.!~*'():$&,;=");
    private static final AbstractC2585b f = new C2586c("-_.!~*'()@:$,;/?:");

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str.replace("+", "%2B"), StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Deprecated
    public static String c(String str) {
        return a.a(str);
    }

    public static String d(String str) {
        return b.a(str);
    }

    public static String e(String str) {
        return c.a(str);
    }

    public static String f(String str) {
        return d.a(str);
    }

    public static String g(String str) {
        return f.a(str);
    }

    public static String h(String str) {
        return e.a(str);
    }
}
