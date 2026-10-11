package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3648e5 {
    private final ax.R5.e a;
    private long b;

    public C3648e5(ax.R5.e eVar) {
        C0821p.l(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }

    public final void c() {
        this.b = this.a.b();
    }
}
