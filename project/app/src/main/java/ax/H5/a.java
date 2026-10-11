/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ax.H5.d;
import ax.N5.c;

public class a
extends ax.N5.a {
    public static final Parcelable.Creator<a> CREATOR = new d();
    private int c0;
    private Bundle d0;
    final int q;

    a(int n8, int n9, Bundle bundle) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = bundle;
    }

    public int k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.i(parcel, 2, this.k());
        c.e(parcel, 3, this.d0, false);
        c.b(parcel, n8);
    }
}

