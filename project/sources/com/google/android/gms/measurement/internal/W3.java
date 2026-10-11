package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes3.dex */
final class W3 implements Runnable {
    private final /* synthetic */ Uri c0;
    private final /* synthetic */ String d0;
    private final /* synthetic */ String e0;
    private final /* synthetic */ X3 f0;
    private final /* synthetic */ boolean q;

    W3(X3 x3, boolean z, Uri uri, String str, String str2) {
        this.q = z;
        this.c0 = uri;
        this.d0 = str;
        this.e0 = str2;
        this.f0 = x3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X3.a(this.f0, this.q, this.c0, this.d0, this.e0);
    }
}
