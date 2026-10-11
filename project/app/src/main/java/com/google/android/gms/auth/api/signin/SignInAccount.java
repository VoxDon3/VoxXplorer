/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.p;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.g;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount
extends a
implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    private final GoogleSignInAccount c0;
    @Deprecated
    final String d0;
    @Deprecated
    final String q;

    SignInAccount(String string, GoogleSignInAccount googleSignInAccount, String string2) {
        this.c0 = googleSignInAccount;
        this.q = p.g(string, "8.3 and 8.4 SDKs require non-null email");
        this.d0 = p.g(string2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        String string = this.q;
        int n9 = c.a(parcel);
        c.n(parcel, 4, string, false);
        c.m(parcel, 7, this.c0, n8, false);
        c.n(parcel, 8, this.d0, false);
        c.b(parcel, n9);
    }
}

