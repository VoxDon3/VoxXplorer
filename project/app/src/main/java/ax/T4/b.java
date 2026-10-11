/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.T4.a;
import java.io.Serializable;

public final class b {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;

    static {
        Serializable serializable = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = serializable;
        b = new a((a)serializable, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        c = new a((a)serializable, "PEM", true, '=', 64);
        serializable = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        ((StringBuilder)serializable).setCharAt(((StringBuilder)serializable).indexOf("+"), '-');
        ((StringBuilder)serializable).setCharAt(((StringBuilder)serializable).indexOf("/"), '_');
        d = new a("MODIFIED-FOR-URL", ((StringBuilder)serializable).toString(), false, '\u0000', Integer.MAX_VALUE);
    }

    public static a a() {
        return b;
    }
}

