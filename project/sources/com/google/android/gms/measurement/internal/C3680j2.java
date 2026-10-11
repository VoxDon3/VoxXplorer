package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3680j2 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ C3659g2 e;

    public C3680j2(C3659g2 c3659g2, String str, boolean z) {
        this.e = c3659g2;
        C0821p.f(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.J().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.J().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
