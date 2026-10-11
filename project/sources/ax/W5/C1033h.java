package ax.W5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.W5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1033h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 != 2) {
                ax.N5.b.t(parcel, n);
            } else {
                str = ax.N5.b.d(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C1030g(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1030g[i];
    }
}
