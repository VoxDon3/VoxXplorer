package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import ax.C5.a;
import ax.M5.C0821p;
import com.google.android.gms.measurement.internal.C3667h3;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3659g2 extends AbstractC3646e3 {
    static final Pair<String, Long> B = new Pair<>(HttpUrl.FRAGMENT_ENCODE_SET, 0L);
    public final C3673i2 A;
    private SharedPreferences c;
    private Object d;
    private SharedPreferences e;
    public C3687k2 f;
    public final C3694l2 g;
    public final C3694l2 h;
    public final C3701m2 i;
    private String j;
    private boolean k;
    private long l;
    public final C3694l2 m;
    public final C3680j2 n;
    public final C3701m2 o;
    public final C3673i2 p;
    public final C3680j2 q;
    public final C3694l2 r;
    public final C3694l2 s;
    public boolean t;
    public C3680j2 u;
    public C3680j2 v;
    public C3694l2 w;
    public final C3701m2 x;
    public final C3701m2 y;
    public final C3694l2 z;

    C3659g2(E2 e2) {
        super(e2);
        this.d = new Object();
        this.m = new C3694l2(this, "session_timeout", 1800000L);
        this.n = new C3680j2(this, "start_new_session", true);
        this.r = new C3694l2(this, "last_pause_time", 0L);
        this.s = new C3694l2(this, "session_id", 0L);
        this.o = new C3701m2(this, "non_personalized_ads", null);
        this.p = new C3673i2(this, "last_received_uri_timestamps_by_source", null);
        this.q = new C3680j2(this, "allow_remote_dynamite", false);
        this.g = new C3694l2(this, "first_open_time", 0L);
        this.h = new C3694l2(this, "app_install_time", 0L);
        this.i = new C3701m2(this, "app_instance_id", null);
        this.u = new C3680j2(this, "app_backgrounded", false);
        this.v = new C3680j2(this, "deep_link_retrieval_complete", false);
        this.w = new C3694l2(this, "deep_link_retrieval_attempts", 0L);
        this.x = new C3701m2(this, "firebase_feature_rollouts", null);
        this.y = new C3701m2(this, "deferred_attribution_cache", null);
        this.z = new C3694l2(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new C3673i2(this, "default_event_parameters", null);
    }

    final boolean A(C3746u c3746u) {
        n();
        if (!C3667h3.l(c3746u.a(), L().a())) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("dma_consent_settings", c3746u.j());
        edit.apply();
        return true;
    }

    final boolean B(C3667h3 c3667h3) {
        n();
        int b = c3667h3.b();
        if (!y(b)) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("consent_settings", c3667h3.z());
        edit.putInt("consent_source", b);
        edit.apply();
        return true;
    }

    protected final boolean C(C3655f5 c3655f5) {
        n();
        String string = J().getString("stored_tcf_param", HttpUrl.FRAGMENT_ENCODE_SET);
        String g = c3655f5.g();
        if (g.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("stored_tcf_param", g);
        edit.apply();
        return true;
    }

    final boolean D() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void E(Boolean bool) {
        n();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    final void F(String str) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    final void G(boolean z) {
        n();
        k().K().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    protected final SharedPreferences H() {
        n();
        p();
        if (this.e == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        String str = a().getPackageName() + "_preferences";
                        k().K().b("Default prefs file", str);
                        this.e = a().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    final void I(String str) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    protected final SharedPreferences J() {
        n();
        p();
        C0821p.l(this.c);
        return this.c;
    }

    final SparseArray<Long> K() {
        Bundle a = this.p.a();
        if (a == null) {
            return new SparseArray<>();
        }
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            k().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    final C3746u L() {
        n();
        return C3746u.d(J().getString("dma_consent_settings", null));
    }

    final C3667h3 M() {
        n();
        return C3667h3.i(J().getString("consent_settings", "G1"), J().getInt("consent_source", 100));
    }

    final Boolean N() {
        n();
        if (J().contains("use_service")) {
            return Boolean.valueOf(J().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean O() {
        n();
        if (J().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean P() {
        n();
        if (J().contains("measurement_enabled")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String Q() {
        n();
        String string = J().getString("previous_os_version", null);
        f().p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    final String R() {
        n();
        return J().getString("admob_app_id", null);
    }

    final String S() {
        n();
        return J().getString("gmp_app_id", null);
    }

    final void T() {
        n();
        Boolean P = P();
        SharedPreferences.Editor edit = J().edit();
        edit.clear();
        edit.apply();
        if (P != null) {
            w(P);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3646e3
    protected final void o() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.t = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f = new C3687k2(this, "health_monitor", Math.max(0L, F.d.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3646e3
    protected final boolean t() {
        return true;
    }

    final Pair<String, Boolean> u(String str) {
        n();
        if (!M().m(C3667h3.a.AD_STORAGE)) {
            return new Pair<>(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
        }
        long b = b().b();
        if (this.j != null && b < this.l) {
            return new Pair<>(this.j, Boolean.valueOf(this.k));
        }
        this.l = b + d().B(str);
        ax.C5.a.b(true);
        try {
            a.C0061a a = ax.C5.a.a(a());
            this.j = HttpUrl.FRAGMENT_ENCODE_SET;
            String a2 = a.a();
            if (a2 != null) {
                this.j = a2;
            }
            this.k = a.b();
        } catch (Exception e) {
            k().F().b("Unable to get advertising id", e);
            this.j = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ax.C5.a.b(false);
        return new Pair<>(this.j, Boolean.valueOf(this.k));
    }

    final void v(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.p.b(bundle);
    }

    final void w(Boolean bool) {
        n();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final void x(boolean z) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    final boolean y(int i) {
        return C3667h3.l(i, J().getInt("consent_source", 100));
    }

    final boolean z(long j) {
        return j - this.m.a() > this.r.a();
    }
}
