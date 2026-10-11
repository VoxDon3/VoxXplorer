/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.K5.b;
import ax.L5.u;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.o;

abstract class v
extends u {
    protected final k b;

    public v(int n8, k k8) {
        super(n8);
        this.b = k8;
    }

    @Override
    public final void a(Status object) {
        object = new b((Status)object);
        this.b.d((Exception)object);
    }

    @Override
    public final void b(Exception exception) {
        this.b.d(exception);
    }

    @Override
    public final void c(o o8) throws DeadObjectException {
        try {
            this.h(o8);
            return;
        }
        catch (RuntimeException runtimeException) {
            this.b.d(runtimeException);
            return;
        }
        catch (RemoteException remoteException) {
            this.a(A.e(remoteException));
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.a(A.e((RemoteException)((Object)deadObjectException)));
            throw deadObjectException;
        }
    }

    protected abstract void h(o var1) throws RemoteException;
}

