package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.N;

/* loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        N n = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n2 = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n2);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n2);
            } else if (i2 != 2) {
                ax.N5.b.t(parcel, n2);
            } else {
                n = (N) ax.N5.b.c(parcel, n2, N.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new j(i, n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new j[i];
    }
}
