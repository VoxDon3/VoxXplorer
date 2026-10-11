/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.f;
import ax.N5.c;

public final class l0
implements Parcelable.Creator {
    static void a(f f8, Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, f8.q);
        c.i(parcel, 2, f8.c0);
        c.i(parcel, 3, f8.d0);
        c.n(parcel, 4, f8.e0, false);
        c.h(parcel, 5, f8.f0, false);
        c.p((Parcel)parcel, (int)6, (Parcelable[])f8.g0, (int)n8, (boolean)false);
        c.e(parcel, 7, f8.h0, false);
        c.m(parcel, 8, (Parcelable)f8.i0, n8, false);
        c.p((Parcel)parcel, (int)10, (Parcelable[])f8.j0, (int)n8, (boolean)false);
        c.p((Parcel)parcel, (int)11, (Parcelable[])f8.k0, (int)n8, (boolean)false);
        c.c(parcel, 12, f8.l0);
        c.i(parcel, 13, f8.m0);
        c.c(parcel, 14, f8.n0);
        c.n(parcel, 15, f8.k(), false);
        c.b(parcel, n9);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new f[n8];
    }
}

