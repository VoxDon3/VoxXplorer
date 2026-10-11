package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class E implements Parcelable.Creator<C> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C createFromParcel(Parcel parcel) {
        int u = ax.N5.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int n = ax.N5.b.n(parcel);
            if (ax.N5.b.i(n) != 2) {
                ax.N5.b.t(parcel, n);
            } else {
                bundle = ax.N5.b.a(parcel, n);
            }
        }
        ax.N5.b.h(parcel, u);
        return new C(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C[] newArray(int i) {
        return new C[i];
    }
}
