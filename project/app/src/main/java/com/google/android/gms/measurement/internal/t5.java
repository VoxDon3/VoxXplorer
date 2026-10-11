/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.D5;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.w5;

final class t5
implements D5 {
    final q5 a;

    t5(q5 q52) {
        this.a = q52;
    }

    @Override
    public final void b(String string, String string2, Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            if (q5.i(this.a) != null) {
                q5.i(this.a).k().G().b("AppId not known when logging event", string2);
            }
            return;
        }
        this.a.l().D(new w5(this, string, string2, bundle));
    }
}

