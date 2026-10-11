/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import java.nio.charset.Charset;

public final class d {
    public static final d a = new d();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;
    private static volatile Charset h;
    private static volatile Charset i;

    static {
        Charset charset = Charset.forName("UTF-8");
        l.e(charset, "forName(...)");
        b = charset;
        charset = Charset.forName("UTF-16");
        l.e(charset, "forName(...)");
        c = charset;
        charset = Charset.forName("UTF-16BE");
        l.e(charset, "forName(...)");
        d = charset;
        charset = Charset.forName("UTF-16LE");
        l.e(charset, "forName(...)");
        e = charset;
        charset = Charset.forName("US-ASCII");
        l.e(charset, "forName(...)");
        f = charset;
        charset = Charset.forName("ISO-8859-1");
        l.e(charset, "forName(...)");
        g = charset;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset;
        Charset charset2 = charset = i;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32BE");
            l.e(charset2, "forName(...)");
            i = charset2;
        }
        return charset2;
    }

    public final Charset b() {
        Charset charset;
        Charset charset2 = charset = h;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32LE");
            l.e(charset2, "forName(...)");
            h = charset2;
        }
        return charset2;
    }
}

