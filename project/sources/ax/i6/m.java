package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;
import ax.M5.P;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        C0742c c0742c = null;
        P p = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 == 2) {
                c0742c = (C0742c) ax.N5.b.c(parcel, n, C0742c.CREATOR);
            } else if (i2 != 3) {
                ax.N5.b.t(parcel, n);
            } else {
                p = (P) ax.N5.b.c(parcel, n, P.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new l(i, c0742c, p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
