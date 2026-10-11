package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ax.J5.C0752m;
import ax.M5.AbstractC0808c;
import ax.f6.InterfaceC2057e;

/* loaded from: classes3.dex */
public final class T1 extends AbstractC0808c<InterfaceC2057e> {
    public T1(Context context, Looper looper, AbstractC0808c.a aVar, AbstractC0808c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // ax.M5.AbstractC0808c
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // ax.M5.AbstractC0808c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // ax.M5.AbstractC0808c, ax.K5.a.f
    public final int k() {
        return C0752m.a;
    }

    @Override // ax.M5.AbstractC0808c
    public final /* synthetic */ InterfaceC2057e s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC2057e ? (InterfaceC2057e) queryLocalInterface : new O1(iBinder);
    }
}
