package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i = ax.N5.b.i(n);
            if (i == 4) {
                str = ax.N5.b.d(parcel, n);
            } else if (i == 7) {
                googleSignInAccount = (GoogleSignInAccount) ax.N5.b.c(parcel, n, GoogleSignInAccount.CREATOR);
            } else if (i != 8) {
                ax.N5.b.t(parcel, n);
            } else {
                str2 = ax.N5.b.d(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
