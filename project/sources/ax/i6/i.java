package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i = ax.N5.b.i(n);
            if (i == 1) {
                arrayList = ax.N5.b.e(parcel, n);
            } else if (i != 2) {
                ax.N5.b.t(parcel, n);
            } else {
                str = ax.N5.b.d(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}
