package ax.Ob;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
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
        Charset forName = Charset.forName("UTF-8");
        ax.Gb.l.e(forName, "forName(...)");
        b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        ax.Gb.l.e(forName2, "forName(...)");
        c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        ax.Gb.l.e(forName3, "forName(...)");
        d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        ax.Gb.l.e(forName4, "forName(...)");
        e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        ax.Gb.l.e(forName5, "forName(...)");
        f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        ax.Gb.l.e(forName6, "forName(...)");
        g = forName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        ax.Gb.l.e(forName, "forName(...)");
        i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        ax.Gb.l.e(forName, "forName(...)");
        h = forName;
        return forName;
    }
}
