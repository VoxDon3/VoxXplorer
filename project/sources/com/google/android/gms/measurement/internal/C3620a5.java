package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3620a5 {
    private long a;
    protected long b;
    private final AbstractC3734s c;
    final /* synthetic */ V4 d;

    public C3620a5(V4 v4) {
        this.d = v4;
        this.c = new C3641d5(this, v4.a);
        long b = v4.b().b();
        this.a = b;
        this.b = b;
    }

    static /* synthetic */ void c(C3620a5 c3620a5) {
        c3620a5.d.n();
        c3620a5.d(false, false, c3620a5.d.b().b());
        c3620a5.d.o().v(c3620a5.d.b().b());
    }

    final long a(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }

    final void b() {
        this.c.a();
        if (this.d.d().t(F.Z0)) {
            this.a = this.d.b().b();
        } else {
            this.a = 0L;
        }
        this.b = this.a;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.n();
        this.d.v();
        if (this.d.a.p()) {
            this.d.h().r.b(this.d.b().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.k().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = a(j);
        }
        this.d.k().K().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        B5.X(this.d.s().C(!this.d.d().T()), bundle, true);
        if (!z2) {
            this.d.r().Y0("auto", "_e", bundle);
        }
        this.a = j;
        this.c.a();
        this.c.b(F.b0.a(null).longValue());
        return true;
    }

    final void e(long j) {
        this.c.a();
    }

    final void f(long j) {
        this.d.n();
        this.c.a();
        this.a = j;
        this.b = j;
    }
}
