/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.a;
import ax.N5.c;
import ax.b6.T0;

public final class U0
extends a {
    public static final Parcelable.Creator<U0> CREATOR = new T0();
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final String f0;
    public final String g0;
    public final Bundle h0;
    public final String i0;
    public final long q;

    public U0(long l8, long l9, boolean bl, String string, String string2, String string3, Bundle bundle, String string4) {
        this.q = l8;
        this.c0 = l9;
        this.d0 = bl;
        this.e0 = string;
        this.f0 = string2;
        this.g0 = string3;
        this.h0 = bundle;
        this.i0 = string4;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.k(parcel, 1, this.q);
        c.k(parcel, 2, this.c0);
        c.c(parcel, 3, this.d0);
        c.n(parcel, 4, this.e0, false);
        c.n(parcel, 5, this.f0, false);
        c.n(parcel, 6, this.g0, false);
        c.e(parcel, 7, this.h0, false);
        c.n(parcel, 8, this.i0, false);
        c.b(parcel, n8);
    }
}

