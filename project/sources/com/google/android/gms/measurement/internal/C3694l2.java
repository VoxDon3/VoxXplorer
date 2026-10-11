package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3694l2 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ C3659g2 e;

    public C3694l2(C3659g2 c3659g2, String str, long j) {
        this.e = c3659g2;
        C0821p.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.J().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.J().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
