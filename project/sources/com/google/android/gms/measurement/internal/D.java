package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0821p;
import ax.f6.C2055c;

/* loaded from: classes3.dex */
public final class D extends ax.N5.a {
    public static final Parcelable.Creator<D> CREATOR = new C2055c();
    public final C c0;
    public final String d0;
    public final long e0;
    public final String q;

    D(D d, long j) {
        C0821p.l(d);
        this.q = d.q;
        this.c0 = d.c0;
        this.d0 = d.d0;
        this.e0 = j;
    }

    public final String toString() {
        return "origin=" + this.d0 + ",name=" + this.q + ",params=" + String.valueOf(this.c0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 2, this.q, false);
        ax.N5.c.m(parcel, 3, this.c0, i, false);
        ax.N5.c.n(parcel, 4, this.d0, false);
        ax.N5.c.k(parcel, 5, this.e0);
        ax.N5.c.b(parcel, a);
    }

    public D(String str, C c, String str2, long j) {
        this.q = str;
        this.c0 = c;
        this.d0 = str2;
        this.e0 = j;
    }
}
