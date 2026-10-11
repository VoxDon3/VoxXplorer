package ax.H5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class a extends ax.N5.a {
    public static final Parcelable.Creator<a> CREATOR = new d();
    private int c0;
    private Bundle d0;
    final int q;

    a(int i, int i2, Bundle bundle) {
        this.q = i;
        this.c0 = i2;
        this.d0 = bundle;
    }

    public int k() {
        return this.c0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.i(parcel, 2, k());
        ax.N5.c.e(parcel, 3, this.d0, false);
        ax.N5.c.b(parcel, a);
    }
}
