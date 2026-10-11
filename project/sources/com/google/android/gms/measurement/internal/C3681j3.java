package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3681j3 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    ax.b6.U0 g;
    boolean h;
    Long i;
    String j;

    public C3681j3(Context context, ax.b6.U0 u0, Long l) {
        this.h = true;
        C0821p.l(context);
        Context applicationContext = context.getApplicationContext();
        C0821p.l(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (u0 != null) {
            this.g = u0;
            this.b = u0.g0;
            this.c = u0.f0;
            this.d = u0.e0;
            this.h = u0.d0;
            this.f = u0.c0;
            this.j = u0.i0;
            Bundle bundle = u0.h0;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
