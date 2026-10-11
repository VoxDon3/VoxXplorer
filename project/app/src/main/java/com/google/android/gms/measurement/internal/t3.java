/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.internal.k3;

public final class t3
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private k3 a;

    public /* synthetic */ t3(k3 k32) {
        this.a = k32;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        this.a.K(sharedPreferences, string);
    }
}

