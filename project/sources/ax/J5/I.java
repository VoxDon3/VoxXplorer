package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i3 = ax.N5.b.i(n);
            if (i3 == 1) {
                z = ax.N5.b.j(parcel, n);
            } else if (i3 == 2) {
                str = ax.N5.b.d(parcel, n);
            } else if (i3 == 3) {
                i = ax.N5.b.p(parcel, n);
            } else if (i3 != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                i2 = ax.N5.b.p(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new H(z, str, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new H[i];
    }
}
