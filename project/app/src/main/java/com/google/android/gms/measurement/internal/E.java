/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.C;

public final class E
implements Parcelable.Creator<C> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            if (b.i(n9) != 2) {
                b.t(parcel, n9);
                continue;
            }
            bundle = b.a(parcel, n9);
        }
        b.h(parcel, n8);
        return new C(bundle);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new C[n8];
    }
}

