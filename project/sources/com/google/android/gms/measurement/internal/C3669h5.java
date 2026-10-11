package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3669h5 extends ax.N5.a {
    public static final Parcelable.Creator<C3669h5> CREATOR = new C3662g5();
    public final long c0;
    public final int d0;
    public final String q;

    C3669h5(String str, long j, int i) {
        this.q = str;
        this.c0 = j;
        this.d0 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 1, this.q, false);
        ax.N5.c.k(parcel, 2, this.c0);
        ax.N5.c.i(parcel, 3, this.d0);
        ax.N5.c.b(parcel, a);
    }
}
