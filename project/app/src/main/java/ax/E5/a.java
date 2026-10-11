/*
 * Decompiled with CFR 0.152.
 */
package ax.E5;

import ax.E5.b;
import ax.E5.c;
import ax.E5.d;
import ax.E5.e;
import ax.H5.h;
import ax.K5.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class a {
    @Deprecated
    public static final ax.K5.a<c> a;
    public static final ax.K5.a<GoogleSignInOptions> b;
    @Deprecated
    public static final ax.F5.a c;
    public static final ax.G5.a d;
    public static final a.g e;
    public static final a.g f;
    private static final a.a g;
    private static final a.a h;

    static {
        a.g g8;
        a.g g9;
        e = g9 = new a.g();
        f = g8 = new a.g();
        d d8 = new d();
        g = d8;
        e e8 = new e();
        h = e8;
        a = ax.E5.b.a;
        new ax.K5.a("Auth.CREDENTIALS_API", d8, g9);
        b = new ax.K5.a("Auth.GOOGLE_SIGN_IN_API", e8, g8);
        c = ax.E5.b.b;
        d = new h();
    }
}

