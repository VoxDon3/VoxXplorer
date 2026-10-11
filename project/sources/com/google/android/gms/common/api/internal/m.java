package com.google.android.gms.common.api.internal;

import ax.K5.a;

/* loaded from: classes3.dex */
final class m implements Runnable {
    final /* synthetic */ n q;

    m(n nVar) {
        this.q = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        o oVar = this.q.a;
        fVar = oVar.f;
        fVar2 = oVar.f;
        fVar.e(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
