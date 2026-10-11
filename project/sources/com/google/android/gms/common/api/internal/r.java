package com.google.android.gms.common.api.internal;

import android.util.Log;
import ax.J5.C0742c;
import ax.K5.a;
import ax.L5.C0790b;
import ax.M5.AbstractC0808c;
import ax.M5.InterfaceC0815j;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class r implements AbstractC0808c.InterfaceC0151c, ax.L5.B {
    private final a.f a;
    private final C0790b b;
    private InterfaceC0815j c = null;
    private Set d = null;
    private boolean e = false;
    final /* synthetic */ C3609c f;

    public r(C3609c c3609c, a.f fVar, C0790b c0790b) {
        this.f = c3609c;
        this.a = fVar;
        this.b = c0790b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC0815j interfaceC0815j;
        if (!this.e || (interfaceC0815j = this.c) == null) {
            return;
        }
        this.a.c(interfaceC0815j, this.d);
    }

    @Override // ax.L5.B
    public final void a(C0742c c0742c) {
        Map map;
        map = this.f.k0;
        o oVar = (o) map.get(this.b);
        if (oVar != null) {
            oVar.J(c0742c);
        }
    }

    @Override // ax.L5.B
    public final void b(InterfaceC0815j interfaceC0815j, Set set) {
        if (interfaceC0815j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C0742c(4));
        } else {
            this.c = interfaceC0815j;
            this.d = set;
            i();
        }
    }

    @Override // ax.M5.AbstractC0808c.InterfaceC0151c
    public final void c(C0742c c0742c) {
        this.f.o0.post(new q(this, c0742c));
    }

    @Override // ax.L5.B
    public final void d(int i) {
        Map map;
        boolean z;
        map = this.f.k0;
        o oVar = (o) map.get(this.b);
        if (oVar != null) {
            z = oVar.m;
            if (z) {
                oVar.J(new C0742c(17));
            } else {
                oVar.w(i);
            }
        }
    }
}
