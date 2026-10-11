/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.c;
import ax.M5.P;
import ax.N5.a;
import ax.i6.m;

public final class l
extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();
    private final c c0;
    private final P d0;
    final int q;

    l(int n8, c c8, P p8) {
        this.q = n8;
        this.c0 = c8;
        this.d0 = p8;
    }

    public final c k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.m(parcel, 2, this.c0, n8, false);
        ax.N5.c.m(parcel, 3, this.d0, n8, false);
        ax.N5.c.b(parcel, n9);
    }

    public final P y() {
        return this.d0;
    }
}

