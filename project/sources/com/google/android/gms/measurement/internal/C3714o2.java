package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.b6.InterfaceC1532d0;

/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3714o2 {
    final E2 a;

    C3714o2(q5 q5Var) {
        this.a = q5Var.o0();
    }

    final Bundle a(String str, InterfaceC1532d0 interfaceC1532d0) {
        this.a.l().n();
        if (interfaceC1532d0 == null) {
            this.a.k().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle n = interfaceC1532d0.n(bundle);
            if (n != null) {
                return n;
            }
            this.a.k().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.k().G().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            ax.S5.d a = ax.S5.e.a(this.a.a());
            if (a != null) {
                return a.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.k().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.k().K().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
