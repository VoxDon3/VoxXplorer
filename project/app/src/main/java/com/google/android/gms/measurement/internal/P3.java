/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.D5;
import com.google.android.gms.measurement.internal.k3;

final class P3
implements D5 {
    private final k3 a;

    P3(k3 k32) {
        this.a = k32;
    }

    @Override
    public final void b(String string, String string2, Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.a.h0("auto", string2, bundle, string);
            return;
        }
        this.a.R0("auto", string2, bundle);
    }
}

