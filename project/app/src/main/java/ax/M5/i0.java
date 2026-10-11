/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.e;
import ax.M5.j0;
import ax.N5.a;
import ax.N5.c;

public final class i0
extends a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();
    ax.J5.e[] c0;
    int d0;
    e e0;
    Bundle q;

    public i0() {
    }

    i0(Bundle bundle, ax.J5.e[] eArray, int n8, e e8) {
        this.q = bundle;
        this.c0 = eArray;
        this.d0 = n8;
        this.e0 = e8;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.e(parcel, 1, this.q, false);
        c.p((Parcel)parcel, (int)2, (Parcelable[])this.c0, (int)n8, (boolean)false);
        c.i(parcel, 3, this.d0);
        c.m(parcel, 4, this.e0, n8, false);
        c.b(parcel, n9);
    }
}

