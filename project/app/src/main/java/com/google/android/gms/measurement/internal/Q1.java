/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import ax.M5.p;
import ax.S5.b;
import ax.b6.g6;
import ax.b6.k7;
import ax.b6.m6;
import ax.b6.w7;
import ax.f6.m;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.h2;
import com.google.android.gms.measurement.internal.h3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class Q1
extends b1 {
    private String c;
    private String d;
    private int e;
    private String f;
    private long g;
    private long h;
    private List<String> i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;
    private long o = 0L;
    private String p = null;

    Q1(E2 e22, long l8) {
        super(e22);
        this.h = l8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String J() {
        Object object;
        Class<?> clazz;
        block9: {
            block8: {
                if (w7.a() && ((f3)this).d().t(F.n0)) {
                    ((f3)this).k().K().a("Disabled IID for tests.");
                    return null;
                }
                try {
                    clazz = ((f3)this).a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clazz != null) break block8;
                    return null;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    return null;
                }
            }
            try {
                object = clazz.getDeclaredMethod("getInstance", Context.class).invoke(null, ((f3)this).a());
                if (object != null) break block9;
                return null;
            }
            catch (Exception exception) {
                ((f3)this).k().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        }
        try {
            return (String)clazz.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object, null);
        }
        catch (Exception exception) {
            ((f3)this).k().M().a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override
    protected final boolean A() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    final E5 B(String string) {
        int n8;
        long l8;
        long l9;
        ((f3)this).n();
        String string2 = this.F();
        String string3 = this.G();
        this.v();
        String string4 = this.d;
        long l10 = this.D();
        this.v();
        ax.M5.p.l(this.f);
        String string5 = this.f;
        this.v();
        ((f3)this).n();
        if (this.g == 0L) {
            this.g = this.a.L().z(((f3)this).a(), ((f3)this).a().getPackageName());
        }
        long l11 = this.g;
        boolean bl = this.a.p();
        boolean bl2 = ((f3)this).h().t;
        ((f3)this).n();
        boolean bl3 = this.a.p();
        String string6 = null;
        String string7 = !bl3 ? null : this.J();
        long l12 = 0L;
        Object object = this.a;
        long l13 = ((E2)object).F().g.a();
        l13 = l13 == 0L ? ((E2)object).H : Math.min(((E2)object).H, l13);
        int n9 = this.C();
        boolean bl4 = ((f3)this).d().S();
        object = ((f3)this).h();
        ((f3)object).n();
        boolean bl5 = ((g2)object).J().getBoolean("deferred_analytics_collection", false);
        String string8 = this.E();
        object = ((f3)this).d().D("google_analytics_default_allow_ad_personalization_signals");
        object = object == null ? null : Boolean.valueOf((Boolean)object ^ true);
        long l14 = this.h;
        List<String> list = this.i;
        String string9 = ((f3)this).h().M().z();
        if (this.j == null) {
            this.j = ((f3)this).i().U0();
        }
        String string10 = this.j;
        if (!m6.a() || !((f3)this).d().t(F.V0) || ((f3)this).h().M().m(h3.a.d0)) {
            ((f3)this).n();
            if (this.o != 0L) {
                l9 = ((f3)this).b().a();
                l8 = this.o;
                if (this.n != null && l9 - l8 > 86400000L && this.p == null) {
                    this.I();
                }
            }
            if (this.n == null) {
                this.I();
            }
            string6 = this.n;
        }
        Object object2 = ((f3)this).d().D("google_analytics_sgtm_upload_enabled");
        bl3 = object2 == null ? false : (Boolean)object2;
        l8 = ((f3)this).i().z0(this.F());
        int n10 = ((f3)this).h().M().b();
        String string11 = ((f3)this).h().L().j();
        if (k7.a() && ((f3)this).d().t(F.B0)) {
            ((f3)this).i();
            n8 = B5.y0();
        } else {
            n8 = 0;
        }
        l9 = l12;
        if (k7.a()) {
            l9 = l12;
            if (((f3)this).d().t(F.B0)) {
                l9 = ((f3)this).i().K0();
            }
        }
        String string12 = ((f3)this).d().R();
        if (g6.a() && ((f3)this).d().t(F.R0)) {
            object2 = new h2(((f3)this).d().A("google_analytics_default_allow_ad_personalization_signals", true)).c();
            return new E5(string2, string3, string4, l10, string5, 97001L, l11, string, bl, bl2 ^ true, string7, 0L, l13, n9, bl4, bl5, string8, (Boolean)object, l14, list, null, string9, string10, string6, bl3, l8, n10, string11, n8, l9, string12, (String)object2);
        }
        object2 = "";
        return new E5(string2, string3, string4, l10, string5, 97001L, l11, string, bl, bl2 ^ true, string7, 0L, l13, n9, bl4, bl5, string8, (Boolean)object, l14, list, null, string9, string10, string6, bl3, l8, n10, string11, n8, l9, string12, (String)object2);
    }

    final int C() {
        this.v();
        return this.k;
    }

    final int D() {
        this.v();
        return this.e;
    }

    final String E() {
        this.v();
        return this.m;
    }

    final String F() {
        this.v();
        ax.M5.p.l(this.c);
        return this.c;
    }

    final String G() {
        ((f3)this).n();
        this.v();
        ax.M5.p.l(this.l);
        return this.l;
    }

    final List<String> H() {
        return this.i;
    }

    final void I() {
        Object object;
        ((f3)this).n();
        if (!((f3)this).h().M().m(h3.a.d0)) {
            ((f3)this).k().F().a("Analytics Storage consent is not granted");
            object = null;
        } else {
            object = new byte[16];
            ((f3)this).i().W0().nextBytes((byte[])object);
            object = String.format(Locale.US, "%032x", new BigInteger(1, (byte[])object));
        }
        X1 x12 = ((f3)this).k().F();
        String string = object == null ? "null" : "not null";
        x12.a(String.format("Resetting session stitching token to %s", string));
        this.n = object;
        this.o = ((f3)this).b().a();
    }

    final boolean K(String string) {
        String string2 = this.p;
        boolean bl = string2 != null && !string2.equals(string);
        this.p = string;
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void y() {
        block35: {
            block36: {
                block34: {
                    block33: {
                        block31: {
                            var12_1 = this.a().getPackageName();
                            var11_2 = this.a().getPackageManager();
                            var10_3 = "";
                            var7_4 = "unknown";
                            var6_6 = "Unknown";
                            var2_7 = -2147483648;
                            if (var11_2 == null) {
                                this.k().G().b("PackageManager is null, app identity information might be inaccurate. appId", V1.v(var12_1));
                                var8_8 /* !! */  = var7_4;
                                var7_4 = var6_6;
                                var1_10 = var2_7;
                            } else {
                                block32: {
                                    try {
                                        var5_11 = var11_2.getInstallerPackageName(var12_1);
                                        var7_4 = var5_11;
                                    }
                                    catch (IllegalArgumentException var5_12) {
                                        this.k().G().b("Error retrieving app installer package name. appId", V1.v(var12_1));
                                    }
                                    if (var7_4 == null) {
                                        var5_11 = "manual_install";
                                    } else {
                                        var5_11 = var7_4;
                                        if ("com.android.vending".equals(var7_4)) {
                                            var5_11 = "";
                                        }
                                    }
                                    try {
                                        var13_14 = var11_2.getPackageInfo(this.a().getPackageName(), 0);
                                        var8_8 /* !! */  = var5_11;
                                        var7_4 = var6_6;
                                        var1_10 = var2_7;
                                        if (var13_14 == null) break block31;
                                        var7_4 = var11_2.getApplicationLabel(var13_14.applicationInfo);
                                        var7_4 = !TextUtils.isEmpty((CharSequence)var7_4) ? var7_4.toString() : "Unknown";
                                    }
                                    catch (PackageManager.NameNotFoundException var7_5) {
                                        var7_4 = "Unknown";
                                        var8_8 /* !! */  = var6_6;
                                        break block32;
                                    }
                                    try {
                                        var9_15 = var13_14.versionName;
                                        var6_6 = var9_15;
                                        var1_10 = var13_14.versionCode;
                                        var8_8 /* !! */  = var5_11;
                                        var7_4 = var9_15;
                                        break block31;
                                    }
                                    catch (PackageManager.NameNotFoundException var8_9) {
                                        var8_8 /* !! */  = var7_4;
                                        var7_4 = var6_6;
                                    }
                                }
                                this.k().G().c("Error retrieving package info. appId, appName", V1.v(var12_1), var8_8 /* !! */ );
                                var1_10 = var2_7;
                                var8_8 /* !! */  = var5_11;
                            }
                        }
                        this.c = var12_1;
                        this.f = var8_8 /* !! */ ;
                        this.d = var7_4;
                        this.e = var1_10;
                        this.g = 0L;
                        var4_16 = TextUtils.isEmpty((CharSequence)this.a.M());
                        var2_7 = 1;
                        var1_10 = var4_16 == false && "am".equals(this.a.N()) != false ? 1 : 0;
                        var3_17 = this.a.x();
                        switch (var3_17) {
                            default: {
                                this.k().J().a("App measurement disabled");
                                this.k().I().a("Invalid scion state in identity");
                                break;
                            }
                            case 8: {
                                this.k().J().a("App measurement disabled due to denied storage consent");
                                break;
                            }
                            case 7: {
                                this.k().J().a("App measurement disabled via the global data collection setting");
                                break;
                            }
                            case 6: {
                                this.k().M().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                break;
                            }
                            case 5: {
                                this.k().K().a("App measurement disabled via the init parameters");
                                break;
                            }
                            case 4: {
                                this.k().J().a("App measurement disabled via the manifest");
                                break;
                            }
                            case 3: {
                                this.k().J().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                break;
                            }
                            case 2: {
                                this.k().K().a("App measurement deactivated via the init parameters");
                                break;
                            }
                            case 1: {
                                this.k().J().a("App measurement deactivated via the manifest");
                                break;
                            }
                            case 0: {
                                this.k().K().a("App measurement collection enabled");
                            }
                        }
                        if (var3_17 != 0) {
                            var2_7 = 0;
                        }
                        this.l = "";
                        this.m = "";
                        if (var1_10 != 0) {
                            this.m = this.a.M();
                        }
                        try {
                            var7_4 = this.a();
                            var5_11 = this.a.P();
                            var6_6 = new m((Context)var7_4, (String)var5_11);
                            var6_6 = var6_6.b("google_app_id");
                            var5_11 = TextUtils.isEmpty((CharSequence)var6_6) != false ? var10_3 : var6_6;
                            this.l = var5_11;
                            if (TextUtils.isEmpty((CharSequence)var6_6)) break block33;
                            var5_11 = new m(this.a(), this.a.P());
                            this.m = var5_11.b("admob_app_id");
                        }
                        catch (IllegalStateException var5_13) {
                            break block34;
                        }
                    }
                    if (var2_7 != 0) {
                        var6_6 = this.k().K();
                        var7_4 = this.c;
                        var5_11 = TextUtils.isEmpty((CharSequence)this.l) != false ? this.m : this.l;
                        var6_6.c("App measurement enabled for app package, google app id", var7_4, var5_11);
                    }
                    break block36;
                }
                this.k().G().c("Fetching Google App Id failed with exception. appId", V1.v(var12_1), var5_13);
            }
            this.i = null;
            var5_11 = this.d().I("analytics.safelisted_events");
            if (var5_11 == null) ** GOTO lbl131
            if (var5_11.isEmpty()) {
                this.k().M().a("Safelisted event list is empty. Ignoring");
            } else {
                for (CharSequence var7_4 : var5_11) {
                    if (this.i().w0("safelisted event", (String)var7_4)) continue;
                    break block35;
                }
lbl131:
                // 2 sources

                this.i = var5_11;
            }
        }
        if (var11_2 != null) {
            this.k = (int)b.a(this.a());
            return;
        }
        this.k = 0;
    }
}

