package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.C0742c;
import ax.M5.P;

/* loaded from: classes3.dex */
public final class l extends ax.N5.a {
    public static final Parcelable.Creator<l> CREATOR = new m();
    private final C0742c c0;
    private final P d0;
    final int q;

    l(int i, C0742c c0742c, P p) {
        this.q = i;
        this.c0 = c0742c;
        this.d0 = p;
    }

    public final C0742c k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.m(parcel, 2, this.c0, i, false);
        ax.N5.c.m(parcel, 3, this.d0, i, false);
        ax.N5.c.b(parcel, a);
    }

    public final P y() {
        return this.d0;
    }
}
