package com.google.android.gms.common.api.internal;

import android.util.Log;
import ax.J5.C0742c;
import ax.K5.a;
import ax.L5.C0790b;
import java.util.Map;

/* loaded from: classes3.dex */
final class q implements Runnable {
    final /* synthetic */ r c0;
    final /* synthetic */ C0742c q;

    q(r rVar, C0742c c0742c) {
        this.c0 = rVar;
        this.q = c0742c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C0790b c0790b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        r rVar = this.c0;
        map = rVar.f.k0;
        c0790b = rVar.b;
        o oVar = (o) map.get(c0790b);
        if (oVar == null) {
            return;
        }
        if (!this.q.C()) {
            oVar.I(this.q, null);
            return;
        }
        this.c0.e = true;
        fVar = this.c0.a;
        if (fVar.o()) {
            this.c0.i();
            return;
        }
        try {
            r rVar2 = this.c0;
            fVar3 = rVar2.a;
            fVar4 = rVar2.a;
            fVar3.c(null, fVar4.d());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            fVar2 = this.c0.a;
            fVar2.e("Failed to get service from broker.");
            oVar.I(new C0742c(10), null);
        }
    }
}
