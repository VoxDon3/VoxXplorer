package ax.J5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i3 = ax.N5.b.i(n);
            if (i3 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i3 == 2) {
                i2 = ax.N5.b.p(parcel, n);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) ax.N5.b.c(parcel, n, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                str = ax.N5.b.d(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0742c(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0742c[i];
    }
}
