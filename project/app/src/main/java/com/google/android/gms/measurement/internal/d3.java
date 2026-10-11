/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import ax.M5.p;
import ax.b6.k7;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.q5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

final class d3
implements Callable<List<h5>> {
    private final E5 a;
    private final Bundle b;
    private final I2 c;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    d3(I2 i22, E5 e52, Bundle bundle) {
        this.a = e52;
        this.b = bundle;
        this.c = i22;
    }

    @Override
    public final /* synthetic */ Object call() throws Exception {
        I2.w(this.c).u0();
        q5 q52 = I2.w(this.c);
        E5 e52 = this.a;
        Object object = this.b;
        ((f3)q52.l()).n();
        if (k7.a() && q52.f0().E(e52.q, F.A0) && e52.q != null) {
            if (object != null) {
                int[] nArray = object.getIntArray("uriSources");
                long[] lArray = object.getLongArray("uriTimestamps");
                if (nArray != null) {
                    if (lArray != null && lArray.length == nArray.length) {
                        for (int i8 = 0; i8 < nArray.length; ++i8) {
                            object = q52.h0();
                            String string = e52.q;
                            int n8 = nArray[i8];
                            long l8 = lArray[i8];
                            p.f(string);
                            ((f3)object).n();
                            ((k5)object).u();
                            try {
                                int n9 = ((l)object).B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{string, String.valueOf(n8), String.valueOf(l8)});
                                X1 x12 = ((f3)object).k().K();
                                StringBuilder stringBuilder = new StringBuilder("Pruned ");
                                stringBuilder.append(n9);
                                stringBuilder.append(" trigger URIs. appId, source, timestamp");
                                x12.d(stringBuilder.toString(), string, n8, l8);
                                continue;
                            }
                            catch (SQLiteException sQLiteException) {
                                ((f3)object).k().G().c("Error pruning trigger URIs. appId", V1.v(string), (Object)sQLiteException);
                            }
                        }
                    } else {
                        q52.k().G().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return q52.h0().R0(e52.q);
        }
        return new ArrayList();
    }
}

