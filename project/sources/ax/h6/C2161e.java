package ax.h6;

import ax.K5.a;
import com.google.android.gms.common.api.Scope;

/* renamed from: ax.h6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2161e {
    public static final a.g a;
    public static final a.g b;
    public static final a.AbstractC0107a c;
    static final a.AbstractC0107a d;
    public static final Scope e;
    public static final Scope f;
    public static final ax.K5.a g;
    public static final ax.K5.a h;

    static {
        a.g gVar = new a.g();
        a = gVar;
        a.g gVar2 = new a.g();
        b = gVar2;
        C2158b c2158b = new C2158b();
        c = c2158b;
        C2159c c2159c = new C2159c();
        d = c2159c;
        e = new Scope("profile");
        f = new Scope("email");
        g = new ax.K5.a("SignIn.API", c2158b, gVar);
        h = new ax.K5.a("SignIn.INTERNAL_API", c2159c, gVar2);
    }
}
