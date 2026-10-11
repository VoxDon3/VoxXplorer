/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.M5.c;
import ax.f6.e;
import com.google.android.gms.measurement.internal.O1;

public final class T1
extends c<e> {
    public T1(Context context, Looper looper, c.a a8, c.b b8) {
        super(context, looper, 93, a8, b8, null);
    }

    @Override
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (iInterface instanceof e) {
            return (e)iInterface;
        }
        return new O1(iBinder);
    }
}

