/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.k0;
import ax.M5.r;
import ax.N5.a;
import ax.N5.c;

public class e
extends a {
    public static final Parcelable.Creator<e> CREATOR = new k0();
    private final boolean c0;
    private final boolean d0;
    private final int[] e0;
    private final int f0;
    private final int[] g0;
    private final r q;

    public e(r r8, boolean bl, boolean bl2, int[] nArray, int n8, int[] nArray2) {
        this.q = r8;
        this.c0 = bl;
        this.d0 = bl2;
        this.e0 = nArray;
        this.f0 = n8;
        this.g0 = nArray2;
    }

    public boolean B() {
        return this.c0;
    }

    public boolean C() {
        return this.d0;
    }

    public final r D() {
        return this.q;
    }

    public int k() {
        return this.f0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.m(parcel, 1, this.q, n8, false);
        c.c(parcel, 2, this.B());
        c.c(parcel, 3, this.C());
        c.j(parcel, 4, this.y(), false);
        c.i(parcel, 5, this.k());
        c.j(parcel, 6, this.z(), false);
        c.b(parcel, n9);
    }

    public int[] y() {
        return this.e0;
    }

    public int[] z() {
        return this.g0;
    }
}

