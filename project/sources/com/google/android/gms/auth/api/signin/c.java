package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 4:
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                case 5:
                    str4 = ax.N5.b.d(parcel, n);
                    break;
                case 6:
                    uri = (Uri) ax.N5.b.c(parcel, n, Uri.CREATOR);
                    break;
                case 7:
                    str5 = ax.N5.b.d(parcel, n);
                    break;
                case 8:
                    j = ax.N5.b.q(parcel, n);
                    break;
                case 9:
                    str6 = ax.N5.b.d(parcel, n);
                    break;
                case 10:
                    arrayList = ax.N5.b.g(parcel, n, Scope.CREATOR);
                    break;
                case 11:
                    str7 = ax.N5.b.d(parcel, n);
                    break;
                case 12:
                    str8 = ax.N5.b.d(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
