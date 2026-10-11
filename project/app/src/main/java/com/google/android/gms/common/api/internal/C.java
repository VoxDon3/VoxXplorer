/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import ax.L5.s;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.E;

final class C
extends s {
    final Dialog a;
    final D b;

    C(D d8, Dialog dialog) {
        this.b = d8;
        this.a = dialog;
    }

    @Override
    public final void a() {
        E.r(this.b.c0);
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}

