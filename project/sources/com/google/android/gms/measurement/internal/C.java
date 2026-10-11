package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class C extends ax.N5.a implements Iterable<String> {
    public static final Parcelable.Creator<C> CREATOR = new E();
    private final Bundle q;

    C(Bundle bundle) {
        this.q = bundle;
    }

    public final Bundle B() {
        return new Bundle(this.q);
    }

    final Long C(String str) {
        return Long.valueOf(this.q.getLong(str));
    }

    final Object D(String str) {
        return this.q.get(str);
    }

    final String E(String str) {
        return this.q.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new B(this);
    }

    public final int k() {
        return this.q.size();
    }

    public final String toString() {
        return this.q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.e(parcel, 2, B(), false);
        ax.N5.c.b(parcel, a);
    }

    final Double z(String str) {
        return Double.valueOf(this.q.getDouble(str));
    }
}
