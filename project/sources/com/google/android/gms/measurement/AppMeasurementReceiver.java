package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import ax.f6.C2063k;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends ax.E0.a implements C2063k.a {
    private C2063k c;

    @Override // ax.f6.C2063k.a
    public final void a(Context context, Intent intent) {
        ax.E0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new C2063k(this);
        }
        this.c.a(context, intent);
    }
}
