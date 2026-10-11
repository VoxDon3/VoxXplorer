package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 2:
                    i2 = ax.N5.b.p(parcel, n);
                    break;
                case 3:
                    i3 = ax.N5.b.p(parcel, n);
                    break;
                case 4:
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 5:
                    j2 = ax.N5.b.q(parcel, n);
                    break;
                case 6:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 7:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 8:
                    i4 = ax.N5.b.p(parcel, n);
                    break;
                case 9:
                    i5 = ax.N5.b.p(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0818m(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0818m[i];
    }
}
