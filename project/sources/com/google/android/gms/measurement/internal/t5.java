package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class t5 implements D5 {
    final /* synthetic */ q5 a;

    t5(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // com.google.android.gms.measurement.internal.D5
    public final void b(String str, String str2, Bundle bundle) {
        E2 e2;
        E2 e22;
        if (!TextUtils.isEmpty(str)) {
            this.a.l().D(new w5(this, str, str2, bundle));
            return;
        }
        e2 = this.a.l;
        if (e2 != null) {
            e22 = this.a.l;
            e22.k().G().b("AppId not known when logging event", str2);
        }
    }
}
