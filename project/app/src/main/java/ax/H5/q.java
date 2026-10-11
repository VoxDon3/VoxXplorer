/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.Parcel;
import android.os.RemoteException;
import ax.H5.r;
import ax.X5.c;

public abstract class q
extends c
implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel parcel2, int n9) throws RemoteException {
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            this.L();
        } else {
            this.i0();
        }
        return true;
    }
}

