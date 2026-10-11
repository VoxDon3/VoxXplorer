/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.K5.a;
import ax.K5.g;
import ax.K5.l;
import ax.M5.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public abstract class b<R extends l, A extends a.b>
extends BasePendingResult<R> {
    private final a.c<A> o;
    private final a<?> p;

    protected b(a<?> a8, g g8) {
        super(ax.M5.p.m(g8, "GoogleApiClient must not be null"));
        ax.M5.p.m(a8, "Api must not be null");
        this.o = a8.b();
        this.p = a8;
    }

    private void o(RemoteException remoteException) {
        this.p(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void l(A var1) throws RemoteException;

    protected void m(R r8) {
    }

    public final void n(A a8) throws DeadObjectException {
        try {
            this.l(a8);
            return;
        }
        catch (RemoteException remoteException) {
            this.o(remoteException);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.o((RemoteException)((Object)deadObjectException));
            throw deadObjectException;
        }
    }

    public final void p(Status status) {
        ax.M5.p.b(status.C() ^ true, "Failed result must not be success");
        status = this.c(status);
        this.f(status);
        this.m(status);
    }
}

