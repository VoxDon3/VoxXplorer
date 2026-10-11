package ax.M5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0744e;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes3.dex */
public final class l0 implements Parcelable.Creator {
    static void a(C0811f c0811f, Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, c0811f.q);
        ax.N5.c.i(parcel, 2, c0811f.c0);
        ax.N5.c.i(parcel, 3, c0811f.d0);
        ax.N5.c.n(parcel, 4, c0811f.e0, false);
        ax.N5.c.h(parcel, 5, c0811f.f0, false);
        ax.N5.c.p(parcel, 6, c0811f.g0, i, false);
        ax.N5.c.e(parcel, 7, c0811f.h0, false);
        ax.N5.c.m(parcel, 8, c0811f.i0, i, false);
        ax.N5.c.p(parcel, 10, c0811f.j0, i, false);
        ax.N5.c.p(parcel, 11, c0811f.k0, i, false);
        ax.N5.c.c(parcel, 12, c0811f.l0);
        ax.N5.c.i(parcel, 13, c0811f.m0);
        ax.N5.c.c(parcel, 14, c0811f.n0);
        ax.N5.c.n(parcel, 15, c0811f.k(), false);
        ax.N5.c.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Scope[] scopeArr = C0811f.p0;
        Bundle bundle = new Bundle();
        C0744e[] c0744eArr = C0811f.q0;
        C0744e[] c0744eArr2 = c0744eArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            switch (ax.N5.b.i(n)) {
                case 1:
                    i = ax.N5.b.p(parcel, n);
                    break;
                case 2:
                    i2 = ax.N5.b.p(parcel, n);
                    break;
                case 3:
                    i3 = ax.N5.b.p(parcel, n);
                    break;
                case 4:
                    str = ax.N5.b.d(parcel, n);
                    break;
                case 5:
                    iBinder = ax.N5.b.o(parcel, n);
                    break;
                case 6:
                    scopeArr = (Scope[]) ax.N5.b.f(parcel, n, Scope.CREATOR);
                    break;
                case 7:
                    bundle = ax.N5.b.a(parcel, n);
                    break;
                case 8:
                    account = (Account) ax.N5.b.c(parcel, n, Account.CREATOR);
                    break;
                case 9:
                default:
                    ax.N5.b.t(parcel, n);
                    break;
                case 10:
                    c0744eArr = (C0744e[]) ax.N5.b.f(parcel, n, C0744e.CREATOR);
                    break;
                case 11:
                    c0744eArr2 = (C0744e[]) ax.N5.b.f(parcel, n, C0744e.CREATOR);
                    break;
                case 12:
                    z = ax.N5.b.j(parcel, n);
                    break;
                case 13:
                    i4 = ax.N5.b.p(parcel, n);
                    break;
                case 14:
                    z2 = ax.N5.b.j(parcel, n);
                    break;
                case 15:
                    str2 = ax.N5.b.d(parcel, n);
                    break;
            }
        }
        ax.N5.b.h(parcel, u);
        return new C0811f(i, i2, i3, str, iBinder, scopeArr, bundle, account, c0744eArr, c0744eArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0811f[i];
    }
}
