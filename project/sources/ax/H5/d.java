package ax.H5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i3 = ax.N5.b.i(n);
            if (i3 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i3 == 2) {
                i2 = ax.N5.b.p(parcel, n);
            } else if (i3 != 3) {
                ax.N5.b.t(parcel, n);
            } else {
                bundle = ax.N5.b.a(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new a(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
