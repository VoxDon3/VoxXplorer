package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import ax.J5.C0742c;
import ax.M5.C0821p;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes3.dex */
final class D implements Runnable {
    final /* synthetic */ E c0;
    private final B q;

    D(E e, B b) {
        this.c0 = e;
        this.q = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c0.b) {
            C0742c b = this.q.b();
            if (b.B()) {
                E e = this.c0;
                e.a.startActivityForResult(GoogleApiActivity.a(e.b(), (PendingIntent) C0821p.l(b.z()), this.q.a(), false), 1);
                return;
            }
            E e2 = this.c0;
            if (e2.e.b(e2.b(), b.k(), null) != null) {
                E e3 = this.c0;
                e3.e.x(e3.b(), e3.a, b.k(), 2, this.c0);
                return;
            }
            if (b.k() != 18) {
                this.c0.l(b, this.q.a());
                return;
            }
            E e4 = this.c0;
            Dialog s = e4.e.s(e4.b(), e4);
            E e5 = this.c0;
            e5.e.t(e5.b().getApplicationContext(), new C(this, s));
        }
    }
}
