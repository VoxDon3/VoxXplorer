package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import ax.M5.C0821p;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3687k2 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ C3659g2 e;

    private final long c() {
        return this.e.J().getLong(this.a, 0L);
    }

    private final void d() {
        this.e.n();
        long a = this.e.b().a();
        SharedPreferences.Editor edit = this.e.J().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long abs;
        this.e.n();
        this.e.n();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.b().a());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            d();
            return null;
        }
        String string = this.e.J().getString(this.c, null);
        long j2 = this.e.J().getLong(this.b, 0L);
        d();
        return (string == null || j2 <= 0) ? C3659g2.B : new Pair<>(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j2 = this.e.J().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.J().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.i().W0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.J().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    private C3687k2(C3659g2 c3659g2, String str, long j) {
        this.e = c3659g2;
        C0821p.f(str);
        C0821p.a(j > 0);
        this.a = str + ":start";
        this.b = str + ":count";
        this.c = str + ":value";
        this.d = j;
    }
}
