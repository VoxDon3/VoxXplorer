package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 2:
                    arrayList = ax.N5.b.g(parcel, n, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) ax.N5.b.c(parcel, n, Account.CREATOR);
                    break;
                case 4:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 5:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 6:
                    z3 = ax.N5.b.j(parcel, n);
                    break;
                case 7:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 8:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
                case 9:
                    arrayList2 = ax.N5.b.g(parcel, n, ax.H5.a.CREATOR);
                    break;
                case 10:
                    str3 = ax.N5.b.d(parcel, n);
                    break;
                default:
                    ax.N5.b.t(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
