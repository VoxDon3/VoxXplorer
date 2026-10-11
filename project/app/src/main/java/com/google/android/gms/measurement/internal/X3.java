/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ax.b6.M6;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.W3;
import com.google.android.gms.measurement.internal.W4;
import com.google.android.gms.measurement.internal.X4;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.z2;

final class X3
implements Application.ActivityLifecycleCallbacks {
    private final k3 a;

    X3(k3 k32) {
        this.a = k32;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* synthetic */ void a(X3 var0, boolean var1_1, Uri var2_2, String var3_4, String var4_5) {
        block12: {
            var0.a.n();
            try {
                var7_6 = var0.a.i();
                var5_7 = M6.a() != false && var0.a.d().t(F.M0) != false;
            }
            catch (RuntimeException var2_3) {
                break block12;
            }
            var6_8 = TextUtils.isEmpty((CharSequence)var4_5);
            if (var6_8) ** GOTO lbl11
            if (!(var4_5.contains("gclid") || var5_7 && var4_5.contains("gbraid") || var4_5.contains("utm_campaign") || var4_5.contains("utm_source") || var4_5.contains("utm_medium") || var4_5.contains("utm_id") || var4_5.contains("dclid") || var4_5.contains("srsltid") || var4_5.contains("sfmc_id"))) {
                var7_6.k().F().a("Activity created with data 'referrer' without required params");
lbl11:
                // 2 sources

                var7_6 = null;
            } else {
                var8_9 = new StringBuilder("https://google.com/search?");
                var8_9.append(var4_5);
                var7_6 = var8_9 = var7_6.C(Uri.parse((String)var8_9.toString()), var5_7);
                if (var8_9 != null) {
                    var8_9.putString("_cis", "referrer");
                    var7_6 = var8_9;
                }
            }
            if (var1_1 && (var2_2 = (var8_9 = var0.a.i()).C(var2_2, var1_1 = M6.a() != false && var0.a.d().t(F.M0) != false)) != null) {
                var2_2.putString("_cis", "intent");
                if (!var2_2.containsKey("gclid") && var7_6 != null && var7_6.containsKey("gclid")) {
                    var2_2.putString("_cer", String.format("gclid=%s", new Object[]{var7_6.getString("gclid")}));
                }
                var0.a.Y0(var3_4, "_cmp", (Bundle)var2_2);
                var0.a.p.b(var3_4, (Bundle)var2_2);
            }
            if (TextUtils.isEmpty((CharSequence)var4_5)) {
                return;
            }
            var0.a.k().F().b("Activity created with referrer", var4_5);
            var1_1 = var0.a.d().t(F.m0);
            if (var1_1) {
                if (var7_6 != null) {
                    var0.a.Y0(var3_4, "_cmp", (Bundle)var7_6);
                    var0.a.p.b(var3_4, (Bundle)var7_6);
                } else {
                    var0.a.k().F().b("Referrer does not contain valid parameters", var4_5);
                }
                var0.a.k0("auto", "_ldl", null, true);
                return;
            }
            if (var4_5.contains("gclid") && (var4_5.contains("utm_campaign") || var4_5.contains("utm_source") || var4_5.contains("utm_medium") || var4_5.contains("utm_term") || var4_5.contains("utm_content"))) {
                if (TextUtils.isEmpty((CharSequence)var4_5) != false) return;
                var0.a.k0("auto", "_ldl", var4_5, true);
                return;
            }
            var0.a.k().F().a("Activity created with data 'referrer' without required params");
            return;
        }
        var0.a.k().G().b("Throwable caught in handleReferrerForOnActivityCreated", var2_3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        block10: {
            RuntimeException var4_9;
            block11: {
                z2 z22;
                boolean bl;
                String string;
                Object object;
                Object object2;
                block9: {
                    ((f3)this.a).k().K().a("onActivityCreated");
                    object2 = activity.getIntent();
                    if (object2 != null) break block9;
                    ((C1)this.a).s().F(activity, bundle);
                    return;
                }
                try {
                    object = object2.getData();
                    if (object == null || !object.isHierarchical()) {
                        object = object2.getExtras();
                        object = object != null && !TextUtils.isEmpty((CharSequence)(object = object.getString("com.android.vending.referral_url"))) ? Uri.parse((String)object) : null;
                    }
                    if (object == null || !object.isHierarchical()) break block10;
                    ((f3)this.a).i();
                    object2 = B5.f0(object2) ? "gs" : "auto";
                    string = object.getQueryParameter("referrer");
                    bl = bundle == null;
                    z22 = ((f3)this.a).l();
                }
                catch (Throwable throwable) {
                    break block11;
                }
                try {
                    W3 w32 = new W3(this, bl, (Uri)object, (String)object2, string);
                    z22.D(w32);
                }
                catch (Throwable throwable) {
                    break block11;
                }
                catch (RuntimeException runtimeException) {}
                ((C1)this.a).s().F(activity, bundle);
                return;
                catch (RuntimeException runtimeException) {
                }
                {
                    ((f3)this.a).k().G().b("Throwable caught in onActivityCreated", object);
                    ((C1)this.a).s().F(activity, bundle);
                    return;
                }
            }
            ((C1)this.a).s().F(activity, bundle);
            throw var4_9;
        }
        ((C1)this.a).s().F(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        ((C1)this.a).s().E(activity);
    }

    public final void onActivityPaused(Activity object) {
        ((C1)this.a).s().Q((Activity)object);
        object = ((C1)this.a).u();
        long l8 = ((f3)object).b().b();
        ((f3)object).l().D(new W4((V4)object, l8));
    }

    public final void onActivityResumed(Activity activity) {
        V4 v42 = ((C1)this.a).u();
        long l8 = ((f3)v42).b().b();
        ((f3)v42).l().D(new X4(v42, l8));
        ((C1)this.a).s().S(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ((C1)this.a).s().R(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

