/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import android.content.Context;
import ax.E5.a;
import ax.H5.o;
import ax.J5.h;
import ax.K5.f;
import ax.K5.g;
import ax.j6.j;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.f;
import com.google.android.gms.dynamite.DynamiteModule;

@Deprecated
public class b
extends ax.K5.f<GoogleSignInOptions> {
    private static final f k = new f(null);
    static int l = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, a.b, googleSignInOptions, new f.a.a().b(new ax.L5.a()).a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int u() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                int n8;
                block5: {
                    h h8;
                    Context context;
                    block6: {
                        try {
                            int n9;
                            n8 = n9 = l;
                            if (n9 != 1) break block5;
                            context = this.k();
                            h8 = h.o();
                            n8 = h8.h(context, 12451000);
                            if (n8 != 0) break block6;
                            n8 = 4;
                            l = 4;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (h8.b(context, n8, null) == null && DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                        n8 = 3;
                        l = 3;
                    } else {
                        n8 = 2;
                        l = 2;
                    }
                }
                return n8;
            }
            throw throwable2;
        }
    }

    public j<Void> s() {
        g g8 = this.d();
        Context context = this.k();
        boolean bl = this.u() == 3;
        return ax.M5.o.b(o.a(g8, context, bl));
    }

    public j<Void> t() {
        g g8 = this.d();
        Context context = this.k();
        boolean bl = this.u() == 3;
        return ax.M5.o.b(o.b(g8, context, bl));
    }
}

