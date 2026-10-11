package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class P3 implements D5 {
    private final /* synthetic */ C3688k3 a;

    P3(C3688k3 c3688k3) {
        this.a = c3688k3;
    }

    @Override // com.google.android.gms.measurement.internal.D5
    public final void b(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.R0("auto", str2, bundle);
        } else {
            this.a.h0("auto", str2, bundle, str);
        }
    }
}
