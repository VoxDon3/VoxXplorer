package ax.J5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 2:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 3:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 4:
                    iBinder = ax.N5.b.o(parcel, n);
                    break;
                case 5:
                    z3 = ax.N5.b.j(parcel, n);
                    break;
                case 6:
                    z4 = ax.N5.b.j(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new F(str, z, z2, iBinder, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new F[i];
    }
}
