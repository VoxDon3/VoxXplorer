package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C0742c c0742c = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 == 2) {
                str = ax.N5.b.d(parcel, n);
            } else if (i2 == 3) {
                pendingIntent = (PendingIntent) ax.N5.b.c(parcel, n, PendingIntent.CREATOR);
            } else if (i2 != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                c0742c = (C0742c) ax.N5.b.c(parcel, n, C0742c.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new Status(i, str, pendingIntent, c0742c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
