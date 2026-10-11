/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.RemoteException;
import ax.H5.e;
import ax.H5.k;
import com.google.android.gms.common.api.Status;

final class j
extends e {
    final k e;

    j(k k8) {
        this.e = k8;
    }

    @Override
    public final void e1(Status status) throws RemoteException {
        this.e.f(status);
    }
}

