/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.N;
import ax.N5.a;
import ax.N5.c;
import ax.i6.k;

public final class j
extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    final N c0;
    final int q;

    j(int n8, N n9) {
        this.q = n8;
        this.c0 = n9;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.m(parcel, 2, this.c0, n8, false);
        c.b(parcel, n9);
    }
}

