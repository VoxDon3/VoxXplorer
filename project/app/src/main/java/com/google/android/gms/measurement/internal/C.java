/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.measurement.internal.B;
import com.google.android.gms.measurement.internal.E;
import java.util.Iterator;

public final class C
extends a
implements Iterable<String> {
    public static final Parcelable.Creator<C> CREATOR = new E();
    private final Bundle q;

    C(Bundle bundle) {
        this.q = bundle;
    }

    static /* bridge */ /* synthetic */ Bundle y(C c8) {
        return c8.q;
    }

    public final Bundle B() {
        return new Bundle(this.q);
    }

    final Long C(String string) {
        return this.q.getLong(string);
    }

    final Object D(String string) {
        return this.q.get(string);
    }

    final String E(String string) {
        return this.q.getString(string);
    }

    @Override
    public final Iterator<String> iterator() {
        return new B(this);
    }

    public final int k() {
        return this.q.size();
    }

    public final String toString() {
        return this.q.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.e(parcel, 2, this.B(), false);
        c.b(parcel, n8);
    }

    final Double z(String string) {
        return this.q.getDouble(string);
    }
}

