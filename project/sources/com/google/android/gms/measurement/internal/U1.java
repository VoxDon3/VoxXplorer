package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class U1 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ Object d0;
    private final /* synthetic */ Object e0;
    private final /* synthetic */ Object f0;
    private final /* synthetic */ V1 g0;
    private final /* synthetic */ int q;

    U1(V1 v1, int i, String str, Object obj, Object obj2, Object obj3) {
        this.q = i;
        this.c0 = str;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
        this.g0 = v1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        C3659g2 F = this.g0.a.F();
        if (!F.s()) {
            this.g0.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.g0.c;
        if (c == 0) {
            if (this.g0.d().W()) {
                this.g0.c = 'C';
            } else {
                this.g0.c = 'c';
            }
        }
        j = this.g0.d;
        if (j < 0) {
            this.g0.d = 97001L;
        }
        char charAt = "01VDIWEA?".charAt(this.q);
        c2 = this.g0.c;
        j2 = this.g0.d;
        String str = "2" + charAt + c2 + j2 + ":" + V1.x(true, this.c0, this.d0, this.e0, this.f0);
        if (str.length() > 1024) {
            str = this.c0.substring(0, 1024);
        }
        C3687k2 c3687k2 = F.f;
        if (c3687k2 != null) {
            c3687k2.b(str, 1L);
        }
    }
}
