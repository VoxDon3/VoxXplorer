package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class z5 implements Parcelable.Creator<A5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ A5 createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
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
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 4:
                    l = ax.N5.b.r(parcel, n);
                    break;
                case 5:
                    f = ax.N5.b.m(parcel, n);
                    break;
                case 6:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 7:
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                case 8:
                    d = ax.N5.b.l(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new A5(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ A5[] newArray(int i) {
        return new A5[i];
    }
}
