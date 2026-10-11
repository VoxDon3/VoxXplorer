package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 2:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 3:
                    l = ax.N5.b.r(parcel, n);
                    break;
                case 4:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 5:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 6:
                    arrayList = ax.N5.b.e(parcel, n);
                    break;
                case 7:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
