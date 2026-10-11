/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.c;
import ax.M5.Q;
import ax.M5.j;
import ax.M5.n;
import ax.N5.a;

public final class P
extends a {
    public static final Parcelable.Creator<P> CREATOR = new Q();
    final IBinder c0;
    private final c d0;
    private final boolean e0;
    private final boolean f0;
    final int q;

    P(int n8, IBinder iBinder, c c8, boolean bl, boolean bl2) {
        this.q = n8;
        this.c0 = iBinder;
        this.d0 = c8;
        this.e0 = bl;
        this.f0 = bl2;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof P)) {
            return false;
        }
        object = (P)object;
        return this.d0.equals(((P)object).d0) && n.b(this.y(), ((P)object).y());
    }

    public final c k() {
        return this.d0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.h(parcel, 2, this.c0, false);
        ax.N5.c.m(parcel, 3, this.d0, n8, false);
        ax.N5.c.c(parcel, 4, this.e0);
        ax.N5.c.c(parcel, 5, this.f0);
        ax.N5.c.b(parcel, n9);
    }

    public final j y() {
        IBinder iBinder = this.c0;
        if (iBinder == null) {
            return null;
        }
        return j.a.w(iBinder);
    }
}

