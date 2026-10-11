/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.N5.a;
import ax.N5.c;
import ax.W5.h;

public final class g
extends a {
    public static final Parcelable.Creator<g> CREATOR = new h();
    String c0;
    final int q;

    public g() {
        this.q = 1;
    }

    g(int n8, String string) {
        this.q = n8;
        this.c0 = string;
    }

    public final g k(String string) {
        this.c0 = string;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.n(parcel, 2, this.c0, false);
        c.b(parcel, n8);
    }
}

