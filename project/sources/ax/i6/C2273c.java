package ax.i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.i6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2273c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Intent intent = null;
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
                intent = (Intent) ax.N5.b.c(parcel, n, Intent.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C2272b(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2272b[i];
    }
}
