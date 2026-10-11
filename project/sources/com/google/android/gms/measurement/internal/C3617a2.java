package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3617a2 {
    public String a;
    private String b;
    private long c;
    public Bundle d;

    private C3617a2(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.c = j;
    }

    public static C3617a2 b(D d) {
        return new C3617a2(d.q, d.d0, d.c0.B(), d.e0);
    }

    public final D a() {
        return new D(this.a, new C(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + String.valueOf(this.d);
    }
}
