/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ax.M5.p;
import ax.T5.b;
import ax.b6.U0;
import ax.b6.W0;
import ax.f6.m;
import com.google.android.gms.dynamite.DynamiteModule;

final class V0
extends W0.a {
    private final String f0;
    private final String g0;
    private final Context h0;
    private final Bundle i0;
    private final W0 j0;

    V0(W0 w02, String string, String string2, Context context, Bundle bundle) {
        this.f0 = string;
        this.g0 = string2;
        this.h0 = context;
        this.i0 = bundle;
        this.j0 = w02;
        super(w02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Exception exception2;
        block5: {
            String string;
            String string2;
            String string3;
            block4: {
                block3: {
                    try {
                        if (!W0.x(this.j0, this.f0, this.g0)) break block3;
                        string3 = this.g0;
                        string2 = this.f0;
                        string = W0.z(this.j0);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                string = null;
                string3 = string2 = null;
            }
            p.l(this.h0);
            Object object = this.j0;
            W0.m((W0)object, ((W0)object).c(this.h0, true));
            if (W0.d(this.j0) == null) {
                Log.w((String)W0.z(this.j0), (String)"Failed to connect to measurement client.");
                return;
            }
            int n8 = DynamiteModule.a(this.h0, "com.google.android.gms.measurement.dynamite");
            int n9 = DynamiteModule.c(this.h0, "com.google.android.gms.measurement.dynamite");
            int n10 = Math.max(n8, n9);
            boolean bl = n9 < n8;
            object = new U0(97001L, n10, bl, string, string2, string3, this.i0, m.a(this.h0));
            p.l(W0.d(this.j0)).initialize(b.a2(this.h0), (U0)object, this.q);
            return;
        }
        W0.o(this.j0, exception2, true, false);
    }
}

