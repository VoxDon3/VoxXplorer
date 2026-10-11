/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import ax.M5.p;
import ax.b6.U0;

public final class j3 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    U0 g;
    boolean h = true;
    Long i;
    String j;

    public j3(Context context, U0 u02, Long l8) {
        p.l(context);
        context = context.getApplicationContext();
        p.l(context);
        this.a = context;
        this.i = l8;
        if (u02 != null) {
            this.g = u02;
            this.b = u02.g0;
            this.c = u02.f0;
            this.d = u02.e0;
            this.h = u02.d0;
            this.f = u02.c0;
            this.j = u02.i0;
            context = u02.h0;
            if (context != null) {
                this.e = context.getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}

