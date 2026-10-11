package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3642e implements Parcelable.Creator<C3649f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3649f createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        String str2 = null;
        A5 a5 = null;
        String str3 = null;
        D d = null;
        D d2 = null;
        D d3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 2:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 3:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 4:
                    a5 = (A5) ax.N5.b.c(parcel, n, A5.CREATOR);
                    break;
                case 5:
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 6:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 7:
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                case 8:
                    d = (D) ax.N5.b.c(parcel, n, D.CREATOR);
                    break;
                case 9:
                    j2 = ax.N5.b.q(parcel, n);
                    break;
                case 10:
                    d2 = (D) ax.N5.b.c(parcel, n, D.CREATOR);
                    break;
                case 11:
                    j3 = ax.N5.b.q(parcel, n);
                    break;
                case 12:
                    d3 = (D) ax.N5.b.c(parcel, n, D.CREATOR);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new C3649f(str, str2, a5, j, z, str3, d, j2, d2, j3, d3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3649f[] newArray(int i) {
        return new C3649f[i];
    }
}
