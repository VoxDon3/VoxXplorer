package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class L3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ ax.b6.M0 q;

    L3(C3688k3 c3688k3, ax.b6.M0 m0) {
        this.q = m0;
        this.c0 = c3688k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.k3 r0 = r7.c0
            com.google.android.gms.measurement.internal.V4 r0 = r0.u()
            com.google.android.gms.measurement.internal.g2 r1 = r0.h()
            com.google.android.gms.measurement.internal.h3 r1 = r1.M()
            boolean r1 = r1.B()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.V1 r0 = r0.k()
            com.google.android.gms.measurement.internal.X1 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.g2 r1 = r0.h()
            ax.R5.e r3 = r0.b()
            long r3 = r3.a()
            boolean r1 = r1.z(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.g2 r1 = r0.h()
            com.google.android.gms.measurement.internal.l2 r1 = r1.s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.g2 r0 = r0.h()
            com.google.android.gms.measurement.internal.l2 r0 = r0.s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.k3 r1 = r7.c0
            com.google.android.gms.measurement.internal.E2 r1 = r1.a
            com.google.android.gms.measurement.internal.B5 r1 = r1.L()
            ax.b6.M0 r2 = r7.q
            long r3 = r0.longValue()
            r1.Q(r2, r3)
            return
        L69:
            ax.b6.M0 r0 = r7.q     // Catch: android.os.RemoteException -> L6f
            r0.n(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.k3 r1 = r7.c0
            com.google.android.gms.measurement.internal.E2 r1 = r1.a
            com.google.android.gms.measurement.internal.V1 r1 = r1.k()
            com.google.android.gms.measurement.internal.X1 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.L3.run():void");
    }
}
