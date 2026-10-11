/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import ax.E0.a;
import ax.f6.k;

public final class AppMeasurementReceiver
extends a
implements k.a {
    private k c;

    @Override
    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new k(this);
        }
        this.c.a(context, intent);
    }
}

