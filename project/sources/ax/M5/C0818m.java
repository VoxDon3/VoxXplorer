package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ax.M5.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0818m extends ax.N5.a {
    public static final Parcelable.Creator<C0818m> CREATOR = new I();
    private final int c0;
    private final int d0;
    private final long e0;
    private final long f0;
    private final String g0;
    private final String h0;
    private final int i0;
    private final int j0;
    private final int q;

    public C0818m(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
        this.e0 = j;
        this.f0 = j2;
        this.g0 = str;
        this.h0 = str2;
        this.i0 = i4;
        this.j0 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, i2);
        ax.N5.c.i(parcel, 2, this.c0);
        ax.N5.c.i(parcel, 3, this.d0);
        ax.N5.c.k(parcel, 4, this.e0);
        ax.N5.c.k(parcel, 5, this.f0);
        ax.N5.c.n(parcel, 6, this.g0, false);
        ax.N5.c.n(parcel, 7, this.h0, false);
        ax.N5.c.i(parcel, 8, this.i0);
        ax.N5.c.i(parcel, 9, this.j0);
        ax.N5.c.b(parcel, a);
    }
}
