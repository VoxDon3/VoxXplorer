package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ax.b6.InterfaceC1532d0;
import ax.b6.M6;

/* renamed from: com.google.android.gms.measurement.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3720p2 implements Runnable {
    private final /* synthetic */ ServiceConnection c0;
    private final /* synthetic */ ServiceConnectionC3708n2 d0;
    private final /* synthetic */ InterfaceC1532d0 q;

    RunnableC3720p2(ServiceConnectionC3708n2 serviceConnectionC3708n2, InterfaceC1532d0 interfaceC1532d0, ServiceConnection serviceConnection) {
        this.q = interfaceC1532d0;
        this.c0 = serviceConnection;
        this.d0 = serviceConnectionC3708n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ServiceConnectionC3708n2 serviceConnectionC3708n2 = this.d0;
        C3714o2 c3714o2 = serviceConnectionC3708n2.c0;
        str = serviceConnectionC3708n2.q;
        InterfaceC1532d0 interfaceC1532d0 = this.q;
        ServiceConnection serviceConnection = this.c0;
        Bundle a = c3714o2.a(str, interfaceC1532d0);
        c3714o2.a.l().n();
        c3714o2.a.Q();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                c3714o2.a.k().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c3714o2.a.k().G().a("No referrer defined in Install Referrer response");
                } else {
                    c3714o2.a.k().K().b("InstallReferrer API result", string);
                    boolean z = M6.a() && c3714o2.a.z().t(F.N0);
                    Bundle C = c3714o2.a.L().C(Uri.parse("?" + string), z);
                    if (C == null) {
                        c3714o2.a.k().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (z) {
                            long j2 = a.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j2 > 0) {
                                C.putLong("click_timestamp", j2);
                            }
                        } else {
                            String string2 = C.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j3 = a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j3 == 0) {
                                    c3714o2.a.k().G().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    C.putLong("click_timestamp", j3);
                                }
                            }
                        }
                        if (j == c3714o2.a.F().h.a()) {
                            c3714o2.a.k().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c3714o2.a.p()) {
                            c3714o2.a.F().h.b(j);
                            c3714o2.a.k().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            C.putString("_cis", "referrer API v2");
                            c3714o2.a.H().h0("auto", "_cmp", C, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ax.Q5.b.b().c(c3714o2.a.a(), serviceConnection);
        }
    }
}
