/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.p;
import ax.N5.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope
extends ax.N5.a
implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();
    private final String c0;
    final int q;

    Scope(int n8, String string) {
        p.g(string, "scopeUri must not be null or empty");
        this.q = n8;
        this.c0 = string;
    }

    public Scope(String string) {
        this(1, string);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Scope)) {
            return false;
        }
        return this.c0.equals(((Scope)object).c0);
    }

    public int hashCode() {
        return this.c0.hashCode();
    }

    public String k() {
        return this.c0;
    }

    public String toString() {
        return this.c0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.q;
        n8 = c.a(parcel);
        c.i(parcel, 1, n9);
        c.n(parcel, 2, this.k(), false);
        c.b(parcel, n8);
    }
}

