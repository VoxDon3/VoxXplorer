package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        long j = -1;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                str = ax.N5.b.d(parcel, n);
            } else if (i2 == 2) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 != 3) {
                ax.N5.b.t(parcel, n);
            } else {
                j = ax.N5.b.q(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0744e(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0744e[i];
    }
}
