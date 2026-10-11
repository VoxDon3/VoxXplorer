/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.f3;

final class c5 {
    final V4 a;

    c5(V4 v42) {
        this.a = v42;
    }

    private final void c(long l8, boolean bl) {
        ((f3)this.a).n();
        if (this.a.a.p()) {
            ((f3)this.a).h().r.b(l8);
            long l9 = ((f3)this.a).b().b();
            ((f3)this.a).k().K().b("Session started, time", l9);
            l9 = l8 / 1000L;
            ((C1)this.a).r().j0("auto", "_sid", l9, l8);
            ((f3)this.a).h().s.b(l9);
            ((f3)this.a).h().n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", l9);
            ((C1)this.a).r().d0("auto", "_s", l8, bundle);
            String string = ((f3)this.a).h().x.a();
            if (!TextUtils.isEmpty((CharSequence)string)) {
                bundle = new Bundle();
                bundle.putString("_ffr", string);
                ((C1)this.a).r().d0("auto", "_ssr", l8, bundle);
            }
        }
    }

    final void a() {
        ((f3)this.a).n();
        if (((f3)this.a).h().z(((f3)this.a).b().a())) {
            ((f3)this.a).h().n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ((f3)this.a).k().K().a("Detected application was in foreground");
                this.c(((f3)this.a).b().a(), false);
            }
        }
    }

    final void b(long l8, boolean bl) {
        ((f3)this.a).n();
        V4.H(this.a);
        if (((f3)this.a).h().z(l8)) {
            ((f3)this.a).h().n.a(true);
            ((C1)this.a).p().I();
        }
        ((f3)this.a).h().r.b(l8);
        if (((f3)this.a).h().n.b()) {
            this.c(l8, bl);
        }
    }
}

