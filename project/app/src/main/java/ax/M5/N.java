/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.O;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class N
extends a {
    public static final Parcelable.Creator<N> CREATOR = new O();
    private final Account c0;
    private final int d0;
    private final GoogleSignInAccount e0;
    final int q;

    N(int n8, Account account, int n9, GoogleSignInAccount googleSignInAccount) {
        this.q = n8;
        this.c0 = account;
        this.d0 = n9;
        this.e0 = googleSignInAccount;
    }

    public N(Account account, int n8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, n8, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.q;
        int n10 = c.a(parcel);
        c.i(parcel, 1, n9);
        c.m(parcel, 2, (Parcelable)this.c0, n8, false);
        c.i(parcel, 3, this.d0);
        c.m(parcel, 4, this.e0, n8, false);
        c.b(parcel, n10);
    }
}

