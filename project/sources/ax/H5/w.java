package ax.H5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i = ax.N5.b.i(n);
            if (i == 2) {
                str = ax.N5.b.d(parcel, n);
            } else if (i != 5) {
                ax.N5.b.t(parcel, n);
            } else {
                googleSignInOptions = (GoogleSignInOptions) ax.N5.b.c(parcel, n, GoogleSignInOptions.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
