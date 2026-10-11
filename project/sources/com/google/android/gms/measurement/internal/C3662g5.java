package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3662g5 implements Parcelable.Creator<C3669h5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3669h5 createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                str = ax.N5.b.d(parcel, n);
            } else if (i2 == 2) {
                j = ax.N5.b.q(parcel, n);
            } else if (i2 != 3) {
                ax.N5.b.t(parcel, n);
            } else {
                i = ax.N5.b.p(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C3669h5(str, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3669h5[] newArray(int i) {
        return new C3669h5[i];
    }
}
