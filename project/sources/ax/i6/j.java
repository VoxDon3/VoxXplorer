package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.N;

/* loaded from: classes3.dex */
public final class j extends ax.N5.a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    final N c0;
    final int q;

    j(int i, N n) {
        this.q = i;
        this.c0 = n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.m(parcel, 2, this.c0, i, false);
        ax.N5.c.b(parcel, a);
    }
}
