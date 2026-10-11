package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.K5.a;
import ax.K5.a.b;
import ax.K5.l;
import ax.M5.C0821p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3608b<R extends ax.K5.l, A extends a.b> extends BasePendingResult<R> {
    private final a.c<A> o;
    private final ax.K5.a<?> p;

    protected AbstractC3608b(ax.K5.a<?> aVar, ax.K5.g gVar) {
        super((ax.K5.g) C0821p.m(gVar, "GoogleApiClient must not be null"));
        C0821p.m(aVar, "Api must not be null");
        this.o = aVar.b();
        this.p = aVar;
    }

    private void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void l(A a) throws RemoteException;

    public final void n(A a) throws DeadObjectException {
        try {
            l(a);
        } catch (DeadObjectException e) {
            o(e);
            throw e;
        } catch (RemoteException e2) {
            o(e2);
        }
    }

    public final void p(Status status) {
        C0821p.b(!status.C(), "Failed result must not be success");
        R c = c(status);
        f(c);
        m(c);
    }

    protected void m(R r) {
    }
}
