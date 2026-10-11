package ax.f6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.f6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2055c implements Parcelable.Creator<com.google.android.gms.measurement.internal.D> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.D createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        com.google.android.gms.measurement.internal.C c = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i = ax.N5.b.i(n);
            if (i == 2) {
                str = ax.N5.b.d(parcel, n);
            } else if (i == 3) {
                c = (com.google.android.gms.measurement.internal.C) ax.N5.b.c(parcel, n, com.google.android.gms.measurement.internal.C.CREATOR);
            } else if (i == 4) {
                str2 = ax.N5.b.d(parcel, n);
            } else if (i != 5) {
                ax.N5.b.t(parcel, n);
            } else {
                j = ax.N5.b.q(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new com.google.android.gms.measurement.internal.D(str, c, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.D[] newArray(int i) {
        return new com.google.android.gms.measurement.internal.D[i];
    }
}
