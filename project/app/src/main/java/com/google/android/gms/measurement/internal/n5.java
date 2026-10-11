/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import com.google.android.gms.measurement.internal.E5;
import java.util.List;

public final class n5
implements Parcelable.Creator<E5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string;
        String string2;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        String string3;
        String string4;
        Object object;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        int n8 = b.u(parcel);
        String string10 = null;
        String string11 = string9 = (string8 = (string7 = (string6 = (string5 = null))));
        Object object2 = object = string11;
        String string12 = string4 = (string3 = object2);
        long l13 = 0L;
        long l14 = l12 = (l11 = (l10 = (l9 = (l8 = 0L))));
        long l15 = Integer.MIN_VALUE;
        String string13 = "";
        String string14 = string2 = (string = "");
        boolean bl = true;
        boolean bl2 = false;
        int n9 = 0;
        boolean bl3 = true;
        boolean bl4 = false;
        boolean bl5 = false;
        int n10 = 100;
        int n11 = 0;
        block34: while (parcel.dataPosition() < n8) {
            int n12 = b.n(parcel);
            switch (b.i(n12)) {
                default: {
                    b.t(parcel, n12);
                    continue block34;
                }
                case 36: {
                    string14 = b.d(parcel, n12);
                    continue block34;
                }
                case 35: {
                    string12 = b.d(parcel, n12);
                    continue block34;
                }
                case 34: {
                    l14 = b.q(parcel, n12);
                    continue block34;
                }
                case 32: {
                    n11 = b.p(parcel, n12);
                    continue block34;
                }
                case 31: {
                    string2 = b.d(parcel, n12);
                    continue block34;
                }
                case 30: {
                    n10 = b.p(parcel, n12);
                    continue block34;
                }
                case 29: {
                    l12 = b.q(parcel, n12);
                    continue block34;
                }
                case 28: {
                    bl5 = b.j(parcel, n12);
                    continue block34;
                }
                case 27: {
                    string4 = b.d(parcel, n12);
                    continue block34;
                }
                case 26: {
                    string = b.d(parcel, n12);
                    continue block34;
                }
                case 25: {
                    string13 = b.d(parcel, n12);
                    continue block34;
                }
                case 24: {
                    string3 = b.d(parcel, n12);
                    continue block34;
                }
                case 23: {
                    object2 = b.e(parcel, n12);
                    continue block34;
                }
                case 22: {
                    l11 = b.q(parcel, n12);
                    continue block34;
                }
                case 21: {
                    object = b.k(parcel, n12);
                    continue block34;
                }
                case 19: {
                    string11 = b.d(parcel, n12);
                    continue block34;
                }
                case 18: {
                    bl4 = b.j(parcel, n12);
                    continue block34;
                }
                case 16: {
                    bl3 = b.j(parcel, n12);
                    continue block34;
                }
                case 15: {
                    n9 = b.p(parcel, n12);
                    continue block34;
                }
                case 14: {
                    l10 = b.q(parcel, n12);
                    continue block34;
                }
                case 13: {
                    l9 = b.q(parcel, n12);
                    continue block34;
                }
                case 12: {
                    string9 = b.d(parcel, n12);
                    continue block34;
                }
                case 11: {
                    l15 = b.q(parcel, n12);
                    continue block34;
                }
                case 10: {
                    bl2 = b.j(parcel, n12);
                    continue block34;
                }
                case 9: {
                    bl = b.j(parcel, n12);
                    continue block34;
                }
                case 8: {
                    string8 = b.d(parcel, n12);
                    continue block34;
                }
                case 7: {
                    l8 = b.q(parcel, n12);
                    continue block34;
                }
                case 6: {
                    l13 = b.q(parcel, n12);
                    continue block34;
                }
                case 5: {
                    string7 = b.d(parcel, n12);
                    continue block34;
                }
                case 4: {
                    string6 = b.d(parcel, n12);
                    continue block34;
                }
                case 3: {
                    string5 = b.d(parcel, n12);
                    continue block34;
                }
                case 2: 
            }
            string10 = b.d(parcel, n12);
        }
        b.h(parcel, n8);
        return new E5(string10, string5, string6, string7, l13, l8, string8, bl, bl2, l15, string9, l9, l10, n9, bl3, bl4, string11, (Boolean)object, l11, (List<String>)object2, string3, string13, string, string4, bl5, l12, n10, string2, n11, l14, string12, string14);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new E5[n8];
    }
}

