package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import ax.M5.C0821p;
import ax.b6.C1602k7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC3639d3 implements Callable<List<C3669h5>> {
    private final /* synthetic */ E5 a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ I2 c;

    CallableC3639d3(I2 i2, E5 e5, Bundle bundle) {
        this.a = e5;
        this.b = bundle;
        this.c = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C3669h5> call() throws Exception {
        q5 q5Var;
        q5 q5Var2;
        q5Var = this.c.e;
        q5Var.u0();
        q5Var2 = this.c.e;
        E5 e5 = this.a;
        Bundle bundle = this.b;
        q5Var2.l().n();
        if (!C1602k7.a() || !q5Var2.f0().E(e5.q, F.A0) || e5.q == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    q5Var2.k().G().a("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        C3691l h0 = q5Var2.h0();
                        String str = e5.q;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        C0821p.f(str);
                        h0.n();
                        h0.u();
                        try {
                            int delete = h0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            h0.k().K().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            h0.k().G().c("Error pruning trigger URIs. appId", V1.v(str), e);
                        }
                    }
                }
            }
        }
        return q5Var2.h0().R0(e5.q);
    }
}
