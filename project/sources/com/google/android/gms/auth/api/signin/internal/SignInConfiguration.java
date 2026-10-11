package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.H5.b;
import ax.H5.w;
import ax.M5.C0821p;
import ax.N5.c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends ax.N5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();
    private final GoogleSignInOptions c0;
    private final String q;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.q = C0821p.f(str);
        this.c0 = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.q.equals(signInConfiguration.q)) {
            GoogleSignInOptions googleSignInOptions = this.c0;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.c0;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.q).a(this.c0).b();
    }

    public final GoogleSignInOptions k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.q;
        int a = c.a(parcel);
        c.n(parcel, 2, str, false);
        c.m(parcel, 5, this.c0, i, false);
        c.b(parcel, a);
    }
}
