package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3701m2 {
    private final String a;
    private boolean b;
    private String c;
    private final /* synthetic */ C3659g2 d;

    public C3701m2(C3659g2 c3659g2, String str, String str2) {
        this.d = c3659g2;
        C0821p.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.J().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.J().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
