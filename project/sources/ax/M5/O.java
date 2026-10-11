package ax.M5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i3 = ax.N5.b.i(n);
            if (i3 == 1) {
                i = ax.N5.b.p(parcel, n);
            } else if (i3 == 2) {
                account = (Account) ax.N5.b.c(parcel, n, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = ax.N5.b.p(parcel, n);
            } else if (i3 != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                googleSignInAccount = (GoogleSignInAccount) ax.N5.b.c(parcel, n, GoogleSignInAccount.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new N(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new N[i];
    }
}
