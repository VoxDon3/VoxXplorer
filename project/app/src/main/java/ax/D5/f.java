/*
 * Decompiled with CFR 0.152.
 */
package ax.D5;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import ax.D5.h;
import ax.D5.i;

public final class f
implements h {
    public final Account a;
    public final String b;
    public final Bundle c;
    public final Context d;

    public /* synthetic */ f(Account account, String string, Bundle bundle, Context context) {
        this.a = account;
        this.b = string;
        this.c = bundle;
        this.d = context;
    }

    @Override
    public final Object a(IBinder iBinder) {
        return i.f(this.a, this.b, this.c, this.d, iBinder);
    }
}

