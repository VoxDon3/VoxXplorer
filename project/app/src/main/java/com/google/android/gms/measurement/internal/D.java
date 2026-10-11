/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.p;
import ax.N5.a;
import ax.f6.c;
import com.google.android.gms.measurement.internal.C;

public final class D
extends a {
    public static final Parcelable.Creator<D> CREATOR = new c();
    public final C c0;
    public final String d0;
    public final long e0;
    public final String q;

    D(D d8, long l8) {
        p.l(d8);
        this.q = d8.q;
        this.c0 = d8.c0;
        this.d0 = d8.d0;
        this.e0 = l8;
    }

    public D(String string, C c8, String string2, long l8) {
        this.q = string;
        this.c0 = c8;
        this.d0 = string2;
        this.e0 = l8;
    }

    public final String toString() {
        String string = this.d0;
        String string2 = this.q;
        String string3 = String.valueOf(this.c0);
        StringBuilder stringBuilder = new StringBuilder("origin=");
        stringBuilder.append(string);
        stringBuilder.append(",name=");
        stringBuilder.append(string2);
        stringBuilder.append(",params=");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 2, this.q, false);
        ax.N5.c.m(parcel, 3, this.c0, n8, false);
        ax.N5.c.n(parcel, 4, this.d0, false);
        ax.N5.c.k(parcel, 5, this.e0);
        ax.N5.c.b(parcel, n9);
    }
}

