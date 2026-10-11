package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import ax.J5.C0744e;
import ax.L5.C0795g;
import ax.j6.C2328k;

/* loaded from: classes3.dex */
public final class z extends v {
    public final C0795g c;

    public z(C0795g c0795g, C2328k c2328k) {
        super(4, c2328k);
        this.c = c0795g;
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final /* bridge */ /* synthetic */ void d(C3613g c3613g, boolean z) {
    }

    @Override // ax.L5.u
    public final boolean f(o oVar) {
        if (((ax.L5.y) oVar.x().get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // ax.L5.u
    public final C0744e[] g(o oVar) {
        if (((ax.L5.y) oVar.x().get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void h(o oVar) throws RemoteException {
        if (((ax.L5.y) oVar.x().remove(this.c)) == null) {
            this.b.e(Boolean.FALSE);
        } else {
            oVar.u();
            throw null;
        }
    }
}
