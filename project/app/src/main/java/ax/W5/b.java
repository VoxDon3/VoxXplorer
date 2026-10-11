/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import ax.D5.e;
import ax.K5.a;
import ax.K5.f;
import ax.L5.n;
import ax.M5.p;
import ax.W5.g;
import ax.W5.m1;
import ax.W5.s2;
import ax.W5.t2;
import ax.W5.u2;
import ax.j6.j;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

final class b
extends f
implements m1 {
    private static final a.g l;
    private static final a.a m;
    private static final a n;
    private static final ax.P5.a o;
    private final Context k;

    static {
        a.g g8;
        l = g8 = new a.g();
        u2 u22 = new u2();
        m = u22;
        n = new a("GoogleAuthService.API", u22, g8);
        o = ax.D5.d.a("GoogleAuthServiceClient");
    }

    b(Context context) {
        super(context, n, a.d.a, f.a.c);
        this.k = context;
    }

    static /* bridge */ /* synthetic */ void s(Status status, Object object, k k8) {
        if (!ax.L5.n.a(status, object, k8)) {
            o.e("The task is already complete.", new Object[0]);
        }
    }

    @Override
    public final j a(Account account, String string, Bundle bundle) {
        p.m(account, "Account name cannot be null!");
        p.g(string, "Scope cannot be null!");
        return this.g(d.a().d(e.l).b(new s2(this, account, string, bundle)).e(1512).a());
    }

    @Override
    public final j c(g g8) {
        return this.g(d.a().d(e.l).b(new t2(this, g8)).e(1513).a());
    }
}

