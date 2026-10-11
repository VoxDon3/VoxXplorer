/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.S5.d;
import ax.S5.e;
import ax.b6.d0;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.q5;

public final class o2 {
    final E2 a;

    o2(q5 q52) {
        this.a = q52.o0();
    }

    final Bundle a(String string, d0 d02) {
        Exception exception2;
        block5: {
            block4: {
                ((f3)this.a.l()).n();
                if (d02 == null) {
                    this.a.k().L().a("Attempting to use Install Referrer Service while it is not initialized");
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("package_name", string);
                try {
                    string = d02.n(bundle);
                    if (string != null) break block4;
                }
                catch (Exception exception2) {}
                this.a.k().G().a("Install Referrer Service returned a null response");
                return null;
                break block5;
            }
            return string;
        }
        this.a.k().G().b("Exception occurred while retrieving the Install Referrer", exception2.getMessage());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean b() {
        Exception exception2;
        block3: {
            d d8;
            boolean bl = false;
            try {
                d8 = e.a(this.a.a());
                if (d8 == null) {
                    this.a.k().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                    return false;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            int n8 = d8.d((String)"com.android.vending", (int)128).versionCode;
            if (n8 < 80837300) return bl;
            return true;
        }
        this.a.k().K().b("Failed to retrieve Play Store version for Install Referrer", exception2);
        return false;
    }
}

