package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i4 = ax.N5.b.i(n);
            if (i4 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i4 == 2) {
                z = ax.N5.b.j(parcel, n);
            } else if (i4 == 3) {
                z2 = ax.N5.b.j(parcel, n);
            } else if (i4 == 4) {
                i2 = ax.N5.b.p(parcel, n);
            } else if (i4 != 5) {
                ax.N5.b.t(parcel, n);
            } else {
                i3 = ax.N5.b.p(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new r(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new r[i];
    }
}
