package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class n5 implements Parcelable.Creator<E5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E5 createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = -2147483648L;
        String str11 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 100;
        int i3 = 0;
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
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                case 5:
                    str4 = ax.N5.b.d(parcel, n);
                    break;
                case 6:
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 7:
                    j2 = ax.N5.b.q(parcel, n);
                    break;
                case 8:
                    str5 = ax.N5.b.d(parcel, n);
                    break;
                case 9:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 10:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 11:
                    j8 = ax.N5.b.q(parcel, n);
                    break;
                case 12:
                    str6 = ax.N5.b.d(parcel, n);
                    break;
                case 13:
                    j3 = ax.N5.b.q(parcel, n);
                    break;
                case 14:
                    j4 = ax.N5.b.q(parcel, n);
                    break;
                case 15:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 16:
                    z3 = ax.N5.b.j(parcel, n);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    ax.N5.b.t(parcel, n);
                    break;
                case 18:
                    z4 = ax.N5.b.j(parcel, n);
                    break;
                case 19:
                    str7 = ax.N5.b.d(parcel, n);
                    break;
                case 21:
                    bool = ax.N5.b.k(parcel, n);
                    break;
                case 22:
                    j5 = ax.N5.b.q(parcel, n);
                    break;
                case 23:
                    arrayList = ax.N5.b.e(parcel, n);
                    break;
                case 24:
                    str8 = ax.N5.b.d(parcel, n);
                    break;
                case 25:
                    str11 = ax.N5.b.d(parcel, n);
                    break;
                case 26:
                    str12 = ax.N5.b.d(parcel, n);
                    break;
                case 27:
                    str9 = ax.N5.b.d(parcel, n);
                    break;
                case 28:
                    z5 = ax.N5.b.j(parcel, n);
                    break;
                case 29:
                    j6 = ax.N5.b.q(parcel, n);
                    break;
                case 30:
                    i2 = ax.N5.b.p(parcel, n);
                    break;
                case 31:
                    str13 = ax.N5.b.d(parcel, n);
                    break;
                case 32:
                    i3 = ax.N5.b.p(parcel, n);
                    break;
                case 34:
                    j7 = ax.N5.b.q(parcel, n);
                    break;
                case 35:
                    str10 = ax.N5.b.d(parcel, n);
                    break;
                case 36:
                    str14 = ax.N5.b.d(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new E5(str, str2, str3, str4, j, j2, str5, z, z2, j8, str6, j3, j4, i, z3, z4, str7, bool, j5, arrayList, str8, str11, str12, str9, z5, j6, i2, str13, i3, j7, str10, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E5[] newArray(int i) {
        return new E5[i];
    }
}
