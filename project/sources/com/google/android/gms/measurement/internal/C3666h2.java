package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import ax.f6.EnumC2067o;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3666h2 {
    private final EnumC2067o a;

    C3666h2(EnumC2067o enumC2067o) {
        this.a = enumC2067o;
    }

    static C3666h2 b(String str) {
        return new C3666h2((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC2067o.UNINITIALIZED : C3667h3.c(str.charAt(0)));
    }

    final EnumC2067o a() {
        return this.a;
    }

    final String c() {
        return String.valueOf(C3667h3.a(this.a));
    }
}
