package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
abstract class v extends ax.L5.u {
    protected final C2328k b;

    public v(int i, C2328k c2328k) {
        super(i);
        this.b = c2328k;
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void a(Status status) {
        this.b.d(new ax.K5.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void c(o oVar) throws DeadObjectException {
        try {
            h(oVar);
        } catch (DeadObjectException e) {
            a(A.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(A.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    protected abstract void h(o oVar) throws RemoteException;
}
