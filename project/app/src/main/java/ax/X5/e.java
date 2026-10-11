/*
 * Decompiled with CFR 0.152.
 */
package ax.X5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.E5.g;
import ax.K5.g;
import ax.M5.d;
import ax.X5.b;
import ax.X5.f;

public final class e
extends ax.M5.g {
    private final g J0;

    public e(Context object, Looper looper, d d8, g g8, g.a a8, g.b b8) {
        super((Context)object, looper, 68, d8, a8, b8);
        object = g8;
        if (g8 == null) {
            object = g.e0;
        }
        object = new ax.E5.f((g)object);
        ((ax.E5.f)object).a(b.a());
        this.J0 = new g((ax.E5.f)object);
    }

    @Override
    protected final Bundle A() {
        return this.J0.a();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override
    public final int k() {
        return 12800000;
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (iInterface instanceof f) {
            return (f)iInterface;
        }
        return new f(iBinder);
    }
}

