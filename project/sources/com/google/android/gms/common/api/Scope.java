package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0821p;
import ax.N5.c;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Scope extends ax.N5.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();
    private final String c0;
    final int q;

    Scope(int i, String str) {
        C0821p.g(str, "scopeUri must not be null or empty");
        this.q = i;
        this.c0 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.c0.equals(((Scope) obj).c0);
        }
        return false;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a = c.a(parcel);
        c.i(parcel, 1, i2);
        c.n(parcel, 2, k(), false);
        c.b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
