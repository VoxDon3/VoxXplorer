package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0821p;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public class SignInAccount extends ax.N5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    private final GoogleSignInAccount c0;

    @Deprecated
    final String d0;

    @Deprecated
    final String q;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.c0 = googleSignInAccount;
        this.q = C0821p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.d0 = C0821p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 4, str, false);
        ax.N5.c.m(parcel, 7, this.c0, i, false);
        ax.N5.c.n(parcel, 8, this.d0, false);
        ax.N5.c.b(parcel, a);
    }
}
