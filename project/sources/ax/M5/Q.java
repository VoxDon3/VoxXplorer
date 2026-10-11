package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;

/* loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        IBinder iBinder = null;
        C0742c c0742c = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 == 2) {
                iBinder = ax.N5.b.o(parcel, n);
            } else if (i2 == 3) {
                c0742c = (C0742c) ax.N5.b.c(parcel, n, C0742c.CREATOR);
            } else if (i2 == 4) {
                z = ax.N5.b.j(parcel, n);
            } else if (i2 != 5) {
                ax.N5.b.t(parcel, n);
            } else {
                z2 = ax.N5.b.j(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new P(i, iBinder, c0742c, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new P[i];
    }
}
