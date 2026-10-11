/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.f;

public final class e
implements Parcelable.Creator<f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long l8;
        Object object;
        Object object2;
        int n8 = b.u(parcel);
        String string = null;
        String string2 = null;
        Object object3 = string2;
        String string3 = object3;
        Object object4 = object2 = (object = string3);
        long l9 = 0L;
        long l10 = l8 = 0L;
        boolean bl = false;
        block13: while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            switch (b.i(n9)) {
                default: {
                    b.t(parcel, n9);
                    continue block13;
                }
                case 12: {
                    object4 = b.c(parcel, n9, D.CREATOR);
                    continue block13;
                }
                case 11: {
                    l10 = b.q(parcel, n9);
                    continue block13;
                }
                case 10: {
                    object2 = b.c(parcel, n9, D.CREATOR);
                    continue block13;
                }
                case 9: {
                    l8 = b.q(parcel, n9);
                    continue block13;
                }
                case 8: {
                    object = b.c(parcel, n9, D.CREATOR);
                    continue block13;
                }
                case 7: {
                    string3 = b.d(parcel, n9);
                    continue block13;
                }
                case 6: {
                    bl = b.j(parcel, n9);
                    continue block13;
                }
                case 5: {
                    l9 = b.q(parcel, n9);
                    continue block13;
                }
                case 4: {
                    object3 = b.c(parcel, n9, A5.CREATOR);
                    continue block13;
                }
                case 3: {
                    string2 = b.d(parcel, n9);
                    continue block13;
                }
                case 2: 
            }
            string = b.d(parcel, n9);
        }
        b.h(parcel, n8);
        return new f(string, string2, (A5)object3, l9, bl, string3, (D)object, l8, (D)object2, l10, (D)object4);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new f[n8];
    }
}

