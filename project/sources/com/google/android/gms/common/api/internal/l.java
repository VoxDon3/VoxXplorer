package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class l implements Runnable {
    final /* synthetic */ o c0;
    final /* synthetic */ int q;

    l(o oVar, int i) {
        this.c0 = oVar;
        this.q = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.i(this.q);
    }
}
