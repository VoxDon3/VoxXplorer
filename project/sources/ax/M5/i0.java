package ax.M5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0744e;

/* loaded from: classes3.dex */
public final class i0 extends ax.N5.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();
    C0744e[] c0;
    int d0;
    C0810e e0;
    Bundle q;

    i0(Bundle bundle, C0744e[] c0744eArr, int i, C0810e c0810e) {
        this.q = bundle;
        this.c0 = c0744eArr;
        this.d0 = i;
        this.e0 = c0810e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.e(parcel, 1, this.q, false);
        ax.N5.c.p(parcel, 2, this.c0, i, false);
        ax.N5.c.i(parcel, 3, this.d0);
        ax.N5.c.m(parcel, 4, this.e0, i, false);
        ax.N5.c.b(parcel, a);
    }

    public i0() {
    }
}
