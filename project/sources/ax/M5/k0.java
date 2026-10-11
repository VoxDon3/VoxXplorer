package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    rVar = (r) ax.N5.b.c(parcel, n, r.CREATOR);
                    break;
                case 2:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 3:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 4:
                    iArr = ax.N5.b.b(parcel, n);
                    break;
                case 5:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 6:
                    iArr2 = ax.N5.b.b(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0810e(rVar, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0810e[i];
    }
}
