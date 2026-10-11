/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.I;
import ax.N5.a;
import ax.N5.c;

public class m
extends a {
    public static final Parcelable.Creator<m> CREATOR = new I();
    private final int c0;
    private final int d0;
    private final long e0;
    private final long f0;
    private final String g0;
    private final String h0;
    private final int i0;
    private final int j0;
    private final int q;

    public m(int n8, int n9, int n10, long l8, long l9, String string, String string2, int n11, int n12) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = n10;
        this.e0 = l8;
        this.f0 = l9;
        this.g0 = string;
        this.h0 = string2;
        this.i0 = n11;
        this.j0 = n12;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = this.q;
        int n9 = c.a(parcel);
        c.i(parcel, 1, n8);
        c.i(parcel, 2, this.c0);
        c.i(parcel, 3, this.d0);
        c.k(parcel, 4, this.e0);
        c.k(parcel, 5, this.f0);
        c.n(parcel, 6, this.g0, false);
        c.n(parcel, 7, this.h0, false);
        c.i(parcel, 8, this.i0);
        c.i(parcel, 9, this.j0);
        c.b(parcel, n9);
    }
}

