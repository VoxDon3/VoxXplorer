/*
 * Decompiled with CFR 0.152.
 */
package ax.i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.K5.l;
import ax.N5.a;
import ax.i6.c;
import com.google.android.gms.common.api.Status;

public final class b
extends a
implements l {
    public static final Parcelable.Creator<b> CREATOR = new c();
    private int c0;
    private Intent d0;
    final int q;

    public b() {
        this(2, 0, null);
    }

    b(int n8, int n9, Intent intent) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = intent;
    }

    @Override
    public final Status e() {
        if (this.c0 == 0) {
            return Status.g0;
        }
        return Status.k0;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.q;
        int n10 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, n9);
        ax.N5.c.i(parcel, 2, this.c0);
        ax.N5.c.m(parcel, 3, (Parcelable)this.d0, n8, false);
        ax.N5.c.b(parcel, n10);
    }
}

