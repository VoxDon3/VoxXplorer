/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.measurement.internal.g5;

public final class h5
extends a {
    public static final Parcelable.Creator<h5> CREATOR = new g5();
    public final long c0;
    public final int d0;
    public final String q;

    h5(String string, long l8, int n8) {
        this.q = string;
        this.c0 = l8;
        this.d0 = n8;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 1, this.q, false);
        c.k(parcel, 2, this.c0);
        c.i(parcel, 3, this.d0);
        c.b(parcel, n8);
    }
}

