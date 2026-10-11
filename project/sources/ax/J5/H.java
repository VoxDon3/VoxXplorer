package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class H extends ax.N5.a {
    public static final Parcelable.Creator<H> CREATOR = new I();
    private final String c0;
    private final int d0;
    private final int e0;
    private final boolean q;

    H(boolean z, String str, int i, int i2) {
        this.q = z;
        this.c0 = str;
        this.d0 = P.a(i) - 1;
        this.e0 = u.a(i2) - 1;
    }

    public final int B() {
        return P.a(this.d0);
    }

    public final String k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.c(parcel, 1, this.q);
        ax.N5.c.n(parcel, 2, this.c0, false);
        ax.N5.c.i(parcel, 3, this.d0);
        ax.N5.c.i(parcel, 4, this.e0);
        ax.N5.c.b(parcel, a);
    }

    public final boolean y() {
        return this.q;
    }

    public final int z() {
        return u.a(this.e0);
    }
}
