/*
 * Decompiled with CFR 0.152.
 */
package ax.O5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.L5.c;
import ax.L5.i;
import ax.M5.d;
import ax.M5.g;
import ax.M5.w;
import ax.O5.a;
import ax.Y5.f;

public final class e
extends g {
    private final w J0;

    public e(Context context, Looper looper, d d8, w w8, c c8, i i8) {
        super(context, looper, 270, d8, c8, i8);
        this.J0 = w8;
    }

    @Override
    protected final Bundle A() {
        return this.J0.b();
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    protected final boolean I() {
        return true;
    }

    @Override
    public final int k() {
        return 203400000;
    }

    @Override
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (iInterface instanceof a) {
            return (a)iInterface;
        }
        return new a(iBinder);
    }

    @Override
    public final ax.J5.e[] v() {
        return f.b;
    }
}

