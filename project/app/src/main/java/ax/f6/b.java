/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.f6.a;

public final class b
implements Parcelable.Creator<a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = ax.N5.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n8) {
            int n9 = ax.N5.b.n(parcel);
            if (ax.N5.b.i(n9) != 1) {
                ax.N5.b.t(parcel, n9);
                continue;
            }
            bundle = ax.N5.b.a(parcel, n9);
        }
        ax.N5.b.h(parcel, n8);
        return new a(bundle);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new a[n8];
    }
}

