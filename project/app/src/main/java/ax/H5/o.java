/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import ax.H5.c;
import ax.H5.f;
import ax.H5.k;
import ax.H5.m;
import ax.H5.p;
import ax.K5.g;
import ax.K5.h;
import ax.K5.i;
import ax.P5.a;
import com.google.android.gms.common.api.Status;

public final class o {
    private static final a a = new a("GoogleSignInCommon", new String[0]);

    public static h a(g g8, Context context, boolean bl) {
        a.a("Revoking access", new Object[0]);
        String string = c.b(context).e();
        o.c(context);
        if (bl) {
            return f.a(string);
        }
        return g8.a(new m(g8));
    }

    public static h b(g g8, Context context, boolean bl) {
        a.a("Signing out", new Object[0]);
        o.c(context);
        if (bl) {
            return i.b(Status.g0, g8);
        }
        return g8.a(new k(g8));
    }

    private static void c(Context object) {
        p.a((Context)object).b();
        object = g.b().iterator();
        while (object.hasNext()) {
            ((g)object.next()).e();
        }
        com.google.android.gms.common.api.internal.c.a();
    }
}

