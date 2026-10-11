package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class T0 implements Parcelable.Creator<U0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ U0 createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 2:
                    j2 = ax.N5.b.q(parcel, n);
                    break;
                case 3:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 4:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 5:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 6:
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                case 7:
                    bundle = ax.N5.b.a(parcel, n);
                    break;
                case 8:
                    str4 = ax.N5.b.d(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new U0(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ U0[] newArray(int i) {
        return new U0[i];
    }
}
