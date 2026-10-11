package com.google.firebase.installations;

import ax.j6.C2328k;

/* loaded from: classes3.dex */
class e implements h {
    private final i a;
    private final C2328k<g> b;

    public e(i iVar, C2328k<g> c2328k) {
        this.a = iVar;
        this.b = c2328k;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(ax.d8.d dVar) {
        if (!dVar.k() || this.a.f(dVar)) {
            return false;
        }
        this.b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.b.d(exc);
        return true;
    }
}
