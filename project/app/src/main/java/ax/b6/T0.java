/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.b;
import ax.b6.U0;

public final class T0
implements Parcelable.Creator<U0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string;
        String string2;
        String string3;
        int n8 = b.u(parcel);
        long l8 = 0L;
        long l9 = 0L;
        String string4 = null;
        String string5 = string3 = (string2 = (string = null));
        boolean bl = false;
        block10: while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            switch (b.i(n9)) {
                default: {
                    b.t(parcel, n9);
                    continue block10;
                }
                case 8: {
                    string5 = b.d(parcel, n9);
                    continue block10;
                }
                case 7: {
                    string3 = b.a(parcel, n9);
                    continue block10;
                }
                case 6: {
                    string2 = b.d(parcel, n9);
                    continue block10;
                }
                case 5: {
                    string = b.d(parcel, n9);
                    continue block10;
                }
                case 4: {
                    string4 = b.d(parcel, n9);
                    continue block10;
                }
                case 3: {
                    bl = b.j(parcel, n9);
                    continue block10;
                }
                case 2: {
                    l9 = b.q(parcel, n9);
                    continue block10;
                }
                case 1: 
            }
            l8 = b.q(parcel, n9);
        }
        b.h(parcel, n8);
        return new U0(l8, l9, bl, string4, string, string2, (Bundle)string3, string5);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new U0[n8];
    }
}

