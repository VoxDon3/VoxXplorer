package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import ax.M5.C0821p;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class x extends A {
    protected final AbstractC3608b b;

    public x(int i, AbstractC3608b abstractC3608b) {
        super(i);
        this.b = (AbstractC3608b) C0821p.m(abstractC3608b, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void a(Status status) {
        try {
            this.b.p(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(Exception exc) {
        try {
            this.b.p(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void c(o oVar) throws DeadObjectException {
        try {
            this.b.n(oVar.u());
        } catch (RuntimeException e) {
            b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void d(C3613g c3613g, boolean z) {
        c3613g.c(this.b, z);
    }
}
