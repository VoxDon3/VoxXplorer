/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.I;
import ax.J5.P;
import ax.J5.u;
import ax.N5.a;
import ax.N5.c;

public final class H
extends a {
    public static final Parcelable.Creator<H> CREATOR = new I();
    private final String c0;
    private final int d0;
    private final int e0;
    private final boolean q;

    H(boolean bl, String string, int n8, int n9) {
        this.q = bl;
        this.c0 = string;
        this.d0 = P.a(n8) - 1;
        this.e0 = u.a(n9) - 1;
    }

    public final int B() {
        return P.a(this.d0);
    }

    public final String k() {
        return this.c0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.c(parcel, 1, this.q);
        c.n(parcel, 2, this.c0, false);
        c.i(parcel, 3, this.d0);
        c.i(parcel, 4, this.e0);
        c.b(parcel, n8);
    }

    public final boolean y() {
        return this.q;
    }

    public final int z() {
        return u.a(this.e0);
    }
}

