package com.google.android.gms.common.api.internal;

import ax.J5.C0744e;
import ax.L5.C0790b;
import ax.M5.C0819n;

/* loaded from: classes3.dex */
final class p {
    private final C0790b a;
    private final C0744e b;

    /* synthetic */ p(C0790b c0790b, C0744e c0744e, ax.L5.q qVar) {
        this.a = c0790b;
        this.b = c0744e;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (C0819n.b(this.a, pVar.a) && C0819n.b(this.b, pVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0819n.c(this.a, this.b);
    }

    public final String toString() {
        return C0819n.d(this).a("key", this.a).a("feature", this.b).toString();
    }
}
