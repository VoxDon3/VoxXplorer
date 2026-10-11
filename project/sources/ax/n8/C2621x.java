package ax.n8;

import android.util.Base64;

/* renamed from: ax.n8.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2621x {
    public static final C2621x a = new C2621x();
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        String encodeToString = Base64.encodeToString(ax.Ob.h.s(C2620w.a.e()), 10);
        b = encodeToString;
        c = "firebase_session_" + encodeToString + "_data";
        d = "firebase_session_" + encodeToString + "_settings";
    }

    private C2621x() {
    }

    public final String a() {
        return c;
    }

    public final String b() {
        return d;
    }
}
