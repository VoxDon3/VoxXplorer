/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.A5;

public final class z5
implements Parcelable.Creator<A5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object;
        Number number;
        int n8 = b.u(parcel);
        String string = null;
        Number number2 = number = null;
        Object object2 = object = number2;
        Double d8 = object2;
        long l8 = 0L;
        int n9 = 0;
        block10: while (parcel.dataPosition() < n8) {
            int n10 = b.n(parcel);
            switch (b.i(n10)) {
                default: {
                    b.t(parcel, n10);
                    continue block10;
                }
                case 8: {
                    d8 = b.l(parcel, n10);
                    continue block10;
                }
                case 7: {
                    object2 = b.d(parcel, n10);
                    continue block10;
                }
                case 6: {
                    object = b.d(parcel, n10);
                    continue block10;
                }
                case 5: {
                    number2 = b.m(parcel, n10);
                    continue block10;
                }
                case 4: {
                    number = b.r(parcel, n10);
                    continue block10;
                }
                case 3: {
                    l8 = b.q(parcel, n10);
                    continue block10;
                }
                case 2: {
                    string = b.d(parcel, n10);
                    continue block10;
                }
                case 1: 
            }
            n9 = b.p(parcel, n10);
        }
        b.h(parcel, n8);
        return new A5(n9, string, l8, (Long)number, (Float)number2, (String)object, (String)object2, d8);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new A5[n8];
    }
}

