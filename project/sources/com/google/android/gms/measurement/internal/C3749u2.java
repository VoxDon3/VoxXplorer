package com.google.android.gms.measurement.internal;

import ax.b6.D7;
import ax.b6.G7;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3749u2 implements G7 {
    private final /* synthetic */ C3726q2 a;

    C3749u2(C3726q2 c3726q2) {
        this.a = c3726q2;
    }

    @Override // ax.b6.G7
    public final void a(D7 d7, String str, List<String> list, boolean z, boolean z2) {
        int i = C3767x2.a[d7.ordinal()];
        X1 J = i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.a.k().J() : this.a.k().K() : z ? this.a.k().N() : !z2 ? this.a.k().M() : this.a.k().L() : z ? this.a.k().I() : !z2 ? this.a.k().H() : this.a.k().G() : this.a.k().F();
        int size = list.size();
        if (size == 1) {
            J.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            J.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            J.a(str);
        } else {
            J.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
