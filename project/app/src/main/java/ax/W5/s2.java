/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.accounts.Account;
import android.os.Bundle;
import ax.L5.j;
import ax.M5.c;
import ax.W5.b;
import ax.W5.o2;
import ax.W5.r2;
import ax.W5.v2;
import ax.j6.k;

public final class s2
implements j {
    public final b a;
    public final Account b;
    public final String c;
    public final Bundle d;

    public /* synthetic */ s2(b b8, Account account, String string, Bundle bundle) {
        this.a = b8;
        this.b = account;
        this.c = string;
        this.d = bundle;
    }

    public final void a(Object object, Object object2) {
        b b8 = this.a;
        Account account = this.b;
        String string = this.c;
        Bundle bundle = this.d;
        object = (o2)object;
        object2 = (k)object2;
        ((r2)((c)object).D()).b2(new v2(b8, (k)object2), account, string, bundle);
    }
}

