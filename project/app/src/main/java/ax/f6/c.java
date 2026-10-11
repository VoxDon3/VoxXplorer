/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;

public final class c
implements Parcelable.Creator<D> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        String string = null;
        C c8 = null;
        Object object = c8;
        long l8 = 0L;
        while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            int n10 = b.i(n9);
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 5) {
                            b.t(parcel, n9);
                            continue;
                        }
                        l8 = b.q(parcel, n9);
                        continue;
                    }
                    object = b.d(parcel, n9);
                    continue;
                }
                c8 = b.c(parcel, n9, C.CREATOR);
                continue;
            }
            string = b.d(parcel, n9);
        }
        b.h(parcel, n8);
        return new D(string, c8, (String)object, l8);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new D[n8];
    }
}

