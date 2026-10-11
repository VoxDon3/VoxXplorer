/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import ax.J5.c;
import ax.L5.f;
import ax.L5.s;
import ax.M5.p;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class D
implements Runnable {
    final E c0;
    private final B q;

    D(E e8, B b8) {
        this.c0 = e8;
        this.q = b8;
    }

    @Override
    public final void run() {
        int n8;
        if (!this.c0.b) {
            return;
        }
        Object object = this.q.b();
        if (((c)object).B()) {
            E e8 = this.c0;
            e8.a.startActivityForResult(GoogleApiActivity.a((Context)e8.b(), p.l(((c)object).z()), this.q.a(), false), 1);
            return;
        }
        Object object2 = this.c0;
        Object object3 = ((LifecycleCallback)object2).b();
        if (((E)object2).e.b((Context)object3, n8 = ((c)object).k(), null) != null) {
            E e9 = this.c0;
            object2 = e9.b();
            object3 = e9.a;
            n8 = ((c)object).k();
            object = this.c0;
            e9.e.x((Activity)object2, (f)object3, n8, 2, (DialogInterface.OnCancelListener)object);
            return;
        }
        if (((c)object).k() == 18) {
            object = this.c0;
            object2 = ((E)object).e.s(((LifecycleCallback)object).b(), (DialogInterface.OnCancelListener)object);
            object3 = this.c0;
            object = ((LifecycleCallback)object3).b().getApplicationContext();
            object2 = new C(this, (Dialog)object2);
            ((E)object3).e.t((Context)object, (s)object2);
            return;
        }
        E.q(this.c0, (c)object, this.q.a());
    }
}

