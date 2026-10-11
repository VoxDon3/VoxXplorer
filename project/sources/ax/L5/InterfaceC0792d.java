package ax.L5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ax.L5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0792d extends IInterface {

    /* renamed from: ax.L5.d$a */
    public static abstract class a extends ax.Y5.b implements InterfaceC0792d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // ax.Y5.b
        protected final boolean a2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) ax.Y5.c.a(parcel, Status.CREATOR);
            ax.Y5.c.b(parcel);
            o0(status);
            return true;
        }
    }

    void o0(Status status) throws RemoteException;
}
