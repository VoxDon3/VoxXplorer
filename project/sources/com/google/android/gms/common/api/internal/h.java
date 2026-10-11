package com.google.android.gms.common.api.internal;

import android.app.Activity;
import ax.J5.C0742c;
import ax.J5.C0747h;
import ax.L5.C0790b;
import ax.L5.InterfaceC0794f;
import ax.M5.C0821p;

/* loaded from: classes3.dex */
public final class h extends E {
    private final ax.B.b f;
    private final C3609c g;

    h(InterfaceC0794f interfaceC0794f, C3609c c3609c, C0747h c0747h) {
        super(interfaceC0794f, c0747h);
        this.f = new ax.B.b();
        this.g = c3609c;
        this.a.m("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C3609c c3609c, C0790b c0790b) {
        InterfaceC0794f c = LifecycleCallback.c(activity);
        h hVar = (h) c.y("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(c, c3609c, C0747h.o());
        }
        C0821p.m(c0790b, "ApiKey cannot be null");
        hVar.f.add(c0790b);
        c3609c.b(hVar);
    }

    private final void v() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.E, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.E, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.E
    protected final void m(C0742c c0742c, int i) {
        this.g.D(c0742c, i);
    }

    @Override // com.google.android.gms.common.api.internal.E
    protected final void n() {
        this.g.E();
    }

    final ax.B.b t() {
        return this.f;
    }
}
