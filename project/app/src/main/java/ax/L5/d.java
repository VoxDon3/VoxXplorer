/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.Y5.b;
import ax.Y5.c;
import com.google.android.gms.common.api.Status;

public interface d
extends IInterface {
    public void o0(Status var1) throws RemoteException;

    public static abstract class a
    extends b
    implements d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override
        protected final boolean a2(int n8, Parcel parcel, Parcel object, int n9) throws RemoteException {
            if (n8 == 1) {
                object = (Status)c.a(parcel, Status.CREATOR);
                c.b(parcel);
                this.o0((Status)object);
                return true;
            }
            return false;
        }
    }
}

