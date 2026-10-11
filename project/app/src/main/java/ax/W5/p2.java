/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ax.W5.c;
import ax.W5.j;
import ax.W5.q2;
import com.google.android.gms.common.api.Status;

public abstract class p2
extends c
implements q2 {
    public p2() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override
    protected final boolean r(int n8, Parcel parcel, Parcel object, int n9) throws RemoteException {
        if (n8 == 2) {
            object = (Status)j.a(parcel, Status.CREATOR);
            Bundle bundle = (Bundle)j.a(parcel, Bundle.CREATOR);
            j.b(parcel);
            this.C1((Status)object, bundle);
            return true;
        }
        return false;
    }
}

