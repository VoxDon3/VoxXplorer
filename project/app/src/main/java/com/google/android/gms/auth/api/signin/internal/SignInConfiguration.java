/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.H5.b;
import ax.H5.w;
import ax.M5.p;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration
extends a
implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();
    private final GoogleSignInOptions c0;
    private final String q;

    public SignInConfiguration(String string, GoogleSignInOptions googleSignInOptions) {
        this.q = p.f(string);
        this.c0 = googleSignInOptions;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                a a8;
                block5: {
                    if (!(object instanceof SignInConfiguration)) {
                        return false;
                    }
                    a8 = (SignInConfiguration)object;
                    if (!this.q.equals(a8.q)) break block4;
                    object = this.c0;
                    a8 = a8.c0;
                    if (object != null) break block5;
                    if (a8 != null) break block4;
                    break block6;
                }
                if (!((GoogleSignInOptions)object).equals(a8)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.q).a(this.c0).b();
    }

    public final GoogleSignInOptions k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        String string = this.q;
        int n9 = c.a(parcel);
        c.n(parcel, 2, string, false);
        c.m(parcel, 5, this.c0, n8, false);
        c.b(parcel, n9);
    }
}

