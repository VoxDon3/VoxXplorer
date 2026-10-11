package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import ax.b6.C1503C;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3755v2 extends ax.B.j<String, C1503C> {
    private final /* synthetic */ C3726q2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3755v2(C3726q2 c3726q2, int i) {
        super(20);
        this.j = c3726q2;
    }

    @Override // ax.B.j
    protected final /* synthetic */ C1503C a(String str) {
        String str2 = str;
        C0821p.f(str2);
        return C3726q2.z(this.j, str2);
    }
}
