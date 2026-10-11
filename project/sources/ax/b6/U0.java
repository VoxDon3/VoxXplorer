package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class U0 extends ax.N5.a {
    public static final Parcelable.Creator<U0> CREATOR = new T0();
    public final long c0;
    public final boolean d0;
    public final String e0;
    public final String f0;
    public final String g0;
    public final Bundle h0;
    public final String i0;
    public final long q;

    public U0(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.q = j;
        this.c0 = j2;
        this.d0 = z;
        this.e0 = str;
        this.f0 = str2;
        this.g0 = str3;
        this.h0 = bundle;
        this.i0 = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.k(parcel, 1, this.q);
        ax.N5.c.k(parcel, 2, this.c0);
        ax.N5.c.c(parcel, 3, this.d0);
        ax.N5.c.n(parcel, 4, this.e0, false);
        ax.N5.c.n(parcel, 5, this.f0, false);
        ax.N5.c.n(parcel, 6, this.g0, false);
        ax.N5.c.e(parcel, 7, this.h0, false);
        ax.N5.c.n(parcel, 8, this.i0, false);
        ax.N5.c.b(parcel, a);
    }
}
