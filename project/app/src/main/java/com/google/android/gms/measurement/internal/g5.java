/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.h5;

public final class g5
implements Parcelable.Creator<h5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        String string = null;
        long l8 = 0L;
        int n9 = 0;
        while (parcel.dataPosition() < n8) {
            int n10 = b.n(parcel);
            int n11 = b.i(n10);
            if (n11 != 1) {
                if (n11 != 2) {
                    if (n11 != 3) {
                        b.t(parcel, n10);
                        continue;
                    }
                    n9 = b.p(parcel, n10);
                    continue;
                }
                l8 = b.q(parcel, n10);
                continue;
            }
            string = b.d(parcel, n10);
        }
        b.h(parcel, n8);
        return new h5(string, l8, n9);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new h5[n8];
    }
}

