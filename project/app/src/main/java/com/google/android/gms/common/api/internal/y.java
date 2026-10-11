/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import ax.J5.e;
import ax.L5.l;
import ax.L5.u;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;

public final class y
extends u {
    private final d b;
    private final k c;
    private final l d;

    public y(int n8, d d8, k k8, l l8) {
        super(n8);
        this.c = k8;
        this.b = d8;
        this.d = l8;
        if (n8 == 2 && d8.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void a(Status status) {
        l l8 = this.d;
        this.c.d(l8.a(status));
    }

    @Override
    public final void b(Exception exception) {
        this.c.d(exception);
    }

    @Override
    public final void c(o o8) throws DeadObjectException {
        DeadObjectException deadObjectException2;
        block5: {
            RemoteException remoteException2;
            block4: {
                try {
                    this.b.b(o8.u(), this.c);
                    return;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (RemoteException remoteException2) {
                    break block4;
                }
                catch (DeadObjectException deadObjectException2) {
                    break block5;
                }
                this.c.d(runtimeException);
                return;
            }
            this.a(A.e(remoteException2));
            return;
        }
        throw deadObjectException2;
    }

    @Override
    public final void d(g g8, boolean bl) {
        g8.d(this.c, bl);
    }

    @Override
    public final boolean f(o o8) {
        return this.b.c();
    }

    @Override
    public final e[] g(o o8) {
        return this.b.e();
    }
}

