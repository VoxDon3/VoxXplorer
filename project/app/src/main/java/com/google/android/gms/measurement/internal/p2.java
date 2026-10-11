/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ax.Q5.b;
import ax.b6.M6;
import ax.b6.d0;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.n2;

final class p2
implements Runnable {
    private final ServiceConnection c0;
    private final n2 d0;
    private final d0 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p2(n2 n22, d0 d02, ServiceConnection serviceConnection) {
        this.q = d02;
        this.c0 = serviceConnection;
        this.d0 = n22;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        block6: {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            var7_1 = this.d0;
                            var6_2 = var7_1.c0;
                            var7_1 = n2.a((n2)var7_1);
                            var9_3 = this.q;
                            var8_4 = this.c0;
                            var9_3 = var6_2.a((String)var7_1, var9_3);
                            var6_2.a.l().n();
                            var6_2.a.Q();
                            if (var9_3 == null) break block6;
                            var2_5 = var9_3.getLong("install_begin_timestamp_seconds", 0L) * 1000L;
                            if (var2_5 != 0L) break block7;
                            var6_2.a.k().L().a("Service response is missing Install Referrer install timestamp");
                            break block6;
                        }
                        var10_6 = var9_3.getString("install_referrer");
                        if (var10_6 == null || var10_6.isEmpty()) break block8;
                        var6_2.a.k().K().b("InstallReferrer API result", var10_6);
                        var1_7 = M6.a() != false && var6_2.a.z().t(F.N0) != false;
                        var11_8 = var6_2.a.L();
                        var12_9 = new StringBuilder("?");
                        var12_9.append(var10_6);
                        var10_6 = var11_8.C(Uri.parse((String)var12_9.toString()), var1_7);
                        if (var10_6 != null) break block9;
                        var6_2.a.k().G().a("No campaign params defined in Install Referrer result");
                        break block6;
                    }
                    if (!var1_7) break block10;
                    var4_10 = var9_3.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000L;
                    if (var4_10 > 0L) {
                        var10_6.putLong("click_timestamp", var4_10);
                    }
                    ** GOTO lbl41
                }
                var11_8 = var10_6.getString("medium");
                if (var11_8 == null || "(not set)".equalsIgnoreCase((String)var11_8) || "organic".equalsIgnoreCase((String)var11_8)) ** GOTO lbl41
                var4_11 = var9_3.getLong("referrer_click_timestamp_seconds", 0L) * 1000L;
                if (var4_11 == 0L) {
                    var6_2.a.k().G().a("Install Referrer is missing click timestamp for ad campaign");
                } else {
                    var10_6.putLong("click_timestamp", var4_11);
lbl41:
                    // 3 sources

                    if (var2_5 == var6_2.a.F().h.a()) {
                        var6_2.a.k().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                    }
                    if (var6_2.a.p()) {
                        var6_2.a.F().h.b(var2_5);
                        var6_2.a.k().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                        var10_6.putString("_cis", "referrer API v2");
                        var6_2.a.H().h0("auto", "_cmp", (Bundle)var10_6, (String)var7_1);
                    }
                }
                break block6;
            }
            var6_2.a.k().G().a("No referrer defined in Install Referrer response");
        }
        if (var8_4 != null) {
            b.b().c(var6_2.a.a(), var8_4);
        }
    }
}

