/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.b0;
import ax.N5.a;
import ax.N5.c;

public class r
extends a {
    public static final Parcelable.Creator<r> CREATOR = new b0();
    private final boolean c0;
    private final boolean d0;
    private final int e0;
    private final int f0;
    private final int q;

    public r(int n8, boolean bl, boolean bl2, int n9, int n10) {
        this.q = n8;
        this.c0 = bl;
        this.d0 = bl2;
        this.e0 = n9;
        this.f0 = n10;
    }

    public boolean B() {
        return this.d0;
    }

    public int C() {
        return this.q;
    }

    public int k() {
        return this.e0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.C());
        c.c(parcel, 2, this.z());
        c.c(parcel, 3, this.B());
        c.i(parcel, 4, this.k());
        c.i(parcel, 5, this.y());
        c.b(parcel, n8);
    }

    public int y() {
        return this.f0;
    }

    public boolean z() {
        return this.c0;
    }
}

