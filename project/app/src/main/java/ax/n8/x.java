/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.util.Base64;
import ax.Ob.h;
import ax.n8.w;

public final class x {
    public static final x a;
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        String string;
        a = new x();
        b = string = Base64.encodeToString((byte[])h.s(w.a.e()), (int)10);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("firebase_session_");
        stringBuilder.append(string);
        stringBuilder.append("_data");
        c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("firebase_session_");
        stringBuilder.append(string);
        stringBuilder.append("_settings");
        d = stringBuilder.toString();
    }

    private x() {
    }

    public final String a() {
        return c;
    }

    public final String b() {
        return d;
    }
}

