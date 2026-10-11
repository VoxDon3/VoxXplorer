package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class r extends ax.N5.a {
    public static final Parcelable.Creator<r> CREATOR = new b0();
    private final boolean c0;
    private final boolean d0;
    private final int e0;
    private final int f0;
    private final int q;

    public r(int i, boolean z, boolean z2, int i2, int i3) {
        this.q = i;
        this.c0 = z;
        this.d0 = z2;
        this.e0 = i2;
        this.f0 = i3;
    }

    public boolean B() {
        return this.d0;
    }

    public int C() {
        return this.q;
    }

    public int k() {
        return this.e0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, C());
        ax.N5.c.c(parcel, 2, z());
        ax.N5.c.c(parcel, 3, B());
        ax.N5.c.i(parcel, 4, k());
        ax.N5.c.i(parcel, 5, y());
        ax.N5.c.b(parcel, a);
    }

    public int y() {
        return this.f0;
    }

    public boolean z() {
        return this.c0;
    }
}
