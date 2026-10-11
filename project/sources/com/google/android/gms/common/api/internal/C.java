package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes3.dex */
final class C extends ax.L5.s {
    final /* synthetic */ Dialog a;
    final /* synthetic */ D b;

    C(D d, Dialog dialog) {
        this.b = d;
        this.a = dialog;
    }

    @Override // ax.L5.s
    public final void a() {
        this.b.c0.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
