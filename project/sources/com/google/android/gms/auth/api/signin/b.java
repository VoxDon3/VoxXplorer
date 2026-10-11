package com.google.android.gms.auth.api.signin;

import android.content.Context;
import ax.H5.o;
import ax.J5.C0747h;
import ax.J5.C0752m;
import ax.K5.f;
import ax.L5.C0789a;
import ax.M5.C0820o;
import ax.j6.AbstractC2327j;
import com.google.android.gms.dynamite.DynamiteModule;

@Deprecated
/* loaded from: classes3.dex */
public class b extends ax.K5.f<GoogleSignInOptions> {
    private static final f k = new f(null);
    static int l = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, ax.E5.a.b, googleSignInOptions, new f.a.C0109a().b(new C0789a()).a());
    }

    private final synchronized int u() {
        int i;
        try {
            i = l;
            if (i == 1) {
                Context k2 = k();
                C0747h o = C0747h.o();
                int h = o.h(k2, C0752m.a);
                if (h == 0) {
                    i = 4;
                    l = 4;
                } else if (o.b(k2, h, null) != null || DynamiteModule.a(k2, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    l = 2;
                } else {
                    i = 3;
                    l = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public AbstractC2327j<Void> s() {
        return C0820o.b(o.a(d(), k(), u() == 3));
    }

    public AbstractC2327j<Void> t() {
        return C0820o.b(o.b(d(), k(), u() == 3));
    }
}
