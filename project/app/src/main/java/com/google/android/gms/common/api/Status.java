/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.c;
import ax.K5.d;
import ax.K5.l;
import ax.M5.n;
import ax.N5.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class Status
extends a
implements l,
ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status f0;
    public static final Status g0;
    public static final Status h0;
    public static final Status i0;
    public static final Status j0;
    public static final Status k0;
    public static final Status l0;
    public static final Status m0;
    private final String c0;
    private final PendingIntent d0;
    private final c e0;
    private final int q;

    static {
        f0 = new Status(-1);
        g0 = new Status(0);
        h0 = new Status(14);
        i0 = new Status(8);
        j0 = new Status(15);
        k0 = new Status(16);
        m0 = new Status(17);
        l0 = new Status(18);
        CREATOR = new b();
    }

    public Status(int n8) {
        this(n8, null);
    }

    public Status(int n8, String string) {
        this(n8, string, null);
    }

    public Status(int n8, String string, PendingIntent pendingIntent) {
        this(n8, string, pendingIntent, null);
    }

    Status(int n8, String string, PendingIntent pendingIntent, c c8) {
        this.q = n8;
        this.c0 = string;
        this.d0 = pendingIntent;
        this.e0 = c8;
    }

    public Status(c c8, String string) {
        this(c8, string, 17);
    }

    @Deprecated
    public Status(c c8, String string, int n8) {
        this(n8, string, c8.z(), c8);
    }

    public boolean B() {
        return this.d0 != null;
    }

    public boolean C() {
        return this.q <= 0;
    }

    public final String D() {
        String string = this.c0;
        if (string != null) {
            return string;
        }
        return d.a(this.q);
    }

    @Override
    public Status e() {
        return this;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Status)) {
            return false;
        }
        object = (Status)object;
        return this.q == ((Status)object).q && n.b(this.c0, ((Status)object).c0) && n.b(this.d0, ((Status)object).d0) && n.b(this.e0, ((Status)object).e0);
    }

    public int hashCode() {
        return n.c(this.q, this.c0, this.d0, this.e0);
    }

    public c k() {
        return this.e0;
    }

    public String toString() {
        n.a a8 = n.d(this);
        a8.a("statusCode", this.D());
        a8.a("resolution", this.d0);
        return a8.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.y());
        ax.N5.c.n(parcel, 2, this.z(), false);
        ax.N5.c.m(parcel, 3, (Parcelable)this.d0, n8, false);
        ax.N5.c.m(parcel, 4, this.k(), n8, false);
        ax.N5.c.b(parcel, n9);
    }

    @ResultIgnorabilityUnspecified
    public int y() {
        return this.q;
    }

    public String z() {
        return this.c0;
    }
}

