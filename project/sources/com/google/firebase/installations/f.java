package com.google.firebase.installations;

import ax.j6.C2328k;

/* loaded from: classes3.dex */
class f implements h {
    final C2328k<String> a;

    public f(C2328k<String> c2328k) {
        this.a = c2328k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(ax.d8.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
