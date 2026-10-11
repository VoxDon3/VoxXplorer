package ax.J5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i = ax.N5.b.i(n);
            if (i == 1) {
                str = ax.N5.b.d(parcel, n);
            } else if (i == 2) {
                iBinder = ax.N5.b.o(parcel, n);
            } else if (i == 3) {
                z = ax.N5.b.j(parcel, n);
            } else if (i != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                z2 = ax.N5.b.j(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new J(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new J[i];
    }
}
