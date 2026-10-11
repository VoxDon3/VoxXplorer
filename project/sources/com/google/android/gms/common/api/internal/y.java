package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.J5.C0744e;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class y extends ax.L5.u {
    private final AbstractC3610d b;
    private final C2328k c;
    private final ax.L5.l d;

    public y(int i, AbstractC3610d abstractC3610d, C2328k c2328k, ax.L5.l lVar) {
        super(i);
        this.c = c2328k;
        this.b = abstractC3610d;
        this.d = lVar;
        if (i == 2 && abstractC3610d.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void c(o oVar) throws DeadObjectException {
        try {
            this.b.b(oVar.u(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(A.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void d(C3613g c3613g, boolean z) {
        c3613g.d(this.c, z);
    }

    @Override // ax.L5.u
    public final boolean f(o oVar) {
        return this.b.c();
    }

    @Override // ax.L5.u
    public final C0744e[] g(o oVar) {
        return this.b.e();
    }
}
