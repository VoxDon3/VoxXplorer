package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;
import ax.K5.d;
import ax.K5.l;
import ax.M5.C0819n;
import ax.N5.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class Status extends ax.N5.a implements l, ReflectedParcelable {
    private final String c0;
    private final PendingIntent d0;
    private final C0742c e0;
    private final int q;
    public static final Status f0 = new Status(-1);
    public static final Status g0 = new Status(0);
    public static final Status h0 = new Status(14);
    public static final Status i0 = new Status(8);
    public static final Status j0 = new Status(15);
    public static final Status k0 = new Status(16);
    public static final Status m0 = new Status(17);
    public static final Status l0 = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i, String str, PendingIntent pendingIntent, C0742c c0742c) {
        this.q = i;
        this.c0 = str;
        this.d0 = pendingIntent;
        this.e0 = c0742c;
    }

    public boolean B() {
        return this.d0 != null;
    }

    public boolean C() {
        return this.q <= 0;
    }

    public final String D() {
        String str = this.c0;
        return str != null ? str : d.a(this.q);
    }

    @Override // ax.K5.l
    public Status e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.q == status.q && C0819n.b(this.c0, status.c0) && C0819n.b(this.d0, status.d0) && C0819n.b(this.e0, status.e0);
    }

    public int hashCode() {
        return C0819n.c(Integer.valueOf(this.q), this.c0, this.d0, this.e0);
    }

    public C0742c k() {
        return this.e0;
    }

    public String toString() {
        C0819n.a d = C0819n.d(this);
        d.a("statusCode", D());
        d.a("resolution", this.d0);
        return d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.i(parcel, 1, y());
        c.n(parcel, 2, z(), false);
        c.m(parcel, 3, this.d0, i, false);
        c.m(parcel, 4, k(), i, false);
        c.b(parcel, a);
    }

    @ResultIgnorabilityUnspecified
    public int y() {
        return this.q;
    }

    public String z() {
        return this.c0;
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(C0742c c0742c, String str) {
        this(c0742c, str, 17);
    }

    public Status(int i, String str) {
        this(i, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(C0742c c0742c, String str, int i) {
        this(i, str, c0742c.z(), c0742c);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }
}
