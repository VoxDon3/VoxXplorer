package ax.M5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0744e;

/* loaded from: classes3.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Bundle bundle = null;
        C0744e[] c0744eArr = null;
        C0810e c0810e = null;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            int i2 = ax.N5.b.i(n);
            if (i2 == 1) {
                bundle = ax.N5.b.a(parcel, n);
            } else if (i2 == 2) {
                c0744eArr = (C0744e[]) ax.N5.b.f(parcel, n, C0744e.CREATOR);
            } else if (i2 == 3) {
                i = ax.N5.b.p(parcel, n);
            } else if (i2 != 4) {
                ax.N5.b.t(parcel, n);
            } else {
                c0810e = (C0810e) ax.N5.b.c(parcel, n, C0810e.CREATOR);
            }
        }
        ax.N5.b.h(parcel, u);
        return new i0(bundle, c0744eArr, i, c0810e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new i0[i];
    }
}
