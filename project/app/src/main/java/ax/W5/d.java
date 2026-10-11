/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import ax.E5.b;
import ax.E5.c;
import ax.L5.i;
import ax.M5.g;
import ax.W5.e;

public final class d
extends g {
    private final Bundle J0;

    public d(Context context, Looper looper, ax.M5.d d8, c c8, ax.L5.c c9, i i8) {
        super(context, looper, 16, d8, c9, i8);
        context = c8 == null ? new Bundle() : c8.a();
        this.J0 = context;
    }

    @Override
    protected final Bundle A() {
        return this.J0;
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override
    public final boolean S() {
        return true;
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final boolean o() {
        ax.M5.d d8 = this.j0();
        return !TextUtils.isEmpty((CharSequence)d8.b()) && !d8.e(b.a).isEmpty();
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (iInterface instanceof e) {
            return (e)iInterface;
        }
        return new e(iBinder);
    }
}

