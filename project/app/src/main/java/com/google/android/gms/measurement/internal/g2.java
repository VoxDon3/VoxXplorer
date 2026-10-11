/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import ax.C5.a;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f5;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.i2;
import com.google.android.gms.measurement.internal.j2;
import com.google.android.gms.measurement.internal.k2;
import com.google.android.gms.measurement.internal.l2;
import com.google.android.gms.measurement.internal.m2;
import com.google.android.gms.measurement.internal.u;

final class g2
extends e3 {
    static final Pair<String, Long> B = new Pair((Object)"", (Object)0L);
    public final i2 A;
    private SharedPreferences c;
    private Object d = new Object();
    private SharedPreferences e;
    public k2 f;
    public final l2 g;
    public final l2 h;
    public final m2 i;
    private String j;
    private boolean k;
    private long l;
    public final l2 m = new l2(this, "session_timeout", 1800000L);
    public final j2 n = new j2(this, "start_new_session", true);
    public final m2 o;
    public final i2 p;
    public final j2 q;
    public final l2 r = new l2(this, "last_pause_time", 0L);
    public final l2 s = new l2(this, "session_id", 0L);
    public boolean t;
    public j2 u;
    public j2 v;
    public l2 w;
    public final m2 x;
    public final m2 y;
    public final l2 z;

    g2(E2 e22) {
        super(e22);
        this.o = new m2(this, "non_personalized_ads", null);
        this.p = new i2(this, "last_received_uri_timestamps_by_source", null);
        this.q = new j2(this, "allow_remote_dynamite", false);
        this.g = new l2(this, "first_open_time", 0L);
        this.h = new l2(this, "app_install_time", 0L);
        this.i = new m2(this, "app_instance_id", null);
        this.u = new j2(this, "app_backgrounded", false);
        this.v = new j2(this, "deep_link_retrieval_complete", false);
        this.w = new l2(this, "deep_link_retrieval_attempts", 0L);
        this.x = new m2(this, "firebase_feature_rollouts", null);
        this.y = new m2(this, "deferred_attribution_cache", null);
        this.z = new l2(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new i2(this, "default_event_parameters", null);
    }

    final boolean A(u u8) {
        this.n();
        u u9 = this.L();
        if (h3.l(u8.a(), u9.a())) {
            u9 = this.J().edit();
            u9.putString("dma_consent_settings", u8.j());
            u9.apply();
            return true;
        }
        return false;
    }

    final boolean B(h3 h32) {
        this.n();
        int n8 = h32.b();
        if (this.y(n8)) {
            SharedPreferences.Editor editor = this.J().edit();
            editor.putString("consent_settings", h32.z());
            editor.putInt("consent_source", n8);
            editor.apply();
            return true;
        }
        return false;
    }

    protected final boolean C(f5 object) {
        this.n();
        String string = this.J().getString("stored_tcf_param", "");
        object = ((f5)object).g();
        if (!((String)object).equals(string)) {
            string = this.J().edit();
            string.putString("stored_tcf_param", (String)object);
            string.apply();
            return true;
        }
        return false;
    }

    final boolean D() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void E(Boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.J().edit();
        if (bl != null) {
            editor.putBoolean("measurement_enabled_from_api", bl.booleanValue());
        } else {
            editor.remove("measurement_enabled_from_api");
        }
        editor.apply();
    }

    final void F(String string) {
        this.n();
        SharedPreferences.Editor editor = this.J().edit();
        editor.putString("admob_app_id", string);
        editor.apply();
    }

    final void G(boolean bl) {
        this.n();
        this.k().K().b("App measurement setting deferred collection", bl);
        SharedPreferences.Editor editor = this.J().edit();
        editor.putBoolean("deferred_analytics_collection", bl);
        editor.apply();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final SharedPreferences H() {
        this.n();
        this.p();
        if (this.e != null) return this.e;
        Object object = this.d;
        synchronized (object) {
            try {
                if (this.e != null) return this.e;
                String string = this.a().getPackageName();
                CharSequence charSequence = new StringBuilder();
                charSequence.append(string);
                charSequence.append("_preferences");
                charSequence = charSequence.toString();
                this.k().K().b("Default prefs file", charSequence);
                this.e = this.a().getSharedPreferences((String)charSequence, 0);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    final void I(String string) {
        this.n();
        SharedPreferences.Editor editor = this.J().edit();
        editor.putString("gmp_app_id", string);
        editor.apply();
    }

    protected final SharedPreferences J() {
        this.n();
        this.p();
        ax.M5.p.l(this.c);
        return this.c;
    }

    final SparseArray<Long> K() {
        Object object = this.p.a();
        if (object == null) {
            return new SparseArray();
        }
        int[] nArray = object.getIntArray("uriSources");
        object = object.getLongArray("uriTimestamps");
        if (nArray != null && object != null) {
            if (nArray.length != ((Bundle)object).length) {
                this.k().G().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < nArray.length; ++i8) {
                sparseArray.put(nArray[i8], (Object)((long)object[i8]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    final u L() {
        this.n();
        return com.google.android.gms.measurement.internal.u.d(this.J().getString("dma_consent_settings", null));
    }

    final h3 M() {
        this.n();
        return h3.i(this.J().getString("consent_settings", "G1"), this.J().getInt("consent_source", 100));
    }

    final Boolean N() {
        this.n();
        if (!this.J().contains("use_service")) {
            return null;
        }
        return this.J().getBoolean("use_service", false);
    }

    final Boolean O() {
        this.n();
        if (this.J().contains("measurement_enabled_from_api")) {
            return this.J().getBoolean("measurement_enabled_from_api", true);
        }
        return null;
    }

    final Boolean P() {
        this.n();
        if (this.J().contains("measurement_enabled")) {
            return this.J().getBoolean("measurement_enabled", true);
        }
        return null;
    }

    protected final String Q() {
        this.n();
        String string = this.J().getString("previous_os_version", null);
        this.f().p();
        String string2 = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty((CharSequence)string2) && !string2.equals(string)) {
            SharedPreferences.Editor editor = this.J().edit();
            editor.putString("previous_os_version", string2);
            editor.apply();
        }
        return string;
    }

    final String R() {
        this.n();
        return this.J().getString("admob_app_id", null);
    }

    final String S() {
        this.n();
        return this.J().getString("gmp_app_id", null);
    }

    final void T() {
        this.n();
        Boolean bl = this.P();
        SharedPreferences.Editor editor = this.J().edit();
        editor.clear();
        editor.apply();
        if (bl != null) {
            this.w(bl);
        }
    }

    @Override
    protected final void o() {
        boolean bl;
        SharedPreferences sharedPreferences;
        this.c = sharedPreferences = this.a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.t = bl = sharedPreferences.getBoolean("has_been_opened", false);
        if (!bl) {
            sharedPreferences = this.c.edit();
            sharedPreferences.putBoolean("has_been_opened", true);
            sharedPreferences.apply();
        }
        this.f = new k2(this, "health_monitor", Math.max(0L, (Long)F.d.a(null)), null);
    }

    @Override
    protected final boolean t() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Pair<String, Boolean> u(String object) {
        block6: {
            Exception exception2;
            block5: {
                block4: {
                    this.n();
                    if (!this.M().m(h3.a.c0)) {
                        return new Pair((Object)"", (Object)Boolean.FALSE);
                    }
                    long l8 = this.b().b();
                    if (this.j != null && l8 < this.l) {
                        return new Pair((Object)this.j, (Object)this.k);
                    }
                    this.l = l8 + this.d().B((String)object);
                    ax.C5.a.b(true);
                    try {
                        object = ax.C5.a.a(this.a());
                        this.j = "";
                        String string = ((a.a)object).a();
                        if (string == null) break block4;
                        this.j = string;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                this.k = ((a.a)object).b();
                break block6;
            }
            this.k().F().b("Unable to get advertising id", exception2);
            this.j = "";
        }
        ax.C5.a.b(false);
        return new Pair((Object)this.j, (Object)this.k);
    }

    final void v(SparseArray<Long> bundle) {
        if (bundle == null) {
            this.p.b(null);
            return;
        }
        int[] nArray = new int[bundle.size()];
        long[] lArray = new long[bundle.size()];
        for (int i8 = 0; i8 < bundle.size(); ++i8) {
            nArray[i8] = bundle.keyAt(i8);
            lArray[i8] = (Long)bundle.valueAt(i8);
        }
        bundle = new Bundle();
        bundle.putIntArray("uriSources", nArray);
        bundle.putLongArray("uriTimestamps", lArray);
        this.p.b(bundle);
    }

    final void w(Boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.J().edit();
        if (bl != null) {
            editor.putBoolean("measurement_enabled", bl.booleanValue());
        } else {
            editor.remove("measurement_enabled");
        }
        editor.apply();
    }

    final void x(boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.J().edit();
        editor.putBoolean("use_service", bl);
        editor.apply();
    }

    final boolean y(int n8) {
        return h3.l(n8, this.J().getInt("consent_source", 100));
    }

    final boolean z(long l8) {
        return l8 - this.m.a() > this.r.a();
    }
}

