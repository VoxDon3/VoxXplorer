package ax.M5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class N extends ax.N5.a {
    public static final Parcelable.Creator<N> CREATOR = new O();
    private final Account c0;
    private final int d0;
    private final GoogleSignInAccount e0;
    final int q;

    N(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.q = i;
        this.c0 = account;
        this.d0 = i2;
        this.e0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, i2);
        ax.N5.c.m(parcel, 2, this.c0, i, false);
        ax.N5.c.i(parcel, 3, this.d0);
        ax.N5.c.m(parcel, 4, this.e0, i, false);
        ax.N5.c.b(parcel, a);
    }

    public N(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
