/*
 * Decompiled with CFR 0.152.
 */
package ax.h6;

import ax.K5.a;
import ax.h6.b;
import ax.h6.c;
import com.google.android.gms.common.api.Scope;

public final class e {
    public static final a.g a;
    public static final a.g b;
    public static final a.a c;
    static final a.a d;
    public static final Scope e;
    public static final Scope f;
    public static final a g;
    public static final a h;

    static {
        a.g g8;
        a.g g9;
        a = g9 = new a.g();
        b = g8 = new a.g();
        b b8 = new b();
        c = b8;
        c c8 = new c();
        d = c8;
        e = new Scope("profile");
        f = new Scope("email");
        g = new a("SignIn.API", b8, g9);
        h = new a("SignIn.INTERNAL_API", c8, g8);
    }
}

