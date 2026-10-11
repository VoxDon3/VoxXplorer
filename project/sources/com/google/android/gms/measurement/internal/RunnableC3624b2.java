package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3624b2 implements Runnable {
    private final int c0;
    private final Throwable d0;
    private final byte[] e0;
    private final String f0;
    private final Map<String, List<String>> g0;
    private final InterfaceC3631c2 q;

    @Override // java.lang.Runnable
    public final void run() {
        this.q.a(this.f0, this.c0, this.d0, this.e0, this.g0);
    }

    private RunnableC3624b2(String str, InterfaceC3631c2 interfaceC3631c2, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C0821p.l(interfaceC3631c2);
        this.q = interfaceC3631c2;
        this.c0 = i;
        this.d0 = th;
        this.e0 = bArr;
        this.f0 = str;
        this.g0 = map;
    }
}
