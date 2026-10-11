/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.p;
import ax.R5.n;
import ax.S5.e;
import ax.b6.S6;
import ax.b6.X6;
import ax.f6.o;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.M1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class h
extends f3 {
    private Boolean b;
    private String c;
    private j d = new g();
    private Boolean e;

    h(E2 e22) {
        super(e22);
    }

    public static long J() {
        return F.e.a(null);
    }

    public static long O() {
        return F.E.a(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle X() {
        PackageManager.NameNotFoundException nameNotFoundException2;
        block3: {
            try {
                if (((f3)this).a().getPackageManager() == null) {
                    ((f3)this).k().G().a("Failed to load metadata: PackageManager is null");
                    return null;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                break block3;
            }
            ApplicationInfo applicationInfo = ax.S5.e.a(((f3)this).a()).b(((f3)this).a().getPackageName(), 128);
            if (applicationInfo != null) return applicationInfo.metaData;
            ((f3)this).k().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        }
        ((f3)this).k().G().b("Failed to load metadata: Package name not found", (Object)nameNotFoundException2);
        return null;
    }

    private final String c(String string, String string2) {
        block8: {
            ClassNotFoundException classNotFoundException2;
            block7: {
                NoSuchMethodException noSuchMethodException2;
                block6: {
                    IllegalAccessException illegalAccessException2;
                    block5: {
                        try {
                            string = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, string, string2);
                            p.l(string);
                            return string;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block5;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block6;
                        }
                        catch (ClassNotFoundException classNotFoundException2) {
                            break block7;
                        }
                        ((f3)this).k().G().b("SystemProperties.get() threw an exception", invocationTargetException);
                        break block8;
                    }
                    ((f3)this).k().G().b("Could not access SystemProperties.get()", illegalAccessException2);
                    break block8;
                }
                ((f3)this).k().G().b("Could not find SystemProperties.get() method", noSuchMethodException2);
                break block8;
            }
            ((f3)this).k().G().b("Could not find SystemProperties class", classNotFoundException2);
        }
        return string2;
    }

    public final o A(String string, boolean bl) {
        p.f(string);
        Object object = this.X();
        if (object == null) {
            ((f3)this).k().G().a("Failed to load metadata: Metadata bundle is null");
            object = null;
        } else {
            object = object.get(string);
        }
        if (object == null) {
            return o.c0;
        }
        if (Boolean.TRUE.equals(object)) {
            return o.f0;
        }
        if (Boolean.FALSE.equals(object)) {
            return o.e0;
        }
        if (bl && "eu_consent_policy".equals(object)) {
            return o.d0;
        }
        ((f3)this).k().L().b("Invalid manifest metadata for", string);
        return o.c0;
    }

    final long B(String string) {
        return this.z(string, F.b);
    }

    public final String C(String string, M1<String> m12) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return m12.a(null);
        }
        return m12.a(this.d.c(string, m12.b()));
    }

    final Boolean D(String string) {
        p.f(string);
        Bundle bundle = this.X();
        if (bundle == null) {
            ((f3)this).k().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundle.containsKey(string)) {
            return null;
        }
        return bundle.getBoolean(string);
    }

    public final boolean E(String string, M1<Boolean> m12) {
        return this.G(string, m12);
    }

    final String F(String string) {
        return this.C(string, F.M);
    }

    public final boolean G(String string, M1<Boolean> m12) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return m12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string = this.d.c(string, m12.b())))) {
            return m12.a(null);
        }
        return m12.a("1".equals(string));
    }

    public final int H() {
        if (((f3)this).i().c0(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final List<String> I(String var1_1) {
        block7: {
            p.f((String)var1_1 /* !! */ );
            var2_3 = this.X();
            if (var2_3 == null) {
                this.k().G().a("Failed to load metadata: Metadata bundle is null");
                while (true) {
                    var1_1 /* !! */  = null;
                    break;
                }
            } else {
                if (!var2_3.containsKey((String)var1_1 /* !! */ )) ** continue;
                var1_1 /* !! */  = var2_3.getInt((String)var1_1 /* !! */ );
            }
            if (var1_1 /* !! */  == null) {
                return null;
            }
            try {
                var1_1 /* !! */  = this.a().getResources().getStringArray(var1_1 /* !! */ .intValue());
                if (var1_1 /* !! */  != null) break block7;
                return null;
            }
            catch (Resources.NotFoundException var1_2) {
                this.k().G().b("Failed to load string array from metadata: resource not found", (Object)var1_2);
                return null;
            }
        }
        var1_1 /* !! */  = Arrays.asList(var1_1 /* !! */ );
        return var1_1 /* !! */ ;
    }

    public final void K(String string) {
        this.c = string;
    }

    final boolean L(String string) {
        return this.G(string, F.L);
    }

    public final boolean M(String string) {
        return "1".equals(this.d.c(string, "gaia_collection_enabled"));
    }

    public final boolean N(String string) {
        return "1".equals(this.d.c(string, "measurement.event_sampling_enabled"));
    }

    public final String P() {
        return this.c("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return this.c("debug.deferred.deeplink", "");
    }

    public final String R() {
        return this.c;
    }

    public final boolean S() {
        Boolean bl = this.D("google_analytics_adid_collection_enabled");
        return bl == null || bl.booleanValue();
        {
        }
    }

    public final boolean T() {
        Boolean bl = this.D("google_analytics_automatic_screen_reporting_enabled");
        return bl == null || bl.booleanValue();
        {
        }
    }

    public final boolean U() {
        Boolean bl = this.D("firebase_analytics_collection_deactivated");
        return bl != null && bl != false;
    }

    final boolean V() {
        if (this.b == null) {
            Boolean bl;
            this.b = bl = this.D("app_measurement_lite");
            if (bl == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.t();
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean W() {
        if (this.e != null) return this.e;
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    boolean bl;
                    try {
                        if (this.e != null) return this.e;
                        Object object = ((f3)this).a().getApplicationInfo();
                        String string = n.a();
                        if (object != null) {
                            object = ((ApplicationInfo)object).processName;
                            bl = object != null && ((String)object).equals(string);
                        }
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.e = bl;
                }
                if (this.e != null) return this.e;
                this.e = Boolean.TRUE;
                ((f3)this).k().G().a("My process not in the list of running processes");
                return this.e;
            }
            throw throwable2;
        }
    }

    public final double o(String string, M1<Double> m12) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return m12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string = this.d.c(string, m12.b())))) {
            return m12.a(null);
        }
        try {
            double d8 = m12.a(Double.parseDouble(string));
            return d8;
        }
        catch (NumberFormatException numberFormatException) {
            return m12.a(null);
        }
    }

    final int p(String string) {
        return this.q(string, F.I, 500, 2000);
    }

    public final int q(String string, M1<Integer> m12, int n8, int n9) {
        return Math.max(Math.min(this.v(string, m12), n9), n8);
    }

    final int r(String string, boolean bl) {
        if (S6.a() && ((f3)this).d().G(null, F.O0)) {
            if (bl) {
                return this.q(string, F.S, 100, 500);
            }
            return 500;
        }
        return 100;
    }

    final void s(j j8) {
        this.d = j8;
    }

    public final boolean t(M1<Boolean> m12) {
        return this.G(null, m12);
    }

    public final int u(String string) {
        return this.q(string, F.J, 25, 100);
    }

    public final int v(String string, M1<Integer> m12) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return m12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string = this.d.c(string, m12.b())))) {
            return m12.a(null);
        }
        try {
            int n8 = m12.a(Integer.parseInt(string));
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            return m12.a(null);
        }
    }

    final int w(String string, boolean bl) {
        return Math.max(this.r(string, bl), 256);
    }

    final int x() {
        if (X6.a() && ((f3)this).d().G(null, F.y0) && ((f3)this).i().c0(231100000, true)) {
            return 35;
        }
        return 0;
    }

    public final int y(String string) {
        return this.v(string, F.p);
    }

    public final long z(String string, M1<Long> m12) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return m12.a(null);
        }
        if (TextUtils.isEmpty((CharSequence)(string = this.d.c(string, m12.b())))) {
            return m12.a(null);
        }
        try {
            long l8 = m12.a(Long.parseLong(string));
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            return m12.a(null);
        }
    }
}

